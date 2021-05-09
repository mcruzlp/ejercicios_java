/**
 * @author cruz
 */
package Ej03_Animal;

public class Mamifero extends Animal {

  private String tipoMedio = "";
  private String tipoNacimiento = "";

  public Mamifero() {
  }

  public Mamifero(Sexo sexo) {
    super(sexo);
  }

  public Mamifero(Alimentacion alim) {
    super(alim);
  }

  public Mamifero(Sexo sexo, Alimentacion alim) {
    super(sexo, alim);
  }

  public Mamifero(Alimentacion alim, String tipoMedio) {
    super(alim);
    this.tipoMedio = tipoMedio;
  }

  public Mamifero(Alimentacion alim, String tipoMedio, String tipoNacimiento) {
    super(alim);
    this.tipoMedio = tipoMedio;
    this.tipoNacimiento = tipoNacimiento;
  }

  public Mamifero(Sexo sexo, Alimentacion alim, String tipoMedio) {
    super(sexo, alim);
    this.tipoMedio = tipoMedio;
  }

  public Mamifero(Sexo sexo, Alimentacion alim, String tipoMedio, String tipoNacimiento) {
    super(sexo, alim);
    this.tipoMedio = tipoMedio;
    this.tipoNacimiento = tipoNacimiento;
  }

  public String getTipoNacimiento() {
    return tipoNacimiento;
  }

  public void setTipoNacimiento(String nacimiento) {
    this.tipoNacimiento = nacimiento;
  }

  public String getTipoMedio() {
    return tipoMedio;
  }

  public void setTipoMedio(String tipoMedio) {
    this.tipoMedio = tipoMedio;
  }

  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Soy macho, no puedo amamantar :(");
    } else {
      System.out.println("Toma pecho, hazte grande");
    }
  }

  public void cuidaCrias() {
    System.out.println("Estoy cuidando mis crias");
  }
  
  

}
