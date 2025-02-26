// Generated from c:/Users/Teodora/Desktop/MiniLang/MiniLang/MiniLang/MiniLang/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangParser}.
 */
public interface MiniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(MiniLangParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(MiniLangParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(MiniLangParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(MiniLangParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDecl(MiniLangParser.DestructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDecl(MiniLangParser.DestructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(MiniLangParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(MiniLangParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MiniLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MiniLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(MiniLangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(MiniLangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MiniLangParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MiniLangParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniLangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MiniLangParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MiniLangParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MiniLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MiniLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MiniLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MiniLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniLangParser.TypeContext ctx);
}