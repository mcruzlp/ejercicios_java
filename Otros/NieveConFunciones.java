/*
 * Problema 1
 * @author cruz
 *
 */
package javaapplication24;

import java.util.Scanner;

public class NieveConFunciones {

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
    
    System.out.println("Elija la altura de nieve deseada: ");
    int alturaNieve = Integer.parseInt(s.nextLine());
    
    System.out.println("Indique el ancho de la ventana desde donde mira la nieve: ");
    int anchoVentana = Integer.parseInt(s.nextLine());

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

    pintaNieve(alturaNieve, anchoVentana, probabilidad);
    
  }
  
  public static void probabilidad(){
  
  }
  
  public static void pintaNieve(int alturaNieve, int anchoVentana, int probabilidad) {
    
    for (int i = 0; i < alturaNieve; i++) { //altura de la nieve
      for (int j = 0; j < anchoVentana; j++) {
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
