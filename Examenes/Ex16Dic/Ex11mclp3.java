/*
**
*/
package t5;

import java.util.Scanner;

public class Ex11mclp3 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    
    int aux1 = num;
    int numRecortado = num;
    int primerDigito;
    int numDigitos = 1;
    int numDiv;
    int i = 1;
    
    //valor del primer dígito y número de dígitos.
    while (aux1 > 10){
      aux1 = aux1 / 10;
      numDigitos++;
    }
    
    primerDigito = aux1;
    
    //cálculo de cuántas veces hay que recortar el número.
    numDiv = numDigitos - primerDigito;
    
    //recorte del número.
    while (i <= numDiv) {
      numRecortado = numRecortado / 10;
      i++;
    }
    
    if (primerDigito > numDigitos){
      System.out.println("El número recortado es: " + num);
    } else{
        System.out.println("El número recortado es: " + numRecortado);
    }
    
  }
  
}
