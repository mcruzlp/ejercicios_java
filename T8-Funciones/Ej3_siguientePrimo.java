/**
 * Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 *
 * Ejercicio 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 *
 * @author cruz
 */
package t8_funciones;

import java.util.Scanner;
import static misfunciones.Matemáticas.esPrimo;
import static misfunciones.Matemáticas.siguientePrimo;


public class Ej3_siguientePrimo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Introduzca el número que desea comprobar si es primo: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println(esPrimo(numIntroducido));
    
    System.out.println("¿Quiere consultar cuál es el número primo mayor más"
      + " cercano? Sí (pulse 1) No (pulse 2)");
    int comprueba = Integer.parseInt(s.nextLine());
    
    switch (comprueba){
      case 1:
        System.out.println("El siguiente número primo es: ");
        System.out.println(siguientePrimo(numIntroducido));
        break;
      case 2:
        System.out.println("Ok, hasta luego");
        break;
      default:
    }
  }
  
}
