/*
 * Ejercicio 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de 
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 
 * euros la hora.
 * 
 * @author Cruz López
 * 
 */


public class Ej4_h_extra {
  
  public static void main (String[] args) {
    System.out.print("Introduzca el número de horas trabajadas: ");
    float horas=Float.parseFloat(System.console().readLine());
    float salario=0;
    float extra=0;
     
    if (horas<=40){
      salario=12*horas;
    }
    if (horas>40){
      extra=horas-40;
      salario=12*horas+16*extra;
    }
    if(horas<0){
      System.out.println("Introduzca un número de horas válido");
    }
    System.out.println("El salario por horas ordinarias es: " + (12*horas));
    System.out.println("El salario por horas extra es: " + (16*extra));
    System.out.println("El salario total es: " + salario);
  }
}

