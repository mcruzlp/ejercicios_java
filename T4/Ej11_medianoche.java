/*
 * Ejercicio 11
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej11_medianoche {

  public static void main(String[] args) {
    System.out.print("Introduzca la hora y los minutos separados por espacios: ");
    int hora;
    int minutos;
    
    boolean comprobar = true;
    
    do{
      comprobar = true;
      Scanner s = new Scanner(System.in);
      hora = s.nextInt();
      minutos = s.nextInt();
      
      if (hora < 0 || hora > 23){
        comprobar = false;
      }
      
      if (minutos < 0 || minutos > 59){
        comprobar = false;
      }
      
      if (comprobar == false){
        System.out.println("Por favor, introduzca una hora correcta:");
      }
      
    }while(comprobar == false);
    
    int totalSegundos = hora*60*60 + minutos*60;
    int segundosDia = 24*60*60;
    int hastaMedianoche = segundosDia - totalSegundos;
    System.out.println("Segundos hasta medianoche: " + hastaMedianoche);
  }
}
