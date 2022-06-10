import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;

import antlr.*;

public class TLangAnalisadorSemantico extends TLangBaseListener {
  static enum Tipo { NUMERO, TEXTO, BOOLEANO }

	/**
	 *  id@escopo: Tipo.NUMERO
	 *  chave2: valor2
	 */
  private HashMap<String, Tipo> ids = new HashMap<>();
	/**
	 * 0-1-2-3
	 */
  private Stack<Integer> escopo = new Stack<>();

	private int contadorErros = 0; 

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

	private String obterChave(String id) {
		return id + '@' + this.escopo.peek().toString();
	}

	public void inspecionarIds() {
		System.err.println("---- Tabela de Ids ----");
		for (Entry<String, Tipo> entry: this.ids.entrySet()) {
			System.err.println(entry.getKey() + ":\t\t" + entry.getValue().name().toLowerCase());
		}
		System.err.println("-----------------------");
	}

	public void erroNaoDeclarado(String id, int linha, int col, String codigo) {
		System.err.println("TLang:" + linha + ": erro: símbolo " + id + " não declarado");
		System.err.println("\t" + codigo);
		System.err.println("\t" + " ".repeat(col - 1) + "^");
		System.err.println("");

		this.contadorErros++;
	}

	public void erroJaDeclarado(String id, int linha, int col, String codigo) {
		System.err.println("TLang:" + linha + ": erro: a variável " + id + " já foi declarada");
		System.err.println("\t" + codigo);
		System.err.println("\t" + " ".repeat(col - 1) + "^");
		System.err.println("");

		this.contadorErros++;
	}

	public void erroTipo(String id, int linha, int col, String codigo, Tipo esperado) {
		System.err.println("TLang:" + linha + ": erro: a variável " + id + " não é de tipo " + esperado.name().toLowerCase());
		System.err.println("\t" + codigo);
		System.err.println("\t" + " ".repeat(col - 1) + "^");
		System.err.println("");
		
		this.contadorErros++;
	}

	public void imprimirTotalErros() {
		System.err.println(contadorErros + " erros");
	}
}