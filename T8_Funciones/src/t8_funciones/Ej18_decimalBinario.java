/**
 * Ejercicio 18
 * Escribe un programa que pase de decimal a binario.
 *
 * @author cruz
 *
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej18_decimalBinario {

  public static void main(String[] args) {
    System.out.print("Introduzca el número que desea transformar a binario: ");

    Scanner s = new Scanner(System.in);
    int numDecimal = Integer.parseInt(s.nextLine());

    System.out.println(numDecimal + "(10  = "
      + MyMaths.decimalBinario(numDecimal) + "(2");

  }
}
