/*
 * Problema 4
 * @author cruz
 *
 */
package ex11mcruzlp;



public class Ex11mcruzlp4 {

  public static void main(String[] args) {
    
    boolean iguales = false;
    int numTiradas = 1;
    
    do{
      
      System.out.println("Tirada " + numTiradas);
      System.out.println();
      
      int tirada1 = (int) (Math.random() * 6 + 1);
      System.out.println("Dado 1:" + tirada1);
      int tirada2 = (int) (Math.random() * 6 + 1);
      System.out.println("Dado 2:" + tirada2);
      int tirada3 = (int) (Math.random() * 6 + 1);
      System.out.println("Dado 3:" + tirada3);
      
      if (tirada1 == tirada2 || tirada1 == tirada3 || tirada3 == tirada2){
        iguales = true;
      }
      
      numTiradas++;
      System.out.println();
      
    }while(iguales == false);
  }
}
