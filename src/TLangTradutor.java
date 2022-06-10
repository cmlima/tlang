import antlr.*;

public class TLangTradutor extends TLangBaseListener {

	private TLangAnalisadorSemantico analisadorSemantico = new TLangAnalisadorSemantico();
	private TLangAnalisadorSemantico.Tipo numero = TLangAnalisadorSemantico.Tipo.NUMERO;
	private TLangAnalisadorSemantico.Tipo booleano = TLangAnalisadorSemantico.Tipo.BOOLEANO;
	private TLangAnalisadorSemantico.Tipo texto = TLangAnalisadorSemantico.Tipo.TEXTO;

	private int numeroLinha = 0;
	private String textoLinha = ""; 

	// Utilidades de formatação

	private void identar() {
		int escopo = analisadorSemantico.obterEscopoAtual();
		int n = escopo >= 0 ? escopo : 0;
    System.out.print("  ".repeat(n));
	}

	private void linha(String texto) {
    System.out.println(texto);
	}

	private void trecho(String texto) {
    System.out.print(texto);
	}

	// Início e fim

	public void iniciarCodigo() {
		linha("import java.util.Scanner;");
		linha("");
		analisadorSemantico.entrarEscopo();
		identar();
    linha("public class Codigo {");
		linha("");
		analisadorSemantico.entrarEscopo();
		identar();
    linha("public static void main(String[] args) {");
		linha("");
		identar();
		linha("  Scanner ler = new Scanner(System.in);");
	}

	public void encerrarCodigo() {
		identar();
		linha("}");
		analisadorSemantico.deixarEscopo();
		identar();
		linha("}");
		analisadorSemantico.deixarEscopo();

		analisadorSemantico.imprimirTotalErros();
	}

	// Tradução das regras

  @Override public void enterIniciar(TLangParser.IniciarContext ctx) {
		iniciarCodigo();
  }

  @Override public void exitIniciar(TLangParser.IniciarContext ctx) {
		encerrarCodigo();
  }

	@Override public void enterBloco(TLangParser.BlocoContext ctx) {
		analisadorSemantico.entrarEscopo();
		linha("");
  }

  @Override public void exitBloco(TLangParser.BlocoContext ctx) {
		analisadorSemantico.deixarEscopo();
		linha("");
  }

  @Override public void enterDecl(TLangParser.DeclContext ctx) {
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();

    TLangAnalisadorSemantico.Tipo tipo;
    String id;
		int col;

    if (ctx.tipo() != null) {
      id = ctx.id().ID().getText();
			col = ctx.id().getStart().getCharPositionInLine();
      if (ctx.tipo().t_booleano() != null) {
        tipo = booleano; // TLangAnalisadorSemantico.Tipo.BOOLEANO
      } else if (ctx.tipo().t_numero() != null) {
        tipo = numero; // TLangAnalisadorSemantico.Tipo.NUMERO
      } else {
        tipo = texto; // TLangAnalisadorSemantico.Tipo.TEXTO
      }
    } else if (ctx.atr_bool() != null) {
      id = ctx.atr_bool().id(0).ID().getText();
			col = ctx.atr_bool().id(0).getStart().getCharPositionInLine();
      tipo = booleano;
    } else if (ctx.atr_num() != null) {
      id = ctx.atr_num().id(0).ID().getText();
			col = ctx.atr_num().id(0).getStart().getCharPositionInLine();
      tipo = numero;
    } else {
      id = ctx.atr_txt().id(0).ID().getText();
			col = ctx.atr_txt().id(0).getStart().getCharPositionInLine();
      tipo = texto;
    }

		if (analisadorSemantico.declarado(id)) {
			analisadorSemantico.erroJaDeclarado(id, this.numeroLinha, col, this.textoLinha);
		} else {
			analisadorSemantico.declarar(id, tipo);
		}
	}

  @Override public void exitDecl(TLangParser.DeclContext ctx) {

		linha(";");
  }

