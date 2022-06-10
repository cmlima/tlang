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
			setState(299);
			escreva();
			setState(300);
			paren_e();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(301);
				id();
				}
				break;
			case 2:
				{
				setState(302);
				expr();
				}
				break;
			}
			setState(305);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				expr_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
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
			setState(312);
			termo_bool();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << E) | (1L << OU))) != 0)) {
				{
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(313);
					op_e();
					setState(314);
					termo_bool();
					}
					break;
				case OU:
					{
					setState(316);
					op_ou();
					setState(317);
					termo_bool();
					}
					break;
				case IGUAL:
					{
					setState(319);
					op_igual();
					setState(320);
					termo_bool();
					}
					break;
				case DIF:
					{
					setState(322);
					op_dif();
					setState(323);
					termo_bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(329);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				op_nao();
				setState(331);
				termo_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				expr_rel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				expr_ig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				paren_e();
				setState(338);
				expr_bool();
				setState(339);
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
			setState(343);
			termo_rel();
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIORQ:
				{
				setState(344);
				op_maiorq();
				setState(345);
				termo_rel();
				}
				break;
			case MENORQ:
				{
				setState(347);
				op_menorq();
				setState(348);
				termo_rel();
				}
				break;
			case MAIORIG:
				{
				setState(350);
				op_maiorig();
				setState(351);
				termo_rel();
				}
				break;
			case MENORIG:
				{
				setState(353);
				op_menorig();
				setState(354);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				paren_e();
				setState(361);
				expr_rel();
				setState(362);
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
			setState(366);
			termo_ig();
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(367);
				op_igual();
				setState(368);
				termo_ig();
				}
				break;
			case DIF:
				{
				setState(370);
				op_dif();
				setState(371);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				paren_e();
				setState(378);
				expr_ig();
				setState(379);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			fator();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUB) {
				{
				setState(390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOMA:
					{
					setState(384);
					op_soma();
					setState(385);
					fator();
					}
					break;
				case SUB:
					{
					setState(387);
					op_sub();
					setState(388);
					fator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(394);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			termo();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(396);
					op_mult();
					setState(397);
					termo();
					}
					break;
				case DIV:
					{
					setState(399);
					op_div();
					setState(400);
					termo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(406);
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
		enterRule(_localctx, 90, RULE_termo);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				id();
				}
				break;
			case PAREN_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				paren_e();
				setState(410);
				expr_aritm();
				setState(411);
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
		enterRule(_localctx, 92, RULE_expr_txt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
				{
				setState(415);
				txt();
				}
				break;
			case ID:
				{
				setState(416);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(419);
				op_soma();
				setState(420);
				txt();
				}
				}
				setState(426);
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
		enterRule(_localctx, 94, RULE_estr_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			se();
			setState(428);
			paren_e();
			setState(429);
			expr_bool();
			setState(430);
			paren_d();
			setState(431);
			chave_e();
			setState(432);
			bloco();
			setState(433);
			chave_d();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(434);
				estr_cond_sec();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(440);
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
		enterRule(_localctx, 96, RULE_estr_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			senaose();
			setState(444);
			paren_e();
			setState(445);
			expr_bool();
			setState(446);
			paren_d();
			setState(447);
			chave_e();
			setState(448);
			bloco();
			setState(449);
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
		enterRule(_localctx, 98, RULE_estr_cond_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			senao();
			setState(452);
			chave_e();
			setState(453);
			bloco();
			setState(454);
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
		enterRule(_localctx, 100, RULE_estr_repet);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				estr_enquanto();
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
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
		enterRule(_localctx, 102, RULE_estr_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			enquanto();
			setState(461);
			paren_e();
			setState(462);
			expr_bool();
			setState(463);
			paren_d();
			setState(464);
			chave_e();
			setState(465);
			bloco();
			setState(466);
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
		enterRule(_localctx, 104, RULE_estr_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			de();
			setState(469);
			controle_de_ate();
			setState(470);
			chave_e();
			setState(471);
			bloco();
			setState(472);
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
		enterRule(_localctx, 106, RULE_controle_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			contr_id();
			setState(475);
			contr_atr();
			setState(476);
			contr_num();
			setState(477);
			ate();
			setState(478);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterContr_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitContr_id(this);
		}
	}

	public final Contr_idContext contr_id() throws RecognitionException {
		Contr_idContext _localctx = new Contr_idContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_contr_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterContr_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitContr_atr(this);
		}
	}

	public final Contr_atrContext contr_atr() throws RecognitionException {
		Contr_atrContext _localctx = new Contr_atrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_contr_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).enterContr_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangListener ) ((TLangListener)listener).exitContr_num(this);
		}
	}

	public final Contr_numContext contr_num() throws RecognitionException {
		Contr_numContext _localctx = new Contr_numContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_contr_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		enterRule(_localctx, 114, RULE_val);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				num();
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				txt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
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
		enterRule(_localctx, 116, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
		enterRule(_localctx, 118, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		enterRule(_localctx, 120, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		enterRule(_localctx, 122, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
		enterRule(_localctx, 124, RULE_tipo);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				t_numero();
				}
				break;
			case T_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				t_texto();
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
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
		enterRule(_localctx, 126, RULE_t_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 128, RULE_t_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 130, RULE_t_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		enterRule(_localctx, 132, RULE_leia_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 134, RULE_leia_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 136, RULE_leia_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 138, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 140, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 142, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 144, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		enterRule(_localctx, 146, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 148, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 150, RULE_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 152, RULE_paren_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 154, RULE_paren_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 156, RULE_chave_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 158, RULE_chave_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		"\u0004\u0001,\u021b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u00a9\b\u0001\u000b\u0001\f\u0001\u00aa"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00b4\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b8\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00e7\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00ef\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fd"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0104\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u010b\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0119\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u011e\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0130\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003"+
		"$\u0137\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u0146\b%\n%\f%\u0149\t%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0156\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0165\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u016d\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0176\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u017e\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u0187\b+\n+\f+\u018a\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u0193\b,\n,\f,\u0196\t,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u019e\b-\u0001.\u0001.\u0003.\u01a2\b.\u0001.\u0001.\u0001"+
		".\u0005.\u01a7\b.\n.\f.\u01aa\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u01b4\b/\n/\f/\u01b7\t/\u0001/\u0003/\u01ba\b/"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00032\u01cb\b2\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u0001"+
		"7\u00017\u00018\u00018\u00019\u00019\u00019\u00039\u01ea\b9\u0001:\u0001"+
		":\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001>\u0003"+
		">\u01f7\b>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001"+
		"C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001"+
		"H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001"+
		"M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001O\u0000\u0000P\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u0000\u0002\u0001\u0000\f\u000e\u0001\u0000\u0006\u000b\u020a\u0000\u00a0"+
		"\u0001\u0000\u0000\u0000\u0002\u00a8\u0001\u0000\u0000\u0000\u0004\u00ac"+
		"\u0001\u0000\u0000\u0000\u0006\u00b3\u0001\u0000\u0000\u0000\b\u00b7\u0001"+
		"\u0000\u0000\u0000\n\u00b9\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000"+
		"\u0000\u0000\u000e\u00bd\u0001\u0000\u0000\u0000\u0010\u00bf\u0001\u0000"+
		"\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00c3\u0001\u0000"+
		"\u0000\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000"+
		"\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000"+
		"\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000\u0000"+
		"\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000\u0000\u0000"+
		"&\u00d5\u0001\u0000\u0000\u0000(\u00d7\u0001\u0000\u0000\u0000*\u00d9"+
		"\u0001\u0000\u0000\u0000,\u00db\u0001\u0000\u0000\u0000.\u00dd\u0001\u0000"+
		"\u0000\u00000\u00df\u0001\u0000\u0000\u00002\u00e1\u0001\u0000\u0000\u0000"+
		"4\u00e6\u0001\u0000\u0000\u00006\u00fc\u0001\u0000\u0000\u00008\u00fe"+
		"\u0001\u0000\u0000\u0000:\u0105\u0001\u0000\u0000\u0000<\u0118\u0001\u0000"+
		"\u0000\u0000>\u011d\u0001\u0000\u0000\u0000@\u011f\u0001\u0000\u0000\u0000"+
		"B\u0123\u0001\u0000\u0000\u0000D\u0127\u0001\u0000\u0000\u0000F\u012b"+
		"\u0001\u0000\u0000\u0000H\u0136\u0001\u0000\u0000\u0000J\u0138\u0001\u0000"+
		"\u0000\u0000L\u0155\u0001\u0000\u0000\u0000N\u0157\u0001\u0000\u0000\u0000"+
		"P\u016c\u0001\u0000\u0000\u0000R\u016e\u0001\u0000\u0000\u0000T\u017d"+
		"\u0001\u0000\u0000\u0000V\u017f\u0001\u0000\u0000\u0000X\u018b\u0001\u0000"+
		"\u0000\u0000Z\u019d\u0001\u0000\u0000\u0000\\\u01a1\u0001\u0000\u0000"+
		"\u0000^\u01ab\u0001\u0000\u0000\u0000`\u01bb\u0001\u0000\u0000\u0000b"+
		"\u01c3\u0001\u0000\u0000\u0000d\u01ca\u0001\u0000\u0000\u0000f\u01cc\u0001"+
		"\u0000\u0000\u0000h\u01d4\u0001\u0000\u0000\u0000j\u01da\u0001\u0000\u0000"+
		"\u0000l\u01e0\u0001\u0000\u0000\u0000n\u01e2\u0001\u0000\u0000\u0000p"+
		"\u01e4\u0001\u0000\u0000\u0000r\u01e9\u0001\u0000\u0000\u0000t\u01eb\u0001"+
		"\u0000\u0000\u0000v\u01ed\u0001\u0000\u0000\u0000x\u01ef\u0001\u0000\u0000"+
		"\u0000z\u01f1\u0001\u0000\u0000\u0000|\u01f6\u0001\u0000\u0000\u0000~"+
		"\u01f8\u0001\u0000\u0000\u0000\u0080\u01fa\u0001\u0000\u0000\u0000\u0082"+
		"\u01fc\u0001\u0000\u0000\u0000\u0084\u01fe\u0001\u0000\u0000\u0000\u0086"+
		"\u0200\u0001\u0000\u0000\u0000\u0088\u0202\u0001\u0000\u0000\u0000\u008a"+
		"\u0204\u0001\u0000\u0000\u0000\u008c\u0206\u0001\u0000\u0000\u0000\u008e"+
		"\u0208\u0001\u0000\u0000\u0000\u0090\u020a\u0001\u0000\u0000\u0000\u0092"+
		"\u020c\u0001\u0000\u0000\u0000\u0094\u020e\u0001\u0000\u0000\u0000\u0096"+
		"\u0210\u0001\u0000\u0000\u0000\u0098\u0212\u0001\u0000\u0000\u0000\u009a"+
		"\u0214\u0001\u0000\u0000\u0000\u009c\u0216\u0001\u0000\u0000\u0000\u009e"+
		"\u0218\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0002\u0001\u0000\u00a1"+
		"\u0001\u0001\u0000\u0000\u0000\u00a2\u00a9\u0003<\u001e\u0000\u00a3\u00a9"+
		"\u00034\u001a\u0000\u00a4\u00a9\u0003>\u001f\u0000\u00a5\u00a9\u0003F"+
		"#\u0000\u00a6\u00a9\u0003^/\u0000\u00a7\u00a9\u0003d2\u0000\u00a8\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u0003\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0005\u0000\u0000\u00ad\u0005\u0001\u0000\u0000\u0000\u00ae\u00b4"+
		"\u0003\u0004\u0002\u0000\u00af\u00b4\u0005\u0015\u0000\u0000\u00b0\u00b4"+
		"\u0005\u0016\u0000\u0000\u00b1\u00b4\u0005\u0017\u0000\u0000\u00b2\u00b4"+
		"\u0005\u0018\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00af"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0007"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0003\u0004\u0002\u0000\u00b6\u00b8"+
		"\u0005\u0015\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\t\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0000\u0000\u0000\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007"+
		"\u0001\u0000\u0000\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0006"+
		"\u0000\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0007"+
		"\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\b\u0000"+
		"\u0000\u00c2\u0013\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\t\u0000\u0000"+
		"\u00c4\u0015\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\n\u0000\u0000\u00c6"+
		"\u0017\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8"+
		"\u0019\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\f\u0000\u0000\u00ca\u001b"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\r\u0000\u0000\u00cc\u001d\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u000e\u0000\u0000\u00ce\u001f\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000\u00d0!\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0010\u0000\u0000\u00d2#\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0012\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0013\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0014\u0000\u0000\u00da+\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0015\u0000\u0000\u00dc-\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0016"+
		"\u0000\u0000\u00de/\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0017\u0000"+
		"\u0000\u00e01\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000"+
		"\u00e23\u0001\u0000\u0000\u0000\u00e3\u00e7\u00036\u001b\u0000\u00e4\u00e7"+
		"\u00038\u001c\u0000\u00e5\u00e7\u0003:\u001d\u0000\u00e6\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e75\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003z=\u0000"+
		"\u00e9\u00ee\u0003\u0006\u0003\u0000\u00ea\u00ef\u0003z=\u0000\u00eb\u00ef"+
		"\u0003t:\u0000\u00ec\u00ef\u0003V+\u0000\u00ed\u00ef\u0003@ \u0000\u00ee"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00fd\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003z=\u0000\u00f1\u00f2\u0003"+
		"(\u0014\u0000\u00f2\u00fd\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003(\u0014"+
		"\u0000\u00f4\u00f5\u0003z=\u0000\u00f5\u00fd\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0003z=\u0000\u00f7\u00f8\u0003*\u0015\u0000\u00f8\u00fd\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0003z="+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00e8\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fd7\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003z=\u0000\u00ff"+
		"\u0103\u0003\b\u0004\u0000\u0100\u0104\u0003z=\u0000\u0101\u0104\u0003"+
		"\\.\u0000\u0102\u0104\u0003B!\u0000\u0103\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000"+
		"\u01049\u0001\u0000\u0000\u0000\u0105\u0106\u0003z=\u0000\u0106\u010a"+
		"\u0003\u0004\u0002\u0000\u0107\u010b\u0003z=\u0000\u0108\u010b\u0003J"+
		"%\u0000\u0109\u010b\u0003D\"\u0000\u010a\u0107\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b;\u0001\u0000\u0000\u0000\u010c\u010d\u0003|>\u0000\u010d\u010e"+
		"\u0003z=\u0000\u010e\u0119\u0001\u0000\u0000\u0000\u010f\u0110\u0003~"+
		"?\u0000\u0110\u0111\u00036\u001b\u0000\u0111\u0119\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0003\u0080@\u0000\u0113\u0114\u00038\u001c\u0000\u0114\u0119"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0003\u0082A\u0000\u0116\u0117\u0003"+
		":\u001d\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u010c\u0001\u0000"+
		"\u0000\u0000\u0118\u010f\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0119=\u0001\u0000\u0000"+
		"\u0000\u011a\u011e\u0003@ \u0000\u011b\u011e\u0003B!\u0000\u011c\u011e"+
		"\u0003\u0088D\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e?\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0003\u0084B\u0000\u0120\u0121\u0003\u0098L\u0000"+
		"\u0121\u0122\u0003\u009aM\u0000\u0122A\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0003\u0086C\u0000\u0124\u0125\u0003\u0098L\u0000\u0125\u0126\u0003\u009a"+
		"M\u0000\u0126C\u0001\u0000\u0000\u0000\u0127\u0128\u0003\u0088D\u0000"+
		"\u0128\u0129\u0003\u0098L\u0000\u0129\u012a\u0003\u009aM\u0000\u012aE"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u008aE\u0000\u012c\u012f\u0003"+
		"\u0098L\u0000\u012d\u0130\u0003z=\u0000\u012e\u0130\u0003H$\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0003\u009aM\u0000\u0132G\u0001"+
		"\u0000\u0000\u0000\u0133\u0137\u0003J%\u0000\u0134\u0137\u0003V+\u0000"+
		"\u0135\u0137\u0003\\.\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"I\u0001\u0000\u0000\u0000\u0138\u0147\u0003L&\u0000\u0139\u013a\u0003"+
		"\u001a\r\u0000\u013a\u013b\u0003L&\u0000\u013b\u0146\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0003\u001c\u000e\u0000\u013d\u013e\u0003L&\u0000\u013e"+
		"\u0146\u0001\u0000\u0000\u0000\u013f\u0140\u0003\u0016\u000b\u0000\u0140"+
		"\u0141\u0003L&\u0000\u0141\u0146\u0001\u0000\u0000\u0000\u0142\u0143\u0003"+
		"\u0018\f\u0000\u0143\u0144\u0003L&\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0139\u0001\u0000\u0000\u0000\u0145\u013c\u0001\u0000\u0000"+
		"\u0000\u0145\u013f\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148K\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0003\u001e\u000f\u0000"+
		"\u014b\u014c\u0003L&\u0000\u014c\u0156\u0001\u0000\u0000\u0000\u014d\u0156"+
		"\u0003x<\u0000\u014e\u0156\u0003z=\u0000\u014f\u0156\u0003N\'\u0000\u0150"+
		"\u0156\u0003R)\u0000\u0151\u0152\u0003\u0098L\u0000\u0152\u0153\u0003"+
		"J%\u0000\u0153\u0154\u0003\u009aM\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u014a\u0001\u0000\u0000\u0000\u0155\u014d\u0001\u0000\u0000"+
		"\u0000\u0155\u014e\u0001\u0000\u0000\u0000\u0155\u014f\u0001\u0000\u0000"+
		"\u0000\u0155\u0150\u0001\u0000\u0000\u0000\u0155\u0151\u0001\u0000\u0000"+
		"\u0000\u0156M\u0001\u0000\u0000\u0000\u0157\u0164\u0003P(\u0000\u0158"+
		"\u0159\u0003\u000e\u0007\u0000\u0159\u015a\u0003P(\u0000\u015a\u0165\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0003\u0010\b\u0000\u015c\u015d\u0003P"+
		"(\u0000\u015d\u0165\u0001\u0000\u0000\u0000\u015e\u015f\u0003\u0012\t"+
		"\u0000\u015f\u0160\u0003P(\u0000\u0160\u0165\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0003\u0014\n\u0000\u0162\u0163\u0003P(\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0158\u0001\u0000\u0000\u0000\u0164\u015b\u0001"+
		"\u0000\u0000\u0000\u0164\u015e\u0001\u0000\u0000\u0000\u0164\u0161\u0001"+
		"\u0000\u0000\u0000\u0165O\u0001\u0000\u0000\u0000\u0166\u016d\u0003z="+
		"\u0000\u0167\u016d\u0003V+\u0000\u0168\u0169\u0003\u0098L\u0000\u0169"+
		"\u016a\u0003N\'\u0000\u016a\u016b\u0003\u009aM\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u0166\u0001\u0000\u0000\u0000\u016c\u0167\u0001"+
		"\u0000\u0000\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016dQ\u0001\u0000"+
		"\u0000\u0000\u016e\u0175\u0003T*\u0000\u016f\u0170\u0003\u0016\u000b\u0000"+
		"\u0170\u0171\u0003T*\u0000\u0171\u0176\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0003\u0018\f\u0000\u0173\u0174\u0003T*\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000"+
		"\u0000\u0000\u0176S\u0001\u0000\u0000\u0000\u0177\u017e\u0003z=\u0000"+
		"\u0178\u017e\u0003V+\u0000\u0179\u017a\u0003\u0098L\u0000\u017a\u017b"+
		"\u0003R)\u0000\u017b\u017c\u0003\u009aM\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u0177\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000"+
		"\u0000\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017eU\u0001\u0000\u0000"+
		"\u0000\u017f\u0188\u0003X,\u0000\u0180\u0181\u0003 \u0010\u0000\u0181"+
		"\u0182\u0003X,\u0000\u0182\u0187\u0001\u0000\u0000\u0000\u0183\u0184\u0003"+
		"\"\u0011\u0000\u0184\u0185\u0003X,\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0186\u0183\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189W\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u0194\u0003Z-\u0000\u018c\u018d"+
		"\u0003$\u0012\u0000\u018d\u018e\u0003Z-\u0000\u018e\u0193\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0003&\u0013\u0000\u0190\u0191\u0003Z-\u0000"+
		"\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018c\u0001\u0000\u0000\u0000"+
		"\u0192\u018f\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195Y\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197"+
		"\u019e\u0003t:\u0000\u0198\u019e\u0003z=\u0000\u0199\u019a\u0003\u0098"+
		"L\u0000\u019a\u019b\u0003V+\u0000\u019b\u019c\u0003\u009aM\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000\u019d"+
		"\u0198\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000\u0000\u019e"+
		"[\u0001\u0000\u0000\u0000\u019f\u01a2\u0003v;\u0000\u01a0\u01a2\u0003"+
		"z=\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a8\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003 \u0010\u0000"+
		"\u01a4\u01a5\u0003v;\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9]\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u0003"+
		"\u008cF\u0000\u01ac\u01ad\u0003\u0098L\u0000\u01ad\u01ae\u0003J%\u0000"+
		"\u01ae\u01af\u0003\u009aM\u0000\u01af\u01b0\u0003\u009cN\u0000\u01b0\u01b1"+
		"\u0003\u0002\u0001\u0000\u01b1\u01b5\u0003\u009eO\u0000\u01b2\u01b4\u0003"+
		"`0\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ba\u0003b1\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba_\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0003\u008eG\u0000\u01bc\u01bd\u0003\u0098L\u0000\u01bd\u01be\u0003J"+
		"%\u0000\u01be\u01bf\u0003\u009aM\u0000\u01bf\u01c0\u0003\u009cN\u0000"+
		"\u01c0\u01c1\u0003\u0002\u0001\u0000\u01c1\u01c2\u0003\u009eO\u0000\u01c2"+
		"a\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003\u0090H\u0000\u01c4\u01c5\u0003"+
		"\u009cN\u0000\u01c5\u01c6\u0003\u0002\u0001\u0000\u01c6\u01c7\u0003\u009e"+
		"O\u0000\u01c7c\u0001\u0000\u0000\u0000\u01c8\u01cb\u0003f3\u0000\u01c9"+
		"\u01cb\u0003h4\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cbe\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003\u0092"+
		"I\u0000\u01cd\u01ce\u0003\u0098L\u0000\u01ce\u01cf\u0003J%\u0000\u01cf"+
		"\u01d0\u0003\u009aM\u0000\u01d0\u01d1\u0003\u009cN\u0000\u01d1\u01d2\u0003"+
		"\u0002\u0001\u0000\u01d2\u01d3\u0003\u009eO\u0000\u01d3g\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0003\u0094J\u0000\u01d5\u01d6\u0003j5\u0000\u01d6"+
		"\u01d7\u0003\u009cN\u0000\u01d7\u01d8\u0003\u0002\u0001\u0000\u01d8\u01d9"+
		"\u0003\u009eO\u0000\u01d9i\u0001\u0000\u0000\u0000\u01da\u01db\u0003l"+
		"6\u0000\u01db\u01dc\u0003n7\u0000\u01dc\u01dd\u0003p8\u0000\u01dd\u01de"+
		"\u0003\u0096K\u0000\u01de\u01df\u0003p8\u0000\u01dfk\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0005)\u0000\u0000\u01e1m\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005\u0005\u0000\u0000\u01e3o\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0005&\u0000\u0000\u01e5q\u0001\u0000\u0000\u0000\u01e6\u01ea\u0003t"+
		":\u0000\u01e7\u01ea\u0003v;\u0000\u01e8\u01ea\u0003x<\u0000\u01e9\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01e8"+
		"\u0001\u0000\u0000\u0000\u01eas\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		"&\u0000\u0000\u01ecu\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\'\u0000"+
		"\u0000\u01eew\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005(\u0000\u0000\u01f0"+
		"y\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005)\u0000\u0000\u01f2{\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f7\u0003~?\u0000\u01f4\u01f7\u0003\u0080@"+
		"\u0000\u01f5\u01f7\u0003\u0082A\u0000\u01f6\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f7}\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005#\u0000\u0000\u01f9\u007f"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005$\u0000\u0000\u01fb\u0081\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0005%\u0000\u0000\u01fd\u0083\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005\u0019\u0000\u0000\u01ff\u0085\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005\u001a\u0000\u0000\u0201\u0087\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0005\u001b\u0000\u0000\u0203\u0089\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0005\u001c\u0000\u0000\u0205\u008b\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0005\u001d\u0000\u0000\u0207\u008d\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0005\u001e\u0000\u0000\u0209\u008f\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0005\u001f\u0000\u0000\u020b\u0091\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005 \u0000\u0000\u020d\u0093\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005!\u0000\u0000\u020f\u0095\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0005\"\u0000\u0000\u0211\u0097\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005\u0001\u0000\u0000\u0213\u0099\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0005\u0002\u0000\u0000\u0215\u009b\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0005\u0003\u0000\u0000\u0217\u009d\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005\u0004\u0000\u0000\u0219\u009f\u0001\u0000\u0000\u0000 \u00a8"+
		"\u00aa\u00b3\u00b7\u00e6\u00ee\u00fc\u0103\u010a\u0118\u011d\u012f\u0136"+
		"\u0145\u0147\u0155\u0164\u016c\u0175\u017d\u0186\u0188\u0192\u0194\u019d"+
		"\u01a1\u01a8\u01b5\u01b9\u01ca\u01e9\u01f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}