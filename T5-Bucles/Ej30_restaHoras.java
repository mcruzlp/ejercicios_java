/**
 * Ejercicio 30
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * Ejemplo:
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 *
 * @author cruz
 *
 */
package t5;

import java.util.Scanner;

public class Ej30_restaHoras {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Por favor, introduzca la primera hora en formato 24h: ");
    System.out.print("Día 1 (en números): ");
    int dia1 = Integer.parseInt(s.nextLine());
    System.out.print("Hora 1: ");
    int hora1 = Integer.parseInt(s.nextLine());

    boolean check;
    int dia2;

    do {
      check = true;
      
      System.out.println("Por favor, introduzca la segunda hora en formato 24h: ");
      System.out.print("Día 2(en números): ");
      dia2 = Integer.parseInt(s.nextLine());
      
      if (dia2 < dia1) { //condición que hay que comprobar
        System.out.println("Lo siento. El día 2 no puede ser anterior al 1.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);
    
    System.out.print("Hora 2: ");
    int hora2 = Integer.parseInt(s.nextLine());
    
    int diasCompletos = dia2-dia1-1;
    
    int horasRestan = 24 - hora1;
    int horasFaltan = hora2;

    int totalHoras = horasRestan + horasFaltan + 24*diasCompletos;

    System.out.printf("Entre las %d:00h del %d y las %d:00h del %d hay: "
      + "%d hora/s.\n", hora1, dia1, hora2, dia2, totalHoras);
  }

}
