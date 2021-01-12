/*
 * Ejercicio 7
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej07_mediaNotas {

  public static void main(String[] args) {
    System.out.print("Introduzca las notas de las que quiere obtener "
      + "la media, separadas por espacios: ");
    Scanner s = new Scanner(System.in);
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();
    
    double media = (double)((nota1+nota2+nota3)/3);
    System.out.printf("La media es : %.2f\n",media);
  }
  
}
