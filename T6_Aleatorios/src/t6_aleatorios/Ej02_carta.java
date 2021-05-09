/*
 * Ejercicio 2
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, 
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A 
 * (que sería el 1).
 * 
 * @author cruz
 */
package t6;

public class Ej02_carta {

  public static void main(String[] args) {

    int numCarta = (int) (Math.random() * 13 + 1);

    switch (numCarta) {
      case 1:
        System.out.println("A");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.print(numCarta);
      break;
      case 11:
        System.out.print("J");
      break;
      case 12:
        System.out.print("Q");
      break;
      case 13:
        System.out.print("K");
      break; 
      default:
    }
    
    int paloCarta = (int) (Math.random() * 4);
    
    switch (paloCarta) {
      case 0:
        System.out.printf(" de Picas\n");
        break;
      case 1:
        System.out.printf(" de Corazones\n");
        break;
      case 2:
        System.out.printf(" de Tréboles\n");
        break;
      case 3:
        System.out.printf(" de Diamantes\n");
        break;
        default:
    }
  }

}
