/*
 * Muestra al azar 20 números aleatorios entre 2 y 1000 que sean primos.
 * Se van generando números aleatorios entre 2 y 1000. En caso de que el número 
 * generado sea primo, se pinta y se incrementa un contador. El programa termina
 * cuando se hayan mostrado 20 primos.
 *
 * @author cruz
 *
 */
package t6;

public class Ej00_primos {

  public static void main(String[] args) {

    int numPrimos = 0;
    boolean esPrimo;

    do {
      int num = (int) (Math.random() * 999) + 2;
      esPrimo = true;
      for (int i = 2; i < num; i++) {
        if ((num % i) == 0) {
          esPrimo = false;
        }
        if(esPrimo){
          System.out.println(num);
          numPrimos++;
        }
      }
    }while (numPrimos < 20);
    System.out.println(numPrimos);
  }
}
