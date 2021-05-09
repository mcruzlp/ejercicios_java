/**
 * @author cruz
 */
package Ej03_Animal;

public abstract class Animal {
  
  private Sexo sexo;
  private Alimentacion alim;

  public Animal() {
  }
  
  public Animal(Sexo sexo) {
    this.sexo = sexo;
  }
  
  public Animal(Alimentacion alim) {
    this.alim = alim;
  }

  public Animal(Sexo sexo, Alimentacion alim) {
    this.sexo = sexo;
    this.alim = alim;
  }

  public Alimentacion getAlim() {
    return alim;
  }

  public void setAlim(Alimentacion alim) {
    this.alim = alim;
  }
  
  public Sexo getSexo() {
    return sexo;
  }

  public void setSexo(Sexo s) {
    this.sexo = s;
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void come() {
    System.out.println("¡Mmmmmm, qué rico!");
  }

  public void come(String comida) {
    System.out.println("¡Mmmmmm, me encanta comer " + comida + "!");
  }
   
}
