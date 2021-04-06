
package ex16dicmclp;

import java.util.Scanner;

public class Ej02exam {

  public static void main(String[] args) {

    System.out.print("Introduzca la longitud de la plataforma: ");
    Scanner s = new Scanner(System.in);
    int longitud = Integer.parseInt(s.nextLine());
    while (longitud < 6){
      System.out.println();
      System.out.print("Error, introduzca una longitud mayor a 6: ");
      longitud = Integer.parseInt(s.nextLine());
    }
    ////personas ////////////////////////////////////////////////
    //int personas = (int)(Math.random()*(longitud - 4);
    //int posición = (int)(Math.random()*(longitud - 4);
    
    
    /////////////////////////////////////////////////////
    System.out.println();
    //// parte alta del puente/////////////////////////////////
    System.out.print("  ");
    for (int i = 1; i <= (longitud - 4); i++){
      System.out.print("*");
    }
    /////////////////////////////////////////////////////
    System.out.println();
    ////parte central///////////////////////////////////////////
    System.out.print(" *");
    for (int i = 1; i <= (longitud - 4); i++){
      System.out.print(" ");
    }
    System.out.print("*");
    /////////////////////////////////////////////////////
    System.out.println();
    ////parte baja//////////////////////////////////////////
    System.out.print("*");
    for (int i = 1; i <=(longitud - 2); i++){
      System.out.print(" ");
    }
    System.out.print("*");
    //////////////////////////////////////////////////////////////
    System.out.println();
  }
  
}
