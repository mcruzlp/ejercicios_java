/*
 * Cruz López Pérez
 * 18/11/2020
 *
 */
package ex11mcruzlp;

import java.util.Scanner;

public class Ex11mcruzlp4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número: ");
    int numIntroducido = Integer.parseInt(s.nextLine());
    int copiaNumero = numIntroducido;
    
    int cont;

    do {
      int aux1 = copiaNumero;
      int numDigitos = 0;
      //valor del primer dígito y número de dígitos.
      while (aux1 > 0){
        aux1 = aux1 / 10;
        numDigitos++;
       // int cont = numDigitos;
      }

      int primerDigito = aux1;
      cont = numDigitos;

      //sustitución del dígito por su letra correspondiente.
      switch (primerDigito){
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
      
      //cálculo de potencia sustituible por la función pow de Math
      int potencia = 1;
      for (int i = 1; i < numDigitos; i++){
        potencia = potencia * 10;
      }
      int numResultante = copiaNumero - (aux1 * potencia);
      //comprueba si algún dígito intermedio es cero
      int aux1 = numResultante;
      int numDigitos2 = 1;
      while (aux1 > 10) {
        aux1 = aux1 / 10;
        numDigitos2++ ;
      }
      if (numDigitos2 == numDigitos-2){
        System.out.print("O");
      }

    } while (numDigitos > 1);
    
    System.out.println("");

  }
}
