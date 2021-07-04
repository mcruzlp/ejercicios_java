/**
 * Ejercicio 20
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author cruz
 *
 */
//package t4.condicional;

import java.util.Scanner;

public class Ej20_capicua {

  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo de hasta 5 cifras: ");

    Scanner s = new Scanner(System.in);

    int primeraCifra = 0;
    int ultimaCifra = 0;
    int cuantasCifras = 1;
    boolean numOK = true;

    do {
      int numIntroducido = Integer.parseInt(s.nextLine());
      int cuentaCifras = numIntroducido; // copia del número introducido
      int num = numIntroducido;

      while (cuentaCifras >= 10) {
        cuentaCifras /= 10;
        cuantasCifras++;
      }

      if (cuantasCifras > 5) {
        System.out.print("Lo siento, el número no es válido, inténtelo de nuevo:");
        numOK = false;
      } else {
        if (num < 10) {// los números de una cifra son capicúas también.
          System.out.printf("El %d es capicúa\n", numIntroducido);
        } else { // numComparaciones = cuantasCifras/2;
          while (num >= 10) {
            num /= 10;
            ultimaCifra = numIntroducido - num * 10;
            cuantasCifras++;
            primeraCifra = num;
            if (primeraCifra != ultimaCifra) {
              System.out.printf("El %d no es capicúa\n", numIntroducido);
              num = 0;
            }
          }
          if (num != 0) {
            System.out.printf("El %d es capicúa\n", numIntroducido);
          }
        }
      }
    } while (!numOK);
  }
}
