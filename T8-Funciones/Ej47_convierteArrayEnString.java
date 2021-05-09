/**
 * Ejercicio 47
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * 
 * Esta función toma como parámetro un array que contiene números y devuelve
 * una cadena de caracteres con esos números. Por ejemplo, si a = { }, 
 * convierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
 * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
 * “62501”.
 * 
 * @author cruz
 *
 */
package t8_funciones;

import funcionesCruz.Arrays;

public class Ej47_convierteArrayEnString {

  public static void main(String[] args) {
    
    int numDigitos = (int)(Math.random()*7+1);
    int[] numArray = new int[numDigitos];

    System.out.println("El número a transformar en cadena de caracteres es: ");
    for (int i = 0; i < numDigitos; i++) {
      numArray[i] = (int)(Math.random()*10);
      System.out.print(numArray[i] + " ");
    }
    
    System.out.println("El número transformado es: " 
      + Arrays.convierteArrayEnString(numArray));
  }
}
