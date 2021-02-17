/**
 * Ejercicio 15
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y
 * el 5, se deberán mostrar 2exp1, 2exp2, 2exp3, 2exp4 y 2exp5.
 *
 * @author cruz
 *
 */
package T5_bucles;

import java.util.Scanner;

public class Ej15_potenciaFactorial {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número real para la base: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un número natural para el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    
    for (int i = 1; i <= exponente; i++) {
      System.out.print(base + "exp" + i + " ");
    }
  }
  
}
