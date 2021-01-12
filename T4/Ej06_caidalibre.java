/*
 * Ejercicio 6
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√(2h/g) siendo g = 9,81m/s2
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej06_caidalibre {

  public static void main(String[] args) {
    System.out.print("Introduzca la altura desde la que cae el objeto: ");
    Scanner s = new Scanner(System.in);
    double h = Double.parseDouble(s.nextLine());
    double g = 9.81;
    double t = Math.sqrt(2*h/g);
    System.out.printf("El objeto tardará %.2f segundos en llegar al suelo.\n",t);
  }
}
