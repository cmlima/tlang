import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr.*;

public class StreamReader {

	public static void main(String[] args) throws IOException {

		CharStream input = CharStreams.fromStream(System.in);
		TLangLexer lexer = new TLangLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TLangParser parser = new TLangParser(tokens);
		ParseTree tree = parser.iniciar();

		TLangTradutor tradutor = new TLangTradutor("Codigo");
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(tradutor, tree);

	}
}
