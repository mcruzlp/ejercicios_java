/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 10. quitaPorDelante: Le quita a un número n dígitos por delante 
 * (por la izquierda).
 * 
 * @author cruz
 * 
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej10_quitaPorDelante {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    long numIntroducido = Long.parseLong(s.nextLine());
    
    System.out.print("Introduzca cuántos dígitos quiere quitarle al número: ");
    int digitosFuera = Integer.parseInt(s.nextLine());
    
    System.out.println("El número recortado es "
      + MyMaths.quitaPorDelante(numIntroducido,digitosFuera));
  }
  
}
