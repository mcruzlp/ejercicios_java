/**
 * CRUZ LÓPEZ PÉREZ
 * Ex18Feb
 *
 * Ejercicio 3
 *
 * @author cruz
 *
 */
package ex11clp;

public class Ex11clp3 {

  public static void main(String[] args) {
    int[] a = {3, 8, 1, 9, 33, 3, 9, 10, 12};
    pintaArray(borraElemento(a, 0));
    pintaArray(borraElemento(a, 4));
    pintaArray(borraElemento(a, 7));
    pintaArray(borraElemento(a, -1));
    pintaArray(borraElemento(a, 8));
    pintaArray(borraElemento(a, 9));

    int[] b = {11, 7, 5, 21};
    pintaArray(borraElemento(b, 1));
    pintaArray(borraElemento(b, 7));

    int[] c = {};
    pintaArray(borraElemento(c, 0));
    pintaArray(borraElemento(c, 1));
  }

  public static int[] borraElemento(int[] a, int posicion) {

    if (posicion < 0 || posicion >= a.length) { 
      return a; 
    }
    
    if (posicion == 0){
      int[] a_resto = new int[a.length - 1];
      for (int i = 0; i < a.length-1; i++) {
        a_resto[i] = a[i + 1];
        posicion++;
      }
      return a_resto;
    }

    int[] a_recortado = new int[posicion];

    for (int i = 0; i < a_recortado.length; i++) {
      a_recortado[i] = a[i];
    }

    int[] a_resto = new int[a.length - a_recortado.length-1];
    for (int i = 0; i < a_resto.length; i++) {
      a_resto[i] = a[posicion + 1];
      posicion++;
    }

    int[] nuevoA = Arrays.concatena(a_recortado,a_resto);

    return nuevoA;
  }

  public static void pintaArray(int[] a) {
    for (int elem : a) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}

