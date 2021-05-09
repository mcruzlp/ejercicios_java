/*
 * Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 *
 * @author cruz
 *
 */



import java.util.Scanner;

public class Ej03_ordenInverso {
  public static void main(String[] args) {
    int[] num = new int[10];

    System.out.println("Introduzca 10 números: ");
    Scanner s = new Scanner(System.in);
    for (int i = 0; i <= 9; i++) {
      num[i] = Integer.parseInt(s.nextLine());
    }
    /*for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + " ");
    }*/

    for (int i = 9; i >= 5; i--) {
      int aux = num[9-i];
      num[9-i] = num[i];
      num[i] = aux;
    }

    System.out.print("\nLos números en orden inverso son: ");
    for (int i = 0; i <= 9; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
