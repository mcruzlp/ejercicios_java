/*
 * Ejercicio 9
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, 
 * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
 * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando 
 * bucles; de esta manera, la única limitación en el número de dígitos la 
 * establece el tipo de dato que se utilice ( int o long ).
 * 
 * @author cruz
 *
 */
package t5.bucles;

import java.util.Scanner;

public class Ej09_cuenta {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número quiera: ");
    int num = Integer.parseInt(s.nextLine());
    int aux = num;
    int cantidadDigitos = 0;
    
    if(num > 10){
      while (aux != 0 ){
        aux = aux/10;
        cantidadDigitos++;
      }
    }else if(num < 10){
      cantidadDigitos = 1;
    }
    System.out.printf("El número tiene %d cifras\n", cantidadDigitos);
  }
  
}
