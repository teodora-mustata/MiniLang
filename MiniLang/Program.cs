using System;
using System.Collections.Immutable;
using System.ComponentModel;
using System.IO;
using System.Reflection.Metadata;
using System.Text.RegularExpressions;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using static MiniLangParser;

namespace MiniLangCompiler
{
    class Program
    {
        static void Main(string[] args)
        {
            string filePath = "program.txt";
            string outputFilePath = "iesire.txt";

            string input = File.ReadAllText(filePath);

            var inputStream = new AntlrInputStream(input);
            var lexer = new MiniLangLexer(inputStream);
            var tokens = new CommonTokenStream(lexer);

            var parser = new MiniLangParser(tokens);
            var tree = parser.program();

            using (var write = new StreamWriter(outputFilePath, false)) // false -> suprascrie fișierul
            {
                foreach (var token in tokens.GetTokens())
                {
                    if (token.Type == MiniLangLexer.BLOCK_COMMENT || token.Type == MiniLangLexer.LINE_COMMENT || token.Type == MiniLangLexer.WS)
                        continue;
                    write.WriteLine($"<{lexer.Vocabulary.GetSymbolicName(token.Type)},{token.Text}, {token.Line}>");
                }
            }

            var visitor = new MyVisitor();
            visitor.Visit(tree);

            using (var writer = new StreamWriter("variabileGlobale.txt"))
            {
                foreach (var variable in visitor.GlobalVariables)
                {
                    writer.WriteLine($"{variable.Type} {variable.Name}={variable.Value ?? "null"}");
                }
            }

        }
    }

    class MyVisitor : MiniLangBaseVisitor<object>
    {

        public List<(string Name, string Type, string? Value)> GlobalVariables = new();
        public List<(bool IsRecursive,bool IsMain,string Name, string Type, List<string> Parameters,List<(string Name, string Type, string? Value)> LocalVariables, List<(string Structure, int LineNumber)> controlStructures)> Functions=new();
        
        public override object VisitProgram(MiniLangParser.ProgramContext context)
        {
            foreach (var child in context.children)
            {
                if (child is MiniLangParser.VarDeclContext)
                {
                    var varDecl = (MiniLangParser.VarDeclContext)child;
                    VisitVarDecl(varDecl); 
                }
                else if (child is MiniLangParser.FunctionDeclContext)
                {
                    var funcionDecl = (MiniLangParser.FunctionDeclContext)child;
                    VisitFunctionDecl(funcionDecl);
                }
                else if (child is MiniLangParser.StructDeclContext structDecl)
                {
                    VisitStructDecl(structDecl);
                }
            }
           
            return null;
        }

