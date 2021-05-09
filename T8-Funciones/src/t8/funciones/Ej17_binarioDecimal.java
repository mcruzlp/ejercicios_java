/**
 * Ejercicio 17
 * 
 * Escribe un programa que pase de binario a decimal.
 *
 * @author cruz
 *
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej17_binarioDecimal {

  public static void main(String[] args) {
    System.out.print("Introduzca el número que desea transformar a decimal: ");
    
    Scanner s = new Scanner(System.in);
    long numIntroducido = Long.parseLong(s.nextLine());
    
    System.out.println(numIntroducido + " = " 
      + MyMaths.binarioDecimal(numIntroducido));
  }
  
}
