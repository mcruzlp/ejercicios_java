/*
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * 
 * @author Cruz López
 * 
 */


public class Ej03_numdia {
  
  public static void main (String[] args) {
    System.out.print("Introduzca un número del 1 al 7: ");
    int num=Integer.parseInt(System.console().readLine());
    
    switch (num){
      case 1:
        System.out.print("Es lunes");
      break;
      case 2:
        System.out.print("Es martes");
      break;
      case 3:
        System.out.print("Es miércoles");
      break;
      case 4:
        System.out.print("Es jueves");
      break;
      case 5:
        System.out.print("Es viernes");
      break;
      case 6:
        System.out.print("Es sábado");
      break;
      case 7:
        System.out.print("Es domingo");
      break;
    default:
        System.out.println("El número introducido no es válido");
    }
    
  }
}