        public override object VisitVarDecl(MiniLangParser.VarDeclContext context)
        {
            string varName = context.ID().GetText();
            string varType = context.type().GetText();
            string? value = context.expression() != null ? context.expression().GetText() : null;

            // Unicitatea variabilelor globale
            if (GlobalVariables.Any(v => v.Name == varName))
            {
                Console.WriteLine($"Eroare: Variabila globala '{varName}' este deja definita.");
                return null;
            }

            // Compatibilitatea tipurilor la inițializare
            if (value != null)
            {
                bool typeMismatch = false;
                if (varType == "int" && !int.TryParse(value, out _))
                    typeMismatch = true;
                else if (varType == "double" && !double.TryParse(value, out _))
                    typeMismatch = true;

                if (typeMismatch)
                {
                    Console.WriteLine($"Eroare: Variabila '{varName}' de tip '{varType}' este initializata cu o valoare incompatibila: '{value}'.");
                    return null;
                }
            }

            GlobalVariables.Add((varName, varType, value));

            return null;
        }
        public override object VisitFunctionDecl(MiniLangParser.FunctionDeclContext context)
        {
            string FuncName = context.ID().GetText();
            string FuncType = context.type().GetText();

            List<string> Parameters = new List<string>();
            if (context.paramList() != null)
            {
                foreach (var child in context.paramList().param())
                {
                    string paramID = child.ID().GetText();
                    Parameters.Add(paramID);
                }
            }

            bool IsMain = FuncName == "main";

            bool IsRecursive = false;

            List<(string Name, string Type, string? Value)> LocalVariables = new();
            List<(string Structure, int LineNumber)> controlStructures = new();

            foreach (var statement in context.statement())
            {
                if (statement.returnStatement() != null)
                {
                    string returnExpr = statement.returnStatement().expression().GetText();
                    if (returnExpr.Contains($"{FuncName}("))
                    {
                        IsRecursive = true;
                    }
                }
                else if (statement.ifStatement() != null)
                {
                    var ifStmt = statement.ifStatement();
                    if (ifStmt.expression() != null)
                    {
                        string ifExpr = ifStmt.expression().GetText();
                        if (ifExpr.Contains($"{FuncName}("))
                        {
                            IsRecursive = true;
                        }
                    }

                    foreach (var stmt in ifStmt.statement())
                    {
                        if (stmt.GetText().Contains($"{FuncName}("))
                        {
                            IsRecursive = true;
                        }
                    }

                    controlStructures.Add(("if", ifStmt.Start.Line));
                }
                else if (statement.whileStatement() != null)
                {
                    var whileStmt = statement.whileStatement();
                    if (whileStmt.expression() != null)
                    {
                        string whileExpr = whileStmt.expression().GetText();
                        if (whileExpr.Contains($"{FuncName}("))
                        {
                            IsRecursive = true;
                        }
                    }

                    controlStructures.Add(("while", whileStmt.Start.Line));
                }
                else if (statement.forStatement() != null)
                {
                    var forStmt = statement.forStatement();
                    if (forStmt.expression() != null)
                    {
                        foreach (var expr in forStmt.expression())
                        {
                            string forExpr = expr.GetText();
                            if (forExpr.Contains($"{FuncName}("))
                            {
                                IsRecursive = true;
                            }
                        }
                    }

                    controlStructures.Add(("for", forStmt.Start.Line));
                }



                else if (statement.varDecl() != null)
                {
                    var varDecl = statement.varDecl();
                    string varName = varDecl.ID().GetText();
                    string varType = varDecl.type().GetText();
                    string? value = varDecl.expression() != null ? varDecl.expression().GetText() : null;

                    if (Parameters.Contains(varName))
                    {
                        Console.WriteLine($"Eroare: Variabila locală '{varName}' redefinește un parametru al funcției '{FuncName}' la linia {varDecl.Start.Line}.");
                    }
                    else if (LocalVariables.Any(v => v.Name == varName))
                    {
                        Console.WriteLine($"Eroare: Variabila locală '{varName}' este definită de mai multe ori în funcția '{FuncName}' la linia {varDecl.Start.Line}.");
                    }
                    else
                    {
                        LocalVariables.Add((varName, varType, value));
                    }

                    if (value != null && ((varType == "int" && !int.TryParse(value, out _)) || (varType == "double" && !double.TryParse(value, out _))))
                    {
                        Console.WriteLine($"Eroare: Valoarea atribuită variabilei '{varName}' nu corespunde tipului declarat '{varType}' la linia {varDecl.Start.Line}.");
                    }
                }
                else if (statement.expression() != null)
                {
                    string expressionText = statement.expression().GetText();
                    var calledFunctions = Functions.Select(f => f.Name).ToList();

                    if (calledFunctions.Any(func => expressionText.StartsWith(func + "(") || expressionText.Contains(" " + func + "(")))
                    {
                        continue;
                    }

                    if (Regex.IsMatch(expressionText, @"\b[a-zA-Z_][a-zA-Z0-9_]*\s*\(") && !calledFunctions.Any(func => expressionText.Contains(func + "(")))
                    {
                        Console.WriteLine($"Eroare: Apelarea funcției nedefinite în expresie la linia {statement.Start.Line}.");
                    }
                }

            }

            if (Functions.Any(f => f.Name == FuncName && f.Parameters.SequenceEqual(Parameters)))
            {
                Console.WriteLine($"Eroare: Funcția '{FuncName}' cu aceeași listă de parametri este definită de mai multe ori.");
            }

            Functions.Add((IsRecursive, IsMain, FuncName, FuncType, Parameters, LocalVariables, controlStructures));

            using (var writer = new StreamWriter("functii.txt", false))
            {
                foreach (var func in Functions)
                {
                    writer.WriteLine($"Funcție: {func.Name}");
                    writer.WriteLine($"- Tip: {func.Type}");
                    writer.WriteLine($"- Parametri: {string.Join(", ", func.Parameters)}");
                    writer.WriteLine($"- IsMain: {func.IsMain}");
                    writer.WriteLine($"- IsRecursive: {func.IsRecursive}");
                    writer.WriteLine("- Variabile locale:");
                    foreach (var variable in func.LocalVariables)
                    {
                        writer.WriteLine($"  {variable.Type} {variable.Name} = {variable.Value ?? "null"}");
                    }
                    writer.WriteLine("- Structuri de control:");
                    foreach (var structure in func.controlStructures)
                    {
                        writer.WriteLine($"  {structure.Structure} la linia {structure.LineNumber}");
                    }
                    writer.WriteLine();
                }
            }

            return null;
        }
        public override object VisitStructDecl(MiniLangParser.StructDeclContext context)
        {
            string structOutputFilePath = "structuri.txt";
            using (StreamWriter writer = new StreamWriter(structOutputFilePath, false))
            {
                string structName = context.ID().GetText();
                writer.WriteLine($"Structură: {structName}");
                writer.WriteLine($"- Declarație la linia: {context.Start.Line}");

                foreach (var member in context.structBody().children)
                {
                    if (member is MiniLangParser.VarDeclContext varDecl)
                    {
                        writer.WriteLine($"- Variabilă: {varDecl.ID().GetText()} ({varDecl.type().GetText()})");
                    }
                    else if (member is MiniLangParser.MethodDeclContext methodDecl)
                    {
                        writer.WriteLine($"- Metodă: {methodDecl.ID().GetText()}");
                    }
                    else if (member is MiniLangParser.ConstructorDeclContext constructorDecl)
                    {
                        writer.WriteLine($"- Constructor: {constructorDecl.ID().GetText()}");
                    }
                    else if (member is MiniLangParser.DestructorDeclContext destructorDecl)
                    {
                        writer.WriteLine($"- Destructor: ~{destructorDecl.ID().GetText()}");
                    }
                }
            }
            return null;
        }
    }
}