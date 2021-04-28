/**
 * CRUZ LÓPEZ PÉREZ
 * Ex07abr
 * 
 * Ejercicios 3 y 4
 * 
 * @author cruz
 */
package ex11clp;

public class Apuesta {
  
  private int[] numeros = new int[6];

  public Apuesta() { //generador de apuestas aleatorio
    for (int i = 0; i < 6; i++) {
      numeros[i] = (int)(Math.random()*48+1);
    }
  }

  public Apuesta(int i, int i0, int i1, int i2, int i3, int i4) {

    numeros[0] = i;
    numeros[1] = i0;
    numeros[2] = i1;
    numeros[3] = i2;
    numeros[4] = i3;
    numeros[5] = i4;
    
    /*for (int j = 1; j < 6; j++) {
      for (int k = j-1; k < 5; k++) {
        if(numeros[k]==numeros[j]){
          System.out.println("Error: No puede haber números repetidos.");
        }
      }
    }* NO LO HE TERMINADO*/
      
    
    for (int numero : numeros) {
      if (numero < 1 || numero > 49){
        System.out.println("Error: Número/s fuera de rango. Los números deben"
          + " estar comprendidos entre el 1 y el 49.");
      }
    }
  }

  @Override
  public String toString() {
    String apuesta = "";
    for (int numero : numeros) {
      apuesta += numero + " ";
    }
    return apuesta;
  }
  
  
  
}
