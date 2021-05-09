/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 14. juntaNumeros: Pega dos números para formar uno.
 * 
 * @author cruz
 * 
 */
package t8_funciones;

import java.util.Scanner;
import  misfunciones.MyMaths;

public class Ej14_juntaNumeros {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int num1 = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca otro número: ");
    int num2 = Integer.parseInt(s.nextLine());
    
    System.out.println("El número final es "
      + MyMaths.juntaNumeros(num1,num2));
  }
  
}
