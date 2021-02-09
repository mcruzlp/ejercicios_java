/**
 * Ejercicio 18
 * Escribe un programa que pase de decimal a binario.
 *
 * @author cruz
 *
 */
package javaapplication24;

import java.util.Scanner;
import misfunciones.MyMaths;

public class Ej18_decimalBinario {

  public static void main(String[] args) {
    System.out.print("Introduzca el número que desea transformar a binario: ");

    Scanner s = new Scanner(System.in);
    int numDecimal = Integer.parseInt(s.nextLine());

    System.out.println(numDecimal + " = "
      + MyMaths.decimalBinario(numDecimal));

  }

  
}
