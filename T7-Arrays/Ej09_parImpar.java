/**
 * Ejercicio 9
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author cruz
 *
 */
package t7;

import java.util.Scanner;

public class Ej09_parImpar {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Por favor, introduzca 8 números: ");
    
    int[] numeros = new int [8];
    for(int i = 0; i < 8; i++){
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    for(int n : numeros){
      if (n % 2 == 0){
        System.out.println(n + "(par)");
      } else {
        System.out.println(n + "(impar)");
      }
    }
  }
  
}
