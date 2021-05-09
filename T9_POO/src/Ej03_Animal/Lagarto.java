/**
 * @author cruz
 */
package Ej03_Animal;

public class Lagarto extends Animal {

  // atributos de instancia *********************************
  private String color = "";
  private boolean esVenenoso;

  // constructor *********************************************
  public Lagarto() {
  }

  public Lagarto(String color) {
    this.color = color;
  }

  public Lagarto(String color, boolean esVenenoso) {
    this.color = color;
    this.esVenenoso = esVenenoso;
  }

  public Lagarto(Sexo sexo) {
    super(sexo);
  }

  public Lagarto(Alimentacion alim) {
    super(alim);
  }

  public Lagarto(Sexo sexo, Alimentacion alim) {
    super(sexo, alim);
  }

  public Lagarto(Sexo sexo, Alimentacion alim, String color, boolean esVenenoso) {
    super(sexo, alim);
    this.color = color;
    this.esVenenoso = esVenenoso;
  }

  // métodos *********************************************
  public boolean getEsVenenoso() {
    return esVenenoso;
  }

  public void setEsVenenoso(boolean esVenenoso) {
    this.esVenenoso = esVenenoso;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void tomaElSol() {
    System.out.println("Estoy tomando el Sol");
  }

  public void pelea() {
    if (esVenenoso){
      System.out.println("Como te muerda te vas a enterar");
    } else System.out.println("Me he escondido, ya no puedes pegarme");
  }

}
