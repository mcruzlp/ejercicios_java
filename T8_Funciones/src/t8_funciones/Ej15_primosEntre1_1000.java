/**
 * Ejercicio 15
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author cruz
 *
 */
package t8_funciones;

import funcionesCruz.MyMaths;

public class Ej15_primosEntre1_1000 {

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++){
      if (MyMaths.esPrimo(i)) {
        System.out.print(i + " ");
      }
      if (i % 50 == 0){
        System.out.println("");
      }
    }
  }
  
}
