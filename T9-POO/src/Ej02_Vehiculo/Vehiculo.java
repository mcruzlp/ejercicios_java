/**
 *
 * @author Cruz
 */

package Ej02_Vehiculo;

public abstract class Vehiculo {
  
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  int kilometrosRecorridos;

  public Vehiculo() {
  }

  public Vehiculo(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    kilometrosRecorridos += this.kilometrosRecorridos;
  }
  
  
  
}
