package ejemplos;

/**
 * PruebaGatoSimple.java Programa que prueba la clase GatoSimple
 *
 * @author Luis José Sánchez
 */
public class PruebaGatoSimple {

  public static void main(String[] args) {
    Gato garfield = new Gato("macho");
    System.out.println("hola gatito");
    garfield.maulla();
    System.out.println("toma tarta");
    garfield.come("tarta selva negra");
    System.out.println("toma pescado, a ver si esto te gusta");
    garfield.come("pescado");
    
    Gato tom = new Gato("macho");
    System.out.println("Tom, toma sopita de verduras");
    tom.come("sopa de verduras");
    
    Gato lisa = new Gato("hembra");
    System.out.println("gatitos, a ver cómo maulláis");
    garfield.maulla();
    tom.maulla();
    lisa.maulla();
    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);
  }

}
