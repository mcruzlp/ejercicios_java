/*
 * Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
 *
 * @author cruz
 *
 */



public class Ej02_simbol {

  public static void main(String[] args) {
    char[] simbol = new char[10];

    simbol[0] = 'a';
    simbol[1] = 'x';
    simbol[4] = '@';
    simbol[6] = ' ';
    simbol[7] = '+';
    simbol[8] = 'Q';

    System.out.println("Los valores del array simbol son: ");
    for (int i = 0; i <= 9; i++) {
      System.out.println(simbol[i]);
    }
  }
}
