/**
 * CRUZ LÓPEZ PÉREZ
 * Ex10feb
 *
 * Ejercicio 3
 *
 *
 *
 * @author cruz
 */
package ex11mclp;

import java.util.Scanner;

public class Ex11clp3 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la pirámide:");
    int altura = Integer.parseInt(s.nextLine());

    char extremo = '*';
    char relleno = ' ';
    int longitud;

    for (int i = altura; i > 1; i--) {
      for (int j = 0; j < i - 1; j++) {
        System.out.print(" ");
      }
      longitud = i;
      String linea = "" + extremo;
      if (longitud == 0) {
        System.out.println(linea);
      } else {
        for (int k = 0; k < longitud; k++) {
          linea += relleno;
        }
        linea += extremo;
        System.out.println(linea);
      }
    }
  }

  public static String linea(int longitud, char extremo, char relleno) {
    
    String linea = "" + extremo;
    if (longitud == 0){
      return linea;
    } else {
      for (int i = 0; i < longitud; i++) {
        linea += relleno;
      }
      linea += extremo;
      return linea;
    }
  }
  
}
