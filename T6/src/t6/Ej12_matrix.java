/*
 * Ejercicio 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios
 * (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting 
 * con (char) para convertir un entero en un carácter.
 *
 * @author cruz
 *
 */
package t6;

public class Ej12_matrix {

  public static void main(String[] args) {
    while(true){
      for (int anchoPantalla = 0; anchoPantalla <= 80; anchoPantalla++){
      System.out.print("\033[32m" + (char)(Math.random() * (126 - 32 + 1) + 32));
      }
      System.out.println();
    }
  }
}
