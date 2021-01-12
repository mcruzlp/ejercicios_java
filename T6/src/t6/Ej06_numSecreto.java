/*
 * Ejercicio 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario 
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento 
 * fallido, el programa dirá cuántas oportunidades quedan y si el número 
 * introducido es menor o mayor que el número secreto.
 *
 * @author cruz
 *
 */
package t6;

import java.util.Scanner;

public class Ej06_numSecreto {

  public static void main(String[] args) {
    int i = 4;
    
    int numGenerado = (int)(Math.random()*100+1);
    System.out.print("Adivina qué número he pensado (del 0 al 100): ");
    Scanner s = new Scanner(System.in);
    int respuesta = Integer.parseInt(s.nextLine());
    
    do{
      
      if(respuesta < 0 || respuesta > 100){
        System.out.println("El valor introducido no es válido.");
        System.out.println("Introduce un número entre 0 y 100");
        respuesta = Integer.parseInt(s.nextLine());
      }
      
      if(respuesta == numGenerado){
        System.out.println("¡Has acertado!");
        i = 0;
      }
      
      if(respuesta != numGenerado){
        
        if(respuesta < numGenerado){
        System.out.println("Lo siento, el número secreto es mayor.");
        }
      
        if(respuesta > numGenerado){
        System.out.println("Lo siento, el número secreto es menor.");
        }
        
        System.out.printf("Prueba de nuevo, te quedan %d intentos.\n",i);
        respuesta = Integer.parseInt(s.nextLine());
        i--;
      }
    }while(i > 0);
    
    if (respuesta != numGenerado){
      System.out.println("Lo siento, te has quedado sin intentos.");
      System.out.println("El número secreto era: " + numGenerado);
    }
  }
  
}
