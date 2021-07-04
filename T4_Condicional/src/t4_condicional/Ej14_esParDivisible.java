/*
 * Ejercicio 14
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author cruz
 *
 */
//package t4;

import java.util.Scanner;

public class Ej14_esParDivisible {

  public static void main(String[] args) {
    System.out.print("Introduce un número y te diré si es par y/o divisible entre 5: ");
    Scanner s = new Scanner(System.in);

    int num = s.nextInt();
    s.nextLine();

    if (num % 2 == 0) {
      System.out.print("Es par");
    } else {
      System.out.print("Es impar");
    }

    if (num % 5 == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }

}
