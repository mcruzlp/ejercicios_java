/*
 * Ejercicio 13
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author cruz
 *
 */
//package t4.condicional;

import java.util.Scanner;

public class Ej13_ordenar {

  public static void main(String[] args) {
    System.out.print("Introduzca 3 números enteros separados por espacios: ");
    Scanner s = new Scanner(System.in);

    int num1;
    int num2;
    int num3;

    int numIntroducido1 = s.nextInt();
    num1 = numIntroducido1;

    int numIntroducido2 = s.nextInt();

    if (numIntroducido2 < numIntroducido1) {
      num1 = numIntroducido2;
      num2 = numIntroducido1;
    } else {
      num2 = numIntroducido2;
    }

    int numIntroducido3 = s.nextInt();

    if (numIntroducido3 < numIntroducido2) {
      if (numIntroducido3 < numIntroducido1) {
        num3 = num2;
        num2 = num1;
        num1 = numIntroducido3;
      } else {
        num3 = num2;
        num2 = numIntroducido3;
      }
    } else {
      num3 = numIntroducido3;
    }
    System.out.println("Ordenados de menor a mayor: " + num1 + " " + num2 + " " + num3);
  }
}
