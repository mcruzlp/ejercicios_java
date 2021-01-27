/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author cruz
 */
public class Matemáticas {

  /**
   * ****** ES PRIMO ******
   * 
   * @param x número que se quiere comprobar si es primo
   * @return devuelve si el número es primo o no
   */
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * ****** SIGUIENTE PRIMO ******
   * Esta función se usa después de haber comprobado con la función esPrimo si
   * un número es primo o no, y busca el siguiente número entero primo mayor al
   * número introducido por el usuario.
   * 
   * @param x número que se quiere comprobar si es primo
   * @return Devuelve el menor primo que es mayor al número que se pasa como
   * parámetro.
   */
  public static int siguientePrimo(int x) {
    
    do{
      x++;
    } while(esPrimo(x) == false);
    
    return x;
  }

}
