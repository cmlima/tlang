import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

public class TLangAnalisadorSemantico {
  static enum Tipo { NUMERO, TEXTO, BOOLEANO }

	private String nomeDaClasse = "";
	private int numeroLinha = 0;
	private int colInicio = 0;
	private String textoLinha = ""; 

	TLangAnalisadorSemantico(String nomeDaClasse) {
		super();
		this.nomeDaClasse = nomeDaClasse;
	}

	/**
	 *  id@escopo: Tipo.NUMERO
	 *  id2@escopo: Tipo.BOOLEANO
	 *  id3@escopo: Tipo.TEXTO
	 *  ...
	 */
  private HashMap<String, Tipo> ids = new HashMap<>();
	/**
	 * 0-1-2-3
	 */
  private Stack<Integer> escopo = new Stack<>();

	private int contadorErros = 0; 

	private String obterChave(String id) {
		return id + '@' + this.escopo.peek().toString();
	}

	// https://stackoverflow.com/questions/26524302/how-to-preserve-whitespace-when-we-use-text-attribute-in-antlr4
	private String obterTextoIntegral(ParserRuleContext ctx) {
    if (ctx.start == null || ctx.stop == null || ctx.start.getStartIndex() < 0 || ctx.stop.getStopIndex() < 0)
        return ctx.getText();

    return ctx.start.getInputStream().getText(Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	}

	// Métodos públicos

	public int obterEscopoAtual() {
		if (!this.escopo.isEmpty()) return this.escopo.peek();
		return -1;
	}

	public void entrarEscopo() {
    this.escopo.push(this.escopo.isEmpty() ? 0 : this.escopo.peek() + 1);
	}

	public void deixarEscopo() {
		int atual = this.escopo.pop();
		String sufixo = '@' + Integer.toString(atual);
		this.ids.entrySet().removeIf(item -> item.getKey().endsWith(sufixo));
	}

	public Tipo obterTipo(String id) {
		int atual = this.escopo.peek();

		for (int i = atual; i >= 0; i--) {
			String chave = id + '@' + Integer.toString(i);
			if (this.ids.containsKey(chave)) {
				return this.ids.get(chave);
			}
		}
		return null;
	}

	public boolean declarado (String id) {
		return obterTipo(id) != null;
	}

	public void declarar(String id, Tipo tipo) {
		String chave = this.obterChave(id);
		this.ids.put(chave, tipo);
	}

	public void inspecionarIds() {
		System.err.println("---- Tabela de Ids ----");
		for (Entry<String, Tipo> entry: this.ids.entrySet()) {
			System.err.println(entry.getKey() + ":\t\t" + entry.getValue().name().toLowerCase());
		}
		System.err.println("-----------------------");
	}

	public String obterIdsDoEscopo(int escopo) {
		String output = "";
		for (Entry<String, Tipo> entry: this.ids.entrySet()) {
			if (entry.getKey().endsWith("@" + escopo)) {
				output += (entry.getKey() + " -> " + entry.getValue().name() + "\n");
			}
		}
		return output;
	}

	public void atualizarContexto(ParserRuleContext ctx) {
		this.numeroLinha = ctx.getStart().getLine();
		this.colInicio = ctx.getStart().getCharPositionInLine();
		this.textoLinha = this.obterTextoIntegral(ctx).split("\\r\\n|\\n")[0];
	}

	private void imprimirErro(String mensagem, ParserRuleContext contextoId) {
		int col = contextoId.getStart().getCharPositionInLine() - this.colInicio;
		System.err.println(this.nomeDaClasse + ".tlang:" + this.numeroLinha + ": erro: " + mensagem);
		System.err.println("\t" + this.textoLinha);
		System.err.println("\t" + " ".repeat(col) + "^");
		System.err.println("");

		this.contadorErros++;
	}

	public void erroNaoDeclarado(String id, ParserRuleContext contextoId) {
		String mensagem = "variavel " + id + " nao declarada";
		imprimirErro(mensagem, contextoId);
	}

	public void erroJaDeclarado(String id, ParserRuleContext contextoId) {
		String mensagem = "variavel " + id + " ja declarada";
		imprimirErro(mensagem, contextoId);
	}

	public void erroTipo(String id, ParserRuleContext contextoId, Tipo esperado) {
		String mensagem = "a variavel " + id + " nao eh do tipo " + esperado.name().toLowerCase();
		imprimirErro(mensagem, contextoId);
	}

	public void erroValor(String val, ParserRuleContext contextoVal, Tipo esperado) {
		String mensagem = "o valor " + val + " nao eh do tipo " + esperado.name().toLowerCase();
		imprimirErro(mensagem, contextoVal);
	}

	public void erroExpressao(String id, ParserRuleContext contextoId, Tipo esperado) {
		String mensagem = "a expressao atribuída aa variavel " + id + " nao eh do tipo " + esperado.name().toLowerCase();
		imprimirErro(mensagem, contextoId);
	}

	public void imprimirTotalErros() {
		System.err.println(contadorErros + " erros");
	}
}