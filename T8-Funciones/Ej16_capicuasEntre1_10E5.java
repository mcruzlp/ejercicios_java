/**
 * Ejercicio 16
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author cruz
 *
 */
package javaapplication24;

import misfunciones.MyMaths;

public class Ej16_capicuasEntre1_10E5 {

  public static void main(String[] args) {
    for (int i = 1; i < 100000; i++){
      if (MyMaths.esCapicua(i)) {
        System.out.print(i + " ");
      }
      if (i % 50 == 0){
        System.out.println("");
      }
    }
  }
  
}
