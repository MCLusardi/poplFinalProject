// Generated from /Users/erikazhou/Mizzou/CS4450 PoPL/poplFinalProject/popl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class poplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, LETTER=12, VARNAME=13, NEWLINE=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "LOWER", "UPPER", "DIGIT", "NUMBER", "LETTER", "VARNAME", "NEWLINE", 
			"WHITESPACE"
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


	public poplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "popl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\5\17G\n\17\3\17\6\17J\n\17\r\17\16\17K\3\20\3\20\3\20\5\20Q\n\20\3\21"+
		"\3\21\3\21\7\21V\n\21\f\21\16\21Y\13\21\3\22\6\22\\\n\22\r\22\16\22]\3"+
		"\23\6\23a\n\23\r\23\16\23b\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\2\31\2\33\2\35\r\37\16!\17#\20%\21\3\2\b\3\2c|\3\2C\\\3\2"+
		"\62;\3\2//\4\2\f\f\17\17\3\2\"\"\2h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r"+
		"\61\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27?\3"+
		"\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35F\3\2\2\2\37P\3\2\2\2!R\3\2\2\2#[\3\2"+
		"\2\2%`\3\2\2\2\'(\7-\2\2(\4\3\2\2\2)*\7/\2\2*\6\3\2\2\2+,\7,\2\2,\b\3"+
		"\2\2\2-.\7\61\2\2.\n\3\2\2\2/\60\7\'\2\2\60\f\3\2\2\2\61\62\7?\2\2\62"+
		"\16\3\2\2\2\63\64\7-\2\2\64\65\7?\2\2\65\20\3\2\2\2\66\67\7/\2\2\678\7"+
		"?\2\28\22\3\2\2\29:\7,\2\2:;\7?\2\2;\24\3\2\2\2<=\7\61\2\2=>\7?\2\2>\26"+
		"\3\2\2\2?@\t\2\2\2@\30\3\2\2\2AB\t\3\2\2B\32\3\2\2\2CD\t\4\2\2D\34\3\2"+
		"\2\2EG\t\5\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\5\33\16\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2L\36\3\2\2\2MQ\5\27\f\2NQ\5\31\r\2OQ\7a\2\2"+
		"PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q \3\2\2\2RW\5\37\20\2SV\5\37\20\2TV\5\33"+
		"\16\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\"\3\2\2\2YW\3"+
		"\2\2\2Z\\\t\6\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^$\3\2\2\2_"+
		"a\t\7\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c&\3\2\2\2\n\2FKPUW]"+
		"b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}