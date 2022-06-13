// Generated from c:\Users\cmlima\Desenvolvimento\UAM\COMPILADORES\tlang\src\gram\TLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAREN_E=1, PAREN_D=2, CHAVE_E=3, CHAVE_D=4, ATR=5, CONCAT=6, MAIORQ=7, 
		MENORQ=8, MAIORIG=9, MENORIG=10, IGUAL=11, DIF=12, E=13, OU=14, NAO=15, 
		SOMA=16, SUB=17, MULT=18, DIV=19, INC=20, DEC=21, SOMA_ATR=22, SUB_ATR=23, 
		MULT_ATR=24, DIV_ATR=25, LEIA_NUM=26, LEIA_TXT=27, LEIA_BOOL=28, ESCREVA=29, 
		SE=30, SENAOSE=31, SENAO=32, ENQUANTO=33, DE=34, ATE=35, T_NUM=36, T_TXT=37, 
		T_BOOL=38, NUM=39, TXT=40, BOOL=41, ID=42, ESP=43, COM=44, COM_LIN=45;
	public static final int
		RULE_iniciar = 0, RULE_bloco = 1, RULE_op_atr = 2, RULE_op_atr_num = 3, 
		RULE_op_atr_txt = 4, RULE_op_concat = 5, RULE_op_bool = 6, RULE_op_rel = 7, 
		RULE_op_maiorq = 8, RULE_op_menorq = 9, RULE_op_maiorig = 10, RULE_op_menorig = 11, 
		RULE_op_igual = 12, RULE_op_dif = 13, RULE_op_e = 14, RULE_op_ou = 15, 
		RULE_op_nao = 16, RULE_op_soma = 17, RULE_op_sub = 18, RULE_op_mult = 19, 
		RULE_op_div = 20, RULE_op_inc = 21, RULE_op_dec = 22, RULE_op_soma_atr = 23, 
		RULE_op_sub_atr = 24, RULE_op_mult_atr = 25, RULE_op_div_atr = 26, RULE_atr = 27, 
		RULE_atr_simples = 28, RULE_decl = 29, RULE_leitura = 30, RULE_leitura_num = 31, 
		RULE_leitura_txt = 32, RULE_leitura_bool = 33, RULE_escrita = 34, RULE_expr = 35, 
		RULE_expr_bool = 36, RULE_termo_bool = 37, RULE_expr_rel = 38, RULE_termo_rel = 39, 
		RULE_expr_ig = 40, RULE_termo_ig = 41, RULE_expr_aritm = 42, RULE_expr_soma = 43, 
		RULE_expr_sub = 44, RULE_expr_mult = 45, RULE_expr_div = 46, RULE_termo = 47, 
		RULE_expr_txt = 48, RULE_termo_txt = 49, RULE_estr_cond = 50, RULE_controle_cond = 51, 
		RULE_estr_cond_sec = 52, RULE_controle_cond_sec = 53, RULE_estr_cond_alt = 54, 
		RULE_estr_repet = 55, RULE_estr_enquanto = 56, RULE_controle_enquanto = 57, 
		RULE_estr_de_ate = 58, RULE_controle_de_ate = 59, RULE_ctr_id = 60, RULE_ctr_inicial = 61, 
		RULE_ctr_final = 62, RULE_val = 63, RULE_num = 64, RULE_txt = 65, RULE_bool = 66, 
		RULE_id = 67, RULE_tipo = 68, RULE_t_numero = 69, RULE_t_texto = 70, RULE_t_booleano = 71, 
		RULE_leia_num = 72, RULE_leia_txt = 73, RULE_leia_bool = 74, RULE_escreva = 75, 
		RULE_se = 76, RULE_senaose = 77, RULE_senao = 78, RULE_enquanto = 79, 
		RULE_de = 80, RULE_ate = 81, RULE_paren_e = 82, RULE_paren_d = 83, RULE_chave_e = 84, 
		RULE_chave_d = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"iniciar", "bloco", "op_atr", "op_atr_num", "op_atr_txt", "op_concat", 
			"op_bool", "op_rel", "op_maiorq", "op_menorq", "op_maiorig", "op_menorig", 
			"op_igual", "op_dif", "op_e", "op_ou", "op_nao", "op_soma", "op_sub", 
			"op_mult", "op_div", "op_inc", "op_dec", "op_soma_atr", "op_sub_atr", 
			"op_mult_atr", "op_div_atr", "atr", "atr_simples", "decl", "leitura", 
			"leitura_num", "leitura_txt", "leitura_bool", "escrita", "expr", "expr_bool", 
			"termo_bool", "expr_rel", "termo_rel", "expr_ig", "termo_ig", "expr_aritm", 
			"expr_soma", "expr_sub", "expr_mult", "expr_div", "termo", "expr_txt", 
			"termo_txt", "estr_cond", "controle_cond", "estr_cond_sec", "controle_cond_sec", 
			"estr_cond_alt", "estr_repet", "estr_enquanto", "controle_enquanto", 
			"estr_de_ate", "controle_de_ate", "ctr_id", "ctr_inicial", "ctr_final", 
			"val", "num", "txt", "bool", "id", "tipo", "t_numero", "t_texto", "t_booleano", 
			"leia_num", "leia_txt", "leia_bool", "escreva", "se", "senaose", "senao", 
			"enquanto", "de", "ate", "paren_e", "paren_d", "chave_e", "chave_d"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'&'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'leiaNumero'", "'leiaTexto'", 
			"'leiaBooleano'", "'escreva'", "'se'", "'senaose'", "'senao'", "'enquanto'", 
			"'de'", "'ate'", "'numero'", "'texto'", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_E", "PAREN_D", "CHAVE_E", "CHAVE_D", "ATR", "CONCAT", "MAIORQ", 
			"MENORQ", "MAIORIG", "MENORIG", "IGUAL", "DIF", "E", "OU", "NAO", "SOMA", 
			"SUB", "MULT", "DIV", "INC", "DEC", "SOMA_ATR", "SUB_ATR", "MULT_ATR", 
			"DIV_ATR", "LEIA_NUM", "LEIA_TXT", "LEIA_BOOL", "ESCREVA", "SE", "SENAOSE", 
			"SENAO", "ENQUANTO", "DE", "ATE", "T_NUM", "T_TXT", "T_BOOL", "NUM", 
			"TXT", "BOOL", "ID", "ESP", "COM", "COM_LIN"
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
	public String getGrammarFileName() { return "TLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IniciarContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IniciarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciar; }
	}

	public final IniciarContext iniciar() throws RecognitionException {
		IniciarContext _localctx = new IniciarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_iniciar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			bloco();
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

	public static class BlocoContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<Atr_simplesContext> atr_simples() {
			return getRuleContexts(Atr_simplesContext.class);
		}
		public Atr_simplesContext atr_simples(int i) {
			return getRuleContext(Atr_simplesContext.class,i);
		}
		public List<EscritaContext> escrita() {
			return getRuleContexts(EscritaContext.class);
		}
		public EscritaContext escrita(int i) {
			return getRuleContext(EscritaContext.class,i);
		}
		public List<Estr_condContext> estr_cond() {
			return getRuleContexts(Estr_condContext.class);
		}
		public Estr_condContext estr_cond(int i) {
			return getRuleContext(Estr_condContext.class,i);
		}
		public List<Estr_repetContext> estr_repet() {
			return getRuleContexts(Estr_repetContext.class);
		}
		public Estr_repetContext estr_repet(int i) {
			return getRuleContext(Estr_repetContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_NUM:
				case T_TXT:
				case T_BOOL:
					{
					setState(174);
					decl();
					}
					break;
				case INC:
				case DEC:
				case ID:
					{
					setState(175);
					atr_simples();
					}
					break;
				case ESCREVA:
					{
					setState(176);
					escrita();
					}
					break;
				case SE:
					{
					setState(177);
					estr_cond();
					}
					break;
				case ENQUANTO:
				case DE:
					{
					setState(178);
					estr_repet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ESCREVA) | (1L << SE) | (1L << ENQUANTO) | (1L << DE) | (1L << T_NUM) | (1L << T_TXT) | (1L << T_BOOL) | (1L << ID))) != 0) );
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

	public static class Op_atrContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(TLangParser.ATR, 0); }
		public Op_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr; }
	}

	public final Op_atrContext op_atr() throws RecognitionException {
		Op_atrContext _localctx = new Op_atrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ATR);
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

	public static class Op_atr_numContext extends ParserRuleContext {
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public TerminalNode SOMA_ATR() { return getToken(TLangParser.SOMA_ATR, 0); }
		public TerminalNode SUB_ATR() { return getToken(TLangParser.SUB_ATR, 0); }
		public TerminalNode MULT_ATR() { return getToken(TLangParser.MULT_ATR, 0); }
		public TerminalNode DIV_ATR() { return getToken(TLangParser.DIV_ATR, 0); }
		public Op_atr_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr_num; }
	}

	public final Op_atr_numContext op_atr_num() throws RecognitionException {
		Op_atr_numContext _localctx = new Op_atr_numContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op_atr_num);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(SOMA_ATR);
				}
				break;
			case SUB_ATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(SUB_ATR);
				}
				break;
			case MULT_ATR:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(MULT_ATR);
				}
				break;
			case DIV_ATR:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(DIV_ATR);
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

	public static class Op_atr_txtContext extends ParserRuleContext {
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public TerminalNode SOMA_ATR() { return getToken(TLangParser.SOMA_ATR, 0); }
		public Op_atr_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr_txt; }
	}

	public final Op_atr_txtContext op_atr_txt() throws RecognitionException {
		Op_atr_txtContext _localctx = new Op_atr_txtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_atr_txt);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SOMA_ATR);
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

	public static class Op_concatContext extends ParserRuleContext {
		public TerminalNode CONCAT() { return getToken(TLangParser.CONCAT, 0); }
		public Op_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_concat; }
	}

	public final Op_concatContext op_concat() throws RecognitionException {
		Op_concatContext _localctx = new Op_concatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(CONCAT);
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

	public static class Op_boolContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(TLangParser.E, 0); }
		public TerminalNode OU() { return getToken(TLangParser.OU, 0); }
		public TerminalNode NAO() { return getToken(TLangParser.NAO, 0); }
		public Op_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bool; }
	}

	public final Op_boolContext op_bool() throws RecognitionException {
		Op_boolContext _localctx = new Op_boolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << OU) | (1L << NAO))) != 0)) ) {
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIORQ() { return getToken(TLangParser.MAIORQ, 0); }
		public TerminalNode MENORQ() { return getToken(TLangParser.MENORQ, 0); }
		public TerminalNode MAIORIG() { return getToken(TLangParser.MAIORIG, 0); }
		public TerminalNode MENORIG() { return getToken(TLangParser.MENORIG, 0); }
		public TerminalNode IGUAL() { return getToken(TLangParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(TLangParser.DIF, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIORQ) | (1L << MENORQ) | (1L << MAIORIG) | (1L << MENORIG) | (1L << IGUAL) | (1L << DIF))) != 0)) ) {
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

	public static class Op_maiorqContext extends ParserRuleContext {
		public TerminalNode MAIORQ() { return getToken(TLangParser.MAIORQ, 0); }
		public Op_maiorqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_maiorq; }
	}

	public final Op_maiorqContext op_maiorq() throws RecognitionException {
		Op_maiorqContext _localctx = new Op_maiorqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_maiorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(MAIORQ);
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

	public static class Op_menorqContext extends ParserRuleContext {
		public TerminalNode MENORQ() { return getToken(TLangParser.MENORQ, 0); }
		public Op_menorqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_menorq; }
	}

	public final Op_menorqContext op_menorq() throws RecognitionException {
		Op_menorqContext _localctx = new Op_menorqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_menorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(MENORQ);
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

	public static class Op_maiorigContext extends ParserRuleContext {
		public TerminalNode MAIORIG() { return getToken(TLangParser.MAIORIG, 0); }
		public Op_maiorigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_maiorig; }
	}

	public final Op_maiorigContext op_maiorig() throws RecognitionException {
		Op_maiorigContext _localctx = new Op_maiorigContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_maiorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(MAIORIG);
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

	public static class Op_menorigContext extends ParserRuleContext {
		public TerminalNode MENORIG() { return getToken(TLangParser.MENORIG, 0); }
		public Op_menorigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_menorig; }
	}

	public final Op_menorigContext op_menorig() throws RecognitionException {
		Op_menorigContext _localctx = new Op_menorigContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_menorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(MENORIG);
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

	public static class Op_igualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(TLangParser.IGUAL, 0); }
		public Op_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_igual; }
	}

	public final Op_igualContext op_igual() throws RecognitionException {
		Op_igualContext _localctx = new Op_igualContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IGUAL);
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

	public static class Op_difContext extends ParserRuleContext {
		public TerminalNode DIF() { return getToken(TLangParser.DIF, 0); }
		public Op_difContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_dif; }
	}

	public final Op_difContext op_dif() throws RecognitionException {
		Op_difContext _localctx = new Op_difContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_dif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(DIF);
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

	public static class Op_eContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(TLangParser.E, 0); }
		public Op_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_e; }
	}

	public final Op_eContext op_e() throws RecognitionException {
		Op_eContext _localctx = new Op_eContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(E);
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

	public static class Op_ouContext extends ParserRuleContext {
		public TerminalNode OU() { return getToken(TLangParser.OU, 0); }
		public Op_ouContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ou; }
	}

	public final Op_ouContext op_ou() throws RecognitionException {
		Op_ouContext _localctx = new Op_ouContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_ou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OU);
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

	public static class Op_naoContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(TLangParser.NAO, 0); }
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_nao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(NAO);
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

	public static class Op_somaContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(TLangParser.SOMA, 0); }
		public Op_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_soma; }
	}

	public final Op_somaContext op_soma() throws RecognitionException {
		Op_somaContext _localctx = new Op_somaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(SOMA);
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

	public static class Op_subContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(TLangParser.SUB, 0); }
		public Op_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sub; }
	}

	public final Op_subContext op_sub() throws RecognitionException {
		Op_subContext _localctx = new Op_subContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(SUB);
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

	public static class Op_multContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TLangParser.MULT, 0); }
		public Op_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mult; }
	}

	public final Op_multContext op_mult() throws RecognitionException {
		Op_multContext _localctx = new Op_multContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(MULT);
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

	public static class Op_divContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(TLangParser.DIV, 0); }
		public Op_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_div; }
	}

	public final Op_divContext op_div() throws RecognitionException {
		Op_divContext _localctx = new Op_divContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DIV);
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

	public static class Op_incContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(TLangParser.INC, 0); }
		public Op_incContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_inc; }
	}

	public final Op_incContext op_inc() throws RecognitionException {
		Op_incContext _localctx = new Op_incContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(INC);
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

	public static class Op_decContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(TLangParser.DEC, 0); }
		public Op_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_dec; }
	}

	public final Op_decContext op_dec() throws RecognitionException {
		Op_decContext _localctx = new Op_decContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DEC);
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

	public static class Op_soma_atrContext extends ParserRuleContext {
		public TerminalNode SOMA_ATR() { return getToken(TLangParser.SOMA_ATR, 0); }
		public Op_soma_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_soma_atr; }
	}

	public final Op_soma_atrContext op_soma_atr() throws RecognitionException {
		Op_soma_atrContext _localctx = new Op_soma_atrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_soma_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SOMA_ATR);
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

	public static class Op_sub_atrContext extends ParserRuleContext {
		public TerminalNode SUB_ATR() { return getToken(TLangParser.SUB_ATR, 0); }
		public Op_sub_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sub_atr; }
	}

	public final Op_sub_atrContext op_sub_atr() throws RecognitionException {
		Op_sub_atrContext _localctx = new Op_sub_atrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_sub_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SUB_ATR);
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

	public static class Op_mult_atrContext extends ParserRuleContext {
		public TerminalNode MULT_ATR() { return getToken(TLangParser.MULT_ATR, 0); }
		public Op_mult_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mult_atr; }
	}

	public final Op_mult_atrContext op_mult_atr() throws RecognitionException {
		Op_mult_atrContext _localctx = new Op_mult_atrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_mult_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(MULT_ATR);
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

	public static class Op_div_atrContext extends ParserRuleContext {
		public TerminalNode DIV_ATR() { return getToken(TLangParser.DIV_ATR, 0); }
		public Op_div_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_div_atr; }
	}

	public final Op_div_atrContext op_div_atr() throws RecognitionException {
		Op_div_atrContext _localctx = new Op_div_atrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op_div_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DIV_ATR);
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

	public static class AtrContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public Op_incContext op_inc() {
			return getRuleContext(Op_incContext.class,0);
		}
		public Op_decContext op_dec() {
			return getRuleContext(Op_decContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atr);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				id();
				setState(241);
				op_atr();
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(242);
					id();
					}
					break;
				case 2:
					{
					setState(243);
					val();
					}
					break;
				case 3:
					{
					setState(244);
					expr();
					}
					break;
				case 4:
					{
					setState(245);
					leitura();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				id();
				setState(249);
				op_inc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				op_inc();
				setState(252);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				id();
				setState(255);
				op_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				op_dec();
				setState(258);
				id();
				}
				break;
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

	public static class Atr_simplesContext extends ParserRuleContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public Atr_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr_simples; }
	}

	public final Atr_simplesContext atr_simples() throws RecognitionException {
		Atr_simplesContext _localctx = new Atr_simplesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atr_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			atr();
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

	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			tipo();
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(265);
				id();
				}
				break;
			case 2:
				{
				setState(266);
				atr();
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

	public static class LeituraContext extends ParserRuleContext {
		public Leitura_numContext leitura_num() {
			return getRuleContext(Leitura_numContext.class,0);
		}
		public Leitura_txtContext leitura_txt() {
			return getRuleContext(Leitura_txtContext.class,0);
		}
		public Leitura_boolContext leitura_bool() {
			return getRuleContext(Leitura_boolContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_leitura);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				leitura_num();
				}
				break;
			case LEIA_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				leitura_txt();
				}
				break;
			case LEIA_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				leitura_bool();
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

	public static class Leitura_numContext extends ParserRuleContext {
		public Leia_numContext leia_num() {
			return getRuleContext(Leia_numContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Leitura_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_num; }
	}

	public final Leitura_numContext leitura_num() throws RecognitionException {
		Leitura_numContext _localctx = new Leitura_numContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_leitura_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			leia_num();
			setState(275);
			paren_e();
			setState(276);
			paren_d();
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

	public static class Leitura_txtContext extends ParserRuleContext {
		public Leia_txtContext leia_txt() {
			return getRuleContext(Leia_txtContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Leitura_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_txt; }
	}

	public final Leitura_txtContext leitura_txt() throws RecognitionException {
		Leitura_txtContext _localctx = new Leitura_txtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_leitura_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			leia_txt();
			setState(279);
			paren_e();
			setState(280);
			paren_d();
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

	public static class Leitura_boolContext extends ParserRuleContext {
		public Leia_boolContext leia_bool() {
			return getRuleContext(Leia_boolContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Leitura_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_bool; }
	}

	public final Leitura_boolContext leitura_bool() throws RecognitionException {
		Leitura_boolContext _localctx = new Leitura_boolContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_leitura_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			leia_bool();
			setState(283);
			paren_e();
			setState(284);
			paren_d();
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

	public static class EscritaContext extends ParserRuleContext {
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			escreva();
			setState(287);
			paren_e();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(288);
				id();
				}
				break;
			case 2:
				{
				setState(289);
				expr();
				}
				break;
			}
			setState(292);
			paren_d();
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_txtContext expr_txt() {
			return getRuleContext(Expr_txtContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				expr_txt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				expr_bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				expr_aritm();
				}
				break;
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

	public static class Expr_boolContext extends ParserRuleContext {
		public List<Termo_boolContext> termo_bool() {
			return getRuleContexts(Termo_boolContext.class);
		}
		public Termo_boolContext termo_bool(int i) {
			return getRuleContext(Termo_boolContext.class,i);
		}
		public List<Op_eContext> op_e() {
			return getRuleContexts(Op_eContext.class);
		}
		public Op_eContext op_e(int i) {
			return getRuleContext(Op_eContext.class,i);
		}
		public List<Op_ouContext> op_ou() {
			return getRuleContexts(Op_ouContext.class);
		}
		public Op_ouContext op_ou(int i) {
			return getRuleContext(Op_ouContext.class,i);
		}
		public List<Op_igualContext> op_igual() {
			return getRuleContexts(Op_igualContext.class);
		}
		public Op_igualContext op_igual(int i) {
			return getRuleContext(Op_igualContext.class,i);
		}
		public List<Op_difContext> op_dif() {
			return getRuleContexts(Op_difContext.class);
		}
		public Op_difContext op_dif(int i) {
			return getRuleContext(Op_difContext.class,i);
		}
		public Expr_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bool; }
	}

	public final Expr_boolContext expr_bool() throws RecognitionException {
		Expr_boolContext _localctx = new Expr_boolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			termo_bool();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << E) | (1L << OU))) != 0)) {
				{
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(300);
					op_e();
					setState(301);
					termo_bool();
					}
					break;
				case OU:
					{
					setState(303);
					op_ou();
					setState(304);
					termo_bool();
					}
					break;
				case IGUAL:
					{
					setState(306);
					op_igual();
					setState(307);
					termo_bool();
					}
					break;
				case DIF:
					{
					setState(309);
					op_dif();
					setState(310);
					termo_bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(316);
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

	public static class Termo_boolContext extends ParserRuleContext {
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Termo_boolContext termo_bool() {
			return getRuleContext(Termo_boolContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public Expr_igContext expr_ig() {
			return getRuleContext(Expr_igContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Termo_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_bool; }
	}

	public final Termo_boolContext termo_bool() throws RecognitionException {
		Termo_boolContext _localctx = new Termo_boolContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termo_bool);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				op_nao();
				setState(318);
				termo_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				expr_rel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				expr_ig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				paren_e();
				setState(325);
				expr_bool();
				setState(326);
				paren_d();
				}
				break;
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

	public static class Expr_relContext extends ParserRuleContext {
		public List<Termo_relContext> termo_rel() {
			return getRuleContexts(Termo_relContext.class);
		}
		public Termo_relContext termo_rel(int i) {
			return getRuleContext(Termo_relContext.class,i);
		}
		public Op_maiorqContext op_maiorq() {
			return getRuleContext(Op_maiorqContext.class,0);
		}
		public Op_menorqContext op_menorq() {
			return getRuleContext(Op_menorqContext.class,0);
		}
		public Op_maiorigContext op_maiorig() {
			return getRuleContext(Op_maiorigContext.class,0);
		}
		public Op_menorigContext op_menorig() {
			return getRuleContext(Op_menorigContext.class,0);
		}
		public Expr_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_rel; }
	}

	public final Expr_relContext expr_rel() throws RecognitionException {
		Expr_relContext _localctx = new Expr_relContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			termo_rel();
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIORQ:
				{
				setState(331);
				op_maiorq();
				setState(332);
				termo_rel();
				}
				break;
			case MENORQ:
				{
				setState(334);
				op_menorq();
				setState(335);
				termo_rel();
				}
				break;
			case MAIORIG:
				{
				setState(337);
				op_maiorig();
				setState(338);
				termo_rel();
				}
				break;
			case MENORIG:
				{
				setState(340);
				op_menorig();
				setState(341);
				termo_rel();
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

	public static class Termo_relContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Termo_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_rel; }
	}

	public final Termo_relContext termo_rel() throws RecognitionException {
		Termo_relContext _localctx = new Termo_relContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_termo_rel);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				paren_e();
				setState(348);
				expr_rel();
				setState(349);
				paren_d();
				}
				break;
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

	public static class Expr_igContext extends ParserRuleContext {
		public List<Termo_igContext> termo_ig() {
			return getRuleContexts(Termo_igContext.class);
		}
		public Termo_igContext termo_ig(int i) {
			return getRuleContext(Termo_igContext.class,i);
		}
		public Op_igualContext op_igual() {
			return getRuleContext(Op_igualContext.class,0);
		}
		public Op_difContext op_dif() {
			return getRuleContext(Op_difContext.class,0);
		}
		public Expr_igContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_ig; }
	}

	public final Expr_igContext expr_ig() throws RecognitionException {
		Expr_igContext _localctx = new Expr_igContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_ig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			termo_ig();
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(354);
				op_igual();
				setState(355);
				termo_ig();
				}
				break;
			case DIF:
				{
				setState(357);
				op_dif();
				setState(358);
				termo_ig();
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

	public static class Termo_igContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_igContext expr_ig() {
			return getRuleContext(Expr_igContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Termo_igContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_ig; }
	}

	public final Termo_igContext termo_ig() throws RecognitionException {
		Termo_igContext _localctx = new Termo_igContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo_ig);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				paren_e();
				setState(365);
				expr_ig();
				setState(366);
				paren_d();
				}
				break;
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

	public static class Expr_aritmContext extends ParserRuleContext {
		public Expr_somaContext expr_soma() {
			return getRuleContext(Expr_somaContext.class,0);
		}
		public Expr_aritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aritm; }
	}

	public final Expr_aritmContext expr_aritm() throws RecognitionException {
		Expr_aritmContext _localctx = new Expr_aritmContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr_aritm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			expr_soma();
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

	public static class Expr_somaContext extends ParserRuleContext {
		public List<Expr_subContext> expr_sub() {
			return getRuleContexts(Expr_subContext.class);
		}
		public Expr_subContext expr_sub(int i) {
			return getRuleContext(Expr_subContext.class,i);
		}
		public List<Op_somaContext> op_soma() {
			return getRuleContexts(Op_somaContext.class);
		}
		public Op_somaContext op_soma(int i) {
			return getRuleContext(Op_somaContext.class,i);
		}
		public Expr_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_soma; }
	}

	public final Expr_somaContext expr_soma() throws RecognitionException {
		Expr_somaContext _localctx = new Expr_somaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			expr_sub();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(373);
				op_soma();
				setState(374);
				expr_sub();
				}
				}
				setState(380);
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

	public static class Expr_subContext extends ParserRuleContext {
		public List<Expr_multContext> expr_mult() {
			return getRuleContexts(Expr_multContext.class);
		}
		public Expr_multContext expr_mult(int i) {
			return getRuleContext(Expr_multContext.class,i);
		}
		public List<Op_subContext> op_sub() {
			return getRuleContexts(Op_subContext.class);
		}
		public Op_subContext op_sub(int i) {
			return getRuleContext(Op_subContext.class,i);
		}
		public Expr_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sub; }
	}

	public final Expr_subContext expr_sub() throws RecognitionException {
		Expr_subContext _localctx = new Expr_subContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expr_mult();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB) {
				{
				{
				setState(382);
				op_sub();
				setState(383);
				expr_mult();
				}
				}
				setState(389);
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

	public static class Expr_multContext extends ParserRuleContext {
		public List<Expr_divContext> expr_div() {
			return getRuleContexts(Expr_divContext.class);
		}
		public Expr_divContext expr_div(int i) {
			return getRuleContext(Expr_divContext.class,i);
		}
		public List<Op_multContext> op_mult() {
			return getRuleContexts(Op_multContext.class);
		}
		public Op_multContext op_mult(int i) {
			return getRuleContext(Op_multContext.class,i);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			expr_div();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(391);
				op_mult();
				setState(392);
				expr_div();
				}
				}
				setState(398);
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

	public static class Expr_divContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_divContext> op_div() {
			return getRuleContexts(Op_divContext.class);
		}
		public Op_divContext op_div(int i) {
			return getRuleContext(Op_divContext.class,i);
		}
		public Expr_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_div; }
	}

	public final Expr_divContext expr_div() throws RecognitionException {
		Expr_divContext _localctx = new Expr_divContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			termo();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(400);
				op_div();
				setState(401);
				termo();
				}
				}
				setState(407);
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

	public static class TermoContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_termo);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				id();
				}
				break;
			case PAREN_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				paren_e();
				setState(411);
				expr_aritm();
				setState(412);
				paren_d();
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

	public static class Expr_txtContext extends ParserRuleContext {
		public List<Termo_txtContext> termo_txt() {
			return getRuleContexts(Termo_txtContext.class);
		}
		public Termo_txtContext termo_txt(int i) {
			return getRuleContext(Termo_txtContext.class,i);
		}
		public List<Op_concatContext> op_concat() {
			return getRuleContexts(Op_concatContext.class);
		}
		public Op_concatContext op_concat(int i) {
			return getRuleContext(Op_concatContext.class,i);
		}
		public Expr_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_txt; }
	}

	public final Expr_txtContext expr_txt() throws RecognitionException {
		Expr_txtContext _localctx = new Expr_txtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr_txt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			termo_txt();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(417);
				op_concat();
				setState(418);
				termo_txt();
				}
				}
				setState(424);
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

	public static class Termo_txtContext extends ParserRuleContext {
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Termo_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_txt; }
	}

	public final Termo_txtContext termo_txt() throws RecognitionException {
		Termo_txtContext _localctx = new Termo_txtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_termo_txt);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				txt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				id();
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

	public static class Estr_condContext extends ParserRuleContext {
		public Controle_condContext controle_cond() {
			return getRuleContext(Controle_condContext.class,0);
		}
		public Chave_eContext chave_e() {
			return getRuleContext(Chave_eContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Chave_dContext chave_d() {
			return getRuleContext(Chave_dContext.class,0);
		}
		public List<Estr_cond_secContext> estr_cond_sec() {
			return getRuleContexts(Estr_cond_secContext.class);
		}
		public Estr_cond_secContext estr_cond_sec(int i) {
			return getRuleContext(Estr_cond_secContext.class,i);
		}
		public Estr_cond_altContext estr_cond_alt() {
			return getRuleContext(Estr_cond_altContext.class,0);
		}
		public Estr_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_cond; }
	}

	public final Estr_condContext estr_cond() throws RecognitionException {
		Estr_condContext _localctx = new Estr_condContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_estr_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			controle_cond();
			setState(430);
			chave_e();
			setState(431);
			bloco();
			setState(432);
			chave_d();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(433);
				estr_cond_sec();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(439);
				estr_cond_alt();
				}
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

	public static class Controle_condContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Controle_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle_cond; }
	}

	public final Controle_condContext controle_cond() throws RecognitionException {
		Controle_condContext _localctx = new Controle_condContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_controle_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			se();
			setState(443);
			paren_e();
			setState(444);
			expr_bool();
			setState(445);
			paren_d();
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

	public static class Estr_cond_secContext extends ParserRuleContext {
		public Controle_cond_secContext controle_cond_sec() {
			return getRuleContext(Controle_cond_secContext.class,0);
		}
		public Chave_eContext chave_e() {
			return getRuleContext(Chave_eContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Chave_dContext chave_d() {
			return getRuleContext(Chave_dContext.class,0);
		}
		public Estr_cond_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_cond_sec; }
	}

	public final Estr_cond_secContext estr_cond_sec() throws RecognitionException {
		Estr_cond_secContext _localctx = new Estr_cond_secContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_estr_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			controle_cond_sec();
			setState(448);
			chave_e();
			setState(449);
			bloco();
			setState(450);
			chave_d();
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

	public static class Controle_cond_secContext extends ParserRuleContext {
		public SenaoseContext senaose() {
			return getRuleContext(SenaoseContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Controle_cond_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle_cond_sec; }
	}

	public final Controle_cond_secContext controle_cond_sec() throws RecognitionException {
		Controle_cond_secContext _localctx = new Controle_cond_secContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_controle_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			senaose();
			setState(453);
			paren_e();
			setState(454);
			expr_bool();
			setState(455);
			paren_d();
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

	public static class Estr_cond_altContext extends ParserRuleContext {
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public Chave_eContext chave_e() {
			return getRuleContext(Chave_eContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Chave_dContext chave_d() {
			return getRuleContext(Chave_dContext.class,0);
		}
		public Estr_cond_altContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_cond_alt; }
	}

	public final Estr_cond_altContext estr_cond_alt() throws RecognitionException {
		Estr_cond_altContext _localctx = new Estr_cond_altContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_estr_cond_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			senao();
			setState(458);
			chave_e();
			setState(459);
			bloco();
			setState(460);
			chave_d();
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

	public static class Estr_repetContext extends ParserRuleContext {
		public Estr_enquantoContext estr_enquanto() {
			return getRuleContext(Estr_enquantoContext.class,0);
		}
		public Estr_de_ateContext estr_de_ate() {
			return getRuleContext(Estr_de_ateContext.class,0);
		}
		public Estr_repetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_repet; }
	}

	public final Estr_repetContext estr_repet() throws RecognitionException {
		Estr_repetContext _localctx = new Estr_repetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_estr_repet);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				estr_enquanto();
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				estr_de_ate();
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

	public static class Estr_enquantoContext extends ParserRuleContext {
		public Controle_enquantoContext controle_enquanto() {
			return getRuleContext(Controle_enquantoContext.class,0);
		}
		public Chave_eContext chave_e() {
			return getRuleContext(Chave_eContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Chave_dContext chave_d() {
			return getRuleContext(Chave_dContext.class,0);
		}
		public Estr_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_enquanto; }
	}

	public final Estr_enquantoContext estr_enquanto() throws RecognitionException {
		Estr_enquantoContext _localctx = new Estr_enquantoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_estr_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			controle_enquanto();
			setState(467);
			chave_e();
			setState(468);
			bloco();
			setState(469);
			chave_d();
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

	public static class Controle_enquantoContext extends ParserRuleContext {
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public Paren_eContext paren_e() {
			return getRuleContext(Paren_eContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public Controle_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle_enquanto; }
	}

	public final Controle_enquantoContext controle_enquanto() throws RecognitionException {
		Controle_enquantoContext _localctx = new Controle_enquantoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_controle_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			enquanto();
			setState(472);
			paren_e();
			setState(473);
			expr_bool();
			setState(474);
			paren_d();
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

	public static class Estr_de_ateContext extends ParserRuleContext {
		public Controle_de_ateContext controle_de_ate() {
			return getRuleContext(Controle_de_ateContext.class,0);
		}
		public Chave_eContext chave_e() {
			return getRuleContext(Chave_eContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Chave_dContext chave_d() {
			return getRuleContext(Chave_dContext.class,0);
		}
		public Estr_de_ateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr_de_ate; }
	}

	public final Estr_de_ateContext estr_de_ate() throws RecognitionException {
		Estr_de_ateContext _localctx = new Estr_de_ateContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_estr_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			controle_de_ate();
			setState(477);
			chave_e();
			setState(478);
			bloco();
			setState(479);
			chave_d();
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

	public static class Controle_de_ateContext extends ParserRuleContext {
		public DeContext de() {
			return getRuleContext(DeContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(TLangParser.PAREN_E, 0); }
		public Ctr_idContext ctr_id() {
			return getRuleContext(Ctr_idContext.class,0);
		}
		public TerminalNode ATR() { return getToken(TLangParser.ATR, 0); }
		public Ctr_inicialContext ctr_inicial() {
			return getRuleContext(Ctr_inicialContext.class,0);
		}
		public AteContext ate() {
			return getRuleContext(AteContext.class,0);
		}
		public Ctr_finalContext ctr_final() {
			return getRuleContext(Ctr_finalContext.class,0);
		}
		public TerminalNode PAREN_D() { return getToken(TLangParser.PAREN_D, 0); }
		public Controle_de_ateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle_de_ate; }
	}

	public final Controle_de_ateContext controle_de_ate() throws RecognitionException {
		Controle_de_ateContext _localctx = new Controle_de_ateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_controle_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			de();
			setState(482);
			match(PAREN_E);
			setState(483);
			ctr_id();
			setState(484);
			match(ATR);
			setState(485);
			ctr_inicial();
			setState(486);
			ate();
			setState(487);
			ctr_final();
			setState(488);
			match(PAREN_D);
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

	public static class Ctr_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangParser.ID, 0); }
		public Ctr_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctr_id; }
	}

	public final Ctr_idContext ctr_id() throws RecognitionException {
		Ctr_idContext _localctx = new Ctr_idContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ctr_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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

	public static class Ctr_inicialContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangParser.ID, 0); }
		public TerminalNode NUM() { return getToken(TLangParser.NUM, 0); }
		public Ctr_inicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctr_inicial; }
	}

	public final Ctr_inicialContext ctr_inicial() throws RecognitionException {
		Ctr_inicialContext _localctx = new Ctr_inicialContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ctr_inicial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class Ctr_finalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangParser.ID, 0); }
		public TerminalNode NUM() { return getToken(TLangParser.NUM, 0); }
		public Ctr_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctr_final; }
	}

	public final Ctr_finalContext ctr_final() throws RecognitionException {
		Ctr_finalContext _localctx = new Ctr_finalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ctr_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class ValContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_val);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				num();
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				txt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				bool();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TLangParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(NUM);
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

	public static class TxtContext extends ParserRuleContext {
		public TerminalNode TXT() { return getToken(TLangParser.TXT, 0); }
		public TxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt; }
	}

	public final TxtContext txt() throws RecognitionException {
		TxtContext _localctx = new TxtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(TXT);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(TLangParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(BOOL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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

	public static class TipoContext extends ParserRuleContext {
		public T_numeroContext t_numero() {
			return getRuleContext(T_numeroContext.class,0);
		}
		public T_textoContext t_texto() {
			return getRuleContext(T_textoContext.class,0);
		}
		public T_booleanoContext t_booleano() {
			return getRuleContext(T_booleanoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tipo);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				t_numero();
				}
				break;
			case T_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				t_texto();
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				t_booleano();
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

	public static class T_numeroContext extends ParserRuleContext {
		public TerminalNode T_NUM() { return getToken(TLangParser.T_NUM, 0); }
		public T_numeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_numero; }
	}

	public final T_numeroContext t_numero() throws RecognitionException {
		T_numeroContext _localctx = new T_numeroContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_t_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T_NUM);
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

	public static class T_textoContext extends ParserRuleContext {
		public TerminalNode T_TXT() { return getToken(TLangParser.T_TXT, 0); }
		public T_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_texto; }
	}

	public final T_textoContext t_texto() throws RecognitionException {
		T_textoContext _localctx = new T_textoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_t_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T_TXT);
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

	public static class T_booleanoContext extends ParserRuleContext {
		public TerminalNode T_BOOL() { return getToken(TLangParser.T_BOOL, 0); }
		public T_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_booleano; }
	}

	public final T_booleanoContext t_booleano() throws RecognitionException {
		T_booleanoContext _localctx = new T_booleanoContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_t_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T_BOOL);
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

	public static class Leia_numContext extends ParserRuleContext {
		public TerminalNode LEIA_NUM() { return getToken(TLangParser.LEIA_NUM, 0); }
		public Leia_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_num; }
	}

	public final Leia_numContext leia_num() throws RecognitionException {
		Leia_numContext _localctx = new Leia_numContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_leia_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(LEIA_NUM);
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

	public static class Leia_txtContext extends ParserRuleContext {
		public TerminalNode LEIA_TXT() { return getToken(TLangParser.LEIA_TXT, 0); }
		public Leia_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_txt; }
	}

	public final Leia_txtContext leia_txt() throws RecognitionException {
		Leia_txtContext _localctx = new Leia_txtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_leia_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LEIA_TXT);
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

	public static class Leia_boolContext extends ParserRuleContext {
		public TerminalNode LEIA_BOOL() { return getToken(TLangParser.LEIA_BOOL, 0); }
		public Leia_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_bool; }
	}

	public final Leia_boolContext leia_bool() throws RecognitionException {
		Leia_boolContext _localctx = new Leia_boolContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_leia_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(LEIA_BOOL);
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

	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(TLangParser.ESCREVA, 0); }
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ESCREVA);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(TLangParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(SE);
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

	public static class SenaoseContext extends ParserRuleContext {
		public TerminalNode SENAOSE() { return getToken(TLangParser.SENAOSE, 0); }
		public SenaoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senaose; }
	}

	public final SenaoseContext senaose() throws RecognitionException {
		SenaoseContext _localctx = new SenaoseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(SENAOSE);
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

	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(TLangParser.SENAO, 0); }
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(SENAO);
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

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(TLangParser.ENQUANTO, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(ENQUANTO);
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

	public static class DeContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(TLangParser.DE, 0); }
		public DeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_de; }
	}

	public final DeContext de() throws RecognitionException {
		DeContext _localctx = new DeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(DE);
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

	public static class AteContext extends ParserRuleContext {
		public TerminalNode ATE() { return getToken(TLangParser.ATE, 0); }
		public AteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ate; }
	}

	public final AteContext ate() throws RecognitionException {
		AteContext _localctx = new AteContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ATE);
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

	public static class Paren_eContext extends ParserRuleContext {
		public TerminalNode PAREN_E() { return getToken(TLangParser.PAREN_E, 0); }
		public Paren_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_e; }
	}

	public final Paren_eContext paren_e() throws RecognitionException {
		Paren_eContext _localctx = new Paren_eContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_paren_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(PAREN_E);
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

	public static class Paren_dContext extends ParserRuleContext {
		public TerminalNode PAREN_D() { return getToken(TLangParser.PAREN_D, 0); }
		public Paren_dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_d; }
	}

	public final Paren_dContext paren_d() throws RecognitionException {
		Paren_dContext _localctx = new Paren_dContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_paren_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(PAREN_D);
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

	public static class Chave_eContext extends ParserRuleContext {
		public TerminalNode CHAVE_E() { return getToken(TLangParser.CHAVE_E, 0); }
		public Chave_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chave_e; }
	}

	public final Chave_eContext chave_e() throws RecognitionException {
		Chave_eContext _localctx = new Chave_eContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_chave_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(CHAVE_E);
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

	public static class Chave_dContext extends ParserRuleContext {
		public TerminalNode CHAVE_D() { return getToken(TLangParser.CHAVE_D, 0); }
		public Chave_dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chave_d; }
	}

	public final Chave_dContext chave_d() throws RecognitionException {
		Chave_dContext _localctx = new Chave_dContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_chave_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(CHAVE_D);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0227\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u00b6\n\3\r\3\16\3"+
		"\u00b7\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00c1\n\5\3\6\3\6\5\6\u00c5\n\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f9\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0107\n\35\3\36\3\36\3\37\3\37"+
		"\3\37\5\37\u010e\n\37\3 \3 \3 \5 \u0113\n \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u0125\n$\3$\3$\3%\3%\3%\5%\u012c\n%\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u013b\n&\f&\16&\u013e\13&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u014b\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u015a\n(\3)\3)\3)\3)\3)\3)\5)\u0162\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u016b\n*\3+\3+\3+\3+\3+\3+\5+\u0173\n+\3,\3,\3-\3-\3"+
		"-\3-\7-\u017b\n-\f-\16-\u017e\13-\3.\3.\3.\3.\7.\u0184\n.\f.\16.\u0187"+
		"\13.\3/\3/\3/\3/\7/\u018d\n/\f/\16/\u0190\13/\3\60\3\60\3\60\3\60\7\60"+
		"\u0196\n\60\f\60\16\60\u0199\13\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01a1\n\61\3\62\3\62\3\62\3\62\7\62\u01a7\n\62\f\62\16\62\u01aa\13\62"+
		"\3\63\3\63\5\63\u01ae\n\63\3\64\3\64\3\64\3\64\3\64\7\64\u01b5\n\64\f"+
		"\64\16\64\u01b8\13\64\3\64\5\64\u01bb\n\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39"+
		"\59\u01d3\n9\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\5A\u01f6\nA\3B\3B\3C\3C\3D"+
		"\3D\3E\3E\3F\3F\3F\5F\u0203\nF\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\2\2"+
		"X\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\2\5\3\2\17\21\3\2\t\16\4\2)),,\2\u0207\2\u00ae"+
		"\3\2\2\2\4\u00b5\3\2\2\2\6\u00b9\3\2\2\2\b\u00c0\3\2\2\2\n\u00c4\3\2\2"+
		"\2\f\u00c6\3\2\2\2\16\u00c8\3\2\2\2\20\u00ca\3\2\2\2\22\u00cc\3\2\2\2"+
		"\24\u00ce\3\2\2\2\26\u00d0\3\2\2\2\30\u00d2\3\2\2\2\32\u00d4\3\2\2\2\34"+
		"\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00da\3\2\2\2\"\u00dc\3\2\2\2$\u00de"+
		"\3\2\2\2&\u00e0\3\2\2\2(\u00e2\3\2\2\2*\u00e4\3\2\2\2,\u00e6\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00ea\3\2\2\2\62\u00ec\3\2\2\2\64\u00ee\3\2\2\2\66\u00f0"+
		"\3\2\2\28\u0106\3\2\2\2:\u0108\3\2\2\2<\u010a\3\2\2\2>\u0112\3\2\2\2@"+
		"\u0114\3\2\2\2B\u0118\3\2\2\2D\u011c\3\2\2\2F\u0120\3\2\2\2H\u012b\3\2"+
		"\2\2J\u012d\3\2\2\2L\u014a\3\2\2\2N\u014c\3\2\2\2P\u0161\3\2\2\2R\u0163"+
		"\3\2\2\2T\u0172\3\2\2\2V\u0174\3\2\2\2X\u0176\3\2\2\2Z\u017f\3\2\2\2\\"+
		"\u0188\3\2\2\2^\u0191\3\2\2\2`\u01a0\3\2\2\2b\u01a2\3\2\2\2d\u01ad\3\2"+
		"\2\2f\u01af\3\2\2\2h\u01bc\3\2\2\2j\u01c1\3\2\2\2l\u01c6\3\2\2\2n\u01cb"+
		"\3\2\2\2p\u01d2\3\2\2\2r\u01d4\3\2\2\2t\u01d9\3\2\2\2v\u01de\3\2\2\2x"+
		"\u01e3\3\2\2\2z\u01ec\3\2\2\2|\u01ee\3\2\2\2~\u01f0\3\2\2\2\u0080\u01f5"+
		"\3\2\2\2\u0082\u01f7\3\2\2\2\u0084\u01f9\3\2\2\2\u0086\u01fb\3\2\2\2\u0088"+
		"\u01fd\3\2\2\2\u008a\u0202\3\2\2\2\u008c\u0204\3\2\2\2\u008e\u0206\3\2"+
		"\2\2\u0090\u0208\3\2\2\2\u0092\u020a\3\2\2\2\u0094\u020c\3\2\2\2\u0096"+
		"\u020e\3\2\2\2\u0098\u0210\3\2\2\2\u009a\u0212\3\2\2\2\u009c\u0214\3\2"+
		"\2\2\u009e\u0216\3\2\2\2\u00a0\u0218\3\2\2\2\u00a2\u021a\3\2\2\2\u00a4"+
		"\u021c\3\2\2\2\u00a6\u021e\3\2\2\2\u00a8\u0220\3\2\2\2\u00aa\u0222\3\2"+
		"\2\2\u00ac\u0224\3\2\2\2\u00ae\u00af\5\4\3\2\u00af\3\3\2\2\2\u00b0\u00b6"+
		"\5<\37\2\u00b1\u00b6\5:\36\2\u00b2\u00b6\5F$\2\u00b3\u00b6\5f\64\2\u00b4"+
		"\u00b6\5p9\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\5\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba"+
		"\7\3\2\2\2\u00bb\u00c1\5\6\4\2\u00bc\u00c1\7\30\2\2\u00bd\u00c1\7\31\2"+
		"\2\u00be\u00c1\7\32\2\2\u00bf\u00c1\7\33\2\2\u00c0\u00bb\3\2\2\2\u00c0"+
		"\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\t\3\2\2\2\u00c2\u00c5\5\6\4\2\u00c3\u00c5\7\30\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\13\3\2\2\2\u00c6\u00c7\7\b\2\2\u00c7"+
		"\r\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9\17\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb"+
		"\21\3\2\2\2\u00cc\u00cd\7\t\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\25\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\f\2\2"+
		"\u00d3\31\3\2\2\2\u00d4\u00d5\7\r\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7\16"+
		"\2\2\u00d7\35\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9\37\3\2\2\2\u00da\u00db"+
		"\7\20\2\2\u00db!\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd#\3\2\2\2\u00de\u00df"+
		"\7\22\2\2\u00df%\3\2\2\2\u00e0\u00e1\7\23\2\2\u00e1\'\3\2\2\2\u00e2\u00e3"+
		"\7\24\2\2\u00e3)\3\2\2\2\u00e4\u00e5\7\25\2\2\u00e5+\3\2\2\2\u00e6\u00e7"+
		"\7\26\2\2\u00e7-\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9/\3\2\2\2\u00ea\u00eb"+
		"\7\30\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\7\31\2\2\u00ed\63\3\2\2\2\u00ee"+
		"\u00ef\7\32\2\2\u00ef\65\3\2\2\2\u00f0\u00f1\7\33\2\2\u00f1\67\3\2\2\2"+
		"\u00f2\u00f3\5\u0088E\2\u00f3\u00f8\5\6\4\2\u00f4\u00f9\5\u0088E\2\u00f5"+
		"\u00f9\5\u0080A\2\u00f6\u00f9\5H%\2\u00f7\u00f9\5> \2\u00f8\u00f4\3\2"+
		"\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u0107\3\2\2\2\u00fa\u00fb\5\u0088E\2\u00fb\u00fc\5,\27\2\u00fc\u0107"+
		"\3\2\2\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\5\u0088E\2\u00ff\u0107\3\2\2"+
		"\2\u0100\u0101\5\u0088E\2\u0101\u0102\5.\30\2\u0102\u0107\3\2\2\2\u0103"+
		"\u0104\5.\30\2\u0104\u0105\5\u0088E\2\u0105\u0107\3\2\2\2\u0106\u00f2"+
		"\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u01079\3\2\2\2\u0108\u0109\58\35\2\u0109;\3\2\2\2\u010a"+
		"\u010d\5\u008aF\2\u010b\u010e\5\u0088E\2\u010c\u010e\58\35\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e=\3\2\2\2\u010f\u0113\5@!\2\u0110\u0113"+
		"\5B\"\2\u0111\u0113\5D#\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113?\3\2\2\2\u0114\u0115\5\u0092J\2\u0115\u0116\5\u00a6"+
		"T\2\u0116\u0117\5\u00a8U\2\u0117A\3\2\2\2\u0118\u0119\5\u0094K\2\u0119"+
		"\u011a\5\u00a6T\2\u011a\u011b\5\u00a8U\2\u011bC\3\2\2\2\u011c\u011d\5"+
		"\u0096L\2\u011d\u011e\5\u00a6T\2\u011e\u011f\5\u00a8U\2\u011fE\3\2\2\2"+
		"\u0120\u0121\5\u0098M\2\u0121\u0124\5\u00a6T\2\u0122\u0125\5\u0088E\2"+
		"\u0123\u0125\5H%\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\5\u00a8U\2\u0127G\3\2\2\2\u0128\u012c\5b\62\2\u0129"+
		"\u012c\5J&\2\u012a\u012c\5V,\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012a\3\2\2\2\u012cI\3\2\2\2\u012d\u013c\5L\'\2\u012e\u012f\5\36"+
		"\20\2\u012f\u0130\5L\'\2\u0130\u013b\3\2\2\2\u0131\u0132\5 \21\2\u0132"+
		"\u0133\5L\'\2\u0133\u013b\3\2\2\2\u0134\u0135\5\32\16\2\u0135\u0136\5"+
		"L\'\2\u0136\u013b\3\2\2\2\u0137\u0138\5\34\17\2\u0138\u0139\5L\'\2\u0139"+
		"\u013b\3\2\2\2\u013a\u012e\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013dK\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5\"\22\2"+
		"\u0140\u0141\5L\'\2\u0141\u014b\3\2\2\2\u0142\u014b\5\u0086D\2\u0143\u014b"+
		"\5\u0088E\2\u0144\u014b\5N(\2\u0145\u014b\5R*\2\u0146\u0147\5\u00a6T\2"+
		"\u0147\u0148\5J&\2\u0148\u0149\5\u00a8U\2\u0149\u014b\3\2\2\2\u014a\u013f"+
		"\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014bM\3\2\2\2\u014c\u0159\5P)\2\u014d"+
		"\u014e\5\22\n\2\u014e\u014f\5P)\2\u014f\u015a\3\2\2\2\u0150\u0151\5\24"+
		"\13\2\u0151\u0152\5P)\2\u0152\u015a\3\2\2\2\u0153\u0154\5\26\f\2\u0154"+
		"\u0155\5P)\2\u0155\u015a\3\2\2\2\u0156\u0157\5\30\r\2\u0157\u0158\5P)"+
		"\2\u0158\u015a\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u0150\3\2\2\2\u0159\u0153"+
		"\3\2\2\2\u0159\u0156\3\2\2\2\u015aO\3\2\2\2\u015b\u0162\5\u0088E\2\u015c"+
		"\u0162\5V,\2\u015d\u015e\5\u00a6T\2\u015e\u015f\5N(\2\u015f\u0160\5\u00a8"+
		"U\2\u0160\u0162\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161"+
		"\u015d\3\2\2\2\u0162Q\3\2\2\2\u0163\u016a\5T+\2\u0164\u0165\5\32\16\2"+
		"\u0165\u0166\5T+\2\u0166\u016b\3\2\2\2\u0167\u0168\5\34\17\2\u0168\u0169"+
		"\5T+\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0167\3\2\2\2\u016b"+
		"S\3\2\2\2\u016c\u0173\5\u0088E\2\u016d\u0173\5V,\2\u016e\u016f\5\u00a6"+
		"T\2\u016f\u0170\5R*\2\u0170\u0171\5\u00a8U\2\u0171\u0173\3\2\2\2\u0172"+
		"\u016c\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0173U\3\2\2\2"+
		"\u0174\u0175\5X-\2\u0175W\3\2\2\2\u0176\u017c\5Z.\2\u0177\u0178\5$\23"+
		"\2\u0178\u0179\5Z.\2\u0179\u017b\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dY\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0185\5\\/\2\u0180\u0181\5&\24\2\u0181\u0182\5\\"+
		"/\2\u0182\u0184\3\2\2\2\u0183\u0180\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186[\3\2\2\2\u0187\u0185\3\2\2\2"+
		"\u0188\u018e\5^\60\2\u0189\u018a\5(\25\2\u018a\u018b\5^\60\2\u018b\u018d"+
		"\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f]\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0197\5`\61\2"+
		"\u0192\u0193\5*\26\2\u0193\u0194\5`\61\2\u0194\u0196\3\2\2\2\u0195\u0192"+
		"\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"_\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u01a1\5\u0082B\2\u019b\u01a1\5\u0088"+
		"E\2\u019c\u019d\5\u00a6T\2\u019d\u019e\5V,\2\u019e\u019f\5\u00a8U\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019c\3\2"+
		"\2\2\u01a1a\3\2\2\2\u01a2\u01a8\5d\63\2\u01a3\u01a4\5\f\7\2\u01a4\u01a5"+
		"\5d\63\2\u01a5\u01a7\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9c\3\2\2\2\u01aa\u01a8\3\2\2\2"+
		"\u01ab\u01ae\5\u0084C\2\u01ac\u01ae\5\u0088E\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01aee\3\2\2\2\u01af\u01b0\5h\65\2\u01b0\u01b1\5\u00aa"+
		"V\2\u01b1\u01b2\5\4\3\2\u01b2\u01b6\5\u00acW\2\u01b3\u01b5\5j\66\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\5n8\2\u01ba\u01b9"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbg\3\2\2\2\u01bc\u01bd\5\u009aN\2\u01bd"+
		"\u01be\5\u00a6T\2\u01be\u01bf\5J&\2\u01bf\u01c0\5\u00a8U\2\u01c0i\3\2"+
		"\2\2\u01c1\u01c2\5l\67\2\u01c2\u01c3\5\u00aaV\2\u01c3\u01c4\5\4\3\2\u01c4"+
		"\u01c5\5\u00acW\2\u01c5k\3\2\2\2\u01c6\u01c7\5\u009cO\2\u01c7\u01c8\5"+
		"\u00a6T\2\u01c8\u01c9\5J&\2\u01c9\u01ca\5\u00a8U\2\u01cam\3\2\2\2\u01cb"+
		"\u01cc\5\u009eP\2\u01cc\u01cd\5\u00aaV\2\u01cd\u01ce\5\4\3\2\u01ce\u01cf"+
		"\5\u00acW\2\u01cfo\3\2\2\2\u01d0\u01d3\5r:\2\u01d1\u01d3\5v<\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3q\3\2\2\2\u01d4\u01d5\5t;\2\u01d5\u01d6"+
		"\5\u00aaV\2\u01d6\u01d7\5\4\3\2\u01d7\u01d8\5\u00acW\2\u01d8s\3\2\2\2"+
		"\u01d9\u01da\5\u00a0Q\2\u01da\u01db\5\u00a6T\2\u01db\u01dc\5J&\2\u01dc"+
		"\u01dd\5\u00a8U\2\u01ddu\3\2\2\2\u01de\u01df\5x=\2\u01df\u01e0\5\u00aa"+
		"V\2\u01e0\u01e1\5\4\3\2\u01e1\u01e2\5\u00acW\2\u01e2w\3\2\2\2\u01e3\u01e4"+
		"\5\u00a2R\2\u01e4\u01e5\7\3\2\2\u01e5\u01e6\5z>\2\u01e6\u01e7\7\7\2\2"+
		"\u01e7\u01e8\5|?\2\u01e8\u01e9\5\u00a4S\2\u01e9\u01ea\5~@\2\u01ea\u01eb"+
		"\7\4\2\2\u01eby\3\2\2\2\u01ec\u01ed\7,\2\2\u01ed{\3\2\2\2\u01ee\u01ef"+
		"\t\4\2\2\u01ef}\3\2\2\2\u01f0\u01f1\t\4\2\2\u01f1\177\3\2\2\2\u01f2\u01f6"+
		"\5\u0082B\2\u01f3\u01f6\5\u0084C\2\u01f4\u01f6\5\u0086D\2\u01f5\u01f2"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u0081\3\2\2\2\u01f7"+
		"\u01f8\7)\2\2\u01f8\u0083\3\2\2\2\u01f9\u01fa\7*\2\2\u01fa\u0085\3\2\2"+
		"\2\u01fb\u01fc\7+\2\2\u01fc\u0087\3\2\2\2\u01fd\u01fe\7,\2\2\u01fe\u0089"+
		"\3\2\2\2\u01ff\u0203\5\u008cG\2\u0200\u0203\5\u008eH\2\u0201\u0203\5\u0090"+
		"I\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u008b\3\2\2\2\u0204\u0205\7&\2\2\u0205\u008d\3\2\2\2\u0206\u0207\7\'"+
		"\2\2\u0207\u008f\3\2\2\2\u0208\u0209\7(\2\2\u0209\u0091\3\2\2\2\u020a"+
		"\u020b\7\34\2\2\u020b\u0093\3\2\2\2\u020c\u020d\7\35\2\2\u020d\u0095\3"+
		"\2\2\2\u020e\u020f\7\36\2\2\u020f\u0097\3\2\2\2\u0210\u0211\7\37\2\2\u0211"+
		"\u0099\3\2\2\2\u0212\u0213\7 \2\2\u0213\u009b\3\2\2\2\u0214\u0215\7!\2"+
		"\2\u0215\u009d\3\2\2\2\u0216\u0217\7\"\2\2\u0217\u009f\3\2\2\2\u0218\u0219"+
		"\7#\2\2\u0219\u00a1\3\2\2\2\u021a\u021b\7$\2\2\u021b\u00a3\3\2\2\2\u021c"+
		"\u021d\7%\2\2\u021d\u00a5\3\2\2\2\u021e\u021f\7\3\2\2\u021f\u00a7\3\2"+
		"\2\2\u0220\u0221\7\4\2\2\u0221\u00a9\3\2\2\2\u0222\u0223\7\5\2\2\u0223"+
		"\u00ab\3\2\2\2\u0224\u0225\7\6\2\2\u0225\u00ad\3\2\2\2\37\u00b5\u00b7"+
		"\u00c0\u00c4\u00f8\u0106\u010d\u0112\u0124\u012b\u013a\u013c\u014a\u0159"+
		"\u0161\u016a\u0172\u017c\u0185\u018e\u0197\u01a0\u01a8\u01ad\u01b6\u01ba"+
		"\u01d2\u01f5\u0202";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}