/**
 * Ejercicio 17
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author cruz
 *
 */
package t4.condicional;

import java.util.Scanner;

public class Ej17_ultimaCifra {

  public static void main(String[] args) {
    System.out.println("Introduzca un número entero: ");

    Scanner s = new Scanner(System.in);

    int numIntroducido = Integer.parseInt(s.nextLine());

    int num = numIntroducido; //copia del número introducido por el usuario

    int ultimaCifra;

    if (num < 10) {
      ultimaCifra = num;
    } else {
      num /= 10;
      ultimaCifra = numIntroducido - num*10;
    }

    System.out.println("La última cifra es: " + ultimaCifra);
  }

}
