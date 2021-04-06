/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 7. digitoN: Devuelve el dígito que está en la posición n de un 
 * número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8_funciones;

import java.util.Scanner;
import misfunciones.MyMaths;

public class Ej07_digitoN {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    long numIntroducido = Long.parseLong(s.nextLine());
    
    System.out.print("Introduzca la posición que desea consultar: ");
    int posicion = Integer.parseInt(s.nextLine());

    System.out.println("El dígito de la posición elegida es: " + 
      MyMaths.posicionDigito(numIntroducido, posicion));
  }
  
}
