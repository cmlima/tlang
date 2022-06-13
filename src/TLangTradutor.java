import org.antlr.v4.runtime.ParserRuleContext;

import antlr.*;

public class TLangTradutor extends TLangBaseListener {

	private String nomeDaClasse;
	private boolean depurar = false;

	private TLangAnalisadorSemantico analisadorSemantico;
	private TLangAnalisadorSemantico.Tipo numero = TLangAnalisadorSemantico.Tipo.NUMERO;
	private TLangAnalisadorSemantico.Tipo booleano = TLangAnalisadorSemantico.Tipo.BOOLEANO;
	private TLangAnalisadorSemantico.Tipo texto = TLangAnalisadorSemantico.Tipo.TEXTO;

	TLangTradutor(String nomeDaClasse, boolean depurar) {
		super();
		this.nomeDaClasse = nomeDaClasse;
		this.depurar = depurar;
		this.analisadorSemantico = new TLangAnalisadorSemantico(nomeDaClasse);
	}

	// Utilidades de depuração

	private void imprimirEscopo() {
		if (!depurar) return;
		identar();
		linha("// Escopo -> " + analisadorSemantico.obterEscopoAtual());
	}

	private void imprimirDeclaracao(String id, TLangAnalisadorSemantico.Tipo tipo) {
		if (!depurar) return;
		linha("// declaracao -> simb: " + id + ", tipo: " + tipo.name().toLowerCase());
	}

