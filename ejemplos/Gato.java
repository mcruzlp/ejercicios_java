package ejemplos;

/**
 * Gato.java Definición de la clase Gato
 *
 * @author Luis José Sánchez
 */
public class Gato extends Animal implements Mascota {

  // atributos ////////////////////////////
  private final String codigo;

  // métodos //////////////////////////////
  // constructor*************************
  public Gato(Sexo s, String c) {
    super(s);
    this.codigo = c;
  }

  dGato(Sexo sexo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  dGato() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  // otros métodos************************
  @Override
  public String getCodigo() {
    return this.codigo;
  }

  /**
   * Hace que el gato emita sonidos.
   */
  @Override
  public void hazRuido() {
    this.maulla();
    this.ronronea();
  }

  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma. A los gatos les gusta el pescado, si le damos otra
   * comida * la rechazará.
   *
   * @param comida la comida que se le ofrece al gato
   */
  @Override
  public void come(String comida) {
    if (comida.equals("pescado")) {
      super.come(comida);
    } else {
      System.out.println("Lo siento, yo sólo como pescado");
    }
  }

  /**
   * Pone a pelear al gato contra otro animal. Solo se van a pelear dos machos
   * entre sí.
   *
   * @param contrincante es el animal contra el que pelear
   */
  @Override
  public void peleaCon(Animal contrincante) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("no peleo contra hembras");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
}
