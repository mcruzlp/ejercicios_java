/**
 *
 * @author Cruz
 */
package Ej02_Vehiculo;

public class Bicicleta extends Vehiculo{
  
  private final String tipoBici;
  private final int talla;
  private final int diametroRueda;
  private final int numPlatos;

  public Bicicleta(String tipoBici, int talla, int diametroRueda, int numPlatos,
    int kilometrosRecorridos) {
    
    super(kilometrosRecorridos);
    this.tipoBici = tipoBici;
    this.talla = talla;
    this.diametroRueda = diametroRueda;
    this.numPlatos = numPlatos;
  }
  
  public void pedalea() {
    this.kilometrosRecorridos = (int)(Math.random()*10);
    System.out.println("\033[33m La bicicleta ha recorrido " +
      this.kilometrosRecorridos + " km en este tramo");
    this.setKilometrosRecorridos(this.kilometrosRecorridos);
    Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() +
      this.kilometrosRecorridos);
  }
}
