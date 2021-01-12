/*
 * Ejercicio 9
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 * @author cruz
 *
 */
package t6;

public class Ej09_cuenta24 {

  public static void main(String[] args) {
    boolean comprobar = false;
    int cont = 0;
    do{
      int numGenerado = (int)(Math.random()*100+1);
      if (numGenerado % 2 == 0){
        System.out.println(numGenerado);
        if (numGenerado == 24){
         comprobar = true;
        }
        cont++;
      }
    }while(comprobar == false);
    System.out.printf("Se han imprimido %d números\n", cont);
  }
}
