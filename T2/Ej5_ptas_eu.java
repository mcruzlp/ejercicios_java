/*
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 */
package ej5;

/**
 *
 * @author maricruz
 */
public class Ej5 {

  public static void main(String[] args) {
    int x=2300;
    double euros=1/166.386;
    double cambioAeuros;
    
    cambioAeuros=x*euros;
    System.out.println(x + " pesetas son " + cambioAeuros + " euros");
  }
  
}
