// Generated from src\gram\TLang.g4 by ANTLR 4.10.1
package antlr;
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		RULE_expr_ig = 41, RULE_termo_ig = 42, RULE_expr_aritm = 43, RULE_expr_soma = 44, 
		RULE_expr_sub = 45, RULE_expr_mult = 46, RULE_expr_div = 47, RULE_termo = 48, 
		RULE_expr_txt = 49, RULE_termo_txt = 50, RULE_estr_cond = 51, RULE_controle_cond = 52, 
		RULE_estr_cond_sec = 53, RULE_controle_cond_sec = 54, RULE_estr_cond_alt = 55, 
		RULE_estr_repet = 56, RULE_estr_enquanto = 57, RULE_controle_enquanto = 58, 
		RULE_estr_de_ate = 59, RULE_controle_de_ate = 60, RULE_ctr_id = 61, RULE_ctr_inicial = 62, 
		RULE_ctr_final = 63, RULE_val = 64, RULE_num = 65, RULE_txt = 66, RULE_bool = 67, 
		RULE_id = 68, RULE_tipo = 69, RULE_t_numero = 70, RULE_t_texto = 71, RULE_t_booleano = 72, 
		RULE_leia_num = 73, RULE_leia_txt = 74, RULE_leia_bool = 75, RULE_escreva = 76, 
		RULE_se = 77, RULE_senaose = 78, RULE_senao = 79, RULE_enquanto = 80, 
		RULE_de = 81, RULE_ate = 82, RULE_paren_e = 83, RULE_paren_d = 84, RULE_chave_e = 85, 
		RULE_chave_d = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"iniciar", "bloco", "op_atr", "op_atr_num", "op_atr_txt", "op_bool", 
			"op_rel", "op_maiorq", "op_menorq", "op_maiorig", "op_menorig", "op_igual", 
			"op_dif", "op_e", "op_ou", "op_nao", "op_soma", "op_sub", "op_mult", 
			"op_div", "op_inc", "op_dec", "op_soma_atr", "op_sub_atr", "op_mult_atr", 
			"op_div_atr", "atr", "atr_num", "atr_txt", "atr_bool", "decl", "leitura", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterIniciar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitIniciar(this);
		}
	}

	public final IniciarContext iniciar() throws RecognitionException {
		IniciarContext _localctx = new IniciarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_iniciar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_NUM:
				case T_TXT:
				case T_BOOL:
					{
					setState(176);
					decl();
					}
					break;
				case INC:
				case DEC:
				case ID:
					{
					setState(177);
					atr();
					}
					break;
				case LEIA_NUM:
				case LEIA_TXT:
				case LEIA_BOOL:
					{
					setState(178);
					leitura();
					}
					break;
				case ESCREVA:
					{
					setState(179);
					escrita();
					}
					break;
				case SE:
					{
					setState(180);
					estr_cond();
					}
					break;
				case ENQUANTO:
				case DE:
					{
					setState(181);
					estr_repet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_atr(this);
		}
	}

	public final Op_atrContext op_atr() throws RecognitionException {
		Op_atrContext _localctx = new Op_atrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_atr_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_atr_num(this);
		}
	}

	public final Op_atr_numContext op_atr_num() throws RecognitionException {
		Op_atr_numContext _localctx = new Op_atr_numContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op_atr_num);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(SOMA_ATR);
				}
				break;
			case SUB_ATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(SUB_ATR);
				}
				break;
			case MULT_ATR:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(MULT_ATR);
				}
				break;
			case DIV_ATR:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_atr_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_atr_txt(this);
		}
	}

	public final Op_atr_txtContext op_atr_txt() throws RecognitionException {
		Op_atr_txtContext _localctx = new Op_atr_txtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_atr_txt);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_bool(this);
		}
	}

	public final Op_boolContext op_bool() throws RecognitionException {
		Op_boolContext _localctx = new Op_boolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_rel(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_maiorq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_maiorq(this);
		}
	}

	public final Op_maiorqContext op_maiorq() throws RecognitionException {
		Op_maiorqContext _localctx = new Op_maiorqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op_maiorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_menorq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_menorq(this);
		}
	}

	public final Op_menorqContext op_menorq() throws RecognitionException {
		Op_menorqContext _localctx = new Op_menorqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_menorq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_maiorig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_maiorig(this);
		}
	}

	public final Op_maiorigContext op_maiorig() throws RecognitionException {
		Op_maiorigContext _localctx = new Op_maiorigContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_maiorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_menorig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_menorig(this);
		}
	}

	public final Op_menorigContext op_menorig() throws RecognitionException {
		Op_menorigContext _localctx = new Op_menorigContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_menorig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_igual(this);
		}
	}

	public final Op_igualContext op_igual() throws RecognitionException {
		Op_igualContext _localctx = new Op_igualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_dif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_dif(this);
		}
	}

	public final Op_difContext op_dif() throws RecognitionException {
		Op_difContext _localctx = new Op_difContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_dif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_e(this);
		}
	}

	public final Op_eContext op_e() throws RecognitionException {
		Op_eContext _localctx = new Op_eContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_ou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_ou(this);
		}
	}

	public final Op_ouContext op_ou() throws RecognitionException {
		Op_ouContext _localctx = new Op_ouContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_ou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_nao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_soma(this);
		}
	}

	public final Op_somaContext op_soma() throws RecognitionException {
		Op_somaContext _localctx = new Op_somaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_sub(this);
		}
	}

	public final Op_subContext op_sub() throws RecognitionException {
		Op_subContext _localctx = new Op_subContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_mult(this);
		}
	}

	public final Op_multContext op_mult() throws RecognitionException {
		Op_multContext _localctx = new Op_multContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_div(this);
		}
	}

	public final Op_divContext op_div() throws RecognitionException {
		Op_divContext _localctx = new Op_divContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_inc(this);
		}
	}

	public final Op_incContext op_inc() throws RecognitionException {
		Op_incContext _localctx = new Op_incContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_dec(this);
		}
	}

	public final Op_decContext op_dec() throws RecognitionException {
		Op_decContext _localctx = new Op_decContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_soma_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_soma_atr(this);
		}
	}

	public final Op_soma_atrContext op_soma_atr() throws RecognitionException {
		Op_soma_atrContext _localctx = new Op_soma_atrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_soma_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_sub_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_sub_atr(this);
		}
	}

	public final Op_sub_atrContext op_sub_atr() throws RecognitionException {
		Op_sub_atrContext _localctx = new Op_sub_atrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_sub_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_mult_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_mult_atr(this);
		}
	}

	public final Op_mult_atrContext op_mult_atr() throws RecognitionException {
		Op_mult_atrContext _localctx = new Op_mult_atrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_mult_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterOp_div_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitOp_div_atr(this);
		}
	}

	public final Op_div_atrContext op_div_atr() throws RecognitionException {
		Op_div_atrContext _localctx = new Op_div_atrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_div_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitAtr(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atr);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				atr_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				atr_txt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Op_atr_numContext op_atr_num() {
			return getRuleContext(Op_atr_numContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterAtr_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitAtr_num(this);
		}
	}

	public final Atr_numContext atr_num() throws RecognitionException {
		Atr_numContext _localctx = new Atr_numContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atr_num);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				id();
				setState(247);
				op_atr_num();
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PAREN_E:
				case NUM:
				case ID:
					{
					setState(248);
					expr_aritm();
					}
					break;
				case LEIA_NUM:
					{
					setState(249);
					leitura_num();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				id();
				setState(253);
				op_inc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				op_inc();
				setState(256);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				id();
				setState(259);
				op_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				op_dec();
				setState(262);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterAtr_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitAtr_txt(this);
		}
	}

	public final Atr_txtContext atr_txt() throws RecognitionException {
		Atr_txtContext _localctx = new Atr_txtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atr_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			id();
			setState(267);
			op_atr_txt();
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
			case ID:
				{
				setState(268);
				expr_txt();
				}
				break;
			case LEIA_TXT:
				{
				setState(269);
				leitura_txt();
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

	public static class Atr_boolContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterAtr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitAtr_bool(this);
		}
	}

	public final Atr_boolContext atr_bool() throws RecognitionException {
		Atr_boolContext _localctx = new Atr_boolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atr_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			id();
			setState(273);
			op_atr();
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_E:
			case NAO:
			case NUM:
			case BOOL:
			case ID:
				{
				setState(274);
				expr_bool();
				}
				break;
			case LEIA_BOOL:
				{
				setState(275);
				leitura_bool();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decl);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				tipo();
				setState(279);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				t_numero();
				setState(282);
				atr_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				t_texto();
				setState(285);
				atr_txt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				t_booleano();
				setState(288);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_leitura);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				leitura_num();
				}
				break;
			case LEIA_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				leitura_txt();
				}
				break;
			case LEIA_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeitura_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeitura_num(this);
		}
	}

	public final Leitura_numContext leitura_num() throws RecognitionException {
		Leitura_numContext _localctx = new Leitura_numContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_leitura_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			leia_num();
			setState(298);
			paren_e();
			setState(299);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeitura_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeitura_txt(this);
		}
	}

	public final Leitura_txtContext leitura_txt() throws RecognitionException {
		Leitura_txtContext _localctx = new Leitura_txtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_leitura_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			leia_txt();
			setState(302);
			paren_e();
			setState(303);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeitura_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeitura_bool(this);
		}
	}

	public final Leitura_boolContext leitura_bool() throws RecognitionException {
		Leitura_boolContext _localctx = new Leitura_boolContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_leitura_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			leia_bool();
			setState(306);
			paren_e();
			setState(307);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			escreva();
			setState(310);
			paren_e();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(311);
				id();
				}
				break;
			case 2:
				{
				setState(312);
				expr();
				}
				break;
			}
			setState(315);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				expr_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_bool(this);
		}
	}

	public final Expr_boolContext expr_bool() throws RecognitionException {
		Expr_boolContext _localctx = new Expr_boolContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			termo_bool();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << E) | (1L << OU))) != 0)) {
				{
				setState(335);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(323);
					op_e();
					setState(324);
					termo_bool();
					}
					break;
				case OU:
					{
					setState(326);
					op_ou();
					setState(327);
					termo_bool();
					}
					break;
				case IGUAL:
					{
					setState(329);
					op_igual();
					setState(330);
					termo_bool();
					}
					break;
				case DIF:
					{
					setState(332);
					op_dif();
					setState(333);
					termo_bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(339);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTermo_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTermo_bool(this);
		}
	}

	public final Termo_boolContext termo_bool() throws RecognitionException {
		Termo_boolContext _localctx = new Termo_boolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_termo_bool);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				op_nao();
				setState(341);
				termo_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				expr_rel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				expr_ig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				paren_e();
				setState(348);
				expr_bool();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_rel(this);
		}
	}

	public final Expr_relContext expr_rel() throws RecognitionException {
		Expr_relContext _localctx = new Expr_relContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			termo_rel();
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIORQ:
				{
				setState(354);
				op_maiorq();
				setState(355);
				termo_rel();
				}
				break;
			case MENORQ:
				{
				setState(357);
				op_menorq();
				setState(358);
				termo_rel();
				}
				break;
			case MAIORIG:
				{
				setState(360);
				op_maiorig();
				setState(361);
				termo_rel();
				}
				break;
			case MENORIG:
				{
				setState(363);
				op_menorig();
				setState(364);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTermo_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTermo_rel(this);
		}
	}

	public final Termo_relContext termo_rel() throws RecognitionException {
		Termo_relContext _localctx = new Termo_relContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_termo_rel);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				paren_e();
				setState(371);
				expr_rel();
				setState(372);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_ig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_ig(this);
		}
	}

	public final Expr_igContext expr_ig() throws RecognitionException {
		Expr_igContext _localctx = new Expr_igContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr_ig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			termo_ig();
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(377);
				op_igual();
				setState(378);
				termo_ig();
				}
				break;
			case DIF:
				{
				setState(380);
				op_dif();
				setState(381);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTermo_ig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTermo_ig(this);
		}
	}

	public final Termo_igContext termo_ig() throws RecognitionException {
		Termo_igContext _localctx = new Termo_igContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termo_ig);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				paren_e();
				setState(388);
				expr_ig();
				setState(389);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_aritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_aritm(this);
		}
	}

	public final Expr_aritmContext expr_aritm() throws RecognitionException {
		Expr_aritmContext _localctx = new Expr_aritmContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr_aritm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_soma(this);
		}
	}

	public final Expr_somaContext expr_soma() throws RecognitionException {
		Expr_somaContext _localctx = new Expr_somaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			expr_sub();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(396);
				op_soma();
				setState(397);
				expr_sub();
				}
				}
				setState(403);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_sub(this);
		}
	}

	public final Expr_subContext expr_sub() throws RecognitionException {
		Expr_subContext _localctx = new Expr_subContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			expr_mult();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB) {
				{
				{
				setState(405);
				op_sub();
				setState(406);
				expr_mult();
				}
				}
				setState(412);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			expr_div();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(414);
				op_mult();
				setState(415);
				expr_div();
				}
				}
				setState(421);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_div(this);
		}
	}

	public final Expr_divContext expr_div() throws RecognitionException {
		Expr_divContext _localctx = new Expr_divContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			termo();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(423);
				op_div();
				setState(424);
				termo();
				}
				}
				setState(430);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termo);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				id();
				}
				break;
			case PAREN_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				paren_e();
				setState(434);
				expr_aritm();
				setState(435);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterExpr_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitExpr_txt(this);
		}
	}

	public final Expr_txtContext expr_txt() throws RecognitionException {
		Expr_txtContext _localctx = new Expr_txtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr_txt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			termo_txt();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(440);
				op_soma();
				setState(441);
				termo_txt();
				}
				}
				setState(447);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTermo_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTermo_txt(this);
		}
	}

	public final Termo_txtContext termo_txt() throws RecognitionException {
		Termo_txtContext _localctx = new Termo_txtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_termo_txt);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				txt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_cond(this);
		}
	}

	public final Estr_condContext estr_cond() throws RecognitionException {
		Estr_condContext _localctx = new Estr_condContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_estr_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			controle_cond();
			setState(453);
			chave_e();
			setState(454);
			bloco();
			setState(455);
			chave_d();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(456);
				estr_cond_sec();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(462);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterControle_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitControle_cond(this);
		}
	}

	public final Controle_condContext controle_cond() throws RecognitionException {
		Controle_condContext _localctx = new Controle_condContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_controle_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			se();
			setState(466);
			paren_e();
			setState(467);
			expr_bool();
			setState(468);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_cond_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_cond_sec(this);
		}
	}

	public final Estr_cond_secContext estr_cond_sec() throws RecognitionException {
		Estr_cond_secContext _localctx = new Estr_cond_secContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_estr_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			controle_cond_sec();
			setState(471);
			chave_e();
			setState(472);
			bloco();
			setState(473);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterControle_cond_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitControle_cond_sec(this);
		}
	}

	public final Controle_cond_secContext controle_cond_sec() throws RecognitionException {
		Controle_cond_secContext _localctx = new Controle_cond_secContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_controle_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			senaose();
			setState(476);
			paren_e();
			setState(477);
			expr_bool();
			setState(478);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_cond_alt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_cond_alt(this);
		}
	}

	public final Estr_cond_altContext estr_cond_alt() throws RecognitionException {
		Estr_cond_altContext _localctx = new Estr_cond_altContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_estr_cond_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			senao();
			setState(481);
			chave_e();
			setState(482);
			bloco();
			setState(483);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_repet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_repet(this);
		}
	}

	public final Estr_repetContext estr_repet() throws RecognitionException {
		Estr_repetContext _localctx = new Estr_repetContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_estr_repet);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				estr_enquanto();
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_enquanto(this);
		}
	}

	public final Estr_enquantoContext estr_enquanto() throws RecognitionException {
		Estr_enquantoContext _localctx = new Estr_enquantoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_estr_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			controle_enquanto();
			setState(490);
			chave_e();
			setState(491);
			bloco();
			setState(492);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterControle_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitControle_enquanto(this);
		}
	}

	public final Controle_enquantoContext controle_enquanto() throws RecognitionException {
		Controle_enquantoContext _localctx = new Controle_enquantoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_controle_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			enquanto();
			setState(495);
			paren_e();
			setState(496);
			expr_bool();
			setState(497);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEstr_de_ate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEstr_de_ate(this);
		}
	}

	public final Estr_de_ateContext estr_de_ate() throws RecognitionException {
		Estr_de_ateContext _localctx = new Estr_de_ateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_estr_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			controle_de_ate();
			setState(500);
			chave_e();
			setState(501);
			bloco();
			setState(502);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterControle_de_ate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitControle_de_ate(this);
		}
	}

	public final Controle_de_ateContext controle_de_ate() throws RecognitionException {
		Controle_de_ateContext _localctx = new Controle_de_ateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_controle_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			de();
			setState(505);
			match(PAREN_E);
			setState(506);
			ctr_id();
			setState(507);
			match(ATR);
			setState(508);
			ctr_inicial();
			setState(509);
			ate();
			setState(510);
			ctr_final();
			setState(511);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterCtr_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitCtr_id(this);
		}
	}

	public final Ctr_idContext ctr_id() throws RecognitionException {
		Ctr_idContext _localctx = new Ctr_idContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ctr_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterCtr_inicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitCtr_inicial(this);
		}
	}

	public final Ctr_inicialContext ctr_inicial() throws RecognitionException {
		Ctr_inicialContext _localctx = new Ctr_inicialContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ctr_inicial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterCtr_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitCtr_final(this);
		}
	}

	public final Ctr_finalContext ctr_final() throws RecognitionException {
		Ctr_finalContext _localctx = new Ctr_finalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ctr_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_val);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				num();
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				txt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTxt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTxt(this);
		}
	}

	public final TxtContext txt() throws RecognitionException {
		TxtContext _localctx = new TxtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tipo);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				t_numero();
				}
				break;
			case T_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				t_texto();
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterT_numero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitT_numero(this);
		}
	}

	public final T_numeroContext t_numero() throws RecognitionException {
		T_numeroContext _localctx = new T_numeroContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_t_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterT_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitT_texto(this);
		}
	}

	public final T_textoContext t_texto() throws RecognitionException {
		T_textoContext _localctx = new T_textoContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_t_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterT_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitT_booleano(this);
		}
	}

	public final T_booleanoContext t_booleano() throws RecognitionException {
		T_booleanoContext _localctx = new T_booleanoContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_t_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeia_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeia_num(this);
		}
	}

	public final Leia_numContext leia_num() throws RecognitionException {
		Leia_numContext _localctx = new Leia_numContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_leia_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeia_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeia_txt(this);
		}
	}

	public final Leia_txtContext leia_txt() throws RecognitionException {
		Leia_txtContext _localctx = new Leia_txtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_leia_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterLeia_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitLeia_bool(this);
		}
	}

	public final Leia_boolContext leia_bool() throws RecognitionException {
		Leia_boolContext _localctx = new Leia_boolContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_leia_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEscreva(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterSenaose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitSenaose(this);
		}
	}

	public final SenaoseContext senaose() throws RecognitionException {
		SenaoseContext _localctx = new SenaoseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitDe(this);
		}
	}

	public final DeContext de() throws RecognitionException {
		DeContext _localctx = new DeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitAte(this);
		}
	}

	public final AteContext ate() throws RecognitionException {
		AteContext _localctx = new AteContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterParen_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitParen_e(this);
		}
	}

	public final Paren_eContext paren_e() throws RecognitionException {
		Paren_eContext _localctx = new Paren_eContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_paren_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterParen_d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitParen_d(this);
		}
	}

	public final Paren_dContext paren_d() throws RecognitionException {
		Paren_dContext _localctx = new Paren_dContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_paren_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterChave_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitChave_e(this);
		}
	}

	public final Chave_eContext chave_e() throws RecognitionException {
		Chave_eContext _localctx = new Chave_eContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_chave_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterChave_d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitChave_d(this);
		}
	}

	public final Chave_dContext chave_d() throws RecognitionException {
		Chave_dContext _localctx = new Chave_dContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_chave_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		"\u0004\u0001,\u023c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00b7\b\u0001"+
		"\u000b\u0001\f\u0001\u00b8\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c2\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00c6\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f5\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fb\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0109"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u010f"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0115"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0123\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0128\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u013a\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u0141\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u0150\b%\n%\f%\u0153\t%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0160\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u016f\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0177\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0180\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0188"+
		"\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0190\b,\n,\f,\u0193"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0005-\u0199\b-\n-\f-\u019c\t-\u0001."+
		"\u0001.\u0001.\u0001.\u0005.\u01a2\b.\n.\f.\u01a5\t.\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u01ab\b/\n/\f/\u01ae\t/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u01b6\b0\u00011\u00011\u00011\u00011\u00051\u01bc\b1\n"+
		"1\f1\u01bf\t1\u00012\u00012\u00032\u01c3\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00053\u01ca\b3\n3\f3\u01cd\t3\u00013\u00033\u01d0\b3\u00014"+
		"\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00038\u01e8\b8\u00019\u00019\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		">\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u020b\b@\u0001A\u0001"+
		"A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0003"+
		"E\u0218\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001"+
		"J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001"+
		"O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001"+
		"T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001V\u0000\u0000W\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\u0003\u0001\u0000\f\u000e"+
		"\u0001\u0000\u0006\u000b\u0002\u0000&&))\u0220\u0000\u00ae\u0001\u0000"+
		"\u0000\u0000\u0002\u00b6\u0001\u0000\u0000\u0000\u0004\u00ba\u0001\u0000"+
		"\u0000\u0000\u0006\u00c1\u0001\u0000\u0000\u0000\b\u00c5\u0001\u0000\u0000"+
		"\u0000\n\u00c7\u0001\u0000\u0000\u0000\f\u00c9\u0001\u0000\u0000\u0000"+
		"\u000e\u00cb\u0001\u0000\u0000\u0000\u0010\u00cd\u0001\u0000\u0000\u0000"+
		"\u0012\u00cf\u0001\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000"+
		"\u0016\u00d3\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000"+
		"\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000\u0000\u0000"+
		"\u001e\u00db\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\""+
		"\u00df\u0001\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000\u0000&\u00e3\u0001"+
		"\u0000\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000\u0000"+
		"\u0000,\u00e9\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000\u0000\u00000"+
		"\u00ed\u0001\u0000\u0000\u00002\u00ef\u0001\u0000\u0000\u00004\u00f4\u0001"+
		"\u0000\u0000\u00006\u0108\u0001\u0000\u0000\u00008\u010a\u0001\u0000\u0000"+
		"\u0000:\u0110\u0001\u0000\u0000\u0000<\u0122\u0001\u0000\u0000\u0000>"+
		"\u0127\u0001\u0000\u0000\u0000@\u0129\u0001\u0000\u0000\u0000B\u012d\u0001"+
		"\u0000\u0000\u0000D\u0131\u0001\u0000\u0000\u0000F\u0135\u0001\u0000\u0000"+
		"\u0000H\u0140\u0001\u0000\u0000\u0000J\u0142\u0001\u0000\u0000\u0000L"+
		"\u015f\u0001\u0000\u0000\u0000N\u0161\u0001\u0000\u0000\u0000P\u0176\u0001"+
		"\u0000\u0000\u0000R\u0178\u0001\u0000\u0000\u0000T\u0187\u0001\u0000\u0000"+
		"\u0000V\u0189\u0001\u0000\u0000\u0000X\u018b\u0001\u0000\u0000\u0000Z"+
		"\u0194\u0001\u0000\u0000\u0000\\\u019d\u0001\u0000\u0000\u0000^\u01a6"+
		"\u0001\u0000\u0000\u0000`\u01b5\u0001\u0000\u0000\u0000b\u01b7\u0001\u0000"+
		"\u0000\u0000d\u01c2\u0001\u0000\u0000\u0000f\u01c4\u0001\u0000\u0000\u0000"+
		"h\u01d1\u0001\u0000\u0000\u0000j\u01d6\u0001\u0000\u0000\u0000l\u01db"+
		"\u0001\u0000\u0000\u0000n\u01e0\u0001\u0000\u0000\u0000p\u01e7\u0001\u0000"+
		"\u0000\u0000r\u01e9\u0001\u0000\u0000\u0000t\u01ee\u0001\u0000\u0000\u0000"+
		"v\u01f3\u0001\u0000\u0000\u0000x\u01f8\u0001\u0000\u0000\u0000z\u0201"+
		"\u0001\u0000\u0000\u0000|\u0203\u0001\u0000\u0000\u0000~\u0205\u0001\u0000"+
		"\u0000\u0000\u0080\u020a\u0001\u0000\u0000\u0000\u0082\u020c\u0001\u0000"+
		"\u0000\u0000\u0084\u020e\u0001\u0000\u0000\u0000\u0086\u0210\u0001\u0000"+
		"\u0000\u0000\u0088\u0212\u0001\u0000\u0000\u0000\u008a\u0217\u0001\u0000"+
		"\u0000\u0000\u008c\u0219\u0001\u0000\u0000\u0000\u008e\u021b\u0001\u0000"+
		"\u0000\u0000\u0090\u021d\u0001\u0000\u0000\u0000\u0092\u021f\u0001\u0000"+
		"\u0000\u0000\u0094\u0221\u0001\u0000\u0000\u0000\u0096\u0223\u0001\u0000"+
		"\u0000\u0000\u0098\u0225\u0001\u0000\u0000\u0000\u009a\u0227\u0001\u0000"+
		"\u0000\u0000\u009c\u0229\u0001\u0000\u0000\u0000\u009e\u022b\u0001\u0000"+
		"\u0000\u0000\u00a0\u022d\u0001\u0000\u0000\u0000\u00a2\u022f\u0001\u0000"+
		"\u0000\u0000\u00a4\u0231\u0001\u0000\u0000\u0000\u00a6\u0233\u0001\u0000"+
		"\u0000\u0000\u00a8\u0235\u0001\u0000\u0000\u0000\u00aa\u0237\u0001\u0000"+
		"\u0000\u0000\u00ac\u0239\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0002"+
		"\u0001\u0000\u00af\u0001\u0001\u0000\u0000\u0000\u00b0\u00b7\u0003<\u001e"+
		"\u0000\u00b1\u00b7\u00034\u001a\u0000\u00b2\u00b7\u0003>\u001f\u0000\u00b3"+
		"\u00b7\u0003F#\u0000\u00b4\u00b7\u0003f3\u0000\u00b5\u00b7\u0003p8\u0000"+
		"\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0003\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0005\u0000\u0000\u00bb\u0005\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c2\u0003\u0004\u0002\u0000\u00bd\u00c2\u0005\u0015\u0000\u0000"+
		"\u00be\u00c2\u0005\u0016\u0000\u0000\u00bf\u00c2\u0005\u0017\u0000\u0000"+
		"\u00c0\u00c2\u0005\u0018\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u0007\u0001\u0000\u0000\u0000\u00c3\u00c6\u0003\u0004\u0002\u0000"+
		"\u00c4\u00c6\u0005\u0015\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\t\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0000\u0000\u0000\u00c8\u000b\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0007\u0001\u0000\u0000\u00ca\r\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0006\u0000\u0000\u00cc\u000f\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0007\u0000\u0000\u00ce\u0011\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005\b\u0000\u0000\u00d0\u0013\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\t\u0000\u0000\u00d2\u0015\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\n"+
		"\u0000\u0000\u00d4\u0017\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000b"+
		"\u0000\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\f\u0000"+
		"\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\r\u0000\u0000"+
		"\u00da\u001d\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u000e\u0000\u0000"+
		"\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u000f\u0000\u0000"+
		"\u00de!\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0010\u0000\u0000\u00e0"+
		"#\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0011\u0000\u0000\u00e2%\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0005\u0012\u0000\u0000\u00e4\'\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005\u0013\u0000\u0000\u00e6)\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0014\u0000\u0000\u00e8+\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0015\u0000\u0000\u00ea-\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0016\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0017\u0000\u0000\u00ee1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0018\u0000\u0000\u00f03\u0001\u0000\u0000\u0000\u00f1\u00f5\u00036\u001b"+
		"\u0000\u00f2\u00f5\u00038\u001c\u0000\u00f3\u00f5\u0003:\u001d\u0000\u00f4"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f55\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0003\u0088D\u0000\u00f7\u00fa\u0003\u0006\u0003\u0000\u00f8\u00fb\u0003"+
		"V+\u0000\u00f9\u00fb\u0003@ \u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0109\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0003\u0088D\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u0109"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0003(\u0014\u0000\u0100\u0101\u0003"+
		"\u0088D\u0000\u0101\u0109\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0088"+
		"D\u0000\u0103\u0104\u0003*\u0015\u0000\u0104\u0109\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0003*\u0015\u0000\u0106\u0107\u0003\u0088D\u0000\u0107\u0109"+
		"\u0001\u0000\u0000\u0000\u0108\u00f6\u0001\u0000\u0000\u0000\u0108\u00fc"+
		"\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000\u0000\u0000\u0108\u0102"+
		"\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u01097\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0003\u0088D\u0000\u010b\u010e\u0003\b"+
		"\u0004\u0000\u010c\u010f\u0003b1\u0000\u010d\u010f\u0003B!\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"9\u0001\u0000\u0000\u0000\u0110\u0111\u0003\u0088D\u0000\u0111\u0114\u0003"+
		"\u0004\u0002\u0000\u0112\u0115\u0003J%\u0000\u0113\u0115\u0003D\"\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0115;\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u008aE\u0000\u0117\u0118"+
		"\u0003\u0088D\u0000\u0118\u0123\u0001\u0000\u0000\u0000\u0119\u011a\u0003"+
		"\u008cF\u0000\u011a\u011b\u00036\u001b\u0000\u011b\u0123\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0003\u008eG\u0000\u011d\u011e\u00038\u001c\u0000\u011e"+
		"\u0123\u0001\u0000\u0000\u0000\u011f\u0120\u0003\u0090H\u0000\u0120\u0121"+
		"\u0003:\u001d\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0116\u0001"+
		"\u0000\u0000\u0000\u0122\u0119\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123=\u0001\u0000"+
		"\u0000\u0000\u0124\u0128\u0003@ \u0000\u0125\u0128\u0003B!\u0000\u0126"+
		"\u0128\u0003\u0096K\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128?\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0003\u0092I\u0000\u012a\u012b\u0003\u00a6"+
		"S\u0000\u012b\u012c\u0003\u00a8T\u0000\u012cA\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0003\u0094J\u0000\u012e\u012f\u0003\u00a6S\u0000\u012f\u0130"+
		"\u0003\u00a8T\u0000\u0130C\u0001\u0000\u0000\u0000\u0131\u0132\u0003\u0096"+
		"K\u0000\u0132\u0133\u0003\u00a6S\u0000\u0133\u0134\u0003\u00a8T\u0000"+
		"\u0134E\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u0098L\u0000\u0136\u0139"+
		"\u0003\u00a6S\u0000\u0137\u013a\u0003\u0088D\u0000\u0138\u013a\u0003H"+
		"$\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u00a8T\u0000"+
		"\u013cG\u0001\u0000\u0000\u0000\u013d\u0141\u0003J%\u0000\u013e\u0141"+
		"\u0003V+\u0000\u013f\u0141\u0003b1\u0000\u0140\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000"+
		"\u0000\u0141I\u0001\u0000\u0000\u0000\u0142\u0151\u0003L&\u0000\u0143"+
		"\u0144\u0003\u001a\r\u0000\u0144\u0145\u0003L&\u0000\u0145\u0150\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0003\u001c\u000e\u0000\u0147\u0148\u0003"+
		"L&\u0000\u0148\u0150\u0001\u0000\u0000\u0000\u0149\u014a\u0003\u0016\u000b"+
		"\u0000\u014a\u014b\u0003L&\u0000\u014b\u0150\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003\u0018\f\u0000\u014d\u014e\u0003L&\u0000\u014e\u0150\u0001"+
		"\u0000\u0000\u0000\u014f\u0143\u0001\u0000\u0000\u0000\u014f\u0146\u0001"+
		"\u0000\u0000\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u014c\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152K\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0155\u0003\u001e"+
		"\u000f\u0000\u0155\u0156\u0003L&\u0000\u0156\u0160\u0001\u0000\u0000\u0000"+
		"\u0157\u0160\u0003\u0086C\u0000\u0158\u0160\u0003\u0088D\u0000\u0159\u0160"+
		"\u0003N\'\u0000\u015a\u0160\u0003R)\u0000\u015b\u015c\u0003\u00a6S\u0000"+
		"\u015c\u015d\u0003J%\u0000\u015d\u015e\u0003\u00a8T\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u0154\u0001\u0000\u0000\u0000\u015f\u0157"+
		"\u0001\u0000\u0000\u0000\u015f\u0158\u0001\u0000\u0000\u0000\u015f\u0159"+
		"\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f\u015b"+
		"\u0001\u0000\u0000\u0000\u0160M\u0001\u0000\u0000\u0000\u0161\u016e\u0003"+
		"P(\u0000\u0162\u0163\u0003\u000e\u0007\u0000\u0163\u0164\u0003P(\u0000"+
		"\u0164\u016f\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u0010\b\u0000\u0166"+
		"\u0167\u0003P(\u0000\u0167\u016f\u0001\u0000\u0000\u0000\u0168\u0169\u0003"+
		"\u0012\t\u0000\u0169\u016a\u0003P(\u0000\u016a\u016f\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0003\u0014\n\u0000\u016c\u016d\u0003P(\u0000\u016d"+
		"\u016f\u0001\u0000\u0000\u0000\u016e\u0162\u0001\u0000\u0000\u0000\u016e"+
		"\u0165\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e"+
		"\u016b\u0001\u0000\u0000\u0000\u016fO\u0001\u0000\u0000\u0000\u0170\u0177"+
		"\u0003\u0088D\u0000\u0171\u0177\u0003V+\u0000\u0172\u0173\u0003\u00a6"+
		"S\u0000\u0173\u0174\u0003N\'\u0000\u0174\u0175\u0003\u00a8T\u0000\u0175"+
		"\u0177\u0001\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176"+
		"\u0171\u0001\u0000\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0177"+
		"Q\u0001\u0000\u0000\u0000\u0178\u017f\u0003T*\u0000\u0179\u017a\u0003"+
		"\u0016\u000b\u0000\u017a\u017b\u0003T*\u0000\u017b\u0180\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0003\u0018\f\u0000\u017d\u017e\u0003T*\u0000\u017e"+
		"\u0180\u0001\u0000\u0000\u0000\u017f\u0179\u0001\u0000\u0000\u0000\u017f"+
		"\u017c\u0001\u0000\u0000\u0000\u0180S\u0001\u0000\u0000\u0000\u0181\u0188"+
		"\u0003\u0088D\u0000\u0182\u0188\u0003V+\u0000\u0183\u0184\u0003\u00a6"+
		"S\u0000\u0184\u0185\u0003R)\u0000\u0185\u0186\u0003\u00a8T\u0000\u0186"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0187"+
		"\u0182\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0188"+
		"U\u0001\u0000\u0000\u0000\u0189\u018a\u0003X,\u0000\u018aW\u0001\u0000"+
		"\u0000\u0000\u018b\u0191\u0003Z-\u0000\u018c\u018d\u0003 \u0010\u0000"+
		"\u018d\u018e\u0003Z-\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018c"+
		"\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192Y\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u019a\u0003"+
		"\\.\u0000\u0195\u0196\u0003\"\u0011\u0000\u0196\u0197\u0003\\.\u0000\u0197"+
		"\u0199\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0199"+
		"\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b[\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019d\u01a3\u0003^/\u0000\u019e\u019f\u0003$"+
		"\u0012\u0000\u019f\u01a0\u0003^/\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a1\u019e\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4]\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6"+
		"\u01ac\u0003`0\u0000\u01a7\u01a8\u0003&\u0013\u0000\u01a8\u01a9\u0003"+
		"`0\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad_\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b6\u0003\u0082A\u0000\u01b0"+
		"\u01b6\u0003\u0088D\u0000\u01b1\u01b2\u0003\u00a6S\u0000\u01b2\u01b3\u0003"+
		"V+\u0000\u01b3\u01b4\u0003\u00a8T\u0000\u01b4\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b6a\u0001\u0000\u0000\u0000"+
		"\u01b7\u01bd\u0003d2\u0000\u01b8\u01b9\u0003 \u0010\u0000\u01b9\u01ba"+
		"\u0003d2\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b8\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01bec\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c3\u0003\u0084B\u0000"+
		"\u01c1\u01c3\u0003\u0088D\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3e\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0003h4\u0000\u01c5\u01c6\u0003\u00aaU\u0000\u01c6\u01c7\u0003\u0002"+
		"\u0001\u0000\u01c7\u01cb\u0003\u00acV\u0000\u01c8\u01ca\u0003j5\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d0\u0003n7\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0g\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003"+
		"\u009aM\u0000\u01d2\u01d3\u0003\u00a6S\u0000\u01d3\u01d4\u0003J%\u0000"+
		"\u01d4\u01d5\u0003\u00a8T\u0000\u01d5i\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0003l6\u0000\u01d7\u01d8\u0003\u00aaU\u0000\u01d8\u01d9\u0003\u0002"+
		"\u0001\u0000\u01d9\u01da\u0003\u00acV\u0000\u01dak\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0003\u009cN\u0000\u01dc\u01dd\u0003\u00a6S\u0000\u01dd\u01de"+
		"\u0003J%\u0000\u01de\u01df\u0003\u00a8T\u0000\u01dfm\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0003\u009eO\u0000\u01e1\u01e2\u0003\u00aaU\u0000\u01e2"+
		"\u01e3\u0003\u0002\u0001\u0000\u01e3\u01e4\u0003\u00acV\u0000\u01e4o\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e8\u0003r9\u0000\u01e6\u01e8\u0003v;\u0000"+
		"\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8q\u0001\u0000\u0000\u0000\u01e9\u01ea\u0003t:\u0000\u01ea\u01eb"+
		"\u0003\u00aaU\u0000\u01eb\u01ec\u0003\u0002\u0001\u0000\u01ec\u01ed\u0003"+
		"\u00acV\u0000\u01eds\u0001\u0000\u0000\u0000\u01ee\u01ef\u0003\u00a0P"+
		"\u0000\u01ef\u01f0\u0003\u00a6S\u0000\u01f0\u01f1\u0003J%\u0000\u01f1"+
		"\u01f2\u0003\u00a8T\u0000\u01f2u\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003"+
		"x<\u0000\u01f4\u01f5\u0003\u00aaU\u0000\u01f5\u01f6\u0003\u0002\u0001"+
		"\u0000\u01f6\u01f7\u0003\u00acV\u0000\u01f7w\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0003\u00a2Q\u0000\u01f9\u01fa\u0005\u0001\u0000\u0000\u01fa\u01fb"+
		"\u0003z=\u0000\u01fb\u01fc\u0005\u0005\u0000\u0000\u01fc\u01fd\u0003|"+
		">\u0000\u01fd\u01fe\u0003\u00a4R\u0000\u01fe\u01ff\u0003~?\u0000\u01ff"+
		"\u0200\u0005\u0002\u0000\u0000\u0200y\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005)\u0000\u0000\u0202{\u0001\u0000\u0000\u0000\u0203\u0204\u0007\u0002"+
		"\u0000\u0000\u0204}\u0001\u0000\u0000\u0000\u0205\u0206\u0007\u0002\u0000"+
		"\u0000\u0206\u007f\u0001\u0000\u0000\u0000\u0207\u020b\u0003\u0082A\u0000"+
		"\u0208\u020b\u0003\u0084B\u0000\u0209\u020b\u0003\u0086C\u0000\u020a\u0207"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209"+
		"\u0001\u0000\u0000\u0000\u020b\u0081\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0005&\u0000\u0000\u020d\u0083\u0001\u0000\u0000\u0000\u020e\u020f\u0005"+
		"\'\u0000\u0000\u020f\u0085\u0001\u0000\u0000\u0000\u0210\u0211\u0005("+
		"\u0000\u0000\u0211\u0087\u0001\u0000\u0000\u0000\u0212\u0213\u0005)\u0000"+
		"\u0000\u0213\u0089\u0001\u0000\u0000\u0000\u0214\u0218\u0003\u008cF\u0000"+
		"\u0215\u0218\u0003\u008eG\u0000\u0216\u0218\u0003\u0090H\u0000\u0217\u0214"+
		"\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u008b\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0005#\u0000\u0000\u021a\u008d\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"$\u0000\u0000\u021c\u008f\u0001\u0000\u0000\u0000\u021d\u021e\u0005%\u0000"+
		"\u0000\u021e\u0091\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0019\u0000"+
		"\u0000\u0220\u0093\u0001\u0000\u0000\u0000\u0221\u0222\u0005\u001a\u0000"+
		"\u0000\u0222\u0095\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u001b\u0000"+
		"\u0000\u0224\u0097\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u001c\u0000"+
		"\u0000\u0226\u0099\u0001\u0000\u0000\u0000\u0227\u0228\u0005\u001d\u0000"+
		"\u0000\u0228\u009b\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u001e\u0000"+
		"\u0000\u022a\u009d\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u001f\u0000"+
		"\u0000\u022c\u009f\u0001\u0000\u0000\u0000\u022d\u022e\u0005 \u0000\u0000"+
		"\u022e\u00a1\u0001\u0000\u0000\u0000\u022f\u0230\u0005!\u0000\u0000\u0230"+
		"\u00a3\u0001\u0000\u0000\u0000\u0231\u0232\u0005\"\u0000\u0000\u0232\u00a5"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0001\u0000\u0000\u0234\u00a7"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u0002\u0000\u0000\u0236\u00a9"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0003\u0000\u0000\u0238\u00ab"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u0004\u0000\u0000\u023a\u00ad"+
		"\u0001\u0000\u0000\u0000 \u00b6\u00b8\u00c1\u00c5\u00f4\u00fa\u0108\u010e"+
		"\u0114\u0122\u0127\u0139\u0140\u014f\u0151\u015f\u016e\u0176\u017f\u0187"+
		"\u0191\u019a\u01a3\u01ac\u01b5\u01bd\u01c2\u01cb\u01cf\u01e7\u020a\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}