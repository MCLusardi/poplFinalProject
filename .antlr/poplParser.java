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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, LETTER=12, VARNAME=13, NEWLINE=14, WHITESPACE=15;
	public static final int
		RULE_prog = 0, RULE_variable = 1, RULE_expression = 2, RULE_arithmetic = 3, 
		RULE_plus = 4, RULE_minus = 5, RULE_mult = 6, RULE_div = 7, RULE_mod = 8, 
		RULE_assignment = 9, RULE_equals = 10, RULE_pluseq = 11, RULE_minuseq = 12, 
		RULE_multeq = 13, RULE_diveq = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "variable", "expression", "arithmetic", "plus", "minus", "mult", 
			"div", "mod", "assignment", "equals", "pluseq", "minuseq", "multeq", 
			"diveq"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"LETTER", "VARNAME", "NEWLINE", "WHITESPACE"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				expression();
				setState(31);
				match(NEWLINE);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==VARNAME );
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
			setState(37);
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
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(39);
				assignment();
				}
				break;
			case 2:
				{
				setState(40);
				arithmetic();
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

	public static class ArithmeticContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43);
				plus();
				}
				break;
			case 2:
				{
				setState(44);
				minus();
				}
				break;
			case 3:
				{
				setState(45);
				mult();
				}
				break;
			case 4:
				{
				setState(46);
				div();
				}
				break;
			case 5:
				{
				setState(47);
				mod();
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

	public static class PlusContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(poplParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(poplParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(54);
				match(WHITESPACE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(61);
				match(WHITESPACE);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(67);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(68);
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

	public static class MinusContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(poplParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(poplParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(71);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(72);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(75);
				match(WHITESPACE);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__1);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(82);
				match(WHITESPACE);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(88);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(89);
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

	public static class MultContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(poplParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(poplParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(92);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(93);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(96);
				match(WHITESPACE);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__2);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(103);
				match(WHITESPACE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(109);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(110);
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

	public static class DivContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(poplParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(poplParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(113);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(114);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(117);
				match(WHITESPACE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__3);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(124);
				match(WHITESPACE);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(130);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(131);
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

	public static class ModContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(poplParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(poplParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(poplParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(poplParser.WHITESPACE, i);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(134);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(135);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(138);
				match(WHITESPACE);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__4);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(145);
				match(WHITESPACE);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(151);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(152);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(155);
				equals();
				}
				break;
			case 2:
				{
				setState(156);
				pluseq();
				}
				break;
			case 3:
				{
				setState(157);
				minuseq();
				}
				break;
			case 4:
				{
				setState(158);
				multeq();
				}
				break;
			case 5:
				{
				setState(159);
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
		enterRule(_localctx, 20, RULE_equals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			variable();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(163);
				match(WHITESPACE);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__5);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(170);
				match(WHITESPACE);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(176);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(177);
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
		enterRule(_localctx, 22, RULE_pluseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			variable();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(181);
				match(WHITESPACE);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__6);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(188);
				match(WHITESPACE);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(194);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(195);
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
		enterRule(_localctx, 24, RULE_minuseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			variable();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(199);
				match(WHITESPACE);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__7);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(206);
				match(WHITESPACE);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(212);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(213);
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
		enterRule(_localctx, 26, RULE_multeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			variable();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(217);
				match(WHITESPACE);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__8);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(224);
				match(WHITESPACE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(230);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(231);
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
		enterRule(_localctx, 28, RULE_diveq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			variable();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(235);
				match(WHITESPACE);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__9);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(242);
				match(WHITESPACE);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(248);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(249);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3"+
		"\6\3\6\5\6\67\n\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\7\6A\n\6\f\6\16"+
		"\6D\13\6\3\6\3\6\5\6H\n\6\3\7\3\7\5\7L\n\7\3\7\7\7O\n\7\f\7\16\7R\13\7"+
		"\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\5\7]\n\7\3\b\3\b\5\ba\n\b\3\b"+
		"\7\bd\n\b\f\b\16\bg\13\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\5\br"+
		"\n\b\3\t\3\t\5\tv\n\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\7\t\u0080\n"+
		"\t\f\t\16\t\u0083\13\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\5\n\u008b\n\n\3\n"+
		"\7\n\u008e\n\n\f\n\16\n\u0091\13\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098"+
		"\13\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3"+
		"\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\f\3\f\7\f\u00ae\n\f\f\f\16"+
		"\f\u00b1\13\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc"+
		"\13\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\r\3\r\5\r\u00c7\n\r"+
		"\3\16\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\7\16\u00d2"+
		"\n\16\f\16\16\16\u00d5\13\16\3\16\3\16\5\16\u00d9\n\16\3\17\3\17\7\17"+
		"\u00dd\n\17\f\17\16\17\u00e0\13\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17"+
		"\u00e7\13\17\3\17\3\17\5\17\u00eb\n\17\3\20\3\20\7\20\u00ef\n\20\f\20"+
		"\16\20\u00f2\13\20\3\20\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3"+
		"\20\3\20\5\20\u00fd\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36\2\2\2\u011c\2#\3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\b\62\3\2\2\2\n\66"+
		"\3\2\2\2\fK\3\2\2\2\16`\3\2\2\2\20u\3\2\2\2\22\u008a\3\2\2\2\24\u00a2"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00b6\3\2\2\2\32\u00c8\3\2\2\2\34\u00da\3"+
		"\2\2\2\36\u00ec\3\2\2\2 !\5\6\4\2!\"\7\20\2\2\"$\3\2\2\2# \3\2\2\2$%\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\7\17\2\2(\5\3\2\2\2),\5\24\13"+
		"\2*,\5\b\5\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-\63\5\n\6\2.\63\5\f\7\2/\63"+
		"\5\16\b\2\60\63\5\20\t\2\61\63\5\22\n\2\62-\3\2\2\2\62.\3\2\2\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\t\3\2\2\2\64\67\5\4\3\2\65\67\7"+
		"\r\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67;\3\2\2\28:\7\21\2\298\3\2\2\2:="+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>B\7\3\2\2?A\7\21\2\2"+
		"@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CG\3\2\2\2DB\3\2\2\2EH\5\4\3\2"+
		"FH\7\r\2\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IL\5\4\3\2JL\7\r\2\2KI\3\2\2"+
		"\2KJ\3\2\2\2LP\3\2\2\2MO\7\21\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QS\3\2\2\2RP\3\2\2\2SW\7\4\2\2TV\7\21\2\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X\\\3\2\2\2YW\3\2\2\2Z]\5\4\3\2[]\7\r\2\2\\Z\3\2\2\2\\"+
		"[\3\2\2\2]\r\3\2\2\2^a\5\4\3\2_a\7\r\2\2`^\3\2\2\2`_\3\2\2\2ae\3\2\2\2"+
		"bd\7\21\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2"+
		"\2hl\7\5\2\2ik\7\21\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mq\3\2"+
		"\2\2nl\3\2\2\2or\5\4\3\2pr\7\r\2\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2sv\5"+
		"\4\3\2tv\7\r\2\2us\3\2\2\2ut\3\2\2\2vz\3\2\2\2wy\7\21\2\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0081\7\6\2\2~\u0080"+
		"\7\21\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\5\4\3\2\u0085"+
		"\u0087\7\r\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\21\3\2\2"+
		"\2\u0088\u008b\5\4\3\2\u0089\u008b\7\r\2\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008e\7\21\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\7\7\2\2\u0093\u0095\7\21\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009c\5\4\3\2\u009a"+
		"\u009c\7\r\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\23\3\2\2"+
		"\2\u009d\u00a3\5\26\f\2\u009e\u00a3\5\30\r\2\u009f\u00a3\5\32\16\2\u00a0"+
		"\u00a3\5\34\17\2\u00a1\u00a3\5\36\20\2\u00a2\u009d\3\2\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\25\3\2\2\2\u00a4\u00a8\5\4\3\2\u00a5\u00a7\7\21\2\2\u00a6\u00a5\3\2\2"+
		"\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\7\b\2\2\u00ac\u00ae\7\21\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\5\4\3\2\u00b3"+
		"\u00b5\7\r\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\27\3\2\2"+
		"\2\u00b6\u00ba\5\4\3\2\u00b7\u00b9\7\21\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7\t\2\2\u00be\u00c0\7\21\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\5\4\3\2\u00c5"+
		"\u00c7\7\r\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\31\3\2\2"+
		"\2\u00c8\u00cc\5\4\3\2\u00c9\u00cb\7\21\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\7\n\2\2\u00d0\u00d2\7\21\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\5\4\3\2\u00d7"+
		"\u00d9\7\r\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\33\3\2\2"+
		"\2\u00da\u00de\5\4\3\2\u00db\u00dd\7\21\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\7\13\2\2\u00e2\u00e4\7\21\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\5\4\3\2\u00e9"+
		"\u00eb\7\r\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\35\3\2\2"+
		"\2\u00ec\u00f0\5\4\3\2\u00ed\u00ef\7\21\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f7\7\f\2\2\u00f4\u00f6\7\21\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\5\4\3\2\u00fb"+
		"\u00fd\7\r\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\37\3\2\2"+
		"\2)%+\62\66;BGKPW\\`elquz\u0081\u0086\u008a\u008f\u0096\u009b\u00a2\u00a8"+
		"\u00af\u00b4\u00ba\u00c1\u00c6\u00cc\u00d3\u00d8\u00de\u00e5\u00ea\u00f0"+
		"\u00f7\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}