/**
 * CRUZ LÓPEZ PÉREZ
 * Ex18Feb
 *
 * Ejercicio 1
 *
 * @author cruz
 *
 */
package ex11clp;

import java.util.Scanner;

public class Ex11clp1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] mesa = new int[10];
    //CAPACIDAD DE LAS MESAS
    //también se pueden rellenar con un switch pero es más rápido de esta forma.
    mesa[0]= 4;
    mesa[1]= 4;
    mesa[2]= 4;
    mesa[3]= 2;
    mesa[4]= 2;
    mesa[5]= 4;
    mesa[6]= 4;
    mesa[7]= 6;
    mesa[8]= 6;
    mesa[9]= 8;
    
    //ALERTA COVID
    System.out.println("ESCENARIOS ANTICOVID");
    System.out.println("1. Alerta máxima\n" + "2. Alerta media\n" + "3. Normalidad");
    System.out.print("Introduzca en qué escenario covid estamos: 1, 2 o 3? ");
    
    int escenario = Integer.parseInt(s.nextLine());
    
    //CAPACIDAD MESAS SEGÚN ESCENARIO COVID
    switch (escenario){
      case 1:
        for (int i = 0; i < 10; i++) {
          mesa[i] = 1;
        }
        for (int i = 0; i < 10; i++) {// Rellena las mesas de forma aleatoria.
          mesa[i] = (int) (Math.random() * 2);
        }
        break;
      case 2:
        for (int i = 0; i < 10; i++) {
          mesa[i] /= 2;
        }
        for (int i = 0; i < 10; i++) {// Rellena las mesas de forma aleatoria.
          mesa[i] = (int) (Math.random() * mesa[i]+1);
        }
        break;
      case 3:
        break;
      default:
    }

    int clientes; // número de clientes que llegan al restaurante buscando mesa
    do {// Muestra el estado de ocupación de las mesas

      System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬───"
        + "─┬────┬────┐");

      System.out.print("│Mesa no: ");

      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }

      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼──"
        + "──┼────┼────┤");

      System.out.print("│Ocupación");

      for (int m : mesa) {
        System.out.printf("│ %2d ", m);
      }

      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴───"
        + "─┴────┴────┘");

      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(s.nextLine());
      
      if (escenario == 3){

        if (clientes > 8) { // comprueba si el grupo de clientes es mayor a 4
          System.out.print("Lo siento, no admitimos grupos de más de 8 personas,"
            + "haga grupos de 6 u 8 personas como máximo e intente de nuevo.");
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
            System.out.println("Por favor, siéntense en la mesa número " + (iVacia + 1) + ".");
          } else {// Busca un hueco para todo el grupo.
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
      }
      if (escenario == 2){

        if (clientes > 4) { // comprueba si el grupo de clientes es mayor a 4
          System.out.print("Lo siento, no admitimos grupos de más de 4 personas,"
            + "haga grupos de 3 o 4 personas como máximo e intente de nuevo.");
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
            System.out.println("Por favor, siéntense en la mesa número " + (iVacia + 1) + ".");
          } else {// Busca un hueco para todo el grupo.
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
      }
      if (escenario == 1){

        if (clientes > 1) { // comprueba si el grupo de clientes es mayor a 4
          System.out.print("Lo siento, no admitimos grupos ni parejas, tendrán "
            + "que sentarse separados");
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
            System.out.println("Por favor, siéntense en la mesa número " + (iVacia + 1) + ".");
          } else {// Busca un hueco para todo el grupo.
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
      }
    } while (clientes != -1);
  }
  
}

