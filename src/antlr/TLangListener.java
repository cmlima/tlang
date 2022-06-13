// Generated from src\gram\TLang.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangParser}.
 */
public interface TLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangParser#iniciar}.
	 * @param ctx the parse tree
	 */
	void enterIniciar(TLangParser.IniciarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#iniciar}.
	 * @param ctx the parse tree
	 */
	void exitIniciar(TLangParser.IniciarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(TLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(TLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr(TLangParser.Op_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr(TLangParser.Op_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_atr_num}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr_num(TLangParser.Op_atr_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_atr_num}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr_num(TLangParser.Op_atr_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_atr_txt}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr_txt(TLangParser.Op_atr_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_atr_txt}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr_txt(TLangParser.Op_atr_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_bool}.
	 * @param ctx the parse tree
	 */
	void enterOp_bool(TLangParser.Op_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_bool}.
	 * @param ctx the parse tree
	 */
	void exitOp_bool(TLangParser.Op_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(TLangParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(TLangParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_maiorq}.
	 * @param ctx the parse tree
	 */
	void enterOp_maiorq(TLangParser.Op_maiorqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_maiorq}.
	 * @param ctx the parse tree
	 */
	void exitOp_maiorq(TLangParser.Op_maiorqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_menorq}.
	 * @param ctx the parse tree
	 */
	void enterOp_menorq(TLangParser.Op_menorqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_menorq}.
	 * @param ctx the parse tree
	 */
	void exitOp_menorq(TLangParser.Op_menorqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_maiorig}.
	 * @param ctx the parse tree
	 */
	void enterOp_maiorig(TLangParser.Op_maiorigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_maiorig}.
	 * @param ctx the parse tree
	 */
	void exitOp_maiorig(TLangParser.Op_maiorigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_menorig}.
	 * @param ctx the parse tree
	 */
	void enterOp_menorig(TLangParser.Op_menorigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_menorig}.
	 * @param ctx the parse tree
	 */
	void exitOp_menorig(TLangParser.Op_menorigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_igual}.
	 * @param ctx the parse tree
	 */
	void enterOp_igual(TLangParser.Op_igualContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_igual}.
	 * @param ctx the parse tree
	 */
	void exitOp_igual(TLangParser.Op_igualContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_dif}.
	 * @param ctx the parse tree
	 */
	void enterOp_dif(TLangParser.Op_difContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_dif}.
	 * @param ctx the parse tree
	 */
	void exitOp_dif(TLangParser.Op_difContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_e}.
	 * @param ctx the parse tree
	 */
	void enterOp_e(TLangParser.Op_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_e}.
	 * @param ctx the parse tree
	 */
	void exitOp_e(TLangParser.Op_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_ou}.
	 * @param ctx the parse tree
	 */
	void enterOp_ou(TLangParser.Op_ouContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_ou}.
	 * @param ctx the parse tree
	 */
	void exitOp_ou(TLangParser.Op_ouContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(TLangParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(TLangParser.Op_naoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_soma}.
	 * @param ctx the parse tree
	 */
	void enterOp_soma(TLangParser.Op_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_soma}.
	 * @param ctx the parse tree
	 */
	void exitOp_soma(TLangParser.Op_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_sub}.
	 * @param ctx the parse tree
	 */
	void enterOp_sub(TLangParser.Op_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_sub}.
	 * @param ctx the parse tree
	 */
	void exitOp_sub(TLangParser.Op_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void enterOp_mult(TLangParser.Op_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void exitOp_mult(TLangParser.Op_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_div}.
	 * @param ctx the parse tree
	 */
	void enterOp_div(TLangParser.Op_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_div}.
	 * @param ctx the parse tree
	 */
	void exitOp_div(TLangParser.Op_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_inc}.
	 * @param ctx the parse tree
	 */
	void enterOp_inc(TLangParser.Op_incContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_inc}.
	 * @param ctx the parse tree
	 */
	void exitOp_inc(TLangParser.Op_incContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_dec}.
	 * @param ctx the parse tree
	 */
	void enterOp_dec(TLangParser.Op_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_dec}.
	 * @param ctx the parse tree
	 */
	void exitOp_dec(TLangParser.Op_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_soma_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_soma_atr(TLangParser.Op_soma_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_soma_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_soma_atr(TLangParser.Op_soma_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_sub_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_sub_atr(TLangParser.Op_sub_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_sub_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_sub_atr(TLangParser.Op_sub_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_mult_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_mult_atr(TLangParser.Op_mult_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_mult_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_mult_atr(TLangParser.Op_mult_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#op_div_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_div_atr(TLangParser.Op_div_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#op_div_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_div_atr(TLangParser.Op_div_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(TLangParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(TLangParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#atr_num}.
	 * @param ctx the parse tree
	 */
	void enterAtr_num(TLangParser.Atr_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#atr_num}.
	 * @param ctx the parse tree
	 */
	void exitAtr_num(TLangParser.Atr_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#atr_txt}.
	 * @param ctx the parse tree
	 */
	void enterAtr_txt(TLangParser.Atr_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#atr_txt}.
	 * @param ctx the parse tree
	 */
	void exitAtr_txt(TLangParser.Atr_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#atr_bool}.
	 * @param ctx the parse tree
	 */
	void enterAtr_bool(TLangParser.Atr_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#atr_bool}.
	 * @param ctx the parse tree
	 */
	void exitAtr_bool(TLangParser.Atr_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(TLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(TLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(TLangParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(TLangParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leitura_num}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_num(TLangParser.Leitura_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leitura_num}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_num(TLangParser.Leitura_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leitura_txt}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_txt(TLangParser.Leitura_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leitura_txt}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_txt(TLangParser.Leitura_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leitura_bool}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_bool(TLangParser.Leitura_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leitura_bool}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_bool(TLangParser.Leitura_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(TLangParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(TLangParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(TLangParser.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(TLangParser.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#termo_bool}.
	 * @param ctx the parse tree
	 */
	void enterTermo_bool(TLangParser.Termo_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#termo_bool}.
	 * @param ctx the parse tree
	 */
	void exitTermo_bool(TLangParser.Termo_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr_rel}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rel(TLangParser.Expr_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr_rel}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rel(TLangParser.Expr_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#termo_rel}.
	 * @param ctx the parse tree
	 */
	void enterTermo_rel(TLangParser.Termo_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#termo_rel}.
	 * @param ctx the parse tree
	 */
	void exitTermo_rel(TLangParser.Termo_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr_ig}.
	 * @param ctx the parse tree
	 */
	void enterExpr_ig(TLangParser.Expr_igContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr_ig}.
	 * @param ctx the parse tree
	 */
	void exitExpr_ig(TLangParser.Expr_igContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#termo_ig}.
	 * @param ctx the parse tree
	 */
	void enterTermo_ig(TLangParser.Termo_igContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#termo_ig}.
	 * @param ctx the parse tree
	 */
	void exitTermo_ig(TLangParser.Termo_igContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr_aritm}.
	 * @param ctx the parse tree
	 */
	void enterExpr_aritm(TLangParser.Expr_aritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr_aritm}.
	 * @param ctx the parse tree
	 */
	void exitExpr_aritm(TLangParser.Expr_aritmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(TLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(TLangParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(TLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(TLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#expr_txt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_txt(TLangParser.Expr_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#expr_txt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_txt(TLangParser.Expr_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_cond}.
	 * @param ctx the parse tree
	 */
	void enterEstr_cond(TLangParser.Estr_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_cond}.
	 * @param ctx the parse tree
	 */
	void exitEstr_cond(TLangParser.Estr_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#controle_cond}.
	 * @param ctx the parse tree
	 */
	void enterControle_cond(TLangParser.Controle_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#controle_cond}.
	 * @param ctx the parse tree
	 */
	void exitControle_cond(TLangParser.Controle_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_cond_sec}.
	 * @param ctx the parse tree
	 */
	void enterEstr_cond_sec(TLangParser.Estr_cond_secContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_cond_sec}.
	 * @param ctx the parse tree
	 */
	void exitEstr_cond_sec(TLangParser.Estr_cond_secContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#controle_cond_sec}.
	 * @param ctx the parse tree
	 */
	void enterControle_cond_sec(TLangParser.Controle_cond_secContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#controle_cond_sec}.
	 * @param ctx the parse tree
	 */
	void exitControle_cond_sec(TLangParser.Controle_cond_secContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_cond_alt}.
	 * @param ctx the parse tree
	 */
	void enterEstr_cond_alt(TLangParser.Estr_cond_altContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_cond_alt}.
	 * @param ctx the parse tree
	 */
	void exitEstr_cond_alt(TLangParser.Estr_cond_altContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_repet}.
	 * @param ctx the parse tree
	 */
	void enterEstr_repet(TLangParser.Estr_repetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_repet}.
	 * @param ctx the parse tree
	 */
	void exitEstr_repet(TLangParser.Estr_repetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEstr_enquanto(TLangParser.Estr_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEstr_enquanto(TLangParser.Estr_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#controle_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterControle_enquanto(TLangParser.Controle_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#controle_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitControle_enquanto(TLangParser.Controle_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#estr_de_ate}.
	 * @param ctx the parse tree
	 */
	void enterEstr_de_ate(TLangParser.Estr_de_ateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#estr_de_ate}.
	 * @param ctx the parse tree
	 */
	void exitEstr_de_ate(TLangParser.Estr_de_ateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#controle_de_ate}.
	 * @param ctx the parse tree
	 */
	void enterControle_de_ate(TLangParser.Controle_de_ateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#controle_de_ate}.
	 * @param ctx the parse tree
	 */
	void exitControle_de_ate(TLangParser.Controle_de_ateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#ctr_id}.
	 * @param ctx the parse tree
	 */
	void enterCtr_id(TLangParser.Ctr_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#ctr_id}.
	 * @param ctx the parse tree
	 */
	void exitCtr_id(TLangParser.Ctr_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#ctr_inicial}.
	 * @param ctx the parse tree
	 */
	void enterCtr_inicial(TLangParser.Ctr_inicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#ctr_inicial}.
	 * @param ctx the parse tree
	 */
	void exitCtr_inicial(TLangParser.Ctr_inicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#ctr_final}.
	 * @param ctx the parse tree
	 */
	void enterCtr_final(TLangParser.Ctr_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#ctr_final}.
	 * @param ctx the parse tree
	 */
	void exitCtr_final(TLangParser.Ctr_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(TLangParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(TLangParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(TLangParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(TLangParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#txt}.
	 * @param ctx the parse tree
	 */
	void enterTxt(TLangParser.TxtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#txt}.
	 * @param ctx the parse tree
	 */
	void exitTxt(TLangParser.TxtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(TLangParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(TLangParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(TLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(TLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#t_numero}.
	 * @param ctx the parse tree
	 */
	void enterT_numero(TLangParser.T_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#t_numero}.
	 * @param ctx the parse tree
	 */
	void exitT_numero(TLangParser.T_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#t_texto}.
	 * @param ctx the parse tree
	 */
	void enterT_texto(TLangParser.T_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#t_texto}.
	 * @param ctx the parse tree
	 */
	void exitT_texto(TLangParser.T_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#t_booleano}.
	 * @param ctx the parse tree
	 */
	void enterT_booleano(TLangParser.T_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#t_booleano}.
	 * @param ctx the parse tree
	 */
	void exitT_booleano(TLangParser.T_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leia_num}.
	 * @param ctx the parse tree
	 */
	void enterLeia_num(TLangParser.Leia_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leia_num}.
	 * @param ctx the parse tree
	 */
	void exitLeia_num(TLangParser.Leia_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leia_txt}.
	 * @param ctx the parse tree
	 */
	void enterLeia_txt(TLangParser.Leia_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leia_txt}.
	 * @param ctx the parse tree
	 */
	void exitLeia_txt(TLangParser.Leia_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#leia_bool}.
	 * @param ctx the parse tree
	 */
	void enterLeia_bool(TLangParser.Leia_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#leia_bool}.
	 * @param ctx the parse tree
	 */
	void exitLeia_bool(TLangParser.Leia_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(TLangParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(TLangParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(TLangParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(TLangParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#senaose}.
	 * @param ctx the parse tree
	 */
	void enterSenaose(TLangParser.SenaoseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#senaose}.
	 * @param ctx the parse tree
	 */
	void exitSenaose(TLangParser.SenaoseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(TLangParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(TLangParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(TLangParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(TLangParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#de}.
	 * @param ctx the parse tree
	 */
	void enterDe(TLangParser.DeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#de}.
	 * @param ctx the parse tree
	 */
	void exitDe(TLangParser.DeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#ate}.
	 * @param ctx the parse tree
	 */
	void enterAte(TLangParser.AteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#ate}.
	 * @param ctx the parse tree
	 */
	void exitAte(TLangParser.AteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#paren_e}.
	 * @param ctx the parse tree
	 */
	void enterParen_e(TLangParser.Paren_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#paren_e}.
	 * @param ctx the parse tree
	 */
	void exitParen_e(TLangParser.Paren_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#paren_d}.
	 * @param ctx the parse tree
	 */
	void enterParen_d(TLangParser.Paren_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#paren_d}.
	 * @param ctx the parse tree
	 */
	void exitParen_d(TLangParser.Paren_dContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#chave_e}.
	 * @param ctx the parse tree
	 */
	void enterChave_e(TLangParser.Chave_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#chave_e}.
	 * @param ctx the parse tree
	 */
	void exitChave_e(TLangParser.Chave_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#chave_d}.
	 * @param ctx the parse tree
	 */
	void enterChave_d(TLangParser.Chave_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#chave_d}.
	 * @param ctx the parse tree
	 */
	void exitChave_d(TLangParser.Chave_dContext ctx);
}