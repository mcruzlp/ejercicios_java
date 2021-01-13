/*
 * Cruz López Pérez
 * 18/11/2020
 *
 */
package ex11mcruzlp;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Ex11mcruzlp4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    int aux1 = num;
    
    int numDigitos = 1;
    int primerDigito;
    int cont = numDigitos;
    String letra = "a";
    String numCodificado = "a";
    int potencia = 1;
  
    do{
      //valor del primer dígito y número de dígitos.
      while (aux1 > 10){
        aux1 = aux1 / 10;
        numDigitos++;
      }
      primerDigito = aux1;
      cont = numDigitos;

      switch (primerDigito){
        case 0:
          System.out.print("O");
        break;
        case 1:
          System.out.print("I");
          break;
        case 2:
          System.out.print("Z");
        break;
        case 3:
          System.out.print("B");
        break;
        case 4:
          System.out.print("A");
        break;       
        case 5:
          System.out.print("S");
        break;
        case 6:
          System.out.print("G");
        break;
        case 7:
          System.out.print("L");
        break;
        case 8:
          System.out.print("H");
        break;
        case 9:
          System.out.print("N");
        break;
        default:
      }
      
      numCodificado = letra + numCodificado;
      
      for (int i = 0; i == numDigitos; i++){
        potencia = potencia * 10;
      }
      int resta = primerDigito * potencia;

      aux1 = aux1 - resta;
      cont--;
      
    } while (cont != 0);
    
    System.out.println("El número codificado es: " + numCodificado);

  }
}

