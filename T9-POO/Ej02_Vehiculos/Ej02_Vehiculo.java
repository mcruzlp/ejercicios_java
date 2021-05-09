/**
 *
 * Ejercicio 2
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases 
 * de la primera. Para la clase Vehiculo, crea los atributos de clase 
 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de 
 * las subclases. Prueba las clases creadas mediante un programa con un menú 
 * como el que se muestra a continuación:
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 *
 *
 * @author Cruz
 */
package Ej02_Vehiculo;

import java.util.Scanner;

public class Ej02_Vehiculo {
  
  public static Scanner s = new Scanner (System.in);
  public static void main(String[] args) {
    
    Bicicleta bici1 = new Bicicleta("montaña",5,17,4,0);
    Vehiculo.setVehiculosCreados(Vehiculo.getVehiculosCreados() + 1);
    Coche coche1 = new Coche("berlina",5,120,0);
    Vehiculo.setVehiculosCreados(Vehiculo.getVehiculosCreados() + 1);
    
    int selection;
    do{
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println();
      System.out.print("Elige una opción (1-8): ");
      
      selection = Integer.parseInt(s.nextLine());
      
      switch (selection) {
        case 1 -> bici1.pedalea();
        case 2 -> System.out.println("\033[33m Mira, mamá: sin dientes");
        case 3 -> coche1.arranca();
        case 4 -> System.out.println("\033[33m ¡Que llego tarde!");
        case 5 -> System.out.println("\033[33m La bicicleta ha recorrido " + 
          bici1.getKilometrosRecorridos() + " km en total.");
        case 6 -> System.out.println("\033[33m El coche ha recorrido " + 
          coche1.getKilometrosRecorridos() + " km en total.");
        case 7 -> System.out.println("\033[33m El parque de vehículos ("
        + Vehiculo.getVehiculosCreados() + " vehículos), ha recorrido " + 
          Vehiculo.getKilometrosTotales() + " km en total.");
        default -> {
        }
      }
    } while (selection != 8);
    
  }
  
}
