/*
 * Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.
 *
 * @author cruz
 *
 */
package t4.condicional;

import java.util.Scanner;

public class Ej15_piramideCaracteres {

  public static void main(String[] args) {
    System.out.println("Introduce el caracter con el que quieres dibujar la "
      + "pirámide, ");
    System.out.print("una letra, un número o un símbolo como *, +, -, $, &,"
      + "etc.): ");
    Scanner s = new Scanner(System.in);
    String caracter = s.nextLine();

    System.out.println("Introduce la dirección en la que quieres que apunte la "
      + "pirámide: ");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int direccion = Integer.parseInt(s.nextLine());

    switch (direccion) {
      case 1:
        System.out.println(" " + " " + caracter);
        System.out.println(" " + caracter + caracter + caracter);
        System.out.println(caracter + caracter + caracter + caracter + caracter);
        break;
      case 2:
        System.out.println(caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter);
        System.out.println(" " + " " + caracter);
        break;
      case 3:
        System.out.println(caracter);
        System.out.println(caracter + caracter);
        System.out.println(caracter + caracter + caracter);
        System.out.println(caracter + caracter);
        System.out.println(caracter);
        break;
      case 4:
        System.out.println(" " + " " + caracter);
        System.out.println(" " + caracter + caracter);
        System.out.println(caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter);
        System.out.println(" " + " " + caracter);
        break;
      default:
    }

  }

}
