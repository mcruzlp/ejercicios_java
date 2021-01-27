/**
 * Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.

 * Ejercicio 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 *
 * @author cruz
 *
 */
package t8_funciones;

import java.util.Scanner;
import static misfunciones.Matemáticas.esPrimo;

public class Ej2_esPrimo {

  public static void main(String[] args) {
    System.out.println("Introduzca el número que desea comprobar si es primo: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(esPrimo(numIntroducido));
    
  }

}
