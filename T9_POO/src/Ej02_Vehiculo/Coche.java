/**
 *
 * @author Cruz
 */
package Ej02_Vehiculo;


public class Coche extends Vehiculo{
  
  private final String tipoCoche;
  private final int numPuertas;
  private final int potenciaCV;

  public Coche(String tipoCoche, int numPuertas, int potenciaCV, int kilometrosRecorridos) {
    super(kilometrosRecorridos);
    this.tipoCoche = tipoCoche;
    this.numPuertas = numPuertas;
    this.potenciaCV = potenciaCV;
  }

  public void arranca() {
    this.kilometrosRecorridos = (int)(Math.random()*100);
    System.out.println("\033[33m El coche ha recorrido " + kilometrosRecorridos 
      + " km en este tramo");
    Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() +
      kilometrosRecorridos);
  }

  
  
  
  
}
