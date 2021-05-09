/*
 * Ejercicio 11
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final aparecerá el número de suspensos, el número de suficientes, el 
 * número de bienes, etc.
 *
 * @author cruz
 *
 */
package t6;

public class Ej11_notasAzar {

  public static void main(String[] args) {
    int suspensos = 0;
    int suficientes = 0;
    int bien = 0;
    int notables = 0;
    int sobresalientes = 0;
    for (int i = 1; i <= 20; i++) {
      int notas = (int) (Math.random() * 11);
      System.out.println(notas);
      switch (notas) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
          suspensos++;
          break;
        case 5:
          suficientes++;
          break;
        case 6:
          bien++;
          break;
        case 7:
        case 8:
          notables++;
          break;
        case 9:
        case 10:
          sobresalientes++;
          break;
      }
    }
    System.out.printf(" Notas suspensas: %2d\n", suspensos);
    System.out.printf(" Notas suficientes: %2d\n", suficientes);
    System.out.printf(" Notas bien: %2d\n", bien);
    System.out.printf(" Notas notables: %2d\n", notables);
    System.out.printf(" Notas sobresalientes: %2d\n", sobresalientes);
  }
}
