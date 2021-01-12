/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que
 *    se quiere convertir deberá estar almacenada en una variable.
 */
package ej4;

/**
 *
 * @author maricruz
 */
public class Ej4 {
  
  public static void main(String[] args) {
    int x=300;
    double pesetas=166.386;
    double cambioApesetas;
    
    cambioApesetas=x*pesetas;
    System.out.println(x + " euros son " + cambioApesetas + " pesetas");
  }
  
}
