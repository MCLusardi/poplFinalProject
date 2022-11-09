// Generated from /Users/erikazhou/Mizzou/CS4450 PoPL/poplFinalProject/popl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class poplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUMBER=6, LETTER=7, VARNAME=8, 
		NEWLINE=9, WHITESPACE=10;
	public static final int
		RULE_prog = 0, RULE_variable = 1, RULE_expression = 2, RULE_assignment = 3, 
		RULE_equals = 4, RULE_pluseq = 5, RULE_minuseq = 6, RULE_multeq = 7, RULE_diveq = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "variable", "expression", "assignment", "equals", "pluseq", "minuseq", 
			"multeq", "diveq"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUMBER", "LETTER", "VARNAME", "NEWLINE", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "popl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public poplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(poplParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(poplParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				expression();
				setState(19);
				match(NEWLINE);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARNAME );
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(poplParser.VARNAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(VARNAME);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public PluseqContext pluseq() {
			return getRuleContext(PluseqContext.class,0);
		}
		public MinuseqContext minuseq() {
			return getRuleContext(MinuseqContext.class,0);
		}
		public MulteqContext multeq() {
			return getRuleContext(MulteqContext.class,0);
		}
		public DiveqContext diveq() {
			return getRuleContext(DiveqContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29);
				equals();
				}
				break;
			case 2:
				{
				setState(30);
				pluseq();
				}
				break;
			case 3:
				{
				setState(31);
				minuseq();
				}
				break;
			case 4:
				{
				setState(32);
				multeq();
				}
				break;
			case 5:
				{
				setState(33);
				diveq();
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

	public static class EqualsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(poplParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			variable();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(37);
				match(WHITESPACE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(44);
				match(WHITESPACE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(50);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(51);
				match(NUMBER);
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

	public static class PluseqContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(poplParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public PluseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluseq; }
	}

	public final PluseqContext pluseq() throws RecognitionException {
		PluseqContext _localctx = new PluseqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pluseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			variable();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(55);
				match(WHITESPACE);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(62);
				match(WHITESPACE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(68);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(69);
				match(NUMBER);
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

	public static class MinuseqContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(poplParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public MinuseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuseq; }
	}

	public final MinuseqContext minuseq() throws RecognitionException {
		MinuseqContext _localctx = new MinuseqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_minuseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			variable();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(73);
				match(WHITESPACE);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__2);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(80);
				match(WHITESPACE);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(86);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(87);
				match(NUMBER);
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

	public static class MulteqContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(poplParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public MulteqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multeq; }
	}

	public final MulteqContext multeq() throws RecognitionException {
		MulteqContext _localctx = new MulteqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			variable();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(91);
				match(WHITESPACE);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__3);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(98);
				match(WHITESPACE);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(104);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(105);
				match(NUMBER);
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

	public static class DiveqContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(poplParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public DiveqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diveq; }
	}

	public final DiveqContext diveq() throws RecognitionException {
		DiveqContext _localctx = new DiveqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_diveq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			variable();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(109);
				match(WHITESPACE);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__4);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(116);
				match(WHITESPACE);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(122);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(123);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5%\n"+
		"\5\3\6\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6"+
		"\3\6\3\6\5\6\67\n\6\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\7\7B\n\7\f"+
		"\7\16\7E\13\7\3\7\3\7\5\7I\n\7\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b"+
		"\7\bT\n\b\f\b\16\bW\13\b\3\b\3\b\5\b[\n\b\3\t\3\t\7\t_\n\t\f\t\16\tb\13"+
		"\t\3\t\3\t\7\tf\n\t\f\t\16\ti\13\t\3\t\3\t\5\tm\n\t\3\n\3\n\7\nq\n\n\f"+
		"\n\16\nt\13\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\n\3\n\5\n\177\n\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\u008b\2\27\3\2\2\2\4\33\3\2\2\2\6\35"+
		"\3\2\2\2\b$\3\2\2\2\n&\3\2\2\2\f8\3\2\2\2\16J\3\2\2\2\20\\\3\2\2\2\22"+
		"n\3\2\2\2\24\25\5\6\4\2\25\26\7\13\2\2\26\30\3\2\2\2\27\24\3\2\2\2\30"+
		"\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\7\n\2\2\34"+
		"\5\3\2\2\2\35\36\5\b\5\2\36\7\3\2\2\2\37%\5\n\6\2 %\5\f\7\2!%\5\16\b\2"+
		"\"%\5\20\t\2#%\5\22\n\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3"+
		"\2\2\2%\t\3\2\2\2&*\5\4\3\2\')\7\f\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2"+
		"*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-\61\7\3\2\2.\60\7\f\2\2/.\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\66\3\2\2\2\63\61\3\2\2\2\64\67\5"+
		"\4\3\2\65\67\7\b\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\28<\5\4\3"+
		"\29;\7\f\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2"+
		"\2?C\7\4\2\2@B\7\f\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2"+
		"\2EC\3\2\2\2FI\5\4\3\2GI\7\b\2\2HF\3\2\2\2HG\3\2\2\2I\r\3\2\2\2JN\5\4"+
		"\3\2KM\7\f\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2"+
		"\2\2QU\7\5\2\2RT\7\f\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VZ\3\2"+
		"\2\2WU\3\2\2\2X[\5\4\3\2Y[\7\b\2\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\`"+
		"\5\4\3\2]_\7\f\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b"+
		"`\3\2\2\2cg\7\6\2\2df\7\f\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hl\3\2\2\2ig\3\2\2\2jm\5\4\3\2km\7\b\2\2lj\3\2\2\2lk\3\2\2\2m\21\3\2\2"+
		"\2nr\5\4\3\2oq\7\f\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2"+
		"\2tr\3\2\2\2uy\7\7\2\2vx\7\f\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z~\3\2\2\2{y\3\2\2\2|\177\5\4\3\2}\177\7\b\2\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\23\3\2\2\2\23\31$*\61\66<CHNUZ`glry~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}