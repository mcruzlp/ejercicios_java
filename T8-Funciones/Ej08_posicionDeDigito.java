/** Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * Ejercicio 8. posicionDeDigito: Da la posición de la primera ocurrencia de un 
 * dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 *
 * @author cruz
 *
 * 
 */
package t8_funciones;

import java.util.Scanner;
import funcionesCruz.MyMaths;

public class Ej08_posicionDeDigito {

  public static void main(String[] args) {
    System.out.print("Introduzca el número que desea consultar: ");
    
    Scanner s = new Scanner(System.in);
    int numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el valor del que quiere conocer la posición: ");
    int digito = Integer.parseInt(s.nextLine());
    
    if (MyMaths.encuentraNum(numIntroducido,digito)!= -1){ 
      System.out.println("La primera vez que aparece el dígito en el número, es"
        + " en la posición: " + MyMaths.encuentraNum(numIntroducido,digito));
    } else System.out.println("El dígito no está en el número.");
  }
  
}
