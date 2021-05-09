/**
 * Ejercicio 10
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es necesario.
 *
 * @author cruz
 *
 */
package t7;

public class Ej10_paresPrimero {

  public static void main(String[] args) {
    int[] numeros = new int[20];
    int[] ordenado = new int[20];
    int cuentaImpar = 19;
    int cuentaPar = 0;

    for (int i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 101);
    }
    for (int n : numeros) {
      if (n % 2 == 0) {
        ordenado[cuentaPar] = n;
        cuentaPar++;
      } else {
        ordenado[cuentaImpar] = n;
        cuentaImpar--;
      }
    }
    for (int m : ordenado) {
      System.out.print(m + " ");
    }
  }
}

