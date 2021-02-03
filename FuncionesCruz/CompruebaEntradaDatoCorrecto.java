/**
 * @author cruz
 * 
 */
package misfunciones;

import java.util.Scanner;

public class CompruebaEntradaDatoCorrecto {


  public static boolean compruebaDatoCorrecto(long num) {

      if (num % 2 != 0) { //condición que hay que comprobar
        System.out.println("Lo siento. El número no es par.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
}