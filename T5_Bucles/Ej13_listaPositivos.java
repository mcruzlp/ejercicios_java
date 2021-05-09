/**
 * Ejercicio 13
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej13_listaPositivos {

  public static void main(String[] args) {
  
    System.out.println("Introduzca 10 números, positivos o negativos: ");

    Scanner s = new Scanner(System.in);
    
    int cuentaPositivos = 0;
    int cuentaNegativos = 0;
    
    do{
      int numIntroducido = Integer.parseInt(s.nextLine());
      
      if (numIntroducido < 0){
        cuentaNegativos++;
      } else {
        cuentaPositivos++;
      }
    }while( cuentaNegativos + cuentaPositivos < 10);
    
    System.out.printf("Hay %d números negativos y %d números "
      + "positivos.\n", cuentaNegativos, cuentaPositivos);
  }
  
}
