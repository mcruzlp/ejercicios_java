/**
 * Ejercicio 18
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej18_primeraCifra {

  public static void main(String[] args) {
    System.out.println("Introduzca un número entero de 5 cifras como máximo: ");

    Scanner s = new Scanner(System.in);

    int numIntroducido = Integer.parseInt(s.nextLine());

    int num = numIntroducido; //copia del número introducido por el usuario

    int primeraCifra;

    if (num < 10) {
      primeraCifra = num;
    } else {
      while (num >= 10) {
        num /= 10;
      }
      primeraCifra = num;
    }

    System.out.println("La primera cifra es: " + primeraCifra);
  }

}
