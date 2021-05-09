/**
 * Ejercicio 18
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *
 * @author cruz
 *
 */
package t6;

public class Ej18_pintaDormitorio {

  public static void main(String[] args) {

    System.out.print("Los colores de los dormitorios serán: ");

    boolean pintado0 = false;
    boolean pintado1 = false;
    boolean pintado2 = false;
    boolean pintado3 = false;
    boolean pintado4 = false;
    boolean pintado5 = false;

    for (int i = 0; i < 3; i++) {
      int color = (int) (Math.random() * 6);

      switch (color) {
        case 0:
          if (pintado0 == false) {
            System.out.print("rojo ");
            pintado0 = true;
          } else {
            i--;
          }
          break;
        case 1:
          if (pintado1 == false) {
            System.out.print("azul ");
            pintado1 = true;
          } else {
            i--;
          }
          break;
        case 2:
          if (pintado2 == false) {
            System.out.print("verde ");
            pintado2 = true;
          } else {
            i--;
          }
          break;
        case 3:
          if (pintado3 == false) {
            System.out.print("amarillo ");
            pintado3 = true;
          } else {
            i--;
          }
          break;
        case 4:
          if (pintado4 == false) {
            System.out.print("violeta ");
            pintado4 = true;
          } else {
            i--;
          }
          break;
        case 5:
          if (pintado5 == false) {
            System.out.print("naranja ");
            pintado5 = true;
          } else {
            i--;
          }
          break;
        default:
      }

    }
    System.out.println("");
  }

}
