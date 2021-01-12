/*
 * Ejericio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Cruz López
 * 
 */


public class Ej5_area {
  
  public static void main (String[] args) {
    
    System.out.print("Introduzca la base del rectángulo: ");
    int b=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura del rectágulo: ");
    int a=Integer.parseInt(System.console().readLine());
    System.out.print("El área del rectángulo es: " + (b*a));
  }
}
