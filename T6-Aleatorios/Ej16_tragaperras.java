/**
 * Ejercicio 16
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * Ejemplo 1:
 * diamante diamante limón
 * Bien, ha recuperado su moneda
 * Ejemplo 2:
 * herradura campana diamante
 * Lo siento, ha perdido
 * Ejemplo 3:
 * corazón corazón corazón
 * Enhorabuena, ha ganado 10 monedas
 *
 *
 * @author cruz
 *
 */
package t6;

import java.util.Scanner;

public class Ej16_tragaperras {

  public static void main(String[] args) {
    System.out.println("JUEGA A JACKPOT");
    System.out.println("Pulse Enter para comenzar.");

    Scanner s = new Scanner(System.in);
    s.nextLine();

    int heart = 0;
    int diamond = 0;
    int horseshoe = 0;
    int bell = 0;
    int lemon = 0;

    System.out.print("El resultado de la tirada es");
    System.out.print(".");
    System.out.print(".");
    System.out.println(".");
    System.out.println("");

    for (int i = 0; i < 3; i++) {

      int fig = (int) (Math.random() * 5);

      switch (fig) {

        case 0:
          System.out.print("corazón   ");
          heart++;
          break;
        case 1:
          System.out.print("diamante    ");
          diamond++;
          break;
        case 2:
          System.out.print("herradura   ");
          horseshoe++;
          break;
        case 3:
          System.out.print("campana   ");
          bell++;
          break;
        case 4:
          System.out.print("limón   ");
          lemon++;
          break;
        default:
      }
    }
    System.out.println("");
    System.out.println("");
    if (heart == 3 || diamond == 3 || horseshoe == 3 || bell == 3 || lemon == 3) {
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    } else if (heart == 2 || diamond == 2 || horseshoe == 2 || bell == 2 || lemon == 2) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento, ha perdido");
    }
  }
}
