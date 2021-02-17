/**
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 *
 * @author cruz
 *
 */
package T5_bucles;

import java.util.Scanner;

public class Ej18_de7en7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int num1 = Integer.parseInt(s.nextLine());
    
    boolean check;
    int num2;


    do { //comprueba que el 2º número es != del 1º
      check = true;

      System.out.print("Introduzca otro número: ");
      num2 = Integer.parseInt(s.nextLine());

      if (num2 == num1) {
        System.out.println("Lo siento. El 2º número debe ser distinto del 1º.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);
    
    if (num2 < num1){ //pone en primer lugar el más pequeño
    
      int aux = num1;
      num1 = num2;
      num2 = aux;
    
    }
    
    System.out.println("Los números que se encuentran entre los dos introducidos"
      + " contando de 7 en 7 son: ");
    
    for (int i = num1; i <= num2; i += 7) {
      System.out.print(i + " ");
    }
  }
  
}
