import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr.*;

public class FileReader {

    private static final boolean MODO_DEPURACAO = false;
    private static final String EXTENSAO = "tlang";
    private static final String DIRETORIO = "../test/";

    public static ArrayList<String> obterArquivos(final File dir, String ext) {
        ArrayList<String> arquivos = new ArrayList<>();
        for (final File fileEntry : dir.listFiles()) {
            if (!fileEntry.isDirectory() && fileEntry.getName().endsWith(ext)) {
                arquivos.add(fileEntry.getName());
            }
        }
        return arquivos;
    }

    public static void redirecionarParaArquivo(final File arquivo) throws FileNotFoundException {
        FileOutputStream output = new FileOutputStream(arquivo);
        PrintStream ps = new PrintStream(output);
        System.setOut(ps);
    }


    public static void main(String[] args) throws IOException {

        final File dir = new File(DIRETORIO);
        ArrayList<String> arquivos = args.length == 0 ? obterArquivos(dir, "." + EXTENSAO) : new ArrayList<>(Arrays.asList(args));

        if (arquivos.size() == 0) {
            System.out.println("Nenhum arquivo localizado no diretório " + DIRETORIO);
            return;
        }

        PrintStream console = System.out;

        for (String arquivo : arquivos){
            System.err.println("Compilando " + arquivo);

            CharStream in = CharStreams.fromFileName(DIRETORIO + arquivo);

            String nomeClasse = arquivo.substring(0, arquivo.lastIndexOf('.'));

            String nomeArquivoJava = nomeClasse + ".java";
            File arquivoJava = new File(DIRETORIO + nomeArquivoJava);
            redirecionarParaArquivo(arquivoJava);

            TLangLexer lexer = new TLangLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TLangParser parser = new TLangParser(tokens);
            ParseTree tree = parser.iniciar();

            TLangTradutor tradutor = new TLangTradutor(nomeClasse, MODO_DEPURACAO);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(tradutor, tree);

            System.err.println("");
        }

        System.setOut(console);

    }
}
