/*
 * Ejercicio 3
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la 
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author cruz
 *
 */
package t6;

public class Ej03_carta_española {

  public static void main(String[] args) {
    int numCarta = (int) (Math.random() * 10 + 1);

    switch (numCarta) {
      case 1:
        System.out.println("As");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        System.out.print(numCarta);
        break;
      case 8:
        System.out.print("Sota");
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      default:
    }

    int paloCarta = (int) (Math.random() * 4);

    switch (paloCarta) {
      case 0:
        System.out.printf(" de Oros\n");
        break;
      case 1:
        System.out.printf(" de Copas\n");
        break;
      case 2:
        System.out.printf(" de Espadas\n");
        break;
      case 3:
        System.out.printf(" de Bastos\n");
        break;
      default:
    }
  }

}
