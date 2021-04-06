/**
 * Aquí se encuentran las funciones para arrays que he ido creando a lo largo
 * del curso.
 *
 * @author cruz
 *
 */
package misfunciones;

public class Arrays {

  /************ CONVIERTE ARRAY EN STRING *********
   * 
   * @param a array que se quiere convertir en cadena de caracteres
   * @return el array en forma de cadena de caracteres
   */
  public static String convierteArrayEnString(int[] a) {
    String cadena = "";
    for (int n : a) {
      cadena += n;
    }
    return cadena;
  }
  /******* PINTA ARRAY *****************
   * 
   * @param a array que se quiere imprimir
   */
  public static void pintaArray(int[] a) {
    for (int n : a) {
      System.out.print(n + " ");
    }
  }
  
  /*********** CONCATENA *****************
   * 
   * @param a primera parte del array final
   * @param b segunda parte del array final
   * @return el array con los valores de los dos iniciales juntos.
   */
  
  public static int[] concatena(int[] a, int[] b){
    int [] arraysJuntos = new int [a.length + b.length];
    for (int i = 0; i < a.length; i++) {
      arraysJuntos[i] = a[i];
    }
    for (int j = a.length; j < arraysJuntos.length; j++) {
      arraysJuntos[j] = b[j - a.length];
    }
    return arraysJuntos;
  }

}
