/**
 * @author cruz
 */
package Ej03_Animal;

public class Perro extends Mamifero{

  // atributos de instancia *********************************
  private String raza = "";
  private String color = "";

  // constructor *********************************************

  public Perro() {
  }
  
  public Perro(String raza){
    this.raza = raza;
  }
  
  public Perro(String raza, String color){
    this.raza = raza;
    this.color = color;
  }
  
  public Perro(Sexo sexo) {
    super(sexo);
  }
  
  public Perro(Alimentacion alim) {
    super(alim);
  }
  
  public Perro(Sexo sexo, String raza, String color) {
    super(sexo);
    this.raza = raza;
    this.color = color;
  }

  public Perro(Sexo sexo, Alimentacion alim, String raza, String color) {
    super(sexo, alim);
    this.raza = raza;
    this.color = color;
  }

  public Perro(Sexo sexo, Alimentacion alim, String tipoMedio) {
    super(sexo, alim, tipoMedio);
  }

  public Perro(Sexo sexo, Alimentacion alim, String tipoMedio, String tipoNacimiento, String raza, String color) {
    super(sexo, alim, tipoMedio, tipoNacimiento);
    this.raza = raza;
    this.color = color;
  }

  // métodos *********************************************
  public void mueveLaCola() {
    System.out.println("Estoy muy contento");
  }

  public void ladra() {
    System.out.println("¡guau, guau!");
  }

  public void traeLaPelota() {
    System.out.println("Me encanta jugar");
  }
}
