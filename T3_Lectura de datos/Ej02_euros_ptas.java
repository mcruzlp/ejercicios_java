/*
 * Ejercicio 2
 * Realiza un conversor de euros a pesetas. La antidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Cruz López
 * 
 */


public class Ej2_euros_ptas {
  
  public static void main (String[] args) {
    System.out.print("Introduzca la cantidad de euros que desea convertir a pesetas:");
    double euros= Double.parseDouble(System.console().readLine());
    double pesetas=euros*166.386;
    System.out.printf(euros + "€ son " + pesetas + "pesetas");
  }
}

