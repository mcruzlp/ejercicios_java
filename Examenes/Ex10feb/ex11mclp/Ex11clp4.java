/**
 * CRUZ LÓPEZ PÉREZ
 * Ex10feb
 * 
 * Ejercicio 4
 *
 *
 *
 * @author cruz
 */
package ex11mclp;

import java.util.Scanner;

public class Ex11clp4 {

  public static void main(String[] args) {
    int[] mesa = new int[10];
    int cupo = 0;
    // Rellena las mesas de forma aleatoria.
    for (int i = 0; i < 10; i++) {
      switch (i){
        case 0:
        case 1:
        case 2:
        case 5:
        case 6:
          cupo = 4;
          break;
        case 3:
        case 4:
          cupo = 2;
          break;
        case 7:
        case 8:
          cupo = 6;
          break;
        case 9:
          cupo = 8;
          break;
        default:
      }
      mesa[i] = (int) (Math.random() * cupo);
    }
    int clientes; // número de clientes que llegan al restaurante buscando mesa
    do {// Muestra el estado de ocupación de las mesas
      System.out.println("\n┌─────────┬──────┬──────┬──────┬──────┬─────┬──────┬──────┬──────┬──────┬──────┐");
      System.out.print("│Mesa no: ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }
      System.out.println(
        "│\n├─────────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼"
          + "──────┼──────┤");
      System.out.print(
        "│Ocupación");
      for (int m : mesa) {
        System.out.printf("│ %2d/%2d ", m, cupo);
      }
      System.out.println(
        "│\n└─────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴"
          + "──────┴──────┘");
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(s.nextLine());
      if (clientes > 8 ) { // comprueba si el grupo de clientes es mayor a 8
        System.out.println("Lo siento, no admitimos grupos de más de 8");
      } else {// Busca una mesa que esté vacía.
        int iVacia = 0;
        boolean hayMesaVacia = false;
        for (int i = 9; i >= 0; i--) {
          if (mesa[i] == 0) {
            iVacia = i;
            hayMesaVacia = true;
          }
        }
        if (hayMesaVacia) {
          mesa[iVacia] = clientes; // coloca a los clientes en la mesa libre
          System.out.println("Por favor, siéntense en la mesa número "
            + "" + (iVacia + 1) + ".");
        } else {
          // Busca un hueco para todo el grupo.
          int iHueco = 0;
          boolean hayHueco = false;
          for (int i = 9; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
              iHueco = i;
              hayHueco = true;
            }
          }
          if (hayHueco) {
            mesa[iHueco] += clientes; // coloca a los clientes en el primer hueco disponible
            System.out.println("Tendrán que compartir mesa. Por favor, "
              + "siéntense en la mesa número " + (iHueco + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
        }
      }
    } while (clientes != -1);
  }
}
