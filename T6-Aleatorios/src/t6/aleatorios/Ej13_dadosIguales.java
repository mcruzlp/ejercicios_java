/*
 * Ejercicio 13
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author cruz
 *
 */
package t6;

public class Ej13_dadosIguales {

  public static void main(String[] args) {
    System.out.println("Tirada de 2 dados: ");
    boolean iguales = false;
    do{
      int tirada1 = (int) (Math.random() * 6 + 1);
      System.out.print(tirada1 + " ");
      int tirada2 = (int) (Math.random() * 6 + 1);
      System.out.println(tirada2);
      if (tirada1 == tirada2){
        iguales = true;
      }
    }while(iguales == false);
  }
}
