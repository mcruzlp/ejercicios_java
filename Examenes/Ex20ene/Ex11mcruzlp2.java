/*
 * Problema 2
 * @author cruz
 *
 */
package corrigiendo;

import java.util.Scanner;

public class Ex11mcruzlp2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int numIntroducido = Integer.parseInt(s.nextLine());

    int numRecortado = numIntroducido;
    int primerDigito;
    int numDigitos = 1;
    int numDivisiones;

    System.out.println("El número introducido en morse es: ");

    do {
      //valor del primer dígito y número de dígitos.
      while (numRecortado > 10) {
        numRecortado = numRecortado / 10;
        numDigitos++;
      }
      numDivisiones = numDigitos;
      primerDigito = numRecortado;

      switch (primerDigito) {
        case 0:
          System.out.print("_ _ _ _ _  ");
          break;
        case 1:
          System.out.print(". _ _ _ _  ");
          break;
        case 2:
          System.out.print(". . _ _ _  ");
          break;
        case 3:
          System.out.print(". . . _ _  ");
          break;
        case 4:
          System.out.print(". . . . _  ");
          break;
        case 5:
          System.out.print(". . . . .  ");
          break;
        case 6:
          System.out.print("_ . . . .  ");
          break;
        case 7:
          System.out.print("_ _ . . .  ");
          break;
        case 8:
          System.out.print("_ _ _ . .  ");
          break;
        case 9:
          System.out.print("_ _ _ _ .  ");
          break;
        default:
      }

      int potencia = 1;
      for (int i = 0; i < numDivisiones - 1; i++) {
        potencia = potencia * 10;
      }

      numRecortado = numIntroducido - primerDigito * potencia;
      numDigitos--;
    } while (numDigitos != 0);
  }
}
