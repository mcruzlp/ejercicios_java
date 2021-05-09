package Ej02_Vehiculo;

/**
 *
 * @author cruz
 */
public class Coche_ejemplo {
  
  // atributos de clase *************************************
  private static int numCoches = 0;
  private static int kmTotales = 0;
  
  // atributos de instancia *********************************
  private final String numBastidor = "";
  private String matricula ="";
  private String marca ="";
  private String modelo ="";
  private int kilometraje = 0;

  // constructor *********************************************
  public Coche_ejemplo() {
    Coche_ejemplo.numCoches++;
  }
  
  public Coche_ejemplo(String matricula) {
    this.matricula = matricula;
    Coche_ejemplo.numCoches++;
  }
  
  public Coche_ejemplo(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    Coche_ejemplo.numCoches++;
  }
  
  // getter y setter ******************************************
  public int getKilometraje() {
    return this.kilometraje;
  }

  public void setKilometraje(int km) {
    this.kilometraje = km;
  }

  public static int getKmTotal() {
    return Coche_ejemplo.kmTotales;
  }
  
  
  
  // métodos *********************************************
  public void recorre(int distancia){
    this.kilometraje += distancia;
    kmTotales += distancia;
  }
  
  /**
   *
   * @return
   */
  @Override
  public String toString() {
    String resultado = "======================\n";
    resultado += "Matrícula: " + this.matricula;
    resultado += "\nMarca: " + this.marca;
    resultado += "\nModelo: " + this.modelo;
    resultado += "\nKilómetros recorridos: " + this.kilometraje;
    resultado += "\n======================\n";
    
    return resultado;
  }
  
}
