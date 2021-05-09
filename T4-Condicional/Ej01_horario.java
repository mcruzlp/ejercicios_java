/*
 * Ejercicio 1
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Cruz López
 * 
 */


public class Ej1_horario {
  
  public static void main (String[] args) {
    System.out.print("¿Qué día de la semana es hoy? ");
    String dia=System.console().readLine();
    dia = dia.toLowerCase();
    
    switch (dia) {
      case "lunes":
        System.out.print("Hoy toca a primera hora ENDE");
      break;
      case "martes":
      case "miércoles":
      case "miercoles":
      case "jueves":
        System.out.print("Hoy toca a primera hora Programación");
      break;
      case "viernes":
        System.out.print("Hoy toca a primera hora FOL");
      break;
      case "sábado":
      case "sabado":
      case "domingo":
        System.out.print("El fin de semana no hay clase");
      break;
    default:
      System.out.print("Día incorrecto, seleccione un día de la semana válido");
    }
      
  }
}

