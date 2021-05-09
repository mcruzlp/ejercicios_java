/**
 * @author cruz
 */
package Ej03_Animal;

public class Pinguino extends Ave{

  // atributos de instancia *********************************
  private boolean tieneCresta;
  private String ambiente = "";

  // constructor *********************************************
  public Pinguino(){
  }

  public Pinguino(boolean tieneCresta) {
    this.tieneCresta = tieneCresta;
  }
  
  public Pinguino(boolean tieneCresta, String ambiente) {
    this.tieneCresta = tieneCresta;
    this.ambiente = ambiente;
  }
  
  public Pinguino(Sexo sexo, Alimentacion alim, boolean puedevolar, String tipoPico, String tipoPata, boolean tieneCresta, String ambiente) {
    super(sexo, alim, puedevolar, tipoPico, tipoPata);
    this.tieneCresta = tieneCresta;
    this.ambiente = ambiente;
  }

   // métodos *********************************************

  public Alimentacion getAlimentacion() {
    return this.getAlim();
  }
  
  public Sexo getSex() {
    return this.getSexo();
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public boolean getTieneCresta() {
    return tieneCresta;
  }

  public void setTieneCresta(boolean tieneCresta) {
    this.tieneCresta = tieneCresta;
  }
  
  public void dondeVive() {
    System.out.println("Soy un pingüino de ambiente " + getAmbiente());
  }

  public void nada() {
    System.out.println("Voy al chapotear");
  }
}
