package Ej02_Vehiculo;

/**
 *
 * @author cruz
 */
public class EjemploCoche {

  public static void main(String[] args) {
    
    Coche_ejemplo cocheDeJesus = new Coche_ejemplo();
    
    cocheDeJesus.recorre(50);
    cocheDeJesus.recorre(50);
    cocheDeJesus.recorre(50);
    
    System.out.println("Km recorridos por el coche de Jesús: " + cocheDeJesus.getKilometraje());
    
    Coche_ejemplo cocheDeAdrian = new Coche_ejemplo("9876RTY");
    
    cocheDeAdrian.recorre(50);
    
    System.out.println("Km recorridos por el coche de Adrián: " + cocheDeAdrian.getKilometraje());
    
    System.out.println(cocheDeJesus);
    System.out.println(cocheDeAdrian);
    
    Coche_ejemplo cocheDeJairo = new Coche_ejemplo("1234FGH", "Dacia", "Sandero");
    System.out.println(cocheDeJairo);
    
    System.out.println(Coche_ejemplo.getKmTotal());
    
    
  }
  
}
