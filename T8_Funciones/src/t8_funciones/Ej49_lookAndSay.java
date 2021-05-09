/**
 * Ejercicio Ejercicio 49
 * Escribe un programa que genere los n primeros términos de la sucesión look
 * and say. El primer término es 1. A continuación se va leyendo - un uno - por
 * tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
 * Se recomienda usar arrays para almacenar los dígitos porque los tipos int y
 * long son muy limitados en cuanto al número de dígitos. También puede resultar
 * de ayuda utilizar las funciones convierteArrayEnString y concatena definidas
 * en los ejercicios anteriores.
 * Ejemplo 1:
 * ¿Cuántos términos de la sucesión look and say quiere calcular? 8
 * 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211
 *
 * @author cruz
 *
 */
package t8.funciones;

import java.util.Scanner;
import funcionesCruz.Arrays;
import funcionesCruz.MyMaths;



public class Ej49_lookAndSay {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("¿Cuántos términos de la sucesión look and say "
      + "quiere calcular?");

    int numTerminos = Integer.parseInt(s.nextLine());
    
    int[] sucesion = lookAndSay(numTerminos);
    Arrays.pintaArray(sucesion);  
  }
  public static int[] lookAndSay(int numTerminos) {

    int[] sucesion = new int[numTerminos];

    sucesion[0] = 1;
    int numPrevio = 1;
    int numDigitos = 1;
    int longitud = numDigitos;
    int numTrozos = 1;
    int[] trozo = new int[numDigitos];
    int[] trozosJuntos = new int[numTrozos];

    for (int i = 1; i < numTerminos; i++) {

      if (numPrevio > 10) { //si el núm tiene 2 o más cifras
        numDigitos = MyMaths.cuentaDigitos(numPrevio);//cuenta las cifras
        int[] arrayNumPrevio = MyMaths.convierteArray(numPrevio);//lo convierte en array
        for (int j = 0; j < arrayNumPrevio.length; j++) {//y recorre el array
          if (arrayNumPrevio[j + 1] == arrayNumPrevio[j]) {//para comprobar si una cifra es igual a la siguiente
            longitud--;//si lo es, guarda la cantidad de cifras iguales para
            trozo[j] = MyMaths.quitaPorDelante(numPrevio, numDigitos - longitud);
          } else {//dividir el array en trozos 
            trozo[j] = arrayNumPrevio[j];
            longitud++;
          }
          numTrozos++;
          for (int k = 0; k < numTrozos; k++) {
            trozosJuntos = Arrays.concatena(trozosJuntos, trozo);
          }
        }
        sucesion[i] = trozosJuntos[i];
      }

      sucesion[i] = sucesion[i - 1] * 10 + numPrevio;
      numPrevio = sucesion[i];
    }
    return sucesion;
  }
}
