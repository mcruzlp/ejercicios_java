/*
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el área del triángulo.
 * 
 * @author Cruz López
 * 
 */


public class Ej6_triang {
  
  public static void main (String[] args) {
     System.out.print("Introduzca la base del triángulo: ");
    int b=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura del triángulo: ");
    int a=Integer.parseInt(System.console().readLine());
    System.out.print("El área del triángulo es: " + ((b*a)/2));
  }
}

