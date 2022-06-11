/*
 * Codigo traduzido de TLang para Java
 * Universidade Anhembi Morumbi
 * Curso de Ciencia da Computacao - 2018/2022
*/

import java.util.Scanner;

public class Codigo {
  // Escopo -> 1

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {
    // Escopo -> 2
    // declaracao -> simb: __yes, tipo: booleano
    boolean __yes = true && false || (x > y) || (2 + 2 >= 4);
    // declaracao -> simb: no__, tipo: booleano
    boolean no__ =  !__yes;
    // declaracao -> simb: z, tipo: numero
    double z = 10;
    // declaracao -> simb: x, tipo: numero
    double x;
    x = 5.45;
    // declaracao -> simb: minhaVariavel, tipo: numero
    double minhaVariavel = 1 - 34 * 2 + 2 / 3;
    // declaracao -> simb: minhaNovaVariavel, tipo: numero
    double minhaNovaVariavel = x;
    // declaracao -> simb: meuTexto, tipo: texto
    String meuTexto = "Ola, eu sou uma longa cadeia de caracteres\n com mais de uma linha" + "mais um trecho" + "outro trecho";
    // declaracao -> simb: ok, tipo: booleano
    boolean ok = true;

    if (x == 3) {
      // Escopo -> 3
      minhaVariavel = 3.34;

    } else {
      // Escopo -> 3
      minhaVariavel = 4;

    }
    if (x == 3) {
      // Escopo -> 3
      minhaVariavel = 3.2;
      minhaNovaVariavel = 4;

    } else if (x == 4) {
      // Escopo -> 3
      minhaVariavel = -4.67;

      if (ok == true) {
        // Escopo -> 4
        minhaNovaVariavel = 20;
        // declaracao -> simb: meuNovoTexto, tipo: texto
        String meuNovoTexto = "isto eh um novo texto";
        // declaracao -> simb: meuValorBooleano, tipo: booleano
        boolean meuValorBooleano = false && true || ( !false &&  !true) && (false == true);
        // declaracao -> simb: istoEhUmNumero, tipo: numero
        double istoEhUmNumero = 34.78;

        /*
         * REMOVENDO IDS ESCOPO: 4
         * meuValorBooleano@4 -> BOOLEANO
         * meuNovoTexto@4 -> TEXTO
         * istoEhUmNumero@4 -> NUMERO
         */

      }
    } else if (x == 5) {
      // Escopo -> 3
      minhaVariavel = 5.72;

    } else {
      // Escopo -> 3
      minhaVariavel = 10;
      minhaNovaVariavel = 20;
      // declaracao -> simb: meuNovoTexto, tipo: texto
      String meuNovoTexto = "isto eh um novo texto" + "novo escopo";
      // declaracao -> simb: meuValorBooleano, tipo: booleano
      boolean meuValorBooleano = false;
      // declaracao -> simb: istoEhUmNumero, tipo: numero
      double istoEhUmNumero = 34.78 + (34 * 2 / 5);

      /*
       * REMOVENDO IDS ESCOPO: 3
       * meuValorBooleano@3 -> BOOLEANO
       * istoEhUmNumero@3 -> NUMERO
       * meuNovoTexto@3 -> TEXTO
       */

    }
    while (x < 5) {
      // Escopo -> 3
      x = 5;
      minhaNovaVariavel = -30.4;

    }
    System.out.println("De 50 a -1");

    for (int x = 50; x >= -1; x--) {
      // Escopo -> 3

      System.out.println(x);
      minhaNovaVariavel = 60.14567;

    }
    System.out.println("De -10 a 100");

    for (int x = -10; x <= 100; x++) {
      // Escopo -> 3

      System.out.println(x);
      minhaNovaVariavel = 60.14567;

    }
    /*
     * REMOVENDO IDS ESCOPO: 2
     * minhaNovaVariavel@2 -> NUMERO
     * meuTexto@2 -> TEXTO
     * ok@2 -> BOOLEANO
     * x@2 -> NUMERO
     * __yes@2 -> BOOLEANO
     * z@2 -> NUMERO
     * minhaVariavel@2 -> NUMERO
     * no__@2 -> BOOLEANO
     */
  }
  // Escopo -> 1
}
