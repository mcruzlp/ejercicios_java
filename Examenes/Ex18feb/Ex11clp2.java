/**
 * CRUZ LÓPEZ PÉREZ
 * Ex18Feb
 *
 * Ejercicio 1
 *
 * @author cruz
 *
 */
package ex11clp;

import java.util.Scanner;

public class Ex11clp2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int espacios = altura - 1;
    int anchura = 1;
    
    for (int i = 1; i < altura; i++) {
      System.out.println(linea(espacios--, ' ') + linea(anchura, '*'));
      anchura += 2;
    }
    
    System.out.println(linea(anchura, '*'));
    
  }

  public static String linea(int longitud) {
    String resultado = "";

    for (int i = 1; i <= longitud; i++) {
      resultado += "*";
    }

    return resultado;
  }

  public static String linea(int longitud, char caracter) {
    String resultado = "";

    for (int i = 1; i <= longitud; i++) {
      resultado += caracter;
    }

    return resultado;
  }

}
