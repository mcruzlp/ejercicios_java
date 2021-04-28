/**
 * CRUZ LÓPEZ PÉREZ
 * Ex07abr
 * 
 * Ejercicios 1 y 2
 * 
 * @author cruz
 */

package ex11clp;

public class Complejo {

  private float real;
  private float imagin;

  public Complejo(float real, float imagin) {
    this.real = real;
    this.imagin = imagin;
  }

  @Override
  public String toString() {
    String complejo = imagin < 0.0 ? real + " - " + -1*imagin + "i": real + " + " + imagin + "i";
    return complejo;
  }
  
  // Ejercicio 2 ****************************

  public float getReal() {
    return real;
  }

  public void setReal(float real) {
    this.real = real;
  }

  public float getImagin() {
    return imagin;
  }

  public void setImagin(float imagin) {
    this.imagin = imagin;
  }
  
  public Complejo suma(Complejo y){
    float parteReal = this.real + y.getReal();
    float parteImagin = this.imagin + y.getImagin();
    Complejo suma = new Complejo (parteReal, parteImagin);
    return suma;

  }
  
  public Complejo multiplica(int r){
    float parteReal = this.real * r;
    float parteImagin = this.imagin * r;
    Complejo prodEscalar = new Complejo (parteReal, parteImagin);
    return prodEscalar;
  }
  
  public Complejo multiplica(Complejo y){
    float parteReal = this.real * y.getReal() - this.imagin * y.getImagin();
    float parteImagin = this.real * y.getImagin() + this.imagin * y.getReal();
    Complejo prodCompl = new Complejo (parteReal, parteImagin);
    return prodCompl;
  }
  
}
