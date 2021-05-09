/**
 * Ejercicio 3
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefine 
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un 
 * programa en el que se instancien objetos y se les apliquen métodos.
 * 
 * @author Cruz
 * 
 */
package Ej03_Animal;

public class Ej03_Animal {

  public static void main(String[] args) {
    
    Gato garfield = new Gato(Sexo.MACHO, "British Shorthair", "naranja");
    
    Perro lassie = new Perro(Sexo.HEMBRA, "Rough Collie", "tricolor");
    
    Canario piolin = new Canario(Sexo.HEMBRA, Alimentacion.OMNIVORO,true, "Canario cantor americano", "amarillo");
    
    Lagarto rango = new Lagarto(Sexo.MACHO, Alimentacion.OMNIVORO, "verde", false);
    
    Pinguino pingu = new Pinguino(Sexo.MACHO, Alimentacion.CARNIVORO, false, "lanza", "semipalmadas", false, "frío");
    
    pingu.dondeVive();
    rango.tomaElSol();
    garfield.come("espaguetis boloñesa");
    piolin.duerme();
    pingu.ponHuevo();
    lassie.come();
    rango.pelea();
    pingu.nada();
    piolin.limpiate();
    lassie.mueveLaCola();
  }
}
