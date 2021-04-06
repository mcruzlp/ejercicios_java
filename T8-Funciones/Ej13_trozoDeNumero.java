/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 13. trozoDeNumero: Toma como parámetros las posiciones inicial y
 * final dentro de un número y devuelve el trozo correspondiente.
 * 
 * @author cruz
 * 
 */
package t8_funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej13_trozoDeNumero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println("El número recortado es " 
      /*+ MyMaths.trozoDeNumero(numIntroducido)*/);
  }
  
}
