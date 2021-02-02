/**
 * Ejercicio 11
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice (0 – 9) utilizando para ello una tabla. Seguidamente el programa
 * pasará los primos a las primeras posiciones, desplazando el resto de números
 * (los que no son primos) de tal forma que no se pierda ninguno. Al final se
 * debe mostrar el array resultante.
 *
 * @author cruz
 *
 */
package t7;

import java.util.Scanner;

public class Ej11_primosPrimero {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int[] ordenado = new int[10];
    int cuentaPrimo = 0;
    int cuentaHno = 9;
    int[] array = new int[10];

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor, introduzca 10 números: ");

    for (int i = 0; i < 10; i++) {
      System.out.print(i+1 + ": ");
      numeros[i] = Integer.parseInt(s.nextLine());
      array[i] = i;
    }
    
    boolean esPrimo;
    
    for (int i = 0; i < 10; i++) {
      esPrimo = true;
      for (int j = 2; j < numeros[i]; j++) {
        if ((numeros[i] % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo){
        ordenado[cuentaPrimo] = numeros[i];
        cuentaPrimo++;
      } else {
          ordenado[cuentaHno] = numeros[i];
          cuentaHno--;
      }
    }
    
    for (int a : array){
      System.out.printf(" %d", a);
    }
    System.out.println("");
    for (int m : ordenado) {
      System.out.print(m + " ");
    }
    System.out.println("");
  }

}
