/*
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
 */
package ej6;

/**
 *
 * @author maricruz
 */
public class Ej6 {

  public static void main(String[] args) {

    double baseImponible=166.4;
    double precioConIVA=baseImponible + baseImponible*0.21;
    
    System.out.println("El precio sin IVA es: " + baseImponible);
    System.out.println("El total de la factura es: " + precioConIVA);
  }
  
}
