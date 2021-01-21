/*
 * Problema 3
 * @author cruz
 *
 */
package ex11mcruzlp;

import java.util.Scanner;



public class Ex11mcruzlp3 {

  public static void main(String[] args) {
    
    boolean check;
    long numIntroducido;

    Scanner s = new Scanner(System.in);

    do {
      check = true;

      System.out.print("Introduzca un número: ");
      numIntroducido = Long.parseLong(s.nextLine());

      if (numIntroducido % 2 != 0) {
        System.out.println("Lo siento. El número introducido tiene longitud "
          + "impar, no se puede partir en trocitos.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);

    long num = numIntroducido;
    long trozo = numIntroducido;
    long primeraPareja;
    long numParejas = 1;
    long numDivisiones;
    long i = 1;
    
    //valor de la primera pareja y número de parejas.
    while (num > 100){
      num = num / 100;
      numParejas++;
    }
    
    primeraPareja = num;
    
    //cálculo de cuántas veces hay que recortar el número.
    numDivisiones = numParejas*2 - primeraPareja;
    
    //recorte del número.
    while (i <= numDivisiones) {
      trozo = trozo / 10;
      i++;
    }
    
    System.out.println("Los trocitos del número son: " + trozo);
  }
}
