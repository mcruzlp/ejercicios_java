/**
 * Ejercicio 14
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * 
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej14_potencia {

  public static void main(String[] args) {
    System.out.println("Introduzca una base y un exponente (entero positivo)"
      + " para calcular la potencia: ");

    Scanner s = new Scanner(System.in);

    int base = Integer.parseInt(s.nextLine());
    int exp = Integer.parseInt(s.nextLine());
    
    int potencia = 1;
    
    for (int i = 0; i < exp; i++){
      potencia *= base;
    }
    
    System.out.println("La potencia resultante es: " + potencia);
    
  }
  
}
