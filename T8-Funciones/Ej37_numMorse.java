/**
 * Ejercicio 37
 * Crea una función con la siguiente cabecera:
 * public String convierteEnMorse(int n)
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres.
 * Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse.
 * Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar 
 * print desde el programa principal.
 * 1 . _ _ _ _ 6 _ . . . .
 * 2 . . _ _ _ 7 _ _ . . .
 * 3 . . . _ _ 8 _ _ _ . .
 * 4 . . . . _ 9 _ _ _ _ .
 * 5 . . . . . 0 _ _ _ _ _
 *
 * @author cruz
 *
 */
package t8_funciones;

import java.util.Scanner;
import misfunciones.MyMaths;

public class Ej37_numMorse {

  public static void main(String[] args) {
    System.out.print("Introduzca un número para convertirlo a morse: ");
    Scanner s = new Scanner(System.in);
    
    int num = Integer.parseInt(s.nextLine());
    System.out.println(convierteEnMorse(num));
    
  }
  
  public static String convierteEnMorse(int n) {
    String[] numerosEnMorse = {" _ _ _ _ _",". _ _ _ _",". . _ _ _",". . . _ _",
      ". . . . _",". . . . .","_ . . . .","_ _ . . .","_ _ _ . ."," _ _ _ _ ."};
    String resultado = "";
    for (int i = 0; i < MyMaths.cuentaDigitos(n); i++) {
      resultado += numerosEnMorse[MyMaths.posicionDigito(n, i)] + "  ";
    }
    return resultado;
  }
  
}
