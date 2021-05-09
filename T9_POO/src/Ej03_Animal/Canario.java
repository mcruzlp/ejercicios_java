/**
 * @author cruz
 */
package Ej03_Animal;

public class Canario extends Ave {

  // atributos de instancia *********************************
  private String raza = "";
  private String color = "";

  // constructor *********************************************

  public Canario() {
  }

  public Canario(Sexo sexo) {
    super(sexo);
  }

  public Canario(Alimentacion alim) {
    super(alim);
  }

  public Canario(Sexo sexo, Alimentacion alim) {
    super(sexo, alim);
  }

  public Canario(boolean puedevolar) {
    super(puedevolar);
  }

  public Canario(boolean puedevolar, String tipoPico) {
    super(puedevolar, tipoPico);
  }

  public Canario(boolean puedevolar, String tipoPico, String tipoPata) {
    super(puedevolar, tipoPico, tipoPata);
  }

  public Canario(Sexo sexo, boolean puedevolar) {
    super(sexo, puedevolar);
  }

  public Canario(Alimentacion alim, boolean puedevolar) {
    super(alim, puedevolar);
  }

  public Canario(Sexo sexo, Alimentacion alim, boolean puedevolar, String raza, String color) {
    super(sexo, alim, puedevolar);
    this.raza = raza;
    this.color = color;
  }
  
  public Canario(Sexo sexo, Alimentacion alim, boolean puedevolar, String tipoPico, String tipoPata, String raza, String color) {
    super(sexo, alim, puedevolar, tipoPico, tipoPata);
    this.raza = raza;
    this.color = color;
  }
  
  // métodos ************************************************

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  public void pia() {
    System.out.println("Me pareció ver un lindo gatito");
  }
}
