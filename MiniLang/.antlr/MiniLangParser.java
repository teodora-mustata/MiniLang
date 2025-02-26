// Generated from c:/Users/Teodora/Desktop/MiniLang/MiniLang/MiniLang/MiniLang/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, NUMBER=14, STRING=15, WS=16, LINE_COMMENT=17, 
		BLOCK_COMMENT=18, KEYWORDS=19, OP_ARITH=20, OP_REL=21, OP_LOGICAL=22, 
		OP_ASSIGN=23, OP_COMPOUND_ASSIGN=24, OP_INC_DEC=25, LPAREN=26, RPAREN=27, 
		LBRACE=28, RBRACE=29, COMMA=30, SEMI=31;
	public static final int
		RULE_program = 0, RULE_structDecl = 1, RULE_constructorDecl = 2, RULE_destructorDecl = 3, 
		RULE_structBody = 4, RULE_varDecl = 5, RULE_functionDecl = 6, RULE_paramList = 7, 
		RULE_param = 8, RULE_statement = 9, RULE_blockStatement = 10, RULE_ifStatement = 11, 
		RULE_whileStatement = 12, RULE_forStatement = 13, RULE_returnStatement = 14, 
		RULE_expression = 15, RULE_functionCall = 16, RULE_type = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structDecl", "constructorDecl", "destructorDecl", "structBody", 
			"varDecl", "functionDecl", "paramList", "param", "statement", "blockStatement", 
			"ifStatement", "whileStatement", "forStatement", "returnStatement", "expression", 
			"functionCall", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'~'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'int'", "'float'", "'double'", "'string'", "'void'", null, null, null, 
			null, null, null, null, null, null, null, "'='", null, null, "'('", "')'", 
			"'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUMBER", "STRING", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"KEYWORDS", "OP_ARITH", "OP_REL", "OP_LOGICAL", "OP_ASSIGN", "OP_COMPOUND_ASSIGN", 
			"OP_INC_DEC", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMI"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 335609834L) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					structDecl();
					}
					break;
				case 2:
					{
					setState(37);
					functionDecl();
					}
					break;
				case 3:
					{
					setState(38);
					varDecl();
					}
					break;
				case 4:
					{
					setState(39);
					statement();
					}
					break;
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(MiniLangParser.SEMI, 0); }
		public List<ConstructorDeclContext> constructorDecl() {
			return getRuleContexts(ConstructorDeclContext.class);
		}
		public ConstructorDeclContext constructorDecl(int i) {
			return getRuleContext(ConstructorDeclContext.class,i);
		}
		public List<DestructorDeclContext> destructorDecl() {
			return getRuleContexts(DestructorDeclContext.class);
		}
		public DestructorDeclContext destructorDecl(int i) {
			return getRuleContext(DestructorDeclContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitStructDecl(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(47);
			match(LBRACE);
			setState(48);
			structBody();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(49);
					constructorDecl();
					}
					break;
				case T__1:
					{
					setState(50);
					destructorDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(RBRACE);
			setState(57);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitConstructorDecl(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(LPAREN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(61);
				paramList();
				}
			}

			setState(64);
			match(RPAREN);
			setState(65);
			match(LBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 335609832L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructorDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(MiniLangParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DestructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterDestructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitDestructorDecl(this);
		}
	}

	public final DestructorDeclContext destructorDecl() throws RecognitionException {
		DestructorDeclContext _localctx = new DestructorDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_destructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
			setState(75);
			match(ID);
			setState(76);
			match(LPAREN);
			setState(77);
			match(RPAREN);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(78);
				match(LBRACE);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 335609832L) != 0)) {
					{
					{
					setState(79);
					statement();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(RBRACE);
				}
				break;
			case SEMI:
				{
				setState(86);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(89);
					varDecl();
					}
					break;
				case 2:
					{
					setState(90);
					functionDecl();
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(MiniLangParser.SEMI, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(MiniLangParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(98);
				match(OP_ASSIGN);
				setState(99);
				expression(0);
				}
			}

			setState(102);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(ID);
			setState(106);
			match(LPAREN);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(107);
				paramList();
				}
			}

			setState(110);
			match(RPAREN);
			setState(111);
			match(LBRACE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 335609832L) != 0)) {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniLangParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			param();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				param();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			type();
			setState(129);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniLangParser.SEMI, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				varDecl();
				}
				break;
			case ID:
			case NUMBER:
			case STRING:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				expression(0);
				setState(133);
				match(SEMI);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				ifStatement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				whileStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				forStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				returnStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				blockStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LBRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 335609832L) != 0)) {
				{
				{
				setState(143);
				statement();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
			setState(152);
			match(LPAREN);
			setState(153);
			expression(0);
			setState(154);
			match(RPAREN);
			setState(155);
			statement();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(156);
				match(T__3);
				setState(157);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__4);
			setState(161);
			match(LPAREN);
			setState(162);
			expression(0);
			setState(163);
			match(RPAREN);
			setState(164);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MiniLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MiniLangParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
			setState(167);
			match(LPAREN);
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				{
				setState(168);
				varDecl();
				}
				break;
			case ID:
			case NUMBER:
			case STRING:
			case LPAREN:
				{
				setState(169);
				expression(0);
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(172);
			match(SEMI);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67166208L) != 0)) {
				{
				setState(173);
				expression(0);
				}
			}

			setState(176);
			match(SEMI);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67166208L) != 0)) {
				{
				setState(177);
				expression(0);
				}
			}

			setState(180);
			match(RPAREN);
			setState(181);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MiniLangParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__6);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67166208L) != 0)) {
				{
				setState(184);
				expression(0);
				}
			}

			setState(187);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(MiniLangParser.OP_ASSIGN, 0); }
		public TerminalNode OP_COMPOUND_ASSIGN() { return getToken(MiniLangParser.OP_COMPOUND_ASSIGN, 0); }
		public TerminalNode OP_INC_DEC() { return getToken(MiniLangParser.OP_INC_DEC, 0); }
		public TerminalNode NUMBER() { return getToken(MiniLangParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MiniLangParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OP_ARITH() { return getToken(MiniLangParser.OP_ARITH, 0); }
		public TerminalNode OP_REL() { return getToken(MiniLangParser.OP_REL, 0); }
		public TerminalNode OP_LOGICAL() { return getToken(MiniLangParser.OP_LOGICAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(190);
				match(LPAREN);
				setState(191);
				expression(0);
				setState(192);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(194);
				match(ID);
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==OP_ASSIGN || _la==OP_COMPOUND_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				expression(6);
				}
				break;
			case 3:
				{
				setState(197);
				match(ID);
				setState(198);
				match(OP_INC_DEC);
				}
				break;
			case 4:
				{
				setState(199);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(200);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(201);
				match(ID);
				}
				break;
			case 7:
				{
				setState(202);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(206);
						match(OP_ARITH);
						setState(207);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(209);
						match(OP_REL);
						setState(210);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(212);
						match(OP_LOGICAL);
						setState(213);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniLangParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(220);
			match(LPAREN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67166208L) != 0)) {
				{
				setState(221);
				expression(0);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					expression(0);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Q\b\u0003\n\u0003"+
		"\f\u0003T\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\\\b\u0004\n\u0004\f\u0004_\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"m\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006r\b\u0006\n\u0006"+
		"\f\u0006u\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007|\b\u0007\n\u0007\f\u0007\u007f\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u008d\b\t\u0001\n\u0001\n\u0005\n\u0091\b\n\n\n\f\n"+
		"\u0094\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ab\b\r\u0001\r\u0001\r\u0003\r\u00af\b\r\u0001\r\u0001\r"+
		"\u0003\r\u00b3\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ba\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00cc\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d7"+
		"\b\u000f\n\u000f\f\u000f\u00da\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00e1\b\u0010\n\u0010\f\u0010\u00e4"+
		"\t\u0010\u0003\u0010\u00e6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0001\u001e\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0002\u0001\u0000\u0017\u0018\u0001\u0000\b\f\u0101\u0000*\u0001\u0000"+
		"\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006J\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000\n`\u0001\u0000"+
		"\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000"+
		"\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000"+
		"\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000"+
		"\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000\u0000\u0000"+
		"\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000"+
		" \u00db\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000$)\u0003"+
		"\u0002\u0001\u0000%)\u0003\f\u0006\u0000&)\u0003\n\u0005\u0000\')\u0003"+
		"\u0012\t\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0001\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005"+
		"\r\u0000\u0000/0\u0005\u001c\u0000\u000005\u0003\b\u0004\u000014\u0003"+
		"\u0004\u0002\u000024\u0003\u0006\u0003\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0005\u001d\u0000\u00009:\u0005\u001f\u0000\u0000:\u0003"+
		"\u0001\u0000\u0000\u0000;<\u0005\r\u0000\u0000<>\u0005\u001a\u0000\u0000"+
		"=?\u0003\u000e\u0007\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u001b\u0000\u0000AE\u0005\u001c"+
		"\u0000\u0000BD\u0003\u0012\t\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u001d\u0000\u0000"+
		"I\u0005\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0005\r\u0000"+
		"\u0000LM\u0005\u001a\u0000\u0000MW\u0005\u001b\u0000\u0000NR\u0005\u001c"+
		"\u0000\u0000OQ\u0003\u0012\t\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0005\u001d\u0000\u0000"+
		"VX\u0005\u001f\u0000\u0000WN\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u0007\u0001\u0000\u0000\u0000Y\\\u0003\n\u0005\u0000Z\\\u0003"+
		"\f\u0006\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_"+
		"\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\t\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0003\""+
		"\u0011\u0000ad\u0005\r\u0000\u0000bc\u0005\u0017\u0000\u0000ce\u0003\u001e"+
		"\u000f\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0005\u001f\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hi\u0003\"\u0011\u0000ij\u0005\r\u0000\u0000jl\u0005\u001a\u0000"+
		"\u0000km\u0003\u000e\u0007\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u001b\u0000\u0000os\u0005"+
		"\u001c\u0000\u0000pr\u0003\u0012\t\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005\u001d\u0000"+
		"\u0000w\r\u0001\u0000\u0000\u0000x}\u0003\u0010\b\u0000yz\u0005\u001e"+
		"\u0000\u0000z|\u0003\u0010\b\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u000f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\"\u0011\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0011\u0001"+
		"\u0000\u0000\u0000\u0083\u008d\u0003\n\u0005\u0000\u0084\u0085\u0003\u001e"+
		"\u000f\u0000\u0085\u0086\u0005\u001f\u0000\u0000\u0086\u008d\u0001\u0000"+
		"\u0000\u0000\u0087\u008d\u0003\u0016\u000b\u0000\u0088\u008d\u0003\u0018"+
		"\f\u0000\u0089\u008d\u0003\u001a\r\u0000\u008a\u008d\u0003\u001c\u000e"+
		"\u0000\u008b\u008d\u0003\u0014\n\u0000\u008c\u0083\u0001\u0000\u0000\u0000"+
		"\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000"+
		"\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u0092\u0005\u001c\u0000\u0000"+
		"\u008f\u0091\u0003\u0012\t\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096"+
		"\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098"+
		"\u0099\u0005\u001a\u0000\u0000\u0099\u009a\u0003\u001e\u000f\u0000\u009a"+
		"\u009b\u0005\u001b\u0000\u0000\u009b\u009e\u0003\u0012\t\u0000\u009c\u009d"+
		"\u0005\u0004\u0000\u0000\u009d\u009f\u0003\u0012\t\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0017\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a2\u0005"+
		"\u001a\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a4\u0005"+
		"\u001b\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u0019\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00aa\u0005\u001a"+
		"\u0000\u0000\u00a8\u00ab\u0003\n\u0005\u0000\u00a9\u00ab\u0003\u001e\u000f"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0005\u001f\u0000\u0000\u00ad\u00af\u0003\u001e\u000f"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u001f\u0000"+
		"\u0000\u00b1\u00b3\u0003\u001e\u000f\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b6\u0003\u0012\t\u0000"+
		"\u00b6\u001b\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0007\u0000\u0000"+
		"\u00b8\u00ba\u0003\u001e\u000f\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0006\u000f\uffff\uffff\u0000\u00be\u00bf\u0005\u001a\u0000"+
		"\u0000\u00bf\u00c0\u0003\u001e\u000f\u0000\u00c0\u00c1\u0005\u001b\u0000"+
		"\u0000\u00c1\u00cc\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\r\u0000\u0000"+
		"\u00c3\u00c4\u0007\u0000\u0000\u0000\u00c4\u00cc\u0003\u001e\u000f\u0006"+
		"\u00c5\u00c6\u0005\r\u0000\u0000\u00c6\u00cc\u0005\u0019\u0000\u0000\u00c7"+
		"\u00cc\u0005\u000e\u0000\u0000\u00c8\u00cc\u0005\u000f\u0000\u0000\u00c9"+
		"\u00cc\u0005\r\u0000\u0000\u00ca\u00cc\u0003 \u0010\u0000\u00cb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c2\u0001\u0000\u0000\u0000\u00cb\u00c5"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d8\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\n\t\u0000\u0000\u00ce\u00cf\u0005\u0014\u0000\u0000\u00cf\u00d7\u0003"+
		"\u001e\u000f\n\u00d0\u00d1\n\b\u0000\u0000\u00d1\u00d2\u0005\u0015\u0000"+
		"\u0000\u00d2\u00d7\u0003\u001e\u000f\t\u00d3\u00d4\n\u0007\u0000\u0000"+
		"\u00d4\u00d5\u0005\u0016\u0000\u0000\u00d5\u00d7\u0003\u001e\u000f\b\u00d6"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u001f\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005\r\u0000\u0000\u00dc\u00e5\u0005\u001a\u0000\u0000\u00dd\u00e2"+
		"\u0003\u001e\u000f\u0000\u00de\u00df\u0005\u001e\u0000\u0000\u00df\u00e1"+
		"\u0003\u001e\u000f\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u001b\u0000\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007"+
		"\u0001\u0000\u0000\u00ea#\u0001\u0000\u0000\u0000\u001a(*35>ERW[]dls}"+
		"\u008c\u0092\u009e\u00aa\u00ae\u00b2\u00b9\u00cb\u00d6\u00d8\u00e2\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}