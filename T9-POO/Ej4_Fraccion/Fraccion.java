/**
 * 
 * Ejercicio 4
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y 
 * algunos de los métodos pueden ser invierte, simplifica, multiplica, divide, 
 * etc.
 * 
 *
 * @author cruz
 *
 */

package Ej4_Fraccion;

public class Fraccion {
  /* Atributos *********************************/
    private int numerador;
    private int denominador;
    
  /* Métodos **********************************/
    
    
  /* Met. Constructor *********************/

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  /* Met. Getter y Setter *****************/
  
  /* Otros métodos ****************************/
  
  @Override
  public String toString() {
    return numerador + "/" + denominador;
  }
  
  public Fraccion multiplica (int x){
      return null;
  
  }
  
  public Fraccion multiplica (Fraccion f){
      return null;
  
  }
    
}