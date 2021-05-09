/*
 * Ejercicio 12
 * Realiza un programa que calcule la nota que hace falta sacar en el 
 * segundo examen de la asignatura Programación para obtener la media
 * deseada. Hay que tener en cuenta que la nota del primer examen cuenta
 * el 40% y la del segundo examen un 60%.
 * 
 * @author Cruz López
 * 
 */


public class Ej12_media_pond {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la nota del primer examen: ");
		float n1=Float.parseFloat(System.console().readLine());
		System.out.print("Introduzca la nota deseada: ");
		float nd=Float.parseFloat(System.console().readLine());
		float n2=(nd-n1*(float)0.4)/(float)0.6;
		System.out.print("Tiene que sacar un: " + n2 + " en el ");
		System.out.print("segundo examen para obtener un " + nd);
		System.out.println(" como nota final");
	}
}

