/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cruz
 */
public class Navidad {

  /**
   * @param args the command line arguments
   */
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
          int color = (int)(Math.random()*6 + 1);
          switch (color){
            case 1: System.out.print("\033[31m");       
              break;
            case 2: System.out.print("\033[32m");
              break;
            case 3: System.out.print("\033[33m");
              break;
            case 4: System.out.print("\033[92m");
              break;
            case 5: System.out.print("\033[31m");
              break;
            case 6: System.out.print("\033[36m");
              break;
            default:System.out.print("\033[31m");
          }
          System.out.print("*");
        }
        System.out.println();
      }
      
      //////////////////felices fiestas
      System.out.println("****  ****  *     *  ****  ****  ****    ****  *  ****  ****  ***   **  ****");
      System.out.println("*     *     *     *  *     *     *       *     *  *     *      *   *  * *");
      System.out.println("***   ***   *     *  *     ***   ****    ***   *  ***   ****   *   **** ****");
      System.out.println("*     *     *     *  *     *        *    *     *  *        *   *   *  *    *");
      System.out.println("*     ****  ****  *  ****  ****  ****    *     *  ****  ****   *   *  * ****");
      
      System.out.println();
      
    }
  }
  
}
