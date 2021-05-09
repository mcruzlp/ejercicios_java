package t4;

import java.util.Scanner;

/*
 * Ejercicio 8
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author cruz
 *
 */

public class Ej08_notasBoletin {

  public static void main(String[] args) {
    System.out.print("Introduzca las notas de las que quiere obtener "
      + "la media, separadas por espacios: ");
    Scanner s = new Scanner(System.in);
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();
    
    double media = (double)((nota1+nota2+nota3)/3);
    System.out.printf("La nota media es : %.2f\n",media);
    
    switch ((int)media){
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Suspenso");
        break;
      case 5:
        System.out.println("Suficiente");
        break;
      case 6:
        System.out.println("Bien");
        break;
      case 7:
      case 8:
        System.out.println("Notable");
        break;
      case 9:
      case 10:
        System.out.println("Sobresaliente");
        break;
    }
  }
  
}
