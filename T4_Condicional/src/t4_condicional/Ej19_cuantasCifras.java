/**
 * Ejercicio 19
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author cruz
 *
 */
//package t4.condicional;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Ej19_cuantasCifras {

  public static void main(String[] args) {
    System.out.print("Introduzca un número entero de 5 cifras como máximo: ");

    Scanner s = new Scanner(System.in);

    int cuantasCifras = 1;
    boolean numOK = true;

    do {
      int numIntroducido = Integer.parseInt(s.nextLine());
      int num = abs(numIntroducido); // copia del número introducido

      while (num >= 10) {
        num /= 10;
        cuantasCifras++;
      }
      if (cuantasCifras <= 5) {
        System.out.printf("El número tiene %d cifra(s)\n", cuantasCifras);
      } else {
        System.out.print("Lo siento, el número no es válido, inténtelo de nuevo:");
        numOK = false;
      }

    } while (!numOK);
  }
}
