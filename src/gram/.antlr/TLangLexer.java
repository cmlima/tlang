// Generated from c:\Users\cmlima\Desenvolvimento\UAM\COMPILADORES\projeto-tlang\src\gram\TLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAREN_E=1, PAREN_D=2, CHAVE_E=3, CHAVE_D=4, ATR=5, MAIORQ=6, MENORQ=7, 
		MAIORIG=8, MENORIG=9, IGUAL=10, DIF=11, E=12, OU=13, NAO=14, SOMA=15, 
		SUB=16, MULT=17, DIV=18, INC=19, DEC=20, SOMA_ATR=21, SUB_ATR=22, MULT_ATR=23, 
		DIV_ATR=24, LEIA_NUM=25, LEIA_TXT=26, LEIA_BOOL=27, ESCREVA=28, SE=29, 
		SENAOSE=30, SENAO=31, ENQUANTO=32, DE=33, ATE=34, T_NUM=35, T_TXT=36, 
		T_BOOL=37, NUM=38, TXT=39, BOOL=40, ID=41, ESP=42, COM=43, COM_LIN=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAREN_E", "PAREN_D", "CHAVE_E", "CHAVE_D", "ATR", "MAIORQ", "MENORQ", 
			"MAIORIG", "MENORIG", "IGUAL", "DIF", "E", "OU", "NAO", "SOMA", "SUB", 
			"MULT", "DIV", "INC", "DEC", "SOMA_ATR", "SUB_ATR", "MULT_ATR", "DIV_ATR", 
			"LEIA_NUM", "LEIA_TXT", "LEIA_BOOL", "ESCREVA", "SE", "SENAOSE", "SENAO", 
			"ENQUANTO", "DE", "ATE", "T_NUM", "T_TXT", "T_BOOL", "NUM", "TXT", "BOOL", 
			"ID", "HEX", "UNICODE", "ESC", "ASPAS", "ESP", "COM", "COM_LIN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'+='", "'-='", "'*='", "'/='", "'leiaNumero'", "'leiaTexto'", 
			"'leiaBooleano'", "'escreva'", "'se'", "'senaose'", "'senao'", "'enquanto'", 
			"'de'", "'ate'", "'numero'", "'texto'", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_E", "PAREN_D", "CHAVE_E", "CHAVE_D", "ATR", "MAIORQ", "MENORQ", 
			"MAIORIG", "MENORIG", "IGUAL", "DIF", "E", "OU", "NAO", "SOMA", "SUB", 
			"MULT", "DIV", "INC", "DEC", "SOMA_ATR", "SUB_ATR", "MULT_ATR", "DIV_ATR", 
			"LEIA_NUM", "LEIA_TXT", "LEIA_BOOL", "ESCREVA", "SE", "SENAOSE", "SENAO", 
			"ENQUANTO", "DE", "ATE", "T_NUM", "T_TXT", "T_BOOL", "NUM", "TXT", "BOOL", 
			"ID", "ESP", "COM", "COM_LIN"
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


	public TLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\5\'\u0102\n\'\3\'\6\'\u0105\n\'\r\'\16\'\u0106"+
		"\3\'\3\'\6\'\u010b\n\'\r\'\16\'\u010c\7\'\u010f\n\'\f\'\16\'\u0112\13"+
		"\'\3(\3(\3(\7(\u0117\n(\f(\16(\u011a\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u012d\n)\3*\3*\7*\u0131\n*\f*\16*\u0134\13*"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\5-\u0141\n-\3.\3.\3/\6/\u0146\n/\r/"+
		"\16/\u0147\3/\3/\3\60\3\60\3\60\3\60\7\60\u0150\n\60\f\60\16\60\u0153"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015e\n\61\f"+
		"\61\16\61\u0161\13\61\3\61\3\61\3\u0151\2\62\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U\2W\2Y\2[\2],_-a.\3\2\n\3\2\62;\4\2$$^^\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\62;CHch\n\2$$\61\61^^ddhhppttvv\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2"+
		"\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23t\3\2\2"+
		"\2\25w\3\2\2\2\27z\3\2\2\2\31}\3\2\2\2\33\u0080\3\2\2\2\35\u0083\3\2\2"+
		"\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2/\u0099\3\2\2\2\61"+
		"\u009c\3\2\2\2\63\u009f\3\2\2\2\65\u00aa\3\2\2\2\67\u00b4\3\2\2\29\u00c1"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cc\3\2\2\2?\u00d4\3\2\2\2A\u00da\3\2\2\2C"+
		"\u00e3\3\2\2\2E\u00e6\3\2\2\2G\u00ea\3\2\2\2I\u00f1\3\2\2\2K\u00f7\3\2"+
		"\2\2M\u0101\3\2\2\2O\u0113\3\2\2\2Q\u012c\3\2\2\2S\u012e\3\2\2\2U\u0135"+
		"\3\2\2\2W\u0137\3\2\2\2Y\u013d\3\2\2\2[\u0142\3\2\2\2]\u0145\3\2\2\2_"+
		"\u014b\3\2\2\2a\u0159\3\2\2\2cd\7*\2\2d\4\3\2\2\2ef\7+\2\2f\6\3\2\2\2"+
		"gh\7}\2\2h\b\3\2\2\2ij\7\177\2\2j\n\3\2\2\2kl\7?\2\2l\f\3\2\2\2mn\7@\2"+
		"\2n\16\3\2\2\2op\7>\2\2p\20\3\2\2\2qr\7@\2\2rs\7?\2\2s\22\3\2\2\2tu\7"+
		">\2\2uv\7?\2\2v\24\3\2\2\2wx\7?\2\2xy\7?\2\2y\26\3\2\2\2z{\7#\2\2{|\7"+
		"?\2\2|\30\3\2\2\2}~\7(\2\2~\177\7(\2\2\177\32\3\2\2\2\u0080\u0081\7~\2"+
		"\2\u0081\u0082\7~\2\2\u0082\34\3\2\2\2\u0083\u0084\7#\2\2\u0084\36\3\2"+
		"\2\2\u0085\u0086\7-\2\2\u0086 \3\2\2\2\u0087\u0088\7/\2\2\u0088\"\3\2"+
		"\2\2\u0089\u008a\7,\2\2\u008a$\3\2\2\2\u008b\u008c\7\61\2\2\u008c&\3\2"+
		"\2\2\u008d\u008e\7-\2\2\u008e\u008f\7-\2\2\u008f(\3\2\2\2\u0090\u0091"+
		"\7/\2\2\u0091\u0092\7/\2\2\u0092*\3\2\2\2\u0093\u0094\7-\2\2\u0094\u0095"+
		"\7?\2\2\u0095,\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7?\2\2\u0098.\3"+
		"\2\2\2\u0099\u009a\7,\2\2\u009a\u009b\7?\2\2\u009b\60\3\2\2\2\u009c\u009d"+
		"\7\61\2\2\u009d\u009e\7?\2\2\u009e\62\3\2\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7P\2\2"+
		"\u00a4\u00a5\7w\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7q\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7V\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7z\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2"+
		"\u00b3\66\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7D\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7q\2\2\u00c08\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7x\2\2\u00c7\u00c8\7c\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7u\2"+
		"\2\u00ca\u00cb\7g\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7"+
		"g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\u00d3\7g\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"@\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7s\2\2\u00dd"+
		"\u00de\7w\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1\u00e2\7q\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7g\2"+
		"\2\u00e5D\3\2\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7"+
		"g\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed"+
		"\7o\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"H\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7z\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5\u00f6\7q\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7d\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7q\2\2\u00ffL\3\2\2"+
		"\2\u0100\u0102\7/\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0110\3\2\2\2\u0108\u010a\7\60"+
		"\2\2\u0109\u010b\t\2\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0108\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"N\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0118\5[.\2\u0114\u0117\n\3\2\2\u0115"+
		"\u0117\5Y-\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\5[.\2\u011cP\3\2\2\2\u011d\u011e\7x\2\2\u011e\u011f"+
		"\7g\2\2\u011f\u0120\7t\2\2\u0120\u0121\7f\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7k\2\2\u0125\u0126\7t\2\2"+
		"\u0126\u012d\7q\2\2\u0127\u0128\7h\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7n\2\2\u012a\u012b\7u\2\2\u012b\u012d\7q\2\2\u012c\u011d\3\2\2\2\u012c"+
		"\u0127\3\2\2\2\u012dR\3\2\2\2\u012e\u0132\t\4\2\2\u012f\u0131\t\5\2\2"+
		"\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133T\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\t\6\2\2\u0136"+
		"V\3\2\2\2\u0137\u0138\7w\2\2\u0138\u0139\5U+\2\u0139\u013a\5U+\2\u013a"+
		"\u013b\5U+\2\u013b\u013c\5U+\2\u013cX\3\2\2\2\u013d\u0140\7^\2\2\u013e"+
		"\u0141\t\7\2\2\u013f\u0141\5W,\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2"+
		"\2\u0141Z\3\2\2\2\u0142\u0143\7$\2\2\u0143\\\3\2\2\2\u0144\u0146\t\b\2"+
		"\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b/\2\2\u014a^\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\60\3\2\u0158`\3\2\2"+
		"\2\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c"+
		"\u015e\n\t\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\b\61\3\2\u0163b\3\2\2\2\17\2\u0101\u0106\u010c\u0110\u0116\u0118"+
		"\u012c\u0132\u0140\u0147\u0151\u015f\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}