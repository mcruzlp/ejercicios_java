/*
 * Ejercicio 10
 *
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos 
 * cuando meta un número negativo.
 * 
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej10_media {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int num;
    int suma = 0;
    int cont = 0;
    
    do{
      
      System.out.print("Introduzca un número > 0 (o < 0 para salir): ");
      num = Integer.parseInt(s.nextLine());
      if (num > 0){
        suma = suma + num;
        cont++;
      }
      
    }while (num >= 0);
    
    System.out.printf("\nLa media es: %d\n",suma/cont);
  }
}