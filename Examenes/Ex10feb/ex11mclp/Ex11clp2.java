/**
 * CRUZ LÓPEZ PÉREZ
 * Ex10feb
 *
 * Ejercicio 2
 *
 *
 *
 * @author cruz
 */
package ex11mclp;

import java.util.Scanner;
import misfunciones.MyMaths;

public class Ex11clp2 {

  public static void main(String[] args) {
    System.out.println("Introduzca un número entero: ");

    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());

    int[] numArray = MyMaths.convierteArray(numIntroducido);

    int[] numPar = extraePares(numArray);

    System.out.println("Los dígitos pares son: " + numPar);

    int[] numImpar = extraeImpares(numArray);

    System.out.println("Los dígitos impares son: " + numImpar);

    int[] numOrdenado = colocaParesEImpares(numArray);

    System.out.println("El número reestructurado es: " + numOrdenado);

  }

  public static int[] extraePares(int[] a) {
    
    int cuentaPar = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        cuentaPar++;
      }
    }
    int[] numPar = new int[cuentaPar];
    int i = 0;
    int j = 0;
    for (i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        numPar[j] = a[i];
      } else 
      
    }

    return numPar;
  }

  public static int[] extraeImpares(int[] a) {
    int[] numImpar = ;
  }

  public static int[] colocaParesEImpares(int[] a) {
    int[] numOrdenado = ;
    return numOrdenado;
  }

}
