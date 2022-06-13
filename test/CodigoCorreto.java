/*
 * Codigo traduzido de TLang para Java
 * Universidade Anhembi Morumbi
 * Curso de Ciencia da Computacao - 2018/2022
*/

import java.util.Scanner;

public class CodigoCorreto {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Olah, este eh um programa escrito em TLang");

    System.out.println("Por favor, forneca um numero qualquer:");
        double inicio = ler.nextDouble(); ler.nextLine();

    System.out.println("Por favor, forneca um outro numero qualquer maior ou igual ao primeiro:");
        double fim = ler.nextDouble(); ler.nextLine();

    System.out.println("Você deseja imprimrir os numeros nesse intervalo? (true/false)");
        boolean sim = ler.nextBoolean(); ler.nextLine();

    System.out.println("Por favor, escreva uma frase como mensagem final:");
        String mensagem = ler.nextLine();

    if (sim) {

      System.out.println("Como voce quis imprimir os números do intervalo, aih vao eles:");

      for (double i = inicio; i<=fim; i++) {

        System.out.println(i);

      }
    } else {

      System.out.println("Como voce nao quis imprimir os números do intervalo, escrevemos sua mensagem final o mesmo numero de vezes:");

      for (double i = inicio; i<=fim; i++) {

        System.out.println(mensagem);

      }
    }  }
}
