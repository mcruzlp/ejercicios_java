/*
 * Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Cruz López
 * 
 */


public class Ej11_kb_mb {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la cantidad de kb a convertir: ");
		double kb=Double.parseDouble(System.console().readLine());
		double mb=kb/1024;
		System.out.println(kb + "kb son: " + mb +"Mb.");
	}
}

