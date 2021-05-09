/*
 * Ejercicio 8
 * 
 * Muesta la tabla de multiplicar de un número introducido por teclado.
 *
 *@author cruz
 */
package t5.bucles;

import java.util.Scanner;

public class Ej08_tabla {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número del que quiera mostrar la tabla: ");
    int numero = Integer.parseInt(s.nextLine());
    int i;
    
    System.out.printf("\nTabla del %2d\n\n", numero);
    
    for (i = 0; i <=10 ; i++){
      System.out.printf("%2d x %2d = %2d\n", numero, i, numero*i);
    }
  }
}
