
package ex16dicmclp;

public class Ej01exam {

  public static void main(String[] args) {
    boolean noEsPrimo = true;
    int cont = 0;
    
    while(noEsPrimo){
      noEsPrimo = true;
      
      int numGenerado = (int)((Math.random()*199))+2;
      if ((numGenerado % 2) != 0){
        System.out.print(numGenerado);
        cont++;
        for (int i = 2; i < numGenerado; i++){
          if ((numGenerado % i) != 0){
            noEsPrimo = false;
          }
        }
      }
    }
    
    System.out.printf("\nSe han imprimido %d números impares.\n",cont);
  }
}
