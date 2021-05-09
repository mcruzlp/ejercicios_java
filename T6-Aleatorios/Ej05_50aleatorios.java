/*
 * Ejercicio 5
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 *
 * @author cruz
 *
 */
package t6;

public class Ej05_50aleatorios {

  public static void main(String[] args) {
    int suma = 0;
    int max = 0;
    int min = 199;
    
    for(int i = 0; i < 50; i++){
      int numGenerado = (int)(Math.random()*101+100);
      System.out.print(numGenerado + " ");
      suma = numGenerado + suma;

      if(max < numGenerado){
        max = numGenerado;
      }
      
      if(min > numGenerado){
        min = numGenerado;
      }
    }

    int media = suma/50;
    
    System.out.println("\nEl número máximo es: " + max);
    System.out.println("\nEl número mínimo es: " + min);
    System.out.println("\nLa media es: " + media);
  }
  
}
