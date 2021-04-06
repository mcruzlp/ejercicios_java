/*
 * Cruz López Pérez
 * 18/11/2020
 *
 */
package ex11mcruzlp;

import java.util.Scanner;

public class Ex11mcruzlp1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int altura;
    boolean datosValidos;
    
    do {
      datosValidos = true;
      System.out.print("Por favor, introduzca la altura: ");
      altura = Integer.parseInt(s.nextLine());
    
      if (altura < 3 || altura % 2 == 0){
        datosValidos = false;
        System.out.println("Lo siento, ese número no es válido");
        System.out.println("Introduzca un número impar mayor o igual que 3: ");
      }
    }while(!datosValidos);
    
    //Parte superior
    System.out.println("*    *   ****   *        ****");
    
    //Parte superior variable
    for (int i = 0; i < (altura-3)/2; i++){
      System.out.println("*    *  *    *  *       *    *");
    }
    
    //Parte central
    System.out.println("******  *    *  *       ******");
    
    //Parte inferior variable
    for (int i = 0; i < (altura-3)/2; i++){
        System.out.println("*    *  *    *  *       *    *");
    }
    
    //Parte inferior
    System.out.println("*    *   ****   ******  *    *");
  }
}
