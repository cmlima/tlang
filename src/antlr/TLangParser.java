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
		RULE_termo = 45, RULE_expr_txt = 46, RULE_estr_cond = 47, RULE_controle_cond = 48, 
		RULE_estr_cond_sec = 49, RULE_controle_cond_sec = 50, RULE_estr_cond_alt = 51, 
		RULE_estr_repet = 52, RULE_estr_enquanto = 53, RULE_controle_enquanto = 54, 
		RULE_estr_de_ate = 55, RULE_controle_de_ate = 56, RULE_ctr_id = 57, RULE_ctr_inicial = 58, 
		RULE_ctr_final = 59, RULE_val = 60, RULE_num = 61, RULE_txt = 62, RULE_bool = 63, 
		RULE_id = 64, RULE_tipo = 65, RULE_t_numero = 66, RULE_t_texto = 67, RULE_t_booleano = 68, 
		RULE_leia_num = 69, RULE_leia_txt = 70, RULE_leia_bool = 71, RULE_escreva = 72, 
		RULE_se = 73, RULE_senaose = 74, RULE_senao = 75, RULE_enquanto = 76, 
		RULE_de = 77, RULE_ate = 78, RULE_paren_e = 79, RULE_paren_d = 80, RULE_chave_e = 81, 
		RULE_chave_d = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"iniciar", "bloco", "op_atr", "op_atr_num", "op_atr_txt", "op_bool", 
			"op_rel", "op_maiorq", "op_menorq", "op_maiorig", "op_menorig", "op_igual", 
			"op_dif", "op_e", "op_ou", "op_nao", "op_soma", "op_sub", "op_mult", 
			"op_div", "op_inc", "op_dec", "op_soma_atr", "op_sub_atr", "op_mult_atr", 
			"op_div_atr", "atr", "atr_num", "atr_txt", "atr_bool", "decl", "leitura", 
			"leitura_num", "leitura_txt", "leitura_bool", "escrita", "expr", "expr_bool", 
			"termo_bool", "expr_rel", "termo_rel", "expr_ig", "termo_ig", "expr_aritm", 
			"fator", "termo", "expr_txt", "estr_cond", "controle_cond", "estr_cond_sec", 
			"controle_cond_sec", "estr_cond_alt", "estr_repet", "estr_enquanto", 
			"controle_enquanto", "estr_de_ate", "controle_de_ate", "ctr_id", "ctr_inicial", 
			"ctr_final", "val", "num", "txt", "bool", "id", "tipo", "t_numero", "t_texto", 
			"t_booleano", "leia_num", "leia_txt", "leia_bool", "escreva", "se", "senaose", 
			"senao", "enquanto", "de", "ate", "paren_e", "paren_d", "chave_e", "chave_d"
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
			setState(166);
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
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_NUM:
				case T_TXT:
				case T_BOOL:
					{
					setState(168);
					decl();
					}
					break;
				case INC:
				case DEC:
				case ID:
					{
					setState(169);
					atr();
					}
					break;
				case LEIA_NUM:
				case LEIA_TXT:
				case LEIA_BOOL:
					{
					setState(170);
					leitura();
					}
					break;
				case ESCREVA:
					{
					setState(171);
					escrita();
					}
					break;
				case SE:
					{
					setState(172);
					estr_cond();
					}
					break;
				case ENQUANTO:
				case DE:
					{
					setState(173);
					estr_repet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176); 
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
			setState(178);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(SOMA_ATR);
				}
				break;
			case SUB_ATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(SUB_ATR);
				}
				break;
			case MULT_ATR:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(MULT_ATR);
				}
				break;
			case DIV_ATR:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				op_atr();
				}
				break;
			case SOMA_ATR:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
			setState(191);
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
			setState(193);
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
			setState(195);
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
			setState(197);
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
			setState(199);
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
			setState(201);
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
			setState(203);
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
			setState(205);
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
			setState(207);
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
			setState(209);
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
			setState(211);
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
			setState(213);
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
			setState(215);
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
			setState(217);
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
			setState(219);
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
			setState(221);
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
			setState(223);
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
			setState(225);
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
			setState(227);
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
			setState(229);
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
			setState(231);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				atr_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				atr_txt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				id();
				setState(239);
				op_atr_num();
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(240);
					id();
					}
					break;
				case 2:
					{
					setState(241);
					num();
					}
					break;
				case 3:
					{
					setState(242);
					expr_aritm();
					}
					break;
				case 4:
					{
					setState(243);
					leitura_num();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				id();
				setState(247);
				op_inc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				op_inc();
				setState(250);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				id();
				setState(253);
				op_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				op_dec();
				setState(256);
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
			setState(260);
			id();
			setState(261);
			op_atr_txt();
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(262);
				id();
				}
				break;
			case 2:
				{
				setState(263);
				expr_txt();
				}
				break;
			case 3:
				{
				setState(264);
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
			setState(267);
			id();
			setState(268);
			op_atr();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(269);
				id();
				}
				break;
			case 2:
				{
				setState(270);
				expr_bool();
				}
				break;
			case 3:
				{
				setState(271);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				tipo();
				setState(275);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				t_numero();
				setState(278);
				atr_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				t_texto();
				setState(281);
				atr_txt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				t_booleano();
				setState(284);
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
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				leitura_num();
				}
				break;
			case LEIA_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				leitura_txt();
				}
				break;
			case LEIA_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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
			setState(293);
			leia_num();
			setState(294);
			paren_e();
			setState(295);
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
			setState(297);
			leia_txt();
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
			setState(301);
			leia_bool();
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
			setState(305);
			escreva();
			setState(306);
			paren_e();
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(307);
				id();
				}
				break;
			case 2:
				{
				setState(308);
				expr();
				}
				break;
			}
			setState(311);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				expr_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
			setState(318);
			termo_bool();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIF) | (1L << E) | (1L << OU))) != 0)) {
				{
				setState(331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(319);
					op_e();
					setState(320);
					termo_bool();
					}
					break;
				case OU:
					{
					setState(322);
					op_ou();
					setState(323);
					termo_bool();
					}
					break;
				case IGUAL:
					{
					setState(325);
					op_igual();
					setState(326);
					termo_bool();
					}
					break;
				case DIF:
					{
					setState(328);
					op_dif();
					setState(329);
					termo_bool();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(335);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				op_nao();
				setState(337);
				termo_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				expr_rel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				expr_ig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				paren_e();
				setState(344);
				expr_bool();
				setState(345);
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
			setState(349);
			termo_rel();
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIORQ:
				{
				setState(350);
				op_maiorq();
				setState(351);
				termo_rel();
				}
				break;
			case MENORQ:
				{
				setState(353);
				op_menorq();
				setState(354);
				termo_rel();
				}
				break;
			case MAIORIG:
				{
				setState(356);
				op_maiorig();
				setState(357);
				termo_rel();
				}
				break;
			case MENORIG:
				{
				setState(359);
				op_menorig();
				setState(360);
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
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				paren_e();
				setState(367);
				expr_rel();
				setState(368);
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
			setState(372);
			termo_ig();
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				setState(373);
				op_igual();
				setState(374);
				termo_ig();
				}
				break;
			case DIF:
				{
				setState(376);
				op_dif();
				setState(377);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				expr_aritm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				paren_e();
				setState(384);
				expr_ig();
				setState(385);
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
			setState(389);
			fator();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUB) {
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOMA:
					{
					setState(390);
					op_soma();
					setState(391);
					fator();
					}
					break;
				case SUB:
					{
					setState(393);
					op_sub();
					setState(394);
					fator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(400);
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
			setState(401);
			termo();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(402);
					op_mult();
					setState(403);
					termo();
					}
					break;
				case DIV:
					{
					setState(405);
					op_div();
					setState(406);
					termo();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				id();
				}
				break;
			case PAREN_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				paren_e();
				setState(416);
				expr_aritm();
				setState(417);
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
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT:
				{
				setState(421);
				txt();
				}
				break;
			case ID:
				{
				setState(422);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(425);
				op_soma();
				setState(426);
				txt();
				}
				}
				setState(432);
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
		enterRule(_localctx, 94, RULE_estr_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			controle_cond();
			setState(434);
			chave_e();
			setState(435);
			bloco();
			setState(436);
			chave_d();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENAOSE) {
				{
				{
				setState(437);
				estr_cond_sec();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(443);
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
		enterRule(_localctx, 96, RULE_controle_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			se();
			setState(447);
			paren_e();
			setState(448);
			expr_bool();
			setState(449);
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
		enterRule(_localctx, 98, RULE_estr_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			controle_cond_sec();
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
		enterRule(_localctx, 100, RULE_controle_cond_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			senaose();
			setState(457);
			paren_e();
			setState(458);
			expr_bool();
			setState(459);
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
		enterRule(_localctx, 102, RULE_estr_cond_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			senao();
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
		enterRule(_localctx, 104, RULE_estr_repet);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENQUANTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				estr_enquanto();
				}
				break;
			case DE:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
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
		enterRule(_localctx, 106, RULE_estr_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			controle_enquanto();
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
		enterRule(_localctx, 108, RULE_controle_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			enquanto();
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
		enterRule(_localctx, 110, RULE_estr_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			controle_de_ate();
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
		enterRule(_localctx, 112, RULE_controle_de_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			de();
			setState(486);
			match(PAREN_E);
			setState(487);
			ctr_id();
			setState(488);
			match(ATR);
			setState(489);
			ctr_inicial();
			setState(490);
			ate();
			setState(491);
			ctr_final();
			setState(492);
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
		enterRule(_localctx, 114, RULE_ctr_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 116, RULE_ctr_inicial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 118, RULE_ctr_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		enterRule(_localctx, 120, RULE_val);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				num();
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				txt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
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
		enterRule(_localctx, 122, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
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
		enterRule(_localctx, 124, RULE_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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
		enterRule(_localctx, 126, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		enterRule(_localctx, 128, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		enterRule(_localctx, 130, RULE_tipo);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				t_numero();
				}
				break;
			case T_TXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				t_texto();
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
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
		enterRule(_localctx, 132, RULE_t_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 134, RULE_t_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 136, RULE_t_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		enterRule(_localctx, 138, RULE_leia_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 140, RULE_leia_txt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 142, RULE_leia_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 144, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 146, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 148, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 150, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		enterRule(_localctx, 152, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		enterRule(_localctx, 154, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		enterRule(_localctx, 156, RULE_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 158, RULE_paren_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 160, RULE_paren_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		enterRule(_localctx, 162, RULE_chave_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		enterRule(_localctx, 164, RULE_chave_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		"\u0004\u0001,\u0229\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u00af\b\u0001\u000b\u0001\f\u0001\u00b0\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ba"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00be\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00ed"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u00f5\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0103\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u010a\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0111"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u011f\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0124\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0136\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u013d\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u014c\b%\n%\f%\u014f\t%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u015c\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u016b\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0173\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u017c\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0184"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u018d\b+\n"+
		"+\f+\u0190\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,"+
		"\u0199\b,\n,\f,\u019c\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01a4\b-\u0001.\u0001.\u0003.\u01a8\b.\u0001.\u0001.\u0001.\u0005.\u01ad"+
		"\b.\n.\f.\u01b0\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u01b7\b/"+
		"\n/\f/\u01ba\t/\u0001/\u0003/\u01bd\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00034\u01d5\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0003<\u01f8\b<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001"+
		"?\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u0205\bA\u0001B\u0001B\u0001"+
		"C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001"+
		"H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001"+
		"M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0000\u0000S\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u0000"+
		"\u0003\u0001\u0000\f\u000e\u0001\u0000\u0006\u000b\u0002\u0000&&))\u0215"+
		"\u0000\u00a6\u0001\u0000\u0000\u0000\u0002\u00ae\u0001\u0000\u0000\u0000"+
		"\u0004\u00b2\u0001\u0000\u0000\u0000\u0006\u00b9\u0001\u0000\u0000\u0000"+
		"\b\u00bd\u0001\u0000\u0000\u0000\n\u00bf\u0001\u0000\u0000\u0000\f\u00c1"+
		"\u0001\u0000\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00c5"+
		"\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00c9"+
		"\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000\u0000\u0018\u00cd"+
		"\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c\u00d1"+
		"\u0001\u0000\u0000\u0000\u001e\u00d3\u0001\u0000\u0000\u0000 \u00d5\u0001"+
		"\u0000\u0000\u0000\"\u00d7\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000"+
		"\u0000\u0000&\u00db\u0001\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000\u0000"+
		"*\u00df\u0001\u0000\u0000\u0000,\u00e1\u0001\u0000\u0000\u0000.\u00e3"+
		"\u0001\u0000\u0000\u00000\u00e5\u0001\u0000\u0000\u00002\u00e7\u0001\u0000"+
		"\u0000\u00004\u00ec\u0001\u0000\u0000\u00006\u0102\u0001\u0000\u0000\u0000"+
		"8\u0104\u0001\u0000\u0000\u0000:\u010b\u0001\u0000\u0000\u0000<\u011e"+
		"\u0001\u0000\u0000\u0000>\u0123\u0001\u0000\u0000\u0000@\u0125\u0001\u0000"+
		"\u0000\u0000B\u0129\u0001\u0000\u0000\u0000D\u012d\u0001\u0000\u0000\u0000"+
		"F\u0131\u0001\u0000\u0000\u0000H\u013c\u0001\u0000\u0000\u0000J\u013e"+
		"\u0001\u0000\u0000\u0000L\u015b\u0001\u0000\u0000\u0000N\u015d\u0001\u0000"+
		"\u0000\u0000P\u0172\u0001\u0000\u0000\u0000R\u0174\u0001\u0000\u0000\u0000"+
		"T\u0183\u0001\u0000\u0000\u0000V\u0185\u0001\u0000\u0000\u0000X\u0191"+
		"\u0001\u0000\u0000\u0000Z\u01a3\u0001\u0000\u0000\u0000\\\u01a7\u0001"+
		"\u0000\u0000\u0000^\u01b1\u0001\u0000\u0000\u0000`\u01be\u0001\u0000\u0000"+
		"\u0000b\u01c3\u0001\u0000\u0000\u0000d\u01c8\u0001\u0000\u0000\u0000f"+
		"\u01cd\u0001\u0000\u0000\u0000h\u01d4\u0001\u0000\u0000\u0000j\u01d6\u0001"+
		"\u0000\u0000\u0000l\u01db\u0001\u0000\u0000\u0000n\u01e0\u0001\u0000\u0000"+
		"\u0000p\u01e5\u0001\u0000\u0000\u0000r\u01ee\u0001\u0000\u0000\u0000t"+
		"\u01f0\u0001\u0000\u0000\u0000v\u01f2\u0001\u0000\u0000\u0000x\u01f7\u0001"+
		"\u0000\u0000\u0000z\u01f9\u0001\u0000\u0000\u0000|\u01fb\u0001\u0000\u0000"+
		"\u0000~\u01fd\u0001\u0000\u0000\u0000\u0080\u01ff\u0001\u0000\u0000\u0000"+
		"\u0082\u0204\u0001\u0000\u0000\u0000\u0084\u0206\u0001\u0000\u0000\u0000"+
		"\u0086\u0208\u0001\u0000\u0000\u0000\u0088\u020a\u0001\u0000\u0000\u0000"+
		"\u008a\u020c\u0001\u0000\u0000\u0000\u008c\u020e\u0001\u0000\u0000\u0000"+
		"\u008e\u0210\u0001\u0000\u0000\u0000\u0090\u0212\u0001\u0000\u0000\u0000"+
		"\u0092\u0214\u0001\u0000\u0000\u0000\u0094\u0216\u0001\u0000\u0000\u0000"+
		"\u0096\u0218\u0001\u0000\u0000\u0000\u0098\u021a\u0001\u0000\u0000\u0000"+
		"\u009a\u021c\u0001\u0000\u0000\u0000\u009c\u021e\u0001\u0000\u0000\u0000"+
		"\u009e\u0220\u0001\u0000\u0000\u0000\u00a0\u0222\u0001\u0000\u0000\u0000"+
		"\u00a2\u0224\u0001\u0000\u0000\u0000\u00a4\u0226\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u0001\u0001\u0000\u0000\u0000"+
		"\u00a8\u00af\u0003<\u001e\u0000\u00a9\u00af\u00034\u001a\u0000\u00aa\u00af"+
		"\u0003>\u001f\u0000\u00ab\u00af\u0003F#\u0000\u00ac\u00af\u0003^/\u0000"+
		"\u00ad\u00af\u0003h4\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0003"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3\u0005"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ba\u0003\u0004\u0002\u0000\u00b5\u00ba"+
		"\u0005\u0015\u0000\u0000\u00b6\u00ba\u0005\u0016\u0000\u0000\u00b7\u00ba"+
		"\u0005\u0017\u0000\u0000\u00b8\u00ba\u0005\u0018\u0000\u0000\u00b9\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u0007\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0003\u0004\u0002\u0000\u00bc\u00be\u0005\u0015\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\t\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0007\u0000\u0000\u0000\u00c0\u000b\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\r\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u000f\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u0011\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000\u00c8\u0013\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u0015\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u0017\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\u000b\u0000\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\f\u0000\u0000\u00d0\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\r\u0000\u0000\u00d2\u001d\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u000e\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u000f\u0000\u0000\u00d6!\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0010"+
		"\u0000\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0011\u0000"+
		"\u0000\u00da%\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0012\u0000\u0000"+
		"\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de"+
		")\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0014\u0000\u0000\u00e0+\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u0015\u0000\u0000\u00e2-\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0016\u0000\u0000\u00e4/\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0017\u0000\u0000\u00e61\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0018\u0000\u0000\u00e83\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ed\u00036\u001b\u0000\u00ea\u00ed\u00038\u001c\u0000\u00eb\u00ed\u0003"+
		":\u001d\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed5\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0003\u0080@\u0000\u00ef\u00f4\u0003\u0006\u0003\u0000"+
		"\u00f0\u00f5\u0003\u0080@\u0000\u00f1\u00f5\u0003z=\u0000\u00f2\u00f5"+
		"\u0003V+\u0000\u00f3\u00f5\u0003@ \u0000\u00f4\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u0103\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0080@\u0000\u00f7\u00f8\u0003(\u0014\u0000\u00f8"+
		"\u0103\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003(\u0014\u0000\u00fa\u00fb"+
		"\u0003\u0080@\u0000\u00fb\u0103\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003"+
		"\u0080@\u0000\u00fd\u00fe\u0003*\u0015\u0000\u00fe\u0103\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0003*\u0015\u0000\u0100\u0101\u0003\u0080@\u0000\u0101"+
		"\u0103\u0001\u0000\u0000\u0000\u0102\u00ee\u0001\u0000\u0000\u0000\u0102"+
		"\u00f6\u0001\u0000\u0000\u0000\u0102\u00f9\u0001\u0000\u0000\u0000\u0102"+
		"\u00fc\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103"+
		"7\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u0080@\u0000\u0105\u0109\u0003"+
		"\b\u0004\u0000\u0106\u010a\u0003\u0080@\u0000\u0107\u010a\u0003\\.\u0000"+
		"\u0108\u010a\u0003B!\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a9\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0003\u0080@\u0000\u010c\u0110\u0003\u0004"+
		"\u0002\u0000\u010d\u0111\u0003\u0080@\u0000\u010e\u0111\u0003J%\u0000"+
		"\u010f\u0111\u0003D\"\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		";\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u0082A\u0000\u0113\u0114\u0003"+
		"\u0080@\u0000\u0114\u011f\u0001\u0000\u0000\u0000\u0115\u0116\u0003\u0084"+
		"B\u0000\u0116\u0117\u00036\u001b\u0000\u0117\u011f\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0003\u0086C\u0000\u0119\u011a\u00038\u001c\u0000\u011a\u011f"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0088D\u0000\u011c\u011d\u0003"+
		":\u001d\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0112\u0001\u0000"+
		"\u0000\u0000\u011e\u0115\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000"+
		"\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011f=\u0001\u0000\u0000"+
		"\u0000\u0120\u0124\u0003@ \u0000\u0121\u0124\u0003B!\u0000\u0122\u0124"+
		"\u0003\u008eG\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124?\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0003\u008aE\u0000\u0126\u0127\u0003\u009eO\u0000"+
		"\u0127\u0128\u0003\u00a0P\u0000\u0128A\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0003\u008cF\u0000\u012a\u012b\u0003\u009eO\u0000\u012b\u012c\u0003\u00a0"+
		"P\u0000\u012cC\u0001\u0000\u0000\u0000\u012d\u012e\u0003\u008eG\u0000"+
		"\u012e\u012f\u0003\u009eO\u0000\u012f\u0130\u0003\u00a0P\u0000\u0130E"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0003\u0090H\u0000\u0132\u0135\u0003"+
		"\u009eO\u0000\u0133\u0136\u0003\u0080@\u0000\u0134\u0136\u0003H$\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u00a0P\u0000\u0138"+
		"G\u0001\u0000\u0000\u0000\u0139\u013d\u0003J%\u0000\u013a\u013d\u0003"+
		"V+\u0000\u013b\u013d\u0003\\.\u0000\u013c\u0139\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000"+
		"\u013dI\u0001\u0000\u0000\u0000\u013e\u014d\u0003L&\u0000\u013f\u0140"+
		"\u0003\u001a\r\u0000\u0140\u0141\u0003L&\u0000\u0141\u014c\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0003\u001c\u000e\u0000\u0143\u0144\u0003L&\u0000"+
		"\u0144\u014c\u0001\u0000\u0000\u0000\u0145\u0146\u0003\u0016\u000b\u0000"+
		"\u0146\u0147\u0003L&\u0000\u0147\u014c\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0003\u0018\f\u0000\u0149\u014a\u0003L&\u0000\u014a\u014c\u0001\u0000"+
		"\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b\u0142\u0001\u0000"+
		"\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014eK\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0003\u001e\u000f"+
		"\u0000\u0151\u0152\u0003L&\u0000\u0152\u015c\u0001\u0000\u0000\u0000\u0153"+
		"\u015c\u0003~?\u0000\u0154\u015c\u0003\u0080@\u0000\u0155\u015c\u0003"+
		"N\'\u0000\u0156\u015c\u0003R)\u0000\u0157\u0158\u0003\u009eO\u0000\u0158"+
		"\u0159\u0003J%\u0000\u0159\u015a\u0003\u00a0P\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0150\u0001\u0000\u0000\u0000\u015b\u0153\u0001"+
		"\u0000\u0000\u0000\u015b\u0154\u0001\u0000\u0000\u0000\u015b\u0155\u0001"+
		"\u0000\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015b\u0157\u0001"+
		"\u0000\u0000\u0000\u015cM\u0001\u0000\u0000\u0000\u015d\u016a\u0003P("+
		"\u0000\u015e\u015f\u0003\u000e\u0007\u0000\u015f\u0160\u0003P(\u0000\u0160"+
		"\u016b\u0001\u0000\u0000\u0000\u0161\u0162\u0003\u0010\b\u0000\u0162\u0163"+
		"\u0003P(\u0000\u0163\u016b\u0001\u0000\u0000\u0000\u0164\u0165\u0003\u0012"+
		"\t\u0000\u0165\u0166\u0003P(\u0000\u0166\u016b\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0003\u0014\n\u0000\u0168\u0169\u0003P(\u0000\u0169\u016b"+
		"\u0001\u0000\u0000\u0000\u016a\u015e\u0001\u0000\u0000\u0000\u016a\u0161"+
		"\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000\u016a\u0167"+
		"\u0001\u0000\u0000\u0000\u016bO\u0001\u0000\u0000\u0000\u016c\u0173\u0003"+
		"\u0080@\u0000\u016d\u0173\u0003V+\u0000\u016e\u016f\u0003\u009eO\u0000"+
		"\u016f\u0170\u0003N\'\u0000\u0170\u0171\u0003\u00a0P\u0000\u0171\u0173"+
		"\u0001\u0000\u0000\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u016d"+
		"\u0001\u0000\u0000\u0000\u0172\u016e\u0001\u0000\u0000\u0000\u0173Q\u0001"+
		"\u0000\u0000\u0000\u0174\u017b\u0003T*\u0000\u0175\u0176\u0003\u0016\u000b"+
		"\u0000\u0176\u0177\u0003T*\u0000\u0177\u017c\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0003\u0018\f\u0000\u0179\u017a\u0003T*\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u0175\u0001\u0000\u0000\u0000\u017b\u0178\u0001"+
		"\u0000\u0000\u0000\u017cS\u0001\u0000\u0000\u0000\u017d\u0184\u0003\u0080"+
		"@\u0000\u017e\u0184\u0003V+\u0000\u017f\u0180\u0003\u009eO\u0000\u0180"+
		"\u0181\u0003R)\u0000\u0181\u0182\u0003\u00a0P\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u017e\u0001"+
		"\u0000\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0184U\u0001\u0000"+
		"\u0000\u0000\u0185\u018e\u0003X,\u0000\u0186\u0187\u0003 \u0010\u0000"+
		"\u0187\u0188\u0003X,\u0000\u0188\u018d\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0003\"\u0011\u0000\u018a\u018b\u0003X,\u0000\u018b\u018d\u0001\u0000"+
		"\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000\u018c\u0189\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018fW\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u019a\u0003Z-\u0000\u0192"+
		"\u0193\u0003$\u0012\u0000\u0193\u0194\u0003Z-\u0000\u0194\u0199\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0003&\u0013\u0000\u0196\u0197\u0003Z-"+
		"\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0192\u0001\u0000\u0000"+
		"\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000"+
		"\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019bY\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019d\u01a4\u0003z=\u0000\u019e\u01a4\u0003\u0080@\u0000\u019f\u01a0"+
		"\u0003\u009eO\u0000\u01a0\u01a1\u0003V+\u0000\u01a1\u01a2\u0003\u00a0"+
		"P\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u019d\u0001\u0000\u0000"+
		"\u0000\u01a3\u019e\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000"+
		"\u0000\u01a4[\u0001\u0000\u0000\u0000\u01a5\u01a8\u0003|>\u0000\u01a6"+
		"\u01a8\u0003\u0080@\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0003 \u0010\u0000\u01aa\u01ab\u0003|>\u0000\u01ab\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af]\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0003`0\u0000\u01b2\u01b3\u0003\u00a2Q\u0000\u01b3"+
		"\u01b4\u0003\u0002\u0001\u0000\u01b4\u01b8\u0003\u00a4R\u0000\u01b5\u01b7"+
		"\u0003b1\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bd\u0003f3\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd_\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0003\u0092I\u0000\u01bf\u01c0\u0003\u009eO\u0000\u01c0\u01c1\u0003"+
		"J%\u0000\u01c1\u01c2\u0003\u00a0P\u0000\u01c2a\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0003d2\u0000\u01c4\u01c5\u0003\u00a2Q\u0000\u01c5\u01c6"+
		"\u0003\u0002\u0001\u0000\u01c6\u01c7\u0003\u00a4R\u0000\u01c7c\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0003\u0094J\u0000\u01c9\u01ca\u0003\u009eO\u0000"+
		"\u01ca\u01cb\u0003J%\u0000\u01cb\u01cc\u0003\u00a0P\u0000\u01cce\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0003\u0096K\u0000\u01ce\u01cf\u0003\u00a2"+
		"Q\u0000\u01cf\u01d0\u0003\u0002\u0001\u0000\u01d0\u01d1\u0003\u00a4R\u0000"+
		"\u01d1g\u0001\u0000\u0000\u0000\u01d2\u01d5\u0003j5\u0000\u01d3\u01d5"+
		"\u0003n7\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5i\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003l6\u0000"+
		"\u01d7\u01d8\u0003\u00a2Q\u0000\u01d8\u01d9\u0003\u0002\u0001\u0000\u01d9"+
		"\u01da\u0003\u00a4R\u0000\u01dak\u0001\u0000\u0000\u0000\u01db\u01dc\u0003"+
		"\u0098L\u0000\u01dc\u01dd\u0003\u009eO\u0000\u01dd\u01de\u0003J%\u0000"+
		"\u01de\u01df\u0003\u00a0P\u0000\u01dfm\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0003p8\u0000\u01e1\u01e2\u0003\u00a2Q\u0000\u01e2\u01e3\u0003\u0002"+
		"\u0001\u0000\u01e3\u01e4\u0003\u00a4R\u0000\u01e4o\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0003\u009aM\u0000\u01e6\u01e7\u0005\u0001\u0000\u0000\u01e7"+
		"\u01e8\u0003r9\u0000\u01e8\u01e9\u0005\u0005\u0000\u0000\u01e9\u01ea\u0003"+
		"t:\u0000\u01ea\u01eb\u0003\u009cN\u0000\u01eb\u01ec\u0003v;\u0000\u01ec"+
		"\u01ed\u0005\u0002\u0000\u0000\u01edq\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005)\u0000\u0000\u01efs\u0001\u0000\u0000\u0000\u01f0\u01f1\u0007\u0002"+
		"\u0000\u0000\u01f1u\u0001\u0000\u0000\u0000\u01f2\u01f3\u0007\u0002\u0000"+
		"\u0000\u01f3w\u0001\u0000\u0000\u0000\u01f4\u01f8\u0003z=\u0000\u01f5"+
		"\u01f8\u0003|>\u0000\u01f6\u01f8\u0003~?\u0000\u01f7\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8y\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005&\u0000\u0000"+
		"\u01fa{\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\'\u0000\u0000\u01fc"+
		"}\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005(\u0000\u0000\u01fe\u007f\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0005)\u0000\u0000\u0200\u0081\u0001\u0000"+
		"\u0000\u0000\u0201\u0205\u0003\u0084B\u0000\u0202\u0205\u0003\u0086C\u0000"+
		"\u0203\u0205\u0003\u0088D\u0000\u0204\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0083\u0001\u0000\u0000\u0000\u0206\u0207\u0005#\u0000\u0000\u0207\u0085"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0005$\u0000\u0000\u0209\u0087\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0005%\u0000\u0000\u020b\u0089\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005\u0019\u0000\u0000\u020d\u008b\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0005\u001a\u0000\u0000\u020f\u008d\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0005\u001b\u0000\u0000\u0211\u008f\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0005\u001c\u0000\u0000\u0213\u0091\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005\u001d\u0000\u0000\u0215\u0093\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0005\u001e\u0000\u0000\u0217\u0095\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0005\u001f\u0000\u0000\u0219\u0097\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0005 \u0000\u0000\u021b\u0099\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005!\u0000\u0000\u021d\u009b\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0005\"\u0000\u0000\u021f\u009d\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005\u0001\u0000\u0000\u0221\u009f\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0005\u0002\u0000\u0000\u0223\u00a1\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0005\u0003\u0000\u0000\u0225\u00a3\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005\u0004\u0000\u0000\u0227\u00a5\u0001\u0000\u0000\u0000 \u00ae"+
		"\u00b0\u00b9\u00bd\u00ec\u00f4\u0102\u0109\u0110\u011e\u0123\u0135\u013c"+
		"\u014b\u014d\u015b\u016a\u0172\u017b\u0183\u018c\u018e\u0198\u019a\u01a3"+
		"\u01a7\u01ae\u01b8\u01bc\u01d4\u01f7\u0204";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}