// Generated from c:\Users\cmlima\Desenvolvimento\UAM\COMPILADORES\projeto-tlang\src\gram\TLang.g4 by ANTLR 4.9.2
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
		PAREN_E=1, PAREN_D=2, CHAVE_E=3, CHAVE_D=4, ATR=5, MAIORQ=6, MENORQ=7, 
		MAIORIG=8, MENORIG=9, IGUAL=10, DIF=11, E=12, OU=13, NAO=14, SOMA=15, 
		SUB=16, MULT=17, DIV=18, INC=19, DEC=20, SOMA_ATR=21, SUB_ATR=22, MULT_ATR=23, 
		DIV_ATR=24, LEIA_NUM=25, LEIA_TXT=26, LEIA_BOOL=27, ESCREVA=28, SE=29, 
		SENAOSE=30, SENAO=31, ENQUANTO=32, DE=33, ATE=34, T_NUM=35, T_TXT=36, 
		T_BOOL=37, NUM=38, TXT=39, BOOL=40, ID=41, ESP=42, COM=43, COM_LIN=44;
	public static final int
		RULE_iniciar = 0, RULE_bloco = 1, RULE_op_atr = 2, RULE_op_atr_num = 3, 
		RULE_op_atr_txt = 4, RULE_op_bool = 5, RULE_op_rel = 6, RULE_op_maiorq = 7, 
		RULE_op_menorq = 8, RULE_op_maiorig = 9, RULE_op_menorig = 10, RULE_op_igual = 11, 
		RULE_op_dif = 12, RULE_op_e = 13, RULE_op_ou = 14, RULE_op_nao = 15, RULE_op_soma = 16, 
		RULE_op_sub = 17, RULE_op_mult = 18, RULE_op_div = 19, RULE_op_inc = 20, 
		RULE_op_dec = 21, RULE_op_soma_atr = 22, RULE_op_sub_atr = 23, RULE_op_mult_atr = 24, 
		RULE_op_div_atr = 25, RULE_atr = 26, RULE_atr_num = 27, RULE_atr_txt = 28, 
		RULE_atr_bool = 29, RULE_decl = 30, RULE_leitura = 31, RULE_leitura_num = 32, 
		RULE_leitura_txt = 33, RULE_leitura_bool = 34, RULE_escrita = 35, RULE_expr = 36, 
		RULE_expr_bool = 37, RULE_termo_bool = 38, RULE_expr_rel = 39, RULE_termo_rel = 40, 
		RULE_expr_ig = 41, RULE_termo_ig = 42, RULE_expr_aritm = 43, RULE_fator = 44, 
		RULE_termo = 45, RULE_expr_txt = 46, RULE_estr_cond = 47, RULE_estr_cond_sec = 48, 
		RULE_estr_cond_alt = 49, RULE_estr_repet = 50, RULE_estr_enquanto = 51, 
		RULE_estr_de_ate = 52, RULE_controle_de_ate = 53, RULE_contr_id = 54, 
		RULE_contr_atr = 55, RULE_contr_num = 56, RULE_val = 57, RULE_num = 58, 
		RULE_txt = 59, RULE_bool = 60, RULE_id = 61, RULE_tipo = 62, RULE_t_numero = 63, 
		RULE_t_texto = 64, RULE_t_booleano = 65, RULE_leia_num = 66, RULE_leia_txt = 67, 
		RULE_leia_bool = 68, RULE_escreva = 69, RULE_se = 70, RULE_senaose = 71, 
		RULE_senao = 72, RULE_enquanto = 73, RULE_de = 74, RULE_ate = 75, RULE_paren_e = 76, 
		RULE_paren_d = 77, RULE_chave_e = 78, RULE_chave_d = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"iniciar", "bloco", "op_atr", "op_atr_num", "op_atr_txt", "op_bool", 
			"op_rel", "op_maiorq", "op_menorq", "op_maiorig", "op_menorig", "op_igual", 
			"op_dif", "op_e", "op_ou", "op_nao", "op_soma", "op_sub", "op_mult", 
			"op_div", "op_inc", "op_dec", "op_soma_atr", "op_sub_atr", "op_mult_atr", 
			"op_div_atr", "atr", "atr_num", "atr_txt", "atr_bool", "decl", "leitura", 
			"leitura_num", "leitura_txt", "leitura_bool", "escrita", "expr", "expr_bool", 
			"termo_bool", "expr_rel", "termo_rel", "expr_ig", "termo_ig", "expr_aritm", 
			"fator", "termo", "expr_txt", "estr_cond", "estr_cond_sec", "estr_cond_alt", 
			"estr_repet", "estr_enquanto", "estr_de_ate", "controle_de_ate", "contr_id", 
			"contr_atr", "contr_num", "val", "num", "txt", "bool", "id", "tipo", 
			"t_numero", "t_texto", "t_booleano", "leia_num", "leia_txt", "leia_bool", 
			"escreva", "se", "senaose", "senao", "enquanto", "de", "ate", "paren_e", 
			"paren_d", "chave_e", "chave_d"
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
			setState(160);
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
		public List<AtrContext> atr() {
			return getRuleContexts(AtrContext.class);
		}
		public AtrContext atr(int i) {
			return getRuleContext(AtrContext.class,i);
		}
		public List<LeituraContext> leitura() {
			return getRuleContexts(LeituraContext.class);
		}
		public LeituraContext leitura(int i) {
			return getRuleContext(LeituraContext.class,i);
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
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_NUM:
				case T_TXT:
				case T_BOOL:
					{
					setState(162);
					decl();
					}
					break;
				case INC:
				case DEC:
				case ID:
					{
					setState(163);
					atr();
					}
					break;
				case LEIA_NUM:
				case LEIA_TXT:
				case LEIA_BOOL:
					{
					setState(164);
					leitura();
					}
					break;
				case ESCREVA:
					{
					setState(165);
					escrita();
					}
					break;
				case SE:
					{
					setState(166);
					estr_cond();
					}
					break;
				case ENQUANTO:
				case DE:
					{
					setState(167);
					estr_repet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << LEIA_NUM) | (1L << LEIA_TXT) | (1L << LEIA_BOOL) | (1L << ESCREVA) | (1L << SE) | (1L << ENQUANTO) | (1L << DE) | (1L << T_NUM) | (1L << T_TXT) | (1L << T_BOOL) | (1L << ID))) != 0) );
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
			setState(172);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(SOMA_ATR);
				}
				break;
			case SUB_ATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(SUB_ATR);
				}
				break;
			case MULT_ATR:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(MULT_ATR);
				}
				break;
			case DIV_ATR:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
		enterRule(_localctx, 10, RULE_op_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 12, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 14, RULE_op_maiorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 16, RULE_op_menorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 18, RULE_op_maiorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 20, RULE_op_menorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 22, RULE_op_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 24, RULE_op_dif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 26, RULE_op_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 28, RULE_op_ou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 30, RULE_op_nao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 32, RULE_op_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 34, RULE_op_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		enterRule(_localctx, 36, RULE_op_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 38, RULE_op_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 40, RULE_op_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 42, RULE_op_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 44, RULE_op_soma_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 46, RULE_op_sub_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 48, RULE_op_mult_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 50, RULE_op_div_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		public Atr_numContext atr_num() {
			return getRuleContext(Atr_numContext.class,0);
		}
		public Atr_txtContext atr_txt() {
			return getRuleContext(Atr_txtContext.class,0);
		}
		public Atr_boolContext atr_bool() {
			return getRuleContext(Atr_boolContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atr);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				atr_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				atr_txt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				atr_bool();
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

	public static class Atr_numContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Op_atr_numContext op_atr_num() {
			return getRuleContext(Op_atr_numContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Leitura_numContext leitura_num() {
			return getRuleContext(Leitura_numContext.class,0);
		}
		public Op_incContext op_inc() {
			return getRuleContext(Op_incContext.class,0);
		}
		public Op_decContext op_dec() {
			return getRuleContext(Op_decContext.class,0);
		}
		public Atr_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr_num; }
	}

	public final Atr_numContext atr_num() throws RecognitionException {
		Atr_numContext _localctx = new Atr_numContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atr_num);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				id();
				setState(233);
				op_atr_num();
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(234);
					id();
					}
					break;
				case 2:
					{
					setState(235);
					num();
					}
					break;
				case 3:
					{
					setState(236);
					expr_aritm();
					}
					break;
				case 4:
					{
					setState(237);
					leitura_num();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				id();
				setState(241);
				op_inc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				op_inc();
				setState(244);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				id();
				setState(247);
				op_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				op_dec();
				setState(250);
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

	public static class Atr_txtContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Op_atr_txtContext op_atr_txt() {
			return getRuleContext(Op_atr_txtContext.class,0);
		}
		public Expr_txtContext expr_txt() {
			return getRuleContext(Expr_txtContext.class,0);
		}
		public Leitura_txtContext leitura_txt() {
			return getRuleContext(Leitura_txtContext.class,0);
		}
		public Atr_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr_txt; }
	}

	public final Atr_txtContext atr_txt() throws RecognitionException {
		Atr_txtContext _localctx = new Atr_txtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atr_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			id();
			setState(255);
			op_atr_txt();
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(256);
				id();
				}
				break;
			case 2:
				{
				setState(257);
				expr_txt();
				}
				break;
			case 3:
				{
				setState(258);
				leitura_txt();
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

	public static class Atr_boolContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Leitura_boolContext leitura_bool() {
			return getRuleContext(Leitura_boolContext.class,0);
		}
		public Atr_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr_bool; }
	}

	public final Atr_boolContext atr_bool() throws RecognitionException {
		Atr_boolContext _localctx = new Atr_boolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atr_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			id();
			setState(262);
			op_atr();
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(263);
				id();
				}
				break;
			case 2:
				{
				setState(264);
				expr_bool();
				}
				break;
			case 3:
				{
				setState(265);
				leitura_bool();
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

	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public T_numeroContext t_numero() {
			return getRuleContext(T_numeroContext.class,0);
		}
		public Atr_numContext atr_num() {
			return getRuleContext(Atr_numContext.class,0);
		}
		public T_textoContext t_texto() {
			return getRuleContext(T_textoContext.class,0);
		}
		public Atr_txtContext atr_txt() {
			return getRuleContext(Atr_txtContext.class,0);
		}
		public T_booleanoContext t_booleano() {
			return getRuleContext(T_booleanoContext.class,0);
		}
		public Atr_boolContext atr_bool() {
			return getRuleContext(Atr_boolContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decl);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				tipo();
				setState(269);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				t_numero();
				setState(272);
				atr_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				t_texto();
				setState(275);
				atr_txt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				t_booleano();
				setState(278);
				atr_bool();
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

	public static class LeituraContext extends ParserRuleContext {
		public Leitura_numContext leitura_num() {
			return getRuleContext(Leitura_numContext.class,0);
		}
		public Leitura_txtContext leitura_txt() {
			return getRuleContext(Leitura_txtContext.class,0);
		}
		public Leia_boolContext leia_bool() {
			return getRuleContext(Leia_boolContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_leitura);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				leitura_num();
				}
				break;
			case LEIA_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				leitura_txt();
				}
				break;
			case LEIA_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				leia_bool();
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
		enterRule(_localctx, 64, RULE_leitura_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			leia_num();
			setState(288);
			paren_e();
			setState(289);
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
		enterRule(_localctx, 66, RULE_leitura_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			leia_txt();
			setState(292);
			paren_e();
			setState(293);
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
		enterRule(_localctx, 68, RULE_leitura_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			leia_bool();
			setState(296);
			paren_e();
			setState(297);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_dContext paren_d() {
			return getRuleContext(Paren_dContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			escreva();
			setState(300);
			paren_e();
			setState(301);
			expr();
			setState(302);
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
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Expr_txtContext expr_txt() {
			return getRuleContext(Expr_txtContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				expr_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				expr_rel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				expr_aritm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				expr_txt();
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
		enterRule(_localctx, 74, RULE_expr_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			termo_bool();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << E) | (1L << OU))) != 0)) {
				{
				setState(323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(311);
					op_e();
					setState(312);
					termo_bool();
					}
					break;
				case OU:
					{
					setState(314);
					op_ou();
					setState(315);
					termo_bool();
					}
					break;
				case IGUAL:
					{
					setState(317);
					op_igual();
					setState(318);
					termo_bool();
					}
					break;
				case DIF:
					{
					setState(320);
					op_dif();
					setState(321);
					termo_bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327);
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
		enterRule(_localctx, 76, RULE_termo_bool);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				op_nao();
				setState(329);
				termo_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				expr_rel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				expr_ig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				paren_e();
				setState(336);
				expr_bool();
				setState(337);
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
		enterRule(_localctx, 78, RULE_expr_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			termo_rel();
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIORQ:
				{
				setState(342);
				op_maiorq();
				setState(343);
				termo_rel();
				}
				break;
			case MENORQ:
				{
				setState(345);
				op_menorq();
				setState(346);
				termo_rel();
				}
				break;
			case MAIORIG:
				{
				setState(348);
				op_maiorig();
				setState(349);
				termo_rel();
				}
				break;
			case MENORIG:
				{
				setState(351);
				op_menorig();
				setState(352);
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
		enterRule(_localctx, 80, RULE_termo_rel);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				paren_e();
				setState(359);
				expr_rel();
				setState(360);
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
		enterRule(_localctx, 82, RULE_expr_ig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			termo_ig();
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(365);
				op_igual();
				setState(366);
				termo_ig();
				}
				break;
			case DIF:
				{
				setState(368);
				op_dif();
				setState(369);
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
		enterRule(_localctx, 84, RULE_termo_ig);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				paren_e();
				setState(376);
				expr_ig();
				setState(377);
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
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op_somaContext> op_soma() {
			return getRuleContexts(Op_somaContext.class);
		}
		public Op_somaContext op_soma(int i) {
			return getRuleContext(Op_somaContext.class,i);
		}
		public List<Op_subContext> op_sub() {
			return getRuleContexts(Op_subContext.class);
		}
		public Op_subContext op_sub(int i) {
			return getRuleContext(Op_subContext.class,i);
		}
		public Expr_aritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aritm; }
	}

	public final Expr_aritmContext expr_aritm() throws RecognitionException {
		Expr_aritmContext _localctx = new Expr_aritmContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr_aritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			fator();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUB) {
				{
				setState(388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOMA:
					{
					setState(382);
					op_soma();
					setState(383);
					fator();
					}
					break;
				case SUB:
					{
					setState(385);
					op_sub();
					setState(386);
					fator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(392);
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

	public static class FatorContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_multContext> op_mult() {
			return getRuleContexts(Op_multContext.class);
		}
		public Op_multContext op_mult(int i) {
			return getRuleContext(Op_multContext.class,i);
		}
		public List<Op_divContext> op_div() {
			return getRuleContexts(Op_divContext.class);
		}
		public Op_divContext op_div(int i) {
			return getRuleContext(Op_divContext.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			termo();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(394);
					op_mult();
					setState(395);
					termo();
					}
					break;
				case DIV:
					{
					setState(397);
					op_div();
					setState(398);
					termo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(404);
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
		enterRule(_localctx, 90, RULE_termo);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				id();
				}
				break;
			case PAREN_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				paren_e();
				setState(408);
				expr_aritm();
				setState(409);
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
		public List<TxtContext> txt() {
			return getRuleContexts(TxtContext.class);
		}
		public TxtContext txt(int i) {
			return getRuleContext(TxtContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Op_somaContext> op_soma() {
			return getRuleContexts(Op_somaContext.class);
		}
		public Op_somaContext op_soma(int i) {
			return getRuleContext(Op_somaContext.class,i);
		}
		public Expr_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_txt; }
	}

	public final Expr_txtContext expr_txt() throws RecognitionException {
		Expr_txtContext _localctx = new Expr_txtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr_txt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
				{
				setState(413);
				txt();
				}
				break;
			case ID:
				{
				setState(414);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(417);
				op_soma();
				setState(418);
				txt();
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

	public static class Estr_condContext extends ParserRuleContext {
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
		enterRule(_localctx, 94, RULE_estr_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			se();
			setState(426);
			paren_e();
			setState(427);
			expr_bool();
			setState(428);
			paren_d();
			setState(429);
			chave_e();
			setState(430);
			bloco();
			setState(431);
			chave_d();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(432);
				estr_cond_sec();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(438);
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

	public static class Estr_cond_secContext extends ParserRuleContext {
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
		enterRule(_localctx, 96, RULE_estr_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			senaose();
			setState(442);
			paren_e();
			setState(443);
			expr_bool();
			setState(444);
			paren_d();
			setState(445);
			chave_e();
			setState(446);
			bloco();
			setState(447);
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
		enterRule(_localctx, 98, RULE_estr_cond_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			senao();
			setState(450);
			chave_e();
			setState(451);
			bloco();
			setState(452);
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
		enterRule(_localctx, 100, RULE_estr_repet);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				estr_enquanto();
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
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
		enterRule(_localctx, 102, RULE_estr_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			enquanto();
			setState(459);
			paren_e();
			setState(460);
			expr_bool();
			setState(461);
			paren_d();
			setState(462);
			chave_e();
			setState(463);
			bloco();
			setState(464);
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

	public static class Estr_de_ateContext extends ParserRuleContext {
		public DeContext de() {
			return getRuleContext(DeContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_estr_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			de();
			setState(467);
			controle_de_ate();
			setState(468);
			chave_e();
			setState(469);
			bloco();
			setState(470);
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
		public Contr_idContext contr_id() {
			return getRuleContext(Contr_idContext.class,0);
		}
		public Contr_atrContext contr_atr() {
			return getRuleContext(Contr_atrContext.class,0);
		}
		public List<Contr_numContext> contr_num() {
			return getRuleContexts(Contr_numContext.class);
		}
		public Contr_numContext contr_num(int i) {
			return getRuleContext(Contr_numContext.class,i);
		}
		public AteContext ate() {
			return getRuleContext(AteContext.class,0);
		}
		public Controle_de_ateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle_de_ate; }
	}

	public final Controle_de_ateContext controle_de_ate() throws RecognitionException {
		Controle_de_ateContext _localctx = new Controle_de_ateContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_controle_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			contr_id();
			setState(473);
			contr_atr();
			setState(474);
			contr_num();
			setState(475);
			ate();
			setState(476);
			contr_num();
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

	public static class Contr_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangParser.ID, 0); }
		public Contr_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contr_id; }
	}

	public final Contr_idContext contr_id() throws RecognitionException {
		Contr_idContext _localctx = new Contr_idContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_contr_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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

	public static class Contr_atrContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(TLangParser.ATR, 0); }
		public Contr_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contr_atr; }
	}

	public final Contr_atrContext contr_atr() throws RecognitionException {
		Contr_atrContext _localctx = new Contr_atrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_contr_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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

	public static class Contr_numContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TLangParser.NUM, 0); }
		public Contr_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contr_num; }
	}

	public final Contr_numContext contr_num() throws RecognitionException {
		Contr_numContext _localctx = new Contr_numContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_contr_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 114, RULE_val);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				num();
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				txt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
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
		enterRule(_localctx, 116, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
		enterRule(_localctx, 118, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
		enterRule(_localctx, 120, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		enterRule(_localctx, 122, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		enterRule(_localctx, 124, RULE_tipo);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				t_numero();
				}
				break;
			case T_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				t_texto();
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
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
		enterRule(_localctx, 126, RULE_t_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 128, RULE_t_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 130, RULE_t_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 132, RULE_leia_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		enterRule(_localctx, 134, RULE_leia_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 136, RULE_leia_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 138, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 140, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 142, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 144, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 146, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		enterRule(_localctx, 148, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 150, RULE_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 152, RULE_paren_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 154, RULE_paren_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 156, RULE_chave_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 158, RULE_chave_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\6\3\u00ab\n\3\r\3\16\3\u00ac\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00b6\n\5\3\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u00e9\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00f1\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u00ff\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0106"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u010d\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u011b\n \3!\3!\3!\5!\u0120\n!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\5&\u0137\n&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0146\n\'\f\'\16\'\u0149\13"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0156\n(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0165\n)\3*\3*\3*\3*\3*\3*\5*\u016d\n*\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u0176\n+\3,\3,\3,\3,\3,\3,\5,\u017e\n,\3-\3-\3-\3-\3-\3"+
		"-\3-\7-\u0187\n-\f-\16-\u018a\13-\3.\3.\3.\3.\3.\3.\3.\7.\u0193\n.\f."+
		"\16.\u0196\13.\3/\3/\3/\3/\3/\3/\5/\u019e\n/\3\60\3\60\5\60\u01a2\n\60"+
		"\3\60\3\60\3\60\7\60\u01a7\n\60\f\60\16\60\u01aa\13\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u01b4\n\61\f\61\16\61\u01b7\13\61\3\61"+
		"\5\61\u01ba\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\5\64\u01cb\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3;\5;\u01ea\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\5"+
		"@\u01f7\n@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\2\2R\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\4\3\2\16\20\3\2\b\r\2\u020a"+
		"\2\u00a2\3\2\2\2\4\u00aa\3\2\2\2\6\u00ae\3\2\2\2\b\u00b5\3\2\2\2\n\u00b9"+
		"\3\2\2\2\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22\u00c1\3"+
		"\2\2\2\24\u00c3\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3\2"+
		"\2\2\34\u00cb\3\2\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2\2\"\u00d1\3\2\2\2"+
		"$\u00d3\3\2\2\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00db\3"+
		"\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2\62\u00e1\3\2\2\2\64\u00e3\3\2\2"+
		"\2\66\u00e8\3\2\2\28\u00fe\3\2\2\2:\u0100\3\2\2\2<\u0107\3\2\2\2>\u011a"+
		"\3\2\2\2@\u011f\3\2\2\2B\u0121\3\2\2\2D\u0125\3\2\2\2F\u0129\3\2\2\2H"+
		"\u012d\3\2\2\2J\u0136\3\2\2\2L\u0138\3\2\2\2N\u0155\3\2\2\2P\u0157\3\2"+
		"\2\2R\u016c\3\2\2\2T\u016e\3\2\2\2V\u017d\3\2\2\2X\u017f\3\2\2\2Z\u018b"+
		"\3\2\2\2\\\u019d\3\2\2\2^\u01a1\3\2\2\2`\u01ab\3\2\2\2b\u01bb\3\2\2\2"+
		"d\u01c3\3\2\2\2f\u01ca\3\2\2\2h\u01cc\3\2\2\2j\u01d4\3\2\2\2l\u01da\3"+
		"\2\2\2n\u01e0\3\2\2\2p\u01e2\3\2\2\2r\u01e4\3\2\2\2t\u01e9\3\2\2\2v\u01eb"+
		"\3\2\2\2x\u01ed\3\2\2\2z\u01ef\3\2\2\2|\u01f1\3\2\2\2~\u01f6\3\2\2\2\u0080"+
		"\u01f8\3\2\2\2\u0082\u01fa\3\2\2\2\u0084\u01fc\3\2\2\2\u0086\u01fe\3\2"+
		"\2\2\u0088\u0200\3\2\2\2\u008a\u0202\3\2\2\2\u008c\u0204\3\2\2\2\u008e"+
		"\u0206\3\2\2\2\u0090\u0208\3\2\2\2\u0092\u020a\3\2\2\2\u0094\u020c\3\2"+
		"\2\2\u0096\u020e\3\2\2\2\u0098\u0210\3\2\2\2\u009a\u0212\3\2\2\2\u009c"+
		"\u0214\3\2\2\2\u009e\u0216\3\2\2\2\u00a0\u0218\3\2\2\2\u00a2\u00a3\5\4"+
		"\3\2\u00a3\3\3\2\2\2\u00a4\u00ab\5> \2\u00a5\u00ab\5\66\34\2\u00a6\u00ab"+
		"\5@!\2\u00a7\u00ab\5H%\2\u00a8\u00ab\5`\61\2\u00a9\u00ab\5f\64\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\5\3\2\2\2\u00ae\u00af\7\7\2\2"+
		"\u00af\7\3\2\2\2\u00b0\u00b6\5\6\4\2\u00b1\u00b6\7\27\2\2\u00b2\u00b6"+
		"\7\30\2\2\u00b3\u00b6\7\31\2\2\u00b4\u00b6\7\32\2\2\u00b5\u00b0\3\2\2"+
		"\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\t\3\2\2\2\u00b7\u00ba\5\6\4\2\u00b8\u00ba\7\27\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00bc\t\2\2"+
		"\2\u00bc\r\3\2\2\2\u00bd\u00be\t\3\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7"+
		"\b\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\23\3\2\2\2\u00c3\u00c4"+
		"\7\n\2\2\u00c4\25\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6\27\3\2\2\2\u00c7"+
		"\u00c8\7\f\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\33\3\2\2\2\u00cb"+
		"\u00cc\7\16\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\37\3\2\2\2"+
		"\u00cf\u00d0\7\20\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2#\3\2\2"+
		"\2\u00d3\u00d4\7\22\2\2\u00d4%\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\'\3"+
		"\2\2\2\u00d7\u00d8\7\24\2\2\u00d8)\3\2\2\2\u00d9\u00da\7\25\2\2\u00da"+
		"+\3\2\2\2\u00db\u00dc\7\26\2\2\u00dc-\3\2\2\2\u00dd\u00de\7\27\2\2\u00de"+
		"/\3\2\2\2\u00df\u00e0\7\30\2\2\u00e0\61\3\2\2\2\u00e1\u00e2\7\31\2\2\u00e2"+
		"\63\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4\65\3\2\2\2\u00e5\u00e9\58\35\2"+
		"\u00e6\u00e9\5:\36\2\u00e7\u00e9\5<\37\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\67\3\2\2\2\u00ea\u00eb\5|?\2\u00eb"+
		"\u00f0\5\b\5\2\u00ec\u00f1\5|?\2\u00ed\u00f1\5v<\2\u00ee\u00f1\5X-\2\u00ef"+
		"\u00f1\5B\"\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\5|?\2\u00f3\u00f4"+
		"\5*\26\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\5|?\2\u00f7"+
		"\u00ff\3\2\2\2\u00f8\u00f9\5|?\2\u00f9\u00fa\5,\27\2\u00fa\u00ff\3\2\2"+
		"\2\u00fb\u00fc\5,\27\2\u00fc\u00fd\5|?\2\u00fd\u00ff\3\2\2\2\u00fe\u00ea"+
		"\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00ff9\3\2\2\2\u0100\u0101\5|?\2\u0101\u0105\5\n\6\2\u0102"+
		"\u0106\5|?\2\u0103\u0106\5^\60\2\u0104\u0106\5D#\2\u0105\u0102\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106;\3\2\2\2\u0107\u0108\5"+
		"|?\2\u0108\u010c\5\6\4\2\u0109\u010d\5|?\2\u010a\u010d\5L\'\2\u010b\u010d"+
		"\5F$\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"=\3\2\2\2\u010e\u010f\5~@\2\u010f\u0110\5|?\2\u0110\u011b\3\2\2\2\u0111"+
		"\u0112\5\u0080A\2\u0112\u0113\58\35\2\u0113\u011b\3\2\2\2\u0114\u0115"+
		"\5\u0082B\2\u0115\u0116\5:\36\2\u0116\u011b\3\2\2\2\u0117\u0118\5\u0084"+
		"C\2\u0118\u0119\5<\37\2\u0119\u011b\3\2\2\2\u011a\u010e\3\2\2\2\u011a"+
		"\u0111\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0117\3\2\2\2\u011b?\3\2\2\2"+
		"\u011c\u0120\5B\"\2\u011d\u0120\5D#\2\u011e\u0120\5\u008aF\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120A\3\2\2\2\u0121"+
		"\u0122\5\u0086D\2\u0122\u0123\5\u009aN\2\u0123\u0124\5\u009cO\2\u0124"+
		"C\3\2\2\2\u0125\u0126\5\u0088E\2\u0126\u0127\5\u009aN\2\u0127\u0128\5"+
		"\u009cO\2\u0128E\3\2\2\2\u0129\u012a\5\u008aF\2\u012a\u012b\5\u009aN\2"+
		"\u012b\u012c\5\u009cO\2\u012cG\3\2\2\2\u012d\u012e\5\u008cG\2\u012e\u012f"+
		"\5\u009aN\2\u012f\u0130\5J&\2\u0130\u0131\5\u009cO\2\u0131I\3\2\2\2\u0132"+
		"\u0137\5L\'\2\u0133\u0137\5P)\2\u0134\u0137\5X-\2\u0135\u0137\5^\60\2"+
		"\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137K\3\2\2\2\u0138\u0147\5N(\2\u0139\u013a\5\34\17\2\u013a"+
		"\u013b\5N(\2\u013b\u0146\3\2\2\2\u013c\u013d\5\36\20\2\u013d\u013e\5N"+
		"(\2\u013e\u0146\3\2\2\2\u013f\u0140\5\30\r\2\u0140\u0141\5N(\2\u0141\u0146"+
		"\3\2\2\2\u0142\u0143\5\32\16\2\u0143\u0144\5N(\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0139\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0142\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"M\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5 \21\2\u014b\u014c\5N(\2\u014c"+
		"\u0156\3\2\2\2\u014d\u0156\5z>\2\u014e\u0156\5|?\2\u014f\u0156\5P)\2\u0150"+
		"\u0156\5T+\2\u0151\u0152\5\u009aN\2\u0152\u0153\5L\'\2\u0153\u0154\5\u009c"+
		"O\2\u0154\u0156\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u014d\3\2\2\2\u0155"+
		"\u014e\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2"+
		"\2\2\u0156O\3\2\2\2\u0157\u0164\5R*\2\u0158\u0159\5\20\t\2\u0159\u015a"+
		"\5R*\2\u015a\u0165\3\2\2\2\u015b\u015c\5\22\n\2\u015c\u015d\5R*\2\u015d"+
		"\u0165\3\2\2\2\u015e\u015f\5\24\13\2\u015f\u0160\5R*\2\u0160\u0165\3\2"+
		"\2\2\u0161\u0162\5\26\f\2\u0162\u0163\5R*\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0158\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u0161\3\2"+
		"\2\2\u0165Q\3\2\2\2\u0166\u016d\5|?\2\u0167\u016d\5X-\2\u0168\u0169\5"+
		"\u009aN\2\u0169\u016a\5P)\2\u016a\u016b\5\u009cO\2\u016b\u016d\3\2\2\2"+
		"\u016c\u0166\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016dS\3"+
		"\2\2\2\u016e\u0175\5V,\2\u016f\u0170\5\30\r\2\u0170\u0171\5V,\2\u0171"+
		"\u0176\3\2\2\2\u0172\u0173\5\32\16\2\u0173\u0174\5V,\2\u0174\u0176\3\2"+
		"\2\2\u0175\u016f\3\2\2\2\u0175\u0172\3\2\2\2\u0176U\3\2\2\2\u0177\u017e"+
		"\5|?\2\u0178\u017e\5X-\2\u0179\u017a\5\u009aN\2\u017a\u017b\5T+\2\u017b"+
		"\u017c\5\u009cO\2\u017c\u017e\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178"+
		"\3\2\2\2\u017d\u0179\3\2\2\2\u017eW\3\2\2\2\u017f\u0188\5Z.\2\u0180\u0181"+
		"\5\"\22\2\u0181\u0182\5Z.\2\u0182\u0187\3\2\2\2\u0183\u0184\5$\23\2\u0184"+
		"\u0185\5Z.\2\u0185\u0187\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0183\3\2\2"+
		"\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189Y"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0194\5\\/\2\u018c\u018d\5&\24\2\u018d"+
		"\u018e\5\\/\2\u018e\u0193\3\2\2\2\u018f\u0190\5(\25\2\u0190\u0191\5\\"+
		"/\2\u0191\u0193\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018f\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195[\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019e\5v<\2\u0198\u019e\5|?\2\u0199\u019a\5"+
		"\u009aN\2\u019a\u019b\5X-\2\u019b\u019c\5\u009cO\2\u019c\u019e\3\2\2\2"+
		"\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019e]\3"+
		"\2\2\2\u019f\u01a2\5x=\2\u01a0\u01a2\5|?\2\u01a1\u019f\3\2\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a8\3\2\2\2\u01a3\u01a4\5\"\22\2\u01a4\u01a5\5x=\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9_\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\5\u008eH\2\u01ac\u01ad\5\u009aN\2\u01ad\u01ae\5L\'\2\u01ae\u01af\5\u009c"+
		"O\2\u01af\u01b0\5\u009eP\2\u01b0\u01b1\5\4\3\2\u01b1\u01b5\5\u00a0Q\2"+
		"\u01b2\u01b4\5b\62\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01ba\5d\63\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baa\3\2\2\2"+
		"\u01bb\u01bc\5\u0090I\2\u01bc\u01bd\5\u009aN\2\u01bd\u01be\5L\'\2\u01be"+
		"\u01bf\5\u009cO\2\u01bf\u01c0\5\u009eP\2\u01c0\u01c1\5\4\3\2\u01c1\u01c2"+
		"\5\u00a0Q\2\u01c2c\3\2\2\2\u01c3\u01c4\5\u0092J\2\u01c4\u01c5\5\u009e"+
		"P\2\u01c5\u01c6\5\4\3\2\u01c6\u01c7\5\u00a0Q\2\u01c7e\3\2\2\2\u01c8\u01cb"+
		"\5h\65\2\u01c9\u01cb\5j\66\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"g\3\2\2\2\u01cc\u01cd\5\u0094K\2\u01cd\u01ce\5\u009aN\2\u01ce\u01cf\5"+
		"L\'\2\u01cf\u01d0\5\u009cO\2\u01d0\u01d1\5\u009eP\2\u01d1\u01d2\5\4\3"+
		"\2\u01d2\u01d3\5\u00a0Q\2\u01d3i\3\2\2\2\u01d4\u01d5\5\u0096L\2\u01d5"+
		"\u01d6\5l\67\2\u01d6\u01d7\5\u009eP\2\u01d7\u01d8\5\4\3\2\u01d8\u01d9"+
		"\5\u00a0Q\2\u01d9k\3\2\2\2\u01da\u01db\5n8\2\u01db\u01dc\5p9\2\u01dc\u01dd"+
		"\5r:\2\u01dd\u01de\5\u0098M\2\u01de\u01df\5r:\2\u01dfm\3\2\2\2\u01e0\u01e1"+
		"\7+\2\2\u01e1o\3\2\2\2\u01e2\u01e3\7\7\2\2\u01e3q\3\2\2\2\u01e4\u01e5"+
		"\7(\2\2\u01e5s\3\2\2\2\u01e6\u01ea\5v<\2\u01e7\u01ea\5x=\2\u01e8\u01ea"+
		"\5z>\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"u\3\2\2\2\u01eb\u01ec\7(\2\2\u01ecw\3\2\2\2\u01ed\u01ee\7)\2\2\u01eey"+
		"\3\2\2\2\u01ef\u01f0\7*\2\2\u01f0{\3\2\2\2\u01f1\u01f2\7+\2\2\u01f2}\3"+
		"\2\2\2\u01f3\u01f7\5\u0080A\2\u01f4\u01f7\5\u0082B\2\u01f5\u01f7\5\u0084"+
		"C\2\u01f6\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\177\3\2\2\2\u01f8\u01f9\7%\2\2\u01f9\u0081\3\2\2\2\u01fa\u01fb\7&\2\2"+
		"\u01fb\u0083\3\2\2\2\u01fc\u01fd\7\'\2\2\u01fd\u0085\3\2\2\2\u01fe\u01ff"+
		"\7\33\2\2\u01ff\u0087\3\2\2\2\u0200\u0201\7\34\2\2\u0201\u0089\3\2\2\2"+
		"\u0202\u0203\7\35\2\2\u0203\u008b\3\2\2\2\u0204\u0205\7\36\2\2\u0205\u008d"+
		"\3\2\2\2\u0206\u0207\7\37\2\2\u0207\u008f\3\2\2\2\u0208\u0209\7 \2\2\u0209"+
		"\u0091\3\2\2\2\u020a\u020b\7!\2\2\u020b\u0093\3\2\2\2\u020c\u020d\7\""+
		"\2\2\u020d\u0095\3\2\2\2\u020e\u020f\7#\2\2\u020f\u0097\3\2\2\2\u0210"+
		"\u0211\7$\2\2\u0211\u0099\3\2\2\2\u0212\u0213\7\3\2\2\u0213\u009b\3\2"+
		"\2\2\u0214\u0215\7\4\2\2\u0215\u009d\3\2\2\2\u0216\u0217\7\5\2\2\u0217"+
		"\u009f\3\2\2\2\u0218\u0219\7\6\2\2\u0219\u00a1\3\2\2\2!\u00aa\u00ac\u00b5"+
		"\u00b9\u00e8\u00f0\u00fe\u0105\u010c\u011a\u011f\u0136\u0145\u0147\u0155"+
		"\u0164\u016c\u0175\u017d\u0186\u0188\u0192\u0194\u019d\u01a1\u01a8\u01b5"+
		"\u01b9\u01ca\u01e9\u01f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}