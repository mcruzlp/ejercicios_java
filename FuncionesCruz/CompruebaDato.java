package misfunciones;

import java.util.Scanner;

/**
 *
 * @author cruz
 */
public class CompruebaDato {

  public static void main(String[] args) {
    
    boolean check;
    long numIntroducido;

    Scanner s = new Scanner(System.in);

    do {
      check = true;

      System.out.print("Introduzca un número par: ");
      numIntroducido = Long.parseLong(s.nextLine());

      if (numIntroducido % 2 != 0) { //condición que hay que comprobar
        System.out.println("Lo siento. El número no es par.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);
  }
  
}
