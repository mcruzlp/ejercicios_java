/*
 * Problema 1
 * @author cruz
 *
 */
package ex11mcruzlp;

import java.util.Scanner;

public class Ex11mcruzlp1 {

  public static void main(String[] args) {

    System.out.println("SIMULADOR DE NIEVE");
    System.out.println("==================");
    System.out.println("1. Densidad alta");
    System.out.println("2. Densidad media");
    System.out.println("3 Densidad baja");

    int densidadElegida;
    boolean check;

    Scanner s = new Scanner(System.in);

    do {
      check = true;

      System.out.println("Elija la densidad de nieve deseada (1 - 3): ");
      densidadElegida = Integer.parseInt(s.nextLine());

      if (densidadElegida < 1 || densidadElegida > 3) {
        System.out.printf("¡Error! La densidad debe ser 1, 2 o 3.\n");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);

    int probabilidad;
    int densidadAlta = 4; 
    int densidadMedia = 8;
    int densidadBaja = 20;

    switch (densidadElegida) {
      case 1:
        probabilidad = densidadAlta;
        break;
      case 2:
        probabilidad = densidadMedia;
        break;
      case 3:
        probabilidad = densidadBaja;
        break;
      default:
        probabilidad = 1;
    }

    for (int nieve = 0; nieve < 10; nieve++) { //altura de la nieve
      for (int anchoPantalla = 0; anchoPantalla < 40; anchoPantalla++) {
        if ((int) (Math.random() * probabilidad) == 0){
          System.out.print("*");
        } else {
          System.out.print(" "); //hueco sin nieve
        }
      }
      System.out.println();
    }
  }
}
