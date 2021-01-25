/*
 * Ejercicio 4
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 *
 * @author cruz
 *
 */

public class Ej04_3arrays_exp2exp3 {
  public static void main(String[] args) {

    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    for (int i = 0; i <= 19; i++) {
      numero[i] = (int) (Math.random() * 100 + 1);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
    }

    System.out.print("Número\t");
    System.out.print("Número^2\t");
    System.out.print("Número^3");
    System.out.println();

    for (int i = 0; i <= 19; i++) {
      System.out.print(numero[i] + "\t");
      System.out.print(cuadrado[i] + "\t\t");
      System.out.print(cubo[i]);
      System.out.println();
    }
  }
}
