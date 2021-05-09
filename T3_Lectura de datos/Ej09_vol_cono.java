/*
 * Ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono según la
 * fórmula V=(pi*r^2*h)/3.
 * 
 * @author Cruz López
 * 
 */

import static java.lang.Math.*;

public class Ej9_vol_cono {
	
	public static void main (String[] args) {
		System.out.print("Introduzca el radio de la base del cono: ");
		double r=Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca la altura del cono: ");
		double h=Double.parseDouble(System.console().readLine());
		double volumen=(PI*r*r*h)/3;
		System.out.print("El volumen del cono es: " + volumen);
	}
}

