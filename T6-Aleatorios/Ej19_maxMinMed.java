/**
 * Ejercicio 19
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares, el mínimo de los impares y la media de todos 
 * los números generados.
 *
 * @author cruz
 *
 */
package t6;

public class Ej19_maxMinMed {

  public static void main(String[] args) {

    int i;
    int num;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int suma = 0;
    int media;
    for (i = 0; i < 50; i++) {
      num = (int) (Math.random() * 301 - 100);
      System.out.print(num + " ");
      suma += num;
      if (num % 2 == 0) {
        if (max < num) {
          max = num;
        }
      } else {
        if (min > num){
          min = num;
        }
      }
    }
    System.out.println("");
    media = suma / 3;
    System.out.println("El mayor de los pares es: " + max);
    System.out.println("El menor de los impares es: " + min);
    System.out.println("La media total es: " + media);

  }

}
