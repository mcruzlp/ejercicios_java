/*
 * Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 * 
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej12_fibonacci {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca cuántos términos quiere: ");
    int numTerminos = Integer.parseInt(s.nextLine());

    int primerTermino = 0;
    int segundoTermino = 1;

    System.out.printf("\nSecuencia de Fibonacci de %d términos: ", numTerminos);

    System.out.print(primerTermino + " ");
    System.out.print(segundoTermino + " ");

    do {

      int nTermino = primerTermino + segundoTermino;
      System.out.print(nTermino + " ");

      primerTermino = segundoTermino;
      segundoTermino = nTermino;

      numTerminos--;
    } while (numTerminos-2 > 0);
    
    System.out.println();

  }

}
