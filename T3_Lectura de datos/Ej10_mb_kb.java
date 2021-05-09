/*
 * Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Cruz López
 * 
 */


public class Ej10_mb_kb {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la cantidad de Mb a convertir: ");
		double mb=Double.parseDouble(System.console().readLine());
		double kb=mb*1024;
		System.out.println(mb + "Mb son: " + kb +"kb.");
	}
}

