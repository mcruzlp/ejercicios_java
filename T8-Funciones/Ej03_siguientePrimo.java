/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8_funciones;

import java.util.Scanner;
import static misfunciones.MyMaths.esPrimo;
import static misfunciones.MyMaths.siguientePrimo;

/**
 *
 * @author cruz
 */
public class Ej03_siguientePrimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Introduzca el número que desea comprobar si es primo: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(esPrimo(numIntroducido));
    
    System.out.println("¿Quiere consultar cuál es el número primo mayor más"
      + " cercano? Sí (pulse 1) No (pulse 2)");
    int comprueba = Integer.parseInt(s.nextLine());
    
    switch (comprueba){
      case 1:
        System.out.println("El siguiente número primo es: ");
        System.out.println(siguientePrimo(numIntroducido));
        break;
      case 2:
        System.out.println("Ok, hasta luego");
        break;
      default:
    }
  }
  
}
