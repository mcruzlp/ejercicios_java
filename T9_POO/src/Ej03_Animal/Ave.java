/**
 * @author cruz
 */
package Ej03_Animal;

public class Ave extends Animal {

  private boolean puedevolar;
  private String tipoPata = "";
  private String tipoPico = "";
  
  //constructor **************************************************

  public Ave() {
  }
  
  public Ave(Sexo sexo) {
    super(sexo);
  }
  
  public Ave(Alimentacion alim) {
    super(alim);
  }
  
  public Ave(Sexo sexo, Alimentacion alim) {
    super(sexo, alim);
  }
  
  public Ave(boolean puedevolar) {
    this.puedevolar = puedevolar;
  }
  
  public Ave(boolean puedevolar, String tipoPico) {
    this.puedevolar = puedevolar;
    this.tipoPico = tipoPico;
  }
  
  public Ave(boolean puedevolar, String tipoPico, String tipoPata) {
    this.puedevolar = puedevolar;
    this.tipoPico = tipoPico;
    this.tipoPata = tipoPata;
  }
  
  public Ave(Sexo sexo, boolean puedevolar) {
    super(sexo);
    this.puedevolar = puedevolar;
  }
  
  public Ave(Alimentacion alim, boolean puedevolar) {
    super(alim);
    this.puedevolar = puedevolar;
  }
  
  public Ave(Sexo sexo, Alimentacion alim, boolean puedevolar) {
    super(sexo, alim);
    this.puedevolar = puedevolar;
  }
  
  public Ave(Sexo sexo, Alimentacion alim, boolean puedevolar, String tipoPico, String tipoPata) {
    super(sexo, alim);
    this.puedevolar = puedevolar;
    this.tipoPico = tipoPico;
    this.tipoPata = tipoPata;
  }
  
  //methods **************************************************

  public String getTipoPata() {
    return tipoPata;
  }

  public void setTipoPata(String tipoPata) {
    this.tipoPata = tipoPata;
  }

  public boolean getPuedeVolar() {
    return puedevolar;
  }

  public void setPuedeVolar(boolean puedevolar) {
    this.puedevolar = puedevolar;
  }
  
  public void ponHuevo() {
    if (this.getSexo() == Sexo.HEMBRA){
      System.out.println("Los huevos no se ponen cuando una quiere");
    } else System.out.println("Los machos no ponemos huevos.");
  }
  
  public void limpiate() {
    System.out.println("Me estoy limpiando las plumas");
  }
  
  public void vuela () {
    if (getPuedeVolar() == true){
      System.out.println("Estoy volando");
    } else System.out.println("Mi especie no puede volar");
  }
  
  public void buscaComida (String tipoPico) {
    switch (tipoPico){
      case "curvo y ganchudo" -> System.out.println("Voy a cazar ratones");
      case "lanza" -> System.out.println("Voy a atrapar peces");
      case "largo y fino" -> System.out.println("Estoy cazando moscas");
      case "grueso y corto" -> System.out.println("Estoy buscando bayas");
    }
  }
  
}
