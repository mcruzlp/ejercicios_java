/*
 * Ejercicio 10
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej10_horoscopo {

  public static void main(String[] args) {
    System.out.print("Introduzca el día y el mes de nacimiento en formato "
      + "numérico, separados por espacios: ");
    int dia;
    int mes;
    
    boolean comprobar = true;
    
    do{
      comprobar = true;
      Scanner s = new Scanner(System.in);

      dia = s.nextInt();
      if (dia < 1 || dia > 31){
        comprobar = false;
      }
      mes = s.nextInt();
      if (mes < 1 || mes > 12){
        comprobar = false;
      }
      
      if (comprobar == false){
        System.out.println("Por favor, introduzca una fecha correcta:");
      }
    } while(comprobar == false);
    
    if (mes == 3){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Piscis");
      } else {
        System.out.println("Su signo del zodiaco es Aries");
      }
    }
    if (mes == 4){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Aries");
      } else {
        System.out.println("Su signo del zodiaco es Tauro");
      }
    }
    if (mes == 5){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Tauro");
      } else {
        System.out.println("Su signo del zodiaco es Géminis");
      }
    }
    if (mes == 6){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Géminis");
      } else {
        System.out.println("Su signo del zodiaco es Cáncer");
      }
    }
    if (mes == 7){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Cáncer");
      } else {
        System.out.println("Su signo del zodiaco es Leo");
      }
    }
    if (mes == 8){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Leo");
      } else {
        System.out.println("Su signo del zodiaco es Virgo");
      }
    }
    if (mes == 9){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Virgo");
      } else {
        System.out.println("Su signo del zodiaco es Libra");
      }
    }
    if (mes == 10){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Libra");
      } else {
        System.out.println("Su signo del zodiaco es Escorpio");
      }
    }
    if (mes == 11){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Escorpio");
      } else {
        System.out.println("Su signo del zodiaco es Sagitario");
      }
    }
    if (mes == 12){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Sagitario");
      } else {
        System.out.println("Su signo del zodiaco es Capricornio");
      }
    }
    if (mes == 1){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Capricornio");
      } else {
        System.out.println("Su signo del zodiaco es Acuario");
      }
    }
    if (mes == 2){
      if(dia < 21){
        System.out.println("Su signo del zodiaco es Acuario");
      } else {
        System.out.println("Su signo del zodiaco es Piscis");
      }
    }
  }
}
