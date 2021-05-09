/**
 * Ejercicio 18
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author cruz
 *
 */
package t4.condicional;

import java.util.Scanner;

public class Ej18_primeraCifra {

  public static void main(String[] args) {
    System.out.print("Introduzca un número entero de 5 cifras como máximo: ");

    Scanner s = new Scanner(System.in);

    int primeraCifra = 0;
    int cuantasCifras = 1;
    boolean numOK = true;

    do {
      int numIntroducido = Integer.parseInt(s.nextLine());
      int num = numIntroducido; //copia del número introducido por el usuario
      if (num < 10) {
        System.out.println("La primera cifra es: " + num);
      } else {
        while (num >= 10) {
          num /= 10;
          cuantasCifras++;
          primeraCifra = num;
        }
        if (cuantasCifras <= 5) {
          System.out.println("La primera cifra es: " + primeraCifra);
        } else {
          System.out.print("Lo siento, el número no es válido, inténtelo de nuevo:");
          numOK = false;
        }
      }
    } while (!numOK);
  }
}