	@Override public void enterAtr(TLangParser.AtrContext ctx) {
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitAtr(TLangParser.AtrContext ctx) { 
		// if (ctx.atr_bool() != null) {
		// 	String id = ctx.atr_bool().id(0).ID().getText();
		// 	int col = ctx.atr_bool().id(0).getStart().getCharPositionInLine();
		// 	if (analisadorSemantico.obterTipo(id) != booleano) {
		// 		analisadorSemantico.erroTipo(id, numeroLinha, col, textoLinha, booleano);
		// 	}
		// } else if (ctx.atr_num() != null) {
		// 	String id = ctx.atr_num().id(0).ID().getText();
		// 	int col = ctx.atr_num().id(0).getStart().getCharPositionInLine();
		// 	if (analisadorSemantico.obterTipo(id) != numero) {
		// 		analisadorSemantico.erroTipo(id, numeroLinha, col, textoLinha, numero);
		// 	}
		// } else if (ctx.atr_txt() != null) {
		// 	String id = ctx.atr_txt().id(0).ID().getText();
		// 	int col = ctx.atr_txt().id(0).getStart().getCharPositionInLine();
		// 	if (analisadorSemantico.obterTipo(id) != texto) {
		// 		analisadorSemantico.erroTipo(id, numeroLinha, col, textoLinha, texto);
		// 	}
		// }

		linha(";");
	}

	@Override public void exitAtr_num(TLangParser.Atr_numContext ctx) {

		for (int i = 0; i < ctx.id().size(); i++) {
			String id = ctx.id(i).getText();
			int col = ctx.id(i).getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitAtr_txt(TLangParser.Atr_txtContext ctx) { 
		for (int i = 0; i < ctx.id().size(); i++) {
			String id = ctx.id(i).getText();
			int col = ctx.id(i).getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != texto) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, texto);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitAtr_bool(TLangParser.Atr_boolContext ctx) { 
		for (int i = 0; i < ctx.id().size(); i++) {
			String id = ctx.id(i).getText();
			int col = ctx.id(i).getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != booleano) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, booleano);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitTermo_bool(TLangParser.Termo_boolContext ctx) {
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			int col = ctx.id().getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != booleano) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, booleano);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}


	@Override public void exitTermo_rel(TLangParser.Termo_relContext ctx) {
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			int col = ctx.id().getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitTermo_ig(TLangParser.Termo_igContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			int col = ctx.id().getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitTermo(TLangParser.TermoContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			int col = ctx.id().getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void exitExpr_txt(TLangParser.Expr_txtContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			int col = ctx.id().getStart().getCharPositionInLine();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != texto) {
					analisadorSemantico.erroTipo(id, this.numeroLinha, col, this.textoLinha, texto);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
		}
	}

	@Override public void enterLeitura(TLangParser.LeituraContext ctx) { 
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitLeitura(TLangParser.LeituraContext ctx) { 
		linha(";");
	}

	@Override public void enterEscrita(TLangParser.EscritaContext ctx) { 
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitEscrita(TLangParser.EscritaContext ctx) { 
		linha(";");
	}

	@Override public void enterEstr_cond(TLangParser.Estr_condContext ctx) { 
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitEstr_cond(TLangParser.Estr_condContext ctx) { 
		linha("");
	}

	@Override public void enterEstr_cond_sec(TLangParser.Estr_cond_secContext ctx) { 
		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitEstr_cond_sec(TLangParser.Estr_cond_secContext ctx) { 
		linha("");
	}

	@Override public void enterEstr_cond_alt(TLangParser.Estr_cond_altContext ctx) { 
		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitEstr_cond_alt(TLangParser.Estr_cond_altContext ctx) { 
		linha("");
	}

	@Override public void enterEstr_repet(TLangParser.Estr_repetContext ctx) { 
		identar();

		this.numeroLinha = ctx.getStart().getLine();
		this.textoLinha = ctx.getText();
	}

	@Override public void exitEstr_repet(TLangParser.Estr_repetContext ctx) { 
		linha("");
	}

	@Override public void exitOp_atr(TLangParser.Op_atrContext ctx) { 
		if (ctx.ATR() != null) trecho(" " + ctx.ATR().getText() + " ");
	}
	
	@Override public void exitOp_maiorq(TLangParser.Op_maiorqContext ctx) { 
		if (ctx.MAIORQ() != null) trecho(" " + ctx.MAIORQ().getText() + " ");
	}
	
	@Override public void exitOp_menorq(TLangParser.Op_menorqContext ctx) { 
		if (ctx.MENORQ() != null) trecho(" " + ctx.MENORQ().getText() + " ");
	}
	
	@Override public void exitOp_maiorig(TLangParser.Op_maiorigContext ctx) { 
		if (ctx.MAIORIG() != null) trecho(" " + ctx.MAIORIG().getText() + " ");
	}
	
	@Override public void exitOp_menorig(TLangParser.Op_menorigContext ctx) { 
		if (ctx.MENORIG() != null) trecho(" " + ctx.MENORIG().getText() + " ");
	}
	
	@Override public void exitOp_igual(TLangParser.Op_igualContext ctx) { 
		if (ctx.IGUAL() != null) trecho(" " + ctx.IGUAL().getText() + " ");
	}
	
	@Override public void exitOp_dif(TLangParser.Op_difContext ctx) { 
		if (ctx.DIF() != null) trecho(" " + ctx.DIF().getText() + " ");
	}
	
	@Override public void exitOp_e(TLangParser.Op_eContext ctx) { 
		if (ctx.E() != null) trecho(" " + ctx.E().getText() + " ");
	}
	
	@Override public void exitOp_ou(TLangParser.Op_ouContext ctx) { 
		if (ctx.OU() != null) trecho(" " + ctx.OU().getText() + " ");
	}
	
	@Override public void exitOp_nao(TLangParser.Op_naoContext ctx) { 
		if (ctx.NAO() != null) trecho(" " + ctx.NAO().getText());
	}
	
	@Override public void exitOp_soma(TLangParser.Op_somaContext ctx) { 
		if (ctx.SOMA() != null) trecho(" " + ctx.SOMA().getText() + " ");
	}
	
	@Override public void exitOp_sub(TLangParser.Op_subContext ctx) { 
		if (ctx.SUB() != null) trecho(" " + ctx.SUB().getText() + " ");
	}
	
	@Override public void exitOp_mult(TLangParser.Op_multContext ctx) { 
		if (ctx.MULT() != null) trecho(" " + ctx.MULT().getText() + " ");
	}
	
	@Override public void exitOp_div(TLangParser.Op_divContext ctx) { 
		if (ctx.DIV() != null) trecho(" " + ctx.DIV().getText() + " ");
	}
	
	@Override public void exitOp_inc(TLangParser.Op_incContext ctx) { 
		if (ctx.INC() != null) trecho(ctx.INC().getText());
	}
	
	@Override public void exitOp_dec(TLangParser.Op_decContext ctx) { 
		if (ctx.DEC() != null) trecho(ctx.DEC().getText());
	}
	
	@Override public void exitOp_soma_atr(TLangParser.Op_soma_atrContext ctx) { 
		if (ctx.SOMA_ATR() != null) trecho(" " + ctx.SOMA_ATR().getText() + " ");
	}
	
	@Override public void exitOp_sub_atr(TLangParser.Op_sub_atrContext ctx) { 
		if (ctx.SUB_ATR() != null) trecho(" " + ctx.SUB_ATR().getText() + " ");
	}
	
	@Override public void exitOp_mult_atr(TLangParser.Op_mult_atrContext ctx) { 
		if (ctx.MULT_ATR() != null) trecho(" " + ctx.MULT_ATR().getText() + " ");
	}
	
	@Override public void exitOp_div_atr(TLangParser.Op_div_atrContext ctx) { 
		if (ctx.DIV_ATR() != null) trecho(" " + ctx.DIV_ATR().getText() + " ");
	}
	
	@Override public void exitNum(TLangParser.NumContext ctx) { 
		if (ctx.NUM() != null) trecho(ctx.NUM().getText());
	}
	
	@Override public void exitTxt(TLangParser.TxtContext ctx) { 
		if (ctx.TXT() != null) trecho(ctx.TXT().getText());
	}
	
	@Override public void exitBool(TLangParser.BoolContext ctx) { 
		if (ctx.BOOL() != null) {
			String val = ctx.BOOL().getText();
			if (val.equalsIgnoreCase("verdadeiro")) {
				trecho("true");
			} else {
				trecho("false");
			}
		}
	}
	
	@Override public void exitId(TLangParser.IdContext ctx) { 
		if (ctx.ID() != null) trecho(ctx.ID().getText());
	}
	
	@Override public void exitT_numero(TLangParser.T_numeroContext ctx) { 
		if (ctx.T_NUM() != null) trecho("double ");
	}
	
	@Override public void exitT_texto(TLangParser.T_textoContext ctx) { 
		if (ctx.T_TXT() != null) trecho("String ");
	}
	
	@Override public void exitT_booleano(TLangParser.T_booleanoContext ctx) { 
		if (ctx.T_BOOL() != null) trecho("boolean ");
	}
	
	@Override public void enterLeia_num(TLangParser.Leia_numContext ctx) { 
		trecho("ler.nextDouble");
	}

	@Override public void enterLeia_txt(TLangParser.Leia_txtContext ctx) { 
		trecho("ler.nextLine");
	}

	@Override public void enterLeia_bool(TLangParser.Leia_boolContext ctx) { 
		trecho("ler.nextBoolean");
	}
	
	@Override public void enterEscreva(TLangParser.EscrevaContext ctx) { 
		trecho("System.out.println");
	}
	
	@Override public void exitSe(TLangParser.SeContext ctx) { 
		trecho("if ");
	}
	
	@Override public void exitSenaose(TLangParser.SenaoseContext ctx) { 
		trecho(" else if ");
	}
	
	@Override public void exitSenao(TLangParser.SenaoContext ctx) { 
		trecho(" else");
	}
	
	@Override public void exitEnquanto(TLangParser.EnquantoContext ctx) { 
		trecho("while ");
	}
	
	@Override public void enterEstr_de_ate(TLangParser.Estr_de_ateContext ctx) { 
		trecho("for ");
	}

	@Override public void enterControle_de_ate(TLangParser.Controle_de_ateContext ctx) { 
		trecho("(");
	}

	@Override public void exitControle_de_ate(TLangParser.Controle_de_ateContext ctx) {
		if (ctx.contr_id() != null && ctx.contr_num(0) != null && ctx.contr_num(1) != null) {
			String id = ctx.contr_id().ID().getText();
			int col = ctx.contr_id().getStart().getCharPositionInLine();
			if (analisadorSemantico.declarado(id)) {
				analisadorSemantico.erroJaDeclarado(id, this.numeroLinha, col, this.textoLinha);
			}
			int de = Integer.parseInt(ctx.contr_num(0).NUM().getText());
			int ate = Integer.parseInt(ctx.contr_num(1).NUM().getText());
			String op_arit = (de <= ate) ? "++" : "--";
			String op_rel = (de <= ate) ? "<=" : ">=";
			trecho("int " + id + " = " + de + "; " + id + " " + op_rel + " " + ate + "; " + id + op_arit);
		}
		trecho(")");
	}

	@Override public void exitParen_e(TLangParser.Paren_eContext ctx) { 
		trecho("(");
	}
	
	@Override public void exitParen_d(TLangParser.Paren_dContext ctx) { 
		trecho(")");
	}
	
	@Override public void exitChave_e(TLangParser.Chave_eContext ctx) { 
		trecho(" {");
	}
	
	@Override public void exitChave_d(TLangParser.Chave_dContext ctx) { 
		identar();

		trecho("}");
	}

}
