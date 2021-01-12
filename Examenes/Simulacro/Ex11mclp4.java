/*
 * Cruz López Pérez
 * 11/11/2020
 *
 */
package ex11mclp;

import java.util.Scanner;

public class Ex11mclp4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int altura;
    int trozos;
    boolean check;
    
    do{
      check = true;
      
      System.out.print("Introduzca la altura de la pirámide: ");
      altura = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca el número de trozos: ");
      trozos = Integer.parseInt(s.nextLine());
        if(altura < trozos){
          System.out.printf("No puede haber más trozos que pisos\n");
          System.out.println("Vuelva a intentarlo.");
          check = false;
        }
        if(altura % trozos != 0){
          System.out.printf("Una pirámide de %d pisos no puede dividirse\n", altura);
          System.out.printf("en %d trozos de la misma altura.\n", trozos);
          System.out.println("Vuelva a intentarlo.");
          
        } 
    } while (!check);
    
    int lineasPorTrozo = altura / trozos;
    int espacios = altura;
    int longitudDeLinea = 1;
    int i;
    
    for (int t = 0; t < trozos; t++){
      //Pinta el trozo
      for (int l = 0; l < lineasPorTrozo; l++){
        //Pinta los espacios de la linea
        for (i = 0; i < espacios; i++) {
          System.out.print(" ");
        }
        //Pinta los asteriscos
        for (i = 0; i < longitudDeLinea; i++){
          System.out.print("*");
        }
        System.out.println();
        espacios--;
        longitudDeLinea += 2;
      }
      System.out.println();
    }
  }
  
}
