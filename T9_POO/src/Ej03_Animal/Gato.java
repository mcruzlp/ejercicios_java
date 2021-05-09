/**
 * @author cruz
 */
package Ej03_Animal;

public class Gato extends Mamifero{

  // atributos de instancia *********************************
  private String raza = "";
  private String color = "";

  // constructor *********************************************
  public Gato(){
  }
  public Gato(String col) {
    this.color = col;
  }
  
  public Gato(String r, String col) {
    this.raza = r;
    this.color = col;
  }

  public Gato(Sexo sexo) {
    super(sexo);
  }

  public Gato(Sexo sexo, String r) {
    super(sexo);
    this.raza = r;
  }
  
  public Gato(Sexo sexo, String r, String col) {
    super(sexo);
    this.raza = r;
    this.color = col;
  }
  
  // methods *********************************************
  public void maulla() {
    System.out.println("miau");
  }

  public void juega() {
    System.out.println("Me gustan los hilos");
  }
}
