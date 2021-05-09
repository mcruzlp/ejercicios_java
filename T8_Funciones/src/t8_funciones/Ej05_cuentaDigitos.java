/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 5. digitos: Cuenta el número de dígitos de un número entero.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej05_cuentaDigitos {

  public static void main(String[] args) {
    System.out.println("Introduzca un número: ");
    
    Scanner s = new Scanner(System.in);
    long num = Long.parseLong(s.nextLine());
    System.out.println("El número tiene " + MyMaths.cuentaDigitos(num) + " dígitos.");
  }
  
}
