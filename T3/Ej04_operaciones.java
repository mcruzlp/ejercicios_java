/*
 * Ejercicio 4
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Cruz López
 * 
 */


public class Ej4_operaciones {
  
  public static void main (String[] args) {
    System.out.print("Introduzca el primer número: ");
    int x= Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int y= Integer.parseInt(System.console().readLine());
    
    System.out.println("suma=" + (x+y));
    System.out.println("resta=" + (x-y));
    System.out.println("multiplicación=" + (x*y));
    System.out.println("división=" + (x/y));
  }
}

