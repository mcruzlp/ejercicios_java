/*
 * Ejercicio 6
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
 * muestra el contenido del array.
 *
 * @author cruz
 *
 */
package t7;

import java.util.Scanner;

public class Ej06_rotar {

  public static void main(String[] args) {

    int[] elementos = new int[15];

    System.out.println("Introduzca 15 números: ");
    Scanner s = new Scanner(System.in);
    for (int i = 0; i <= 14; i++) {
      elementos[i] = Integer.parseInt(s.nextLine());
    }
    System.out.print("Los números introducidos son: ");
    // System.out.println(Arrays.toString(elementos));
    for (int i = 0; i <= 14; i++) {
      System.out.print(elementos[i] + " ");
    }

    // int ultimo = elementos[14];
    for (int i = 0; i < 14; i++) {
      int aux = elementos[i + 1];
      elementos[i + 1] = elementos[i];
      elementos[i] = aux;
    }
    // elementos [0] = ultimo;

    System.out.print("\nLos números rotados son: ");
    for (int i = 0; i <= 14; i++) {
      System.out.print(elementos[i] + " ");
    }
    System.out.println();
  }
}
