/**
 * Ejercicio 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author cruz
 *
 */
package t7;

import java.util.Scanner;

public class Ej08_temperaturaMedia {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int[] temp = new int [12];
    String naranja = "\033[33m";
    String rojo = "\033[31m";
    String azul = "\033[34m";
    
    System.out.println("Por favor, introduzca temperatura media (redondee "
      + "al entero más cercano) de cada mes: ");
    for(int i = 1; i < 13; i++){
      System.out.print(i + ": ");
      temp[i-1] = Integer.parseInt(s.nextLine());
      System.out.println("");
    }
    System.out.println(" ** GRÁFICA DE TEMPERATURAS MEDIAS ** ");
    System.out.println("");
    for (int i = 9; i >0; i--){ //alto del diagrama según temperatura más alta
      if (i % 2 == 0){
        System.out.print(azul);
        System.out.printf("%2d ┼ ", i*3);
      }else {
        System.out.print(azul + "   ┼ ");
      }
      for (int j = 0; j < 12; j++){ //ancho del diagrama constante
        if(temp[j] < i*3){
          System.out.print("    ");
        } else{
          if (temp[j] < 18){
            System.out.print(naranja + "  ☀ ");
          } else {
            System.out.print(rojo + "  ☀ ");
          }
        }
      }
      System.out.println("");
    }
    System.out.println(azul + " 0 ┼ ======================================="
      + "===========");
    System.out.print("    ");
    for (int i = 1; i < 13; i++){
      System.out.print("  " + i + " ");
    }
    System.out.println("");
  }
  
}