	private void imprimirIds() {
		if (!depurar) return;
		String ids = analisadorSemantico.obterIdsDoEscopo(analisadorSemantico.obterEscopoAtual());
		if (ids.length() > 0) {
			linha("");
			identar();
			linha("/*");
			identar();
			linha(" * REMOVENDO IDS ESCOPO: " + analisadorSemantico.obterEscopoAtual());

			String[] itens = ids.split("\n");
			for (int i = 0; i < itens.length; i++) {
				String item = itens[i];
				if (item.length() > 0) {
					identar();
					linha(" * " + item);
				}
			}
			identar();
			linha(" */");
		}
	}

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
		analisadorSemantico.entrarEscopo(); // inicializa a pilha de escopo
		linha("/*");
		linha(" * Codigo traduzido de TLang para Java");
		linha(" * Universidade Anhembi Morumbi");
		linha(" * Curso de Ciencia da Computacao - 2018/2022");
		linha("*/");
		linha("");
		linha("import java.util.Scanner;");
		linha("");
		identar();
    linha("public class " + this.nomeDaClasse + " {");
		identar();
		analisadorSemantico.entrarEscopo(); // primeiro escopo
		imprimirEscopo();
		linha("");
		identar();
		linha("static Scanner ler = new Scanner(System.in);");
		linha("");
		identar();
    linha("public static void main(String[] args) {");
	}

	public void encerrarCodigo() {
		identar();
		linha("}");
		imprimirEscopo();
		analisadorSemantico.deixarEscopo();
		identar();
		linha("}");
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
		imprimirEscopo();
  }

  @Override public void exitBloco(TLangParser.BlocoContext ctx) {
		imprimirIds();
		analisadorSemantico.deixarEscopo();
  }

  @Override public void enterDecl(TLangParser.DeclContext ctx) {
		identar();
		analisadorSemantico.atualizarContexto(ctx);

    TLangAnalisadorSemantico.Tipo tipo;
    String id;
		ParserRuleContext contexto;

    if (ctx.tipo() != null) {
      id = ctx.id().ID().getText();
			contexto = ctx.id();
      if (ctx.tipo().t_booleano() != null) {
        tipo = booleano; // TLangAnalisadorSemantico.Tipo.BOOLEANO
      } else if (ctx.tipo().t_numero() != null) {
        tipo = numero; // TLangAnalisadorSemantico.Tipo.NUMERO
      } else {
        tipo = texto; // TLangAnalisadorSemantico.Tipo.TEXTO
      }
    } else if (ctx.atr_bool() != null) {
      id = ctx.atr_bool().id().ID().getText();
			contexto = ctx.atr_bool().id();
      tipo = booleano;
    } else if (ctx.atr_num() != null) {
      id = ctx.atr_num().id().ID().getText();
			contexto = ctx.atr_num().id();
      tipo = numero;
    } else {
      id = ctx.atr_txt().id().ID().getText();
			contexto = ctx.atr_txt().id();
      tipo = texto;
    }

		if (analisadorSemantico.declarado(id)) {
			analisadorSemantico.erroJaDeclarado(id, contexto);
		} else {
			analisadorSemantico.declarar(id, tipo);
			imprimirDeclaracao(id, tipo);
			identar();
		}
	}

  @Override public void exitDecl(TLangParser.DeclContext ctx) {
		linha(";");
  }

	@Override public void enterAtr(TLangParser.AtrContext ctx) {
		identar();
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void exitAtr(TLangParser.AtrContext ctx) { 
		linha(";");
	}

	@Override public void exitAtr_num(TLangParser.Atr_numContext ctx) {
		String id = ctx.id().getText();
		ParserRuleContext contexto = ctx.id();
		TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
		if (tipo != null) {
			if (tipo != numero) {
				analisadorSemantico.erroTipo(id, contexto, numero);
			}
		} else {
			analisadorSemantico.erroNaoDeclarado(id, contexto);
		}
	}

	@Override public void exitAtr_txt(TLangParser.Atr_txtContext ctx) { 
		String id = ctx.id().getText();
		ParserRuleContext contexto = ctx.id();
		TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
		if (tipo != null) {
			if (tipo != texto) {
				analisadorSemantico.erroTipo(id, contexto, texto);
			}
		} else {
			analisadorSemantico.erroNaoDeclarado(id, contexto);
		}
	}

	@Override public void exitAtr_bool(TLangParser.Atr_boolContext ctx) { 
		String id = ctx.id().getText();
		ParserRuleContext contexto = ctx.id();
		TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
		if (tipo != null) {
			if (tipo != booleano) {
				analisadorSemantico.erroTipo(id, contexto, booleano);
			}
		} else {
			analisadorSemantico.erroNaoDeclarado(id, contexto);
		}
	}

	@Override public void exitTermo_bool(TLangParser.Termo_boolContext ctx) {
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			ParserRuleContext contexto = ctx.id();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != booleano) {
					analisadorSemantico.erroTipo(id, contexto, booleano);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, contexto);
			}
		}
	}


	@Override public void exitTermo_rel(TLangParser.Termo_relContext ctx) {
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			ParserRuleContext contexto = ctx.id();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, contexto, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, contexto);
			}
		}
	}

	@Override public void exitTermo_ig(TLangParser.Termo_igContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			ParserRuleContext contexto = ctx.id();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, contexto, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, contexto);
			}
		}
	}

	@Override public void exitTermo(TLangParser.TermoContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			ParserRuleContext contexto = ctx.id();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != numero) {
					analisadorSemantico.erroTipo(id, contexto, numero);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, contexto);
			}
		}
	}

	@Override public void exitTermo_txt(TLangParser.Termo_txtContext ctx) { 
		if (ctx.id() != null) {
			String id = ctx.id().ID().getText();
			ParserRuleContext contexto = ctx.id();
			TLangAnalisadorSemantico.Tipo tipo = analisadorSemantico.obterTipo(id);
			if (tipo != null) {
				if (tipo != texto) {
					analisadorSemantico.erroTipo(id, contexto, texto);
				}
			} else {
				analisadorSemantico.erroNaoDeclarado(id, contexto);
			}
		}
	}

	@Override public void exitLeitura(TLangParser.LeituraContext ctx) { 
		linha(";");
	}

	@Override public void enterEscrita(TLangParser.EscritaContext ctx) { 
		linha("");
		identar();
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void exitEscrita(TLangParser.EscritaContext ctx) { 
		linha(";");
	}

	@Override public void enterEstr_cond(TLangParser.Estr_condContext ctx) { 
		linha("");
		identar();
	}

	@Override public void enterControle_cond(TLangParser.Controle_condContext ctx) { 
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void enterControle_cond_sec(TLangParser.Controle_cond_secContext ctx) { 
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void enterEstr_repet(TLangParser.Estr_repetContext ctx) { 
		linha("");
		identar();
	}

	@Override public void enterControle_enquanto(TLangParser.Controle_enquantoContext ctx) { 
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void enterControle_de_ate(TLangParser.Controle_de_ateContext ctx) { 
		analisadorSemantico.atualizarContexto(ctx);
	}

	@Override public void exitControle_de_ate(TLangParser.Controle_de_ateContext ctx) {
		
		String id = ctx.ctr_id().ID().getText();
		ParserRuleContext contexto = ctx.ctr_id();
		if (analisadorSemantico.declarado(id)) {
			analisadorSemantico.erroJaDeclarado(id, contexto);
		}

		String inicio, fim;

		if (ctx.ctr_inicial().ID() != null) {
			inicio = ctx.ctr_inicial().ID().getText();
			ParserRuleContext subContexto = ctx.ctr_inicial();
			if (!analisadorSemantico.declarado(inicio)) {
				analisadorSemantico.erroNaoDeclarado(inicio, subContexto);
			}
		} else {
			inicio = ctx.ctr_inicial().NUM().getText();
		}

		if (ctx.ctr_final().ID() != null) {
			fim = ctx.ctr_final().ID().getText();
			ParserRuleContext subContexto = ctx.ctr_final();
			if (!analisadorSemantico.declarado(fim)) {
				analisadorSemantico.erroNaoDeclarado(fim, subContexto);
			}
		} else {
			fim = ctx.ctr_final().NUM().getText();
		}

		trecho("for (double " + id + " = " + inicio + "; " + id + "<=" + fim + "; " + id + "++)");
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

	@Override public void exitLeitura_num(TLangParser.Leitura_numContext ctx) { 
		trecho("; ler.nextLine()");
	}

	@Override public void enterLeia_txt(TLangParser.Leia_txtContext ctx) { 
		trecho("ler.nextLine");
	}

	@Override public void enterLeia_bool(TLangParser.Leia_boolContext ctx) { 
		trecho("ler.nextBoolean");
	}

	@Override public void exitLeitura_bool(TLangParser.Leitura_boolContext ctx) { 
		trecho("; ler.nextLine()");
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
	
	@Override public void exitParen_e(TLangParser.Paren_eContext ctx) { 
		trecho("(");
	}
	
	@Override public void exitParen_d(TLangParser.Paren_dContext ctx) { 
		trecho(")");
	}
	
	@Override public void exitChave_e(TLangParser.Chave_eContext ctx) { 
		linha(" {");
	}
	
	@Override public void exitChave_d(TLangParser.Chave_dContext ctx) { 
		linha("");
		identar();
		trecho("}");
	}

}
