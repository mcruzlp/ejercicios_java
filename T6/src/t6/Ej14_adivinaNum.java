/*
 * Ejercicio 14
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author cruz
 *
 */
package t6;

import java.util.Scanner;

public class Ej14_adivinaNum {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Piensa un número de 0 a 100, yo trataré de adivinarlo.");
    boolean acierto = false;
    //boolean intentos = true;
    int numIntentos = 4;
    int tipoError;
    int numMayor = 100;
    int numMenor = 1;
    
    do{
      System.out.print("¿El número que estás pensando es:");
      int numGenerado = (int)(Math.random()*numMayor + numMenor);/*cuando el numMenor está 
      muy cerca del número correcto, al sumarlo al numMayor, se pasa del intervalo*/
      System.out.println(numGenerado + "?");
      System.out.print("Pulsa [Y/n]");
      String respuesta = s.nextLine();
      if (respuesta.equals("Y")){
        acierto = true;
        System.out.println("¡Bien! ^_^");
      } else{
        if (numIntentos <= 0) {
          System.out.println("¡oh, no! Se me han acabado los intentos Ú_Ù");
          acierto = true;//intentos == false;
        } else {
          System.out.printf("Vaya, probaré otra vez, aún tengo %d intentos.\n", numIntentos);
          System.out.print("¿El número te he dicho es mayor o menor que ");
          System.out.println("el que has pensado? 1=mayor, 2=menor");
          tipoError = Integer.parseInt(s.nextLine());
          numIntentos--;
          if (tipoError == 2) {
                numMenor = numGenerado;
          }
          if (tipoError == 1){
                numMayor = numGenerado;
          }else while (tipoError > 2){
              System.out.println("Número incorrecto, introduzca 1=mayor o 2=menor");
              tipoError = Integer.parseInt(s.nextLine());
            }
        }
      }
    }while(acierto == false/* intentos == true */);
  }
}
