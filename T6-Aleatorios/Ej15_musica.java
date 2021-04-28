/*
 * Ejercicio 15
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se 
 * marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * Ejemplo 1:
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 * Ejemplo 2:
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re |
 * fa la do la ||
 *
 *
 * @author cruz
 */

package t6;

public class Ej15_musica {

  public static void main(String[] args) {
    int numNotas;
    int nota;
    int i;
    int primeraNota = 0;

    do{
    	numNotas = (int)(Math.random()*27+1);
    }while (numNotas < 4 || (numNotas + 1) % 4 != 0);
    for (i = 1; i <= numNotas; i++) {
      nota = (int) (Math.random() * 7 + 1);
      if (i == 1) {
        primeraNota = nota;
      }
      switch (nota) {
        case 1:
          System.out.print(" do");
          break;
        case 2:
          System.out.print(" re");
          break;
        case 3:
          System.out.print(" mi");
          break;
        case 4:
          System.out.print(" fa");
          break;
        case 5:
          System.out.print(" sol");
          break;
        case 6:
          System.out.print(" la");
          break;
        case 7:
          System.out.print(" si");
          break;
        default:
      }
      if (i % 4 == 0) {
        System.out.print(" |");
      }
     }
     int ultimaNota = primeraNota;
     switch (ultimaNota) {
       case 1:
         System.out.print(" do");          
         break;
       case 2:
         System.out.print(" re");
         break;
       case 3:
         System.out.print(" mi");
         break;
       case 4:
         System.out.print(" fa");
         break;
       case 5:
         System.out.print(" sol");
         break;
       case 6:
         System.out.print(" la");
         break;
       case 7:
         System.out.print(" si");
         break;
       default:
     }
     System.out.print("||\n");
  }
}
