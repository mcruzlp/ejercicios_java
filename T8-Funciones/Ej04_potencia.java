/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8_funciones;

import java.util.Scanner;
import static misfunciones.MyMaths.potencia;

public class Ej04_potencia {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Introduzca la base y el exponente de la potencia: ");
    
    Scanner s = new Scanner(System.in);
    double base = Double.parseDouble(s.nextLine());
    double exp = Double.parseDouble(s.nextLine());
    
    System.out.println(potencia(base,exp));
  }
  
}
