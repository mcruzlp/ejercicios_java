/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 1. esCapicua: Devuelve verdadero si el número que se pasa como 
 * parámetro es capicúa y falso en caso contrario.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej01_esCapicua {

  public static void main(String[] args) {
    System.out.print("Introduzca el número que desea comprobar si es capicua: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(MyMaths.esCapicua(numIntroducido));
  }
  
}
