/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8_funciones;

import java.util.Scanner;
import static misfunciones.MyMaths.esPrimo;


/**
 *
 * @author cruz
 */
public class Ej02_esPrimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Introduzca el número que desea comprobar si es primo: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(esPrimo(numIntroducido));
    
  }

}
