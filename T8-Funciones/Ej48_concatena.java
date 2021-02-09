/**
 * Ejercicio 48
 * Define la función concatena con la siguiente cabecera:
 * public static int[] concatena(int[] a, int[] b)
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
 * concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 *
 * @author cruz
 *
 */
package javaapplication24;

import java.util.Scanner;
import static misfunciones.Arrays.pintaArray;
import static misfunciones.Arrays.concatena;

public class Ej48_concatena {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca la longitud del primer array: ");
    int long1Array = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca los valores del primer array: ");
    int[] a = new int[long1Array];
    for (int i = 0; i < long1Array; i++) {
      a[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("");

    System.out.println("Introduzca la longitud del segundo array: ");
    int long2Array = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca los valores del segundo array: ");
    int[] b = new int[long2Array];
    for (int i = 0; i < long2Array; i++) {
      b[i] = Integer.parseInt(s.nextLine());
    }

    System.out.println("El array resultante es: ");
    pintaArray(concatena(a,b));

  }

}
