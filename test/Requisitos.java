/*
 * Codigo traduzido de TLang para Java
 * Universidade Anhembi Morumbi
 * Curso de Ciencia da Computacao - 2018/2022
*/

import java.util.Scanner;

public class Requisitos {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {
        double n = 3;
        boolean ok = true;
        String t = "Olah mundo!";

    if (n == 2) {
      ok = false;

    } else if (n == 1) {
      n = 5;

    } else {
      n = 6;

    }
    while (n == 6) {

      System.out.println("Me deh um numero diferente de 6: ");
      n = ler.nextDouble(); ler.nextLine();

    }
    for (double x = 0; x<=n; x++) {

      System.out.println(x);

    }    n = n + 1.6 - 190.323524 + 3.2;
  }
}
