/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

/**
 *
 * @author maricruz
 */
public class Ej10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m";
    String blanco="\033[37m";

    System.out.println(rojo + "      ____");
    System.out.println(rojo + "    _/__|__l_");
    System.out.println(azul + "..."+rojo+"|____|____|");
    System.out.println(naranja + "    @       @");
  }
  
}