/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/*
 *
 * @author maricruz
 */
public class Ej5 {

  /*
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String tabular="\t";
    String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m";
    String blanco="\033[37m";
    
    System.out.println("Hora " + tabular + "|" + tabular + "Lunes" + tabular + "|" + tabular + "Martes" +tabular + "|" + tabular + "Miércoles" + tabular + "|" + tabular + "Jueves" + tabular + "|" + tabular + "Viernes");
    System.out.println("08:15" + tabular + "|" + tabular + morado + "  BD " + tabular + "|" + tabular + naranja + "  LM  " +tabular + "|" + tabular + verde + "   SI    " + tabular + "|" + tabular + rojo + "  P   " + tabular + "|" + tabular + verde + "  SI   ");
    System.out.println("09:15" + tabular + "|" + tabular + morado + "  BD " + tabular + "|" + tabular + naranja + "  LM  " +tabular + "|" + tabular + verde + "   SI    " + tabular + "|" + tabular + rojo + "  P   " + tabular + "|" + tabular + verde + "  SI   ");
    System.out.println("10:15" + tabular + "|" + tabular + rojo + "  P  " + tabular + "|" + tabular + rojo + "  P   " +tabular + "|" + tabular + rojo +"    P    " + tabular + "|" + tabular + morado + "  BD  " + tabular + "|" + tabular + blanco + "  ED   ");
    System.out.println("11:15" + tabular + "|" + tabular + "  R  " + tabular + "|" + tabular + "  E   " +tabular + "|" + tabular + "   CR    " + tabular + "|" + tabular + "  E   " + tabular + "|" + tabular + "  O    ");
    System.out.println("11:45" + tabular + "|" + tabular + rojo + "  P  " + tabular + "|" + tabular + rojo + "  P   " +tabular + "|" + tabular + rojo +"    P    " + tabular + "|" + tabular + morado + "  BD  " + tabular + "|" + tabular + morado + "  BD   ");
    System.out.println("12:40" + tabular + "|" + tabular + azul + " FOL " + tabular + "|" + tabular + verde + "  SI  " +tabular + "|" + tabular + blanco + "   ED    " + tabular + "|" + tabular + naranja + "  LM  " + tabular + "|" + tabular + morado + "  BD   ");
    System.out.println("13:35" + tabular + "|" + tabular + azul + " FOL " + tabular + "|" + tabular + verde + "  SI  " +tabular + "|" + tabular + blanco + "   ED    " + tabular + "|" + tabular + naranja + "  LM  " + tabular + "|" + tabular + azul + "  FOL  ");
  }
  
}
