/*
 * 
 * Ejercicio 7
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un número 
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 */
package t5;

import java.util.Scanner;

public class Ej7_comb {
  public static void main(String[] args) {
    int comb_correcta = 9876;
    int intentos = 1;
    System.out.print("Introduzca una combinación de 4 cifras: ");
    Scanner s = new Scanner(System.in);
    int codigo = Integer.parseInt(s.nextLine());
      
    while (codigo != comb_correcta && intentos < 4){
      intentos++;
      System.out.println("Lo siento, esa no es la combinación");
      System.out.printf("Intento nº %d \n", intentos);
      System.out.print("Introduzca una combinación de 4 cifras: ");
      codigo = Integer.parseInt(s.nextLine());
    }
    if (codigo != comb_correcta && intentos == 4){
      System.out.println("La caja fuerte se ha bloqueado.");
    }
    if (codigo == comb_correcta){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    }
  }
}
