/**
 * Aquí se encuentran algunas funciones extras que he ido creando a lo largo
 * del curso.
 *
 * @author cruz
 *
 */
package ex11clp;

import java.util.Scanner;

public class Varias {

  /***** COMPRUEBA SI EL DATO QUE METE EL USUARIO ES VÁLIDO
   * 
   * @param num dato a comprobar
   */
  public static void compruebaSiDatoCorrecto(int num) {
    
    boolean check;
    int numIntroducido;

    Scanner s = new Scanner(System.in);

    do {
      check = true;

      System.out.print("Introduzca un número par: ");//condición que se pide
      numIntroducido = Integer.parseInt(s.nextLine());

      if (numIntroducido % 2 != 0) { //condición que hay que comprobar
        System.out.println("Lo siento. El número no es par.");
        System.out.println("Vuelva a intentarlo.");
        check = false;
      }
    } while (!check);
  }
  /** CONVIERTE UN NÚMERO A CÓDIGO MORSE *******
   * 
   * @param n
   * @return cadena de caracteres con el número en morse
   */
  public static String convierteEnMorse(int n) {
    String[] numerosEnMorse = {" _ _ _ _ _",". _ _ _ _",". . _ _ _",". . . _ _",
      ". . . . _",". . . . .","_ . . . .","_ _ . . .","_ _ _ . ."," _ _ _ _ ."};
    String resultado = "";
    for (int i = 0; i < MyMaths.cuentaDigitos(n); i++) {
      resultado += numerosEnMorse[MyMaths.posicionDigito(n, i)] + "  ";
    }
    return resultado;
  }
  /******** PINTA NIEVE **************
   * 
   * @param alturaNieve altura de la nieve
   * @param anchoVentana ancho de la nieve por pantalla
   * @param probabilidad probabilidad de que aparezca nieve en una posición
   */
  public static void pintaNieve(int alturaNieve, int anchoVentana, int probabilidad) {
    
    for (int i = 0; i < alturaNieve; i++) { //altura de la nieve
      for (int j = 0; j < anchoVentana; j++) {
        if ((int) (Math.random() * probabilidad) == 0){
          System.out.print("*");
        } else {
          System.out.print(" "); //hueco sin nieve
        }
      }
      System.out.println();
    }
  }
}
