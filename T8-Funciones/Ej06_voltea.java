/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 6. voltea: Le da la vuelta a un número.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8_funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej06_voltea {

  public static void main(String[] args) {
     System.out.println("Introduzca el número al que desea darle la vuelta: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(MyMaths.voltea(numIntroducido));
  }
  
}
