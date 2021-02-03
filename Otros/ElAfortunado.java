package ex11mclp;



public class ElAfortunado {

  public static void main(String[] args) throws InterruptedException {
    final String[] ALUMNOS = {
      "Andrés Domínguez, Javier",
      "Buendía López, Jairo",
      "De Abrisqueta Rangel, Ander",
      "Egea Hermoso, Adrián",
      "Estrada Cobo, José Manuel",
      "Fabián El Belaizi, Daniel",
      "García Campoy, Daniel",
      "García Gómez, Sergio",
      "Gutiérrez Ramírez, Jesús María",
      "López Lozano, Santos",
      "López Pérez, María de la Cruz",
      "Millán Rebollo, Noel",
      "Millón Cortés, Manuel Alejandro",
      "Morales Aragón, Marcos",
      "Moreno Rodríguez, Javier",
      "Pelaz Medrano, Adrián",
      "Reyes Podadera, Pablo Jesús",
      "Salmerón Robles, Gonzalo José",
      "Sevilla Valderrama, Fernando Iván",
      "Sicilia Pérez, Francisco Javier"
    };
    
    System.out.print("El/la afortunado/a es ");

    for (int i = 1; i <= 7; i++) {
      System.out.print(".");
      Thread.sleep(i * 300);
    }
    
    System.out.println("\"" + ALUMNOS[(int)(Math.random() * ALUMNOS.length)] + "\"");
  }

}
