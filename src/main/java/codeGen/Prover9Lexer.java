// Generated from C:/projects/SpassAndProver9/src/grammar\Prover9.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Prover9Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
		FORMULAS=18, END_OF_LIST=19, ASSUMPLTIONS=20, GOALS=21, TRUE=22, FALSE=23,
		LPAREN=24, RPAREN=25, DOT=26, COMMA=27, NOT=28, OR=29, AND=30, IMPL=31,
		BIMPL=32, BIDIR=33, FORALL=34, EXISTS=35, TEXT=36, WS=37, LINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
			"FORMULAS", "END_OF_LIST", "ASSUMPLTIONS", "GOALS", "TRUE", "FALSE",
			"LPAREN", "RPAREN", "DOT", "COMMA", "NOT", "OR", "AND", "IMPL", "BIMPL",
			"BIDIR", "FORALL", "EXISTS", "LETTER", "TEXT", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'positive'", "'negative'", "'mixed'", "'unit'", "'horn'", "'definite'",
			"'has_equality'", "'true'", "'false'", "'initial'", "'resolvent'", "'hyper_resolvent'",
			"'ur_resolvent'", "'factor'", "'subsumer'", "'back_demodulant'", "'paramodulant'",
			"'formulas'", "'end_of_list'", "'assumptions'", "'goals'", "'$T'", "'$F'",
			"'('", "')'", "'.'", "','", "'-'", "'|'", "'&'", "'->'", "'<-'", "'<->'",
			"'all'", "'exists'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, "FORMULAS", "END_OF_LIST", "ASSUMPLTIONS",
			"GOALS", "TRUE", "FALSE", "LPAREN", "RPAREN", "DOT", "COMMA", "NOT",
			"OR", "AND", "IMPL", "BIMPL", "BIDIR", "FORALL", "EXISTS", "TEXT", "WS",
			"LINE_COMMENT"
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


	public Prover9Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prover9.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3&\6&\u0144\n&\r&\16&\u0145\3\'\6\'\u0149\n\'\r\'\16\'\u014a\3\'\3\'"+
		"\3(\3(\7(\u0151\n(\f(\16(\u0154\13(\3(\3(\3(\3(\3\u0152\2)\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I\2K&M\'O(\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u015a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5Z\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13n\3"+
		"\2\2\2\rs\3\2\2\2\17|\3\2\2\2\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25\u0094"+
		"\3\2\2\2\27\u009c\3\2\2\2\31\u00a6\3\2\2\2\33\u00b6\3\2\2\2\35\u00c3\3"+
		"\2\2\2\37\u00ca\3\2\2\2!\u00d3\3\2\2\2#\u00e3\3\2\2\2%\u00f0\3\2\2\2\'"+
		"\u00f9\3\2\2\2)\u0105\3\2\2\2+\u0111\3\2\2\2-\u0117\3\2\2\2/\u011a\3\2"+
		"\2\2\61\u011d\3\2\2\2\63\u011f\3\2\2\2\65\u0121\3\2\2\2\67\u0123\3\2\2"+
		"\29\u0125\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2?\u012b\3\2\2\2A\u012e"+
		"\3\2\2\2C\u0131\3\2\2\2E\u0135\3\2\2\2G\u0139\3\2\2\2I\u0140\3\2\2\2K"+
		"\u0143\3\2\2\2M\u0148\3\2\2\2O\u014e\3\2\2\2QR\7r\2\2RS\7q\2\2ST\7u\2"+
		"\2TU\7k\2\2UV\7v\2\2VW\7k\2\2WX\7x\2\2XY\7g\2\2Y\4\3\2\2\2Z[\7p\2\2[\\"+
		"\7g\2\2\\]\7i\2\2]^\7c\2\2^_\7v\2\2_`\7k\2\2`a\7x\2\2ab\7g\2\2b\6\3\2"+
		"\2\2cd\7o\2\2de\7k\2\2ef\7z\2\2fg\7g\2\2gh\7f\2\2h\b\3\2\2\2ij\7w\2\2"+
		"jk\7p\2\2kl\7k\2\2lm\7v\2\2m\n\3\2\2\2no\7j\2\2op\7q\2\2pq\7t\2\2qr\7"+
		"p\2\2r\f\3\2\2\2st\7f\2\2tu\7g\2\2uv\7h\2\2vw\7k\2\2wx\7p\2\2xy\7k\2\2"+
		"yz\7v\2\2z{\7g\2\2{\16\3\2\2\2|}\7j\2\2}~\7c\2\2~\177\7u\2\2\177\u0080"+
		"\7a\2\2\u0080\u0081\7g\2\2\u0081\u0082\7s\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7k\2\2\u0086\u0087\7v\2\2"+
		"\u0087\u0088\7{\2\2\u0088\20\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b\7"+
		"t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d\22\3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7g\2\2\u0093\24\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7v\2\2\u0098\u0099\7k\2\2\u0099\u009a\7c\2\2"+
		"\u009a\u009b\7n\2\2\u009b\26\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e\7"+
		"g\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\30\3\2\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7{\2\2\u00a8\u00a9\7r\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7a\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7u\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7x\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2\34\3\2\2\2\u00c3\u00c4"+
		"\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7w\2\2"+
		"\u00cf\u00d0\7o\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2 \3\2\2"+
		"\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7"+
		"\7m\2\2\u00d7\u00d8\7a\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7o\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7w\2\2"+
		"\u00de\u00df\7n\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7q\2\2\u00e9"+
		"\u00ea\7f\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7h\2"+
		"\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5"+
		"\7w\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"&\3\2\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7f\2\2\u00fc"+
		"\u00fd\7a\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7a\2\2"+
		"\u0100\u0101\7n\2\2\u0101\u0102\7k\2\2\u0102\u0103\7u\2\2\u0103\u0104"+
		"\7v\2\2\u0104(\3\2\2\2\u0105\u0106\7c\2\2\u0106\u0107\7u\2\2\u0107\u0108"+
		"\7u\2\2\u0108\u0109\7w\2\2\u0109\u010a\7o\2\2\u010a\u010b\7r\2\2\u010b"+
		"\u010c\7v\2\2\u010c\u010d\7k\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2"+
		"\u010f\u0110\7u\2\2\u0110*\3\2\2\2\u0111\u0112\7i\2\2\u0112\u0113\7q\2"+
		"\2\u0113\u0114\7c\2\2\u0114\u0115\7n\2\2\u0115\u0116\7u\2\2\u0116,\3\2"+
		"\2\2\u0117\u0118\7&\2\2\u0118\u0119\7V\2\2\u0119.\3\2\2\2\u011a\u011b"+
		"\7&\2\2\u011b\u011c\7H\2\2\u011c\60\3\2\2\2\u011d\u011e\7*\2\2\u011e\62"+
		"\3\2\2\2\u011f\u0120\7+\2\2\u0120\64\3\2\2\2\u0121\u0122\7\60\2\2\u0122"+
		"\66\3\2\2\2\u0123\u0124\7.\2\2\u01248\3\2\2\2\u0125\u0126\7/\2\2\u0126"+
		":\3\2\2\2\u0127\u0128\7~\2\2\u0128<\3\2\2\2\u0129\u012a\7(\2\2\u012a>"+
		"\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7@\2\2\u012d@\3\2\2\2\u012e\u012f"+
		"\7>\2\2\u012f\u0130\7/\2\2\u0130B\3\2\2\2\u0131\u0132\7>\2\2\u0132\u0133"+
		"\7/\2\2\u0133\u0134\7@\2\2\u0134D\3\2\2\2\u0135\u0136\7c\2\2\u0136\u0137"+
		"\7n\2\2\u0137\u0138\7n\2\2\u0138F\3\2\2\2\u0139\u013a\7g\2\2\u013a\u013b"+
		"\7z\2\2\u013b\u013c\7k\2\2\u013c\u013d\7u\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7u\2\2\u013fH\3\2\2\2\u0140\u0141\t\2\2\2\u0141J\3\2\2\2\u0142"+
		"\u0144\5I%\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146L\3\2\2\2\u0147\u0149\t\3\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\b\'\2\2\u014dN\3\2\2\2\u014e\u0152\7\'\2\2"+
		"\u014f\u0151\13\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\7\f\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b(\2\2\u0158P\3\2\2\2\6"+
		"\2\u0145\u014a\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
