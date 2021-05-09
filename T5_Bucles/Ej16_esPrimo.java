/**
 * Ejercicio 16
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author cruz
 *
 */
package T5_bucles;

import java.util.Scanner;

public class Ej16_esPrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    
    boolean esPrimo = true;
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        esPrimo = false;
      }
    }
    if(esPrimo){
      System.out.printf("El %d es primo.\n",num);
    } else System.out.printf("El %d no es primo.\n",num);
  }
  
}
