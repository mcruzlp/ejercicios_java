/*
 * Ejercicio 3
 * Realiza un conversor de pesetas a euros. La antidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Cruz López
 * 
 */


public class Ej3_ptas_a_euros {
  
  public static void main (String[] args) {
    System.out.print("Introduzca la cantidad de pesetas que desea convertir a euros:");
    double pesetas= Double.parseDouble(System.console().readLine());
    double euros=pesetas/166.386;
    System.out.printf(pesetas + "pesetas son " + euros + "€");
  }
}

