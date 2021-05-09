/*
Ejercicio 1

Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 */
package t6;

public class Ej01_3dados {

  public static void main(String[] args) {
    
    System.out.println("Tirada de 3 dados: ");
    int tirada = 0;
    int suma = 0;
    for(int i = 0; i <= 2; i++){
      tirada = (int)(Math.random()*6 + 1);
      System.out.println(tirada);
      suma = tirada + suma;
    }
    System.out.println("La suma total es: " + suma);
  }
  
}
