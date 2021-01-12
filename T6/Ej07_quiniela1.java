/*
 * Ejercicio 7
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author cruz
 *
 */
package t6;

public class Ej07_quiniela1 {

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
        int apuesta = (int) (Math.random() * 3);
        switch (apuesta) {
          case 0:
            System.out.print("    1");
            break;
          case 1:
            System.out.print("    X");
            break;
          case 2:
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
