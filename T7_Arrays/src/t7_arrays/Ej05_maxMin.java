import java.util.Scanner;

/*
 * Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 *
 * @author cruz
 *
 */

public class Ej05_maxMin {
  public static void main(String[] args) {
    int[] numero = new int[15];

    System.out.println("Introduzca 10 números: ");
    Scanner s = new Scanner(System.in);

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i <= 9; i++) {
      numero[i] = Integer.parseInt(s.nextLine());
      
      if (numero[i] >= max) {
        max = numero[i];
      }
      if (numero[i] <= min) {
        min = numero[i];
      }
    }

    System.out.println();
    
    for (int i = 0; i <= 9; i++) {
      System.out.print(numero[i]);
      if (numero[i] == max){
        System.out.println("\tMáximo");
      } else if (numero[i] == min){
        System.out.println("\tMinimo");
      } else {
        System.out.println();
      }
    }
  }
}
