/*
 * Ejercicio 11
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej11_cuadradoCubo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");
    int numIntroducido = Integer.parseInt(s.nextLine());
    int num = numIntroducido;

    System.out.print("Número\t"); //columna 1
    System.out.print("Número^2\t");//columna 2
    System.out.print("Número^3");//columna 3
    System.out.println();

    for (int filas = 0; filas < 5; filas++) {
      num++;
      System.out.print(num + "\t"); //columna 1
      System.out.print(num * num + "\t\t");//columna 2
      System.out.print(num * num * num + "\t");//columna 3
      System.out.println();
    }
  }

}
