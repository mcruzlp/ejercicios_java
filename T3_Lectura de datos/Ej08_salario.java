/*
 * Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en 
 * base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Cruz López
 * 
 * 
 */


public class Ej8_salario {
	
	public static void main (String[] args) {
		System.out.print("Introduzca el número de horas trabajadas: ");
		float horas=Float.parseFloat(System.console().readLine());
		float salario=12*horas;
		System.out.println("El salario total es: " + salario);
	}
}

