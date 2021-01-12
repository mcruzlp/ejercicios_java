/*
 * Ejercicio 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios
 * (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting 
 * con (char) para convertir un entero en un carácter.
 *
 * @author cruz
 *
 */
package t6;

public class Ej12_matrix {

  public static void main(String[] args) {
    while(true){
      //////////////parte superior
      for (int nieve = 0; nieve < 10; nieve++){
        int numAsteriscos = (int)(Math.random() * 50);
        for (int i = 0; i <= numAsteriscos; i++){
          int position = (int)(Math.random() * 10);
          for (int anchoPantalla = 0; anchoPantalla <= (position-1); anchoPantalla++){
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
      
      //////////////////felices fiestas
      int color = (int)(Math.random()*6 + 1);
      switch (color){
        case 1: System.out.print("\033[31m");       
          break;
        case 2: System.out.print("\033[32m");
          break;
        case 3: System.out.print("\033[33m");
          break;
        case 4: System.out.print("\033[34m");
          break;
        case 5: System.out.print("\033[35m");
          break;
        case 6: System.out.print("\033[36m");
          break;
        default:System.out.print("\033[31m");
      }
      System.out.println("**** **** *    * **** **** ****   **** * **** **** ****  **  ****");
      switch (color){
        case 1: System.out.print("\033[31m");       
          break;
        case 2: System.out.print("\033[32m");
          break;
        case 3: System.out.print("\033[33m");
          break;
        case 4: System.out.print("\033[34m");
          break;
        case 5: System.out.print("\033[35m");
          break;
        case 6: System.out.print("\033[36m");
          break;
        default:System.out.print("\033[31m");
      }
      
      System.out.println("*    *    *    * *    *    *      *    * *    *     *   *  * *");
      switch (color){
        case 1: System.out.print("\033[31m");       
          break;
        case 2: System.out.print("\033[32m");
          break;
        case 3: System.out.print("\033[33m");
          break;
        case 4: System.out.print("\033[34m");
          break;
        case 5: System.out.print("\033[35m");
          break;
        case 6: System.out.print("\033[36m");
          break;
        default:System.out.print("\033[31m");
      }
      System.out.println("***  ***  *    * *    ***  ****   ***  * ***  ****  *   **** ****");
      switch (color){
        case 1: System.out.print("\033[31m");       
          break;
        case 2: System.out.print("\033[32m");
          break;
        case 3: System.out.print("\033[33m");
          break;
        case 4: System.out.print("\033[34m");
          break;
        case 5: System.out.print("\033[35m");
          break;
        case 6: System.out.print("\033[36m");
          break;
        default:System.out.print("\033[31m");
      }
      System.out.println("*    *    *    * *    *       *   *    * *       *  *   *  *    *");
      switch (color){
        case 1: System.out.print("\033[31m");       
          break;
        case 2: System.out.print("\033[32m");
          break;
        case 3: System.out.print("\033[33m");
          break;
        case 4: System.out.print("\033[94m");
          break;
        case 5: System.out.print("\033[35m");
          break;
        case 6: System.out.print("\033[96m");
          break;
        default:System.out.print("\033[31m");
      }
      System.out.println("*    **** **** * **** **** ****   *    * **** ****  *   *  * ****");
      
      System.out.println();
      
      
      for (int nieve = 0; nieve < 10; nieve++){
        int numAsteriscos = (int)(Math.random() * 50);
        for (int i = 0; i <= numAsteriscos; i++){
          int position = (int)(Math.random() * 10);
          for (int anchoPantalla = 0; anchoPantalla <= (position-1); anchoPantalla++){
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
