/**
 * Ejercicio 20
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * Ejemplo:
 * Por favor, indique la capacidad de la cuba en litros: 3
 * 
 *  *    *
 *  *====*
 *  *====*
 *  ******
 * 
 * La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *
 * @author cruz
 *
 */
package t6;

import java.util.Scanner;

public class Ej20_cuboAgua {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    
    int capacidad = Integer.parseInt(s.nextLine());
    int cantidad = (int) (Math.random() * capacidad+1);
    
    for (int i = capacidad; i > 0; i--){ //alto de la cuba según su capacidad
      System.out.print("*");
      for (int j = 1; j < 6; j++){//ancho de la cuba constante
        if (i <= cantidad){
          System.out.print("=");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }
    System.out.println("*******");
    System.out.printf("La cuba tiene una capacidad de %d litros y "
      + "contiene %d litros de agua.\n", capacidad, cantidad);
  }
  
}
