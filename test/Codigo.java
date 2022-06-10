import java.util.Scanner;

public class Codigo {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    boolean __yes = true && false || (x > y) || (2 + 2 >= 4);
    boolean no__ =  !__yes;
    double z = 10;
    double x;
    x = 5.45;
    double minhaVariavel = 1 - 34 * 2 + 2 / 3;
    double minhaNovaVariavel = x;
    String meuTexto = "Ola, eu sou uma longa cadeia de caracteres\n com mais de uma linha" + "mais um trecho" + "outro trecho";
    boolean ok = true;
    if (x == 3) {
      minhaVariavel = 3.34;

    } else {
      minhaVariavel = 4;

    }

    if (x == 3) {
      minhaVariavel = 3.2;
      minhaNovaVariavel = 4;

    } else if (x == 4) {
      minhaVariavel = -4.67;
      if (ok == true) {
        minhaNovaVariavel = 20;
        String meuNovoTexto = "isto eh um novo texto";
        boolean meuValorBooleano = false && true || ( !false &&  !true) && (false == true);
        double istoEhUmNumero = 34.78;

      }

    }
 else if (x == 5) {
      minhaVariavel = 5.72;

    }
 else {
      minhaVariavel = 10;
      minhaNovaVariavel = 20;
      String meuNovoTexto = "isto eh um novo texto" + "novo escopo";
      boolean meuValorBooleano = false;
      double istoEhUmNumero = 34.78 + (34 * 2 / 5);

    }

    while (x < 5) {
      x = 5;
      minhaNovaVariavel = -30.4;

    }
    System.out.println("De 50 a -1");
    for (int x = 50; x >= -1; x--) {
      System.out.println(x);
      minhaNovaVariavel = 60.14567;

    }
    System.out.println("De -10 a 100");
    for (int x = -10; x <= 100; x++) {
      System.out.println(x);
      minhaNovaVariavel = 60.14567;

    }

  }
}
