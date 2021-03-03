/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9.poo;

/**
 *
 * @author cruz
 */
public class EjemploCoche {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Coche cocheDeJesus = new Coche();
    
    cocheDeJesus.recorre(50);
    cocheDeJesus.recorre(50);
    cocheDeJesus.recorre(50);
    
    System.out.println("Km recorridos por el coche de Jesús: " + cocheDeJesus.getKilometraje());
    
    Coche cocheDeAdrian = new Coche("9876RTY");
    
    cocheDeAdrian.recorre(50);
    
    System.out.println("Km recorridos por el coche de Adrián: " + cocheDeAdrian.getKilometraje());
    
    System.out.println(cocheDeJesus);
    System.out.println(cocheDeAdrian);
    
    Coche cocheDeJairo = new Coche("1234FGH", "Dacia", "Sandero");
    System.out.println(cocheDeJairo);
    
    System.out.println(Coche.getKmTotal());
    
    
  }
  
}
