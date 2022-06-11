import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;

public class TLangAnalisadorSemantico {
  static enum Tipo { NUMERO, TEXTO, BOOLEANO }

	private String nomeDaClasse;

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

	private void imprimirErro(String mensagem, int linha, int col, String codigo) {
		System.err.println(this.nomeDaClasse + ".tlang:" + linha + ": erro: " + mensagem);
		System.err.println("\t" + codigo);
		System.err.println("\t" + " ".repeat(col) + "^");
		System.err.println("");

		this.contadorErros++;
	}

	public void erroNaoDeclarado(String id, int linha, int col, String codigo) {
		String mensagem = "variável " + id + " não declarada";
		imprimirErro(mensagem, linha, col, codigo);
	}

	public void erroJaDeclarado(String id, int linha, int col, String codigo) {
		String mensagem = "variável " + id + " já declarada";
		imprimirErro(mensagem, linha, col, codigo);
	}

	public void erroTipo(String id, int linha, int col, String codigo, Tipo esperado) {
		String mensagem = "a variável " + id + " não é do tipo" + esperado.name().toLowerCase();
		imprimirErro(mensagem, linha, col, codigo);
	}

	public void imprimirTotalErros() {
		System.err.println(contadorErros + " erros");
	}
}