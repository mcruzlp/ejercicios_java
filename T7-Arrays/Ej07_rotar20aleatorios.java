/*
 * Ejercicio 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del 
 * primer valor por el segundo en la lista generada anteriormente. Los números 
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author cruz
 *
 */
package t7;

import java.util.Scanner;

public class Ej07_rotar20aleatorios {

  public static void main(String[] args) {

    int[] elementos = new int[100];

    System.out.println("Los números son: ");
    for (int i = 0; i < 100; i++) {/*genera 100 num aleatorios entre 
      0 y 20 y los almacena en el array "elementos" */
      elementos[i] = (int) (Math.random() * 21);
      System.out.print(elementos[i] + " ");
    }

    System.out.println("");
    System.out.println("Elija dos de los números anteriores para rotarlos: ");

    Scanner s = new Scanner(System.in);


    int numElegido1;
    int numElegido2;

      numElegido1 = Integer.parseInt(s.nextLine());
      numElegido2 = Integer.parseInt(s.nextLine());

      System.out.println("Los números rotados son: ");

      for (int i : elementos) {
        if (i == numElegido1) {
          i = numElegido2;
          System.out.print("'" + i + "'" + " ");
        } else if (i == numElegido2) {
          i = numElegido1;
          System.out.print("'" + i + "'" + " ");
        } else {
          System.out.print(i + " ");
        }
      }
    }


  }
