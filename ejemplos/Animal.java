package ejemplos;

/**
 * Animal.java Definición de la clase Animal
 *
 * @author Luis José Sánchez
 */
public abstract class Animal {

  // atributos ////////////////////////////
  private Sexo sexo;

  // métodos //////////////////////////////
  // constructor*************************
  public Animal() {
    sexo = Sexo.MACHO;
  }

  public Animal(Sexo s) {
    sexo = s;
  }

  public Sexo getSexo() {
    return sexo;
  }

  // otros métodos************************
  @Override
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }

  /**
   * Hace que el animal se eche a dormir.
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void come() {
    System.out.println("¡Qué rico!");
  }

  public void come(String comida) {
    System.out.println("¡Qué rico, me gusta comer " + comida + "!");
  }
}
