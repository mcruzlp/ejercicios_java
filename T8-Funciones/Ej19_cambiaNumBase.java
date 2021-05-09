/**
 * Ejercicio 19
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario, hexadecimal y octal.
 *
 * @author cruz
 *
 */
package t8_funciones;

import java.util.Scanner;
import misfunciones.MyMaths;

public class Ej19_cambiaNumBase {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduca el número que quiere cambiar de base: ");
    int numIntroducido = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca en qué base está el número: ");
    int base1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca a qué base quiere cambiarlo: ");
    int base2 = Integer.parseInt(s.nextLine());
    
    System.out.println("El número es " +
      MyMaths.cambiaDeBase(numIntroducido, base1, base2));
  }
  
}
