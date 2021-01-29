/**
 * Ejercicio 17
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * Ejemplo:
 * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 * Ahora introduzca la anchura (como mínimo 4): 7
 * 
 *    * * * * * * *
 *    *           *  
 *    *       &   *
 *    * * * * * * *
 * 
 * 
 * @author cruz
 *
 * 
 */
package t6;

import java.util.Scanner;

public class Ej17_pecera {

  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Por favor, introduzca la altura de la "
      + "pecera (como mínimo 4): ");
    
    int alto = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    
    int ancho = Integer.parseInt(s.nextLine());
    
    // parte alta
    
    for (int i = 0; i < ancho; i++){
      System.out.print("* ");
    }
    System.out.println("");
    
    // parte central
    int pez = (int)(Math.random() * (ancho-1));
    for (int i = 1; i < alto-1; i++){
      System.out.print("* ");
      for (int j = 1; j < ancho-1; j++){
        if(pez == j){
          System.out.print("& ");
          pez = 0;
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("* ");
      System.out.println("");
    }
    
    // parte baja
    
    for (int i = 0; i < ancho; i++){
      System.out.print("* ");
    }
    System.out.println("");
  }
  
}
