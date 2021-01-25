/*
 * Ejercicio 9
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0 ).
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej09_ecu2grado {

  public static void main(String[] args) {
    System.out.print("Introduzca los coeficientes, separados por espacios: ");
    Scanner s = new Scanner(System.in);
    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();
    
    if ((a == 0) && (b == 0) && (c == 0)){
      System.out.println("La ecuación tiene infinitas soluciones");
    }
    
    if ((a == 0) && (b == 0) && (c != 0)){
      System.out.println("La ecuación no tiene solución");
    }
    
    if ((a != 0) && (b != 0) && (c == 0)){
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
      
    if ((a == 0) && (b != 0) && (c != 0)){
      System.out.println("x1 = x2 = " + (-c / b));
    }
   
    if ((a != 0) && (b != 0) && (c != 0)) {
      double discriminante = b*b - (4 * a * c);
      if (discriminante < 0) {
        System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }
  }
}
