/*
 * Problema 3
 * @author cruz
 *
 */
package ex11mcruzlp;

import java.util.Scanner;



public class Ex11mcruzlp3 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    Scanner s = new Scanner(System.in);

    long numIntroducido;
    long num; //crea una copia del número introducido por teclado

    boolean check;
    do {//comprueba si el número tiene una cantidad de dígitos par
      check = true;

      numIntroducido = Long.parseLong(s.nextLine());

      num = numIntroducido;
      long aux = num;
      int cantidadDigitos = 0;

      if (num > 10) {
        while (aux != 0) {
          aux /= 10;
          cantidadDigitos++;
        }
      } else if (num < 10) {
        cantidadDigitos = 1;
      }

      if (cantidadDigitos % 2 != 0) {
        System.out.println("Lo siento. El número introducido tiene longitud "
          + "impar, no se puede partir en trocitos.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);

    long trozo = numIntroducido;
    long primeraPareja;
    long numDivisiones = 1;

    System.out.println("Los trocitos del número son los siguientes: ");

    do {

      long numParejas = 1;
      num = trozo;
      //valor de la primera pareja y número de parejas.
      if (trozo < 100) {
        System.out.println(trozo);
        numDivisiones = 0;
      } else {
        while (trozo > 100) {
          trozo /= 100;
          numParejas++;
        }
        
        System.out.println(trozo);
        
        numDivisiones = numParejas - 1;
        primeraPareja = trozo;

        long potencia = (long) Math.pow(100, numDivisiones);

        trozo = num - primeraPareja * potencia;
      }
    } while (numDivisiones != 0);
  }
}
