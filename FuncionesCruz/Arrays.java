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
public class Arrays {

  /******************** FUNCIONES ********************************
   * @param a
   * @return  
   */
   
  public static int [] extraePrimos(int[][]a){
    return null;
  
  }
  
  /**
   * ****** CONVIERTE A ARRAY ******
   *
   * @param num número que se quiere almacenar en un array
   * @return número convertido a array
   */
  public static long[] convierteArray(long num) {
    long numRecortado = num;
    int numDigitos = 1;

    //número de dígitos.
    while (numRecortado > 10) {
      numRecortado /= 10;
      numDigitos++;
    }
    
    long[] numArray = new long[numDigitos];
    
    for (int i = numDigitos; i <= 0; i++){
      numArray[i] = num % 10;
    }
    
    return numArray;
  
  }
  
  public static int[] convierteArray(int num) {
    int numRecortado = num;
    int numDigitos = 1;

    //número de dígitos.
    while (numRecortado > 10) {
      numRecortado /= 10;
      numDigitos++;
    }
    
    int[] numArray = new int[numDigitos];
    
    for (int i = numDigitos; i <= 0; i++){
      numArray[i] = num % 10;
    }
    
    return numArray;
  
  }

}
