import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr.*;

public class FileReader {

    private static final String EXTENSION = "tlang";
    private static final String DIRBASE = "../test/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length == 0 ? new String[] { "teste." + EXTENSION } : args;
        for (String file : files){
            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            TLangLexer lexer = new TLangLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TLangParser parser = new TLangParser(tokens);
            ParseTree tree = parser.iniciar();

            TLangTradutor tradutor = new TLangTradutor();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(tradutor, tree);
        }
    }
}
