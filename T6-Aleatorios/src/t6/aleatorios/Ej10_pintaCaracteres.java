/*
 * Ejercicio 10
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma 
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben 
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author cruz
 *
 */
package t6;

public class Ej10_pintaCaracteres {

  public static void main(String[] args) {
    for (int j = 0; j < 10; j++){
      int caracter = (int) (Math.random() * 6 + 1);
      int longitud = (int) (Math.random() * 40 + 1);
      for(int i=1; i <= longitud; i++){
        switch (caracter) {
          case 1:
            System.out.print("*");
            break;
          case 2:
            System.out.print("-");
            break;
          case 3:
            System.out.print("=");
            break;
          case 4:
            System.out.print(".");
            break;
          case 5:
            System.out.print("|");
            break;
          case 6:
            System.out.print("@");
            break;
          default:
        }
      }
      System.out.println();
    }
  }
}
