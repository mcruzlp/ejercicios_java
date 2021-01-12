/*
 * Ejercicio 7
 * 
 * Escribe un programa que calcule el total de una factura a partir 
 * de la base imponible.
 * 
 * @author Cruz López
 * 
 */


public class Ej7_factura {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la cantidad a la que quiere aplicarle el IVA: ");
		double base=Double.parseDouble(System.console().readLine());
		double iva=base*0.21;
		System.out.println("El total de la factura es: " +(base + iva)+"€");
	}
}
