grammar MiniLang;

// Reguli lexicale (Token-uri)

// Cuvinte cheie
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
STRING_TYPE: 'string';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
STRUCT: 'struct';

// Operatori
OP_ARITH: '+' | '-' | '*' | '/' | '%';
OP_REL: '<' | '>' | '<=' | '>=' | '==' | '!=';
OP_LOGICAL: '&&' | '||' | '!';
OP_ASSIGN: '=';
OP_COMPOUND_ASSIGN: '+=' | '-=' | '*=' | '/=' | '%=';
OP_INC_DEC: '++' | '--';

// Delimitatori
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMI: ';';

NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' ( ~["\\] | '\\' .)* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Reguli sintactice
program: (structDecl | functionDecl | varDecl | statement)*;

structDecl: STRUCT ID LBRACE structBody RBRACE SEMI;

constructorDecl:
	ID LPAREN paramList? RPAREN LBRACE statement* RBRACE // Constructor cu parametri
	| ID LPAREN RPAREN LBRACE statement* RBRACE; // Constructor fără parametri

destructorDecl:
	'~' ID LPAREN RPAREN (
		LBRACE statement* RBRACE
		| SEMI
	) // Destructor fără parametri
	| '~' ID LPAREN paramList? RPAREN LBRACE statement* RBRACE; // Destructor cu parametri

methodDecl:
	type ID LPAREN paramList? RPAREN LBRACE statement* RBRACE;

structBody: (
		varDecl
		| methodDecl
		| constructorDecl
		| destructorDecl
	)*;

varDecl: type ID (OP_ASSIGN expression)? SEMI;

functionDecl:
	type ID LPAREN paramList? RPAREN LBRACE statement* RBRACE;

paramList: param (COMMA param)*;
param: type ID;

constructorCallStatement:
	ID ID LPAREN expressionList? RPAREN SEMI;

statement:
	varDecl
	| expression SEMI
	| ifStatement
	| whileStatement
	| forStatement
	| returnStatement
	| blockStatement
	| constructorCallStatement;

blockStatement: LBRACE statement* RBRACE;

ifStatement:
	IF LPAREN expression RPAREN statement (ELSE statement)?;

whileStatement: WHILE LPAREN expression RPAREN statement;

forStatement:
	FOR LPAREN (varDecl | expression)? SEMI expression? SEMI expression? RPAREN statement;

returnStatement: RETURN expression? SEMI;

expression:
	primaryExpr											# PrimaryExpression
	| expression OP_ARITH expression					# ArithmeticExpression
	| expression OP_REL expression						# RelationalExpression
	| expression OP_LOGICAL expression					# LogicalExpression
	| ID (OP_ASSIGN | OP_COMPOUND_ASSIGN) expression	# AssignmentExpression
	| ID OP_INC_DEC										# IncrementDecrementExpression;

primaryExpr:
	LPAREN expression RPAREN					# ParenExpression
	| functionCall								# FunctionCallExpression
	| NUMBER									# NumberExpression
	| STRING									# StringExpression
	| constructorCall							# ConstructorCallExpression
	| ID '.' ID LPAREN expressionList? RPAREN	# MethodCallExpression
	| ID '.' ID									# FieldAccessExpression
	| ID										# IdentifierExpression;

functionCall: ID LPAREN expressionList? RPAREN;

constructorCall: ID LPAREN expressionList? RPAREN;

expressionList: expression (COMMA expression)*;

type: INT | FLOAT | DOUBLE | STRING_TYPE | VOID;