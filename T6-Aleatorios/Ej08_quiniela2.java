/*
 * Ejercicio 8
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que 
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author cruz
 *
 */
package t6;

public class Ej08_quiniela2 {

  public static void main(String[] args) {
    System.out.println("   ┌──────────┬──────────┬──────────┐");
    System.out.println("   │ Columna1 │ Columna2 │ Columna3 │");
    System.out.println("   ├──────────┼──────────┼──────────┤");
    int j = 3;
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%2d │", i);
      if (i == 15) {
        j = 1;
      }
      for (int bloques = 1; bloques <= j; bloques++) {
        int apuesta = (int) (Math.random() * 6);
        switch (apuesta) {
          case 0:
          case 1:
          case 2:
            System.out.print("    1");
            break;
          case 3:
          case 4:
            System.out.print("    X");
            break;
          case 5:
            System.out.print("    2");
            break;
          default:
        }
        System.out.printf("     │");
      }
      System.out.println();
    }
    System.out.println("   ├──────────┼──────────┼──────────┤");
  }
}