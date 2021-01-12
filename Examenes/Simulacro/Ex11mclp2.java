/*
 * Cruz López Pérez
 * 11/11/2020
 *
 */
package ex11mclp;

import java.util.Scanner;

public class Ex11mclp2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de polos que desea: ");
    Double cantidad;
    cantidad = Double.parseDouble(s.nextLine());
    while (cantidad < 20){
      System.out.print("El pedido mínimo es de 20 polos. Inténtelo de nuevo: ");
      cantidad = Double.parseDouble(s.nextLine());
    }
    System.out.print("1) blanco 2) color: ");
    int colores = Integer.parseInt(s.nextLine());
    System.out.print("1) serigrafía 2) bordado: ");
    int tecnica = Integer.parseInt(s.nextLine());
    double base = 0;
    double iva = 0;
    
    if (cantidad >= 20 && cantidad <=39){
      base = 4.9;
      if (colores == 2){
        base = base + (base*0.2);
        System.out.println("Polos en color:       " + cantidad);
        System.out.println("Precio unitario:      " + base + " €");
        System.out.println("Total textil:         " + (base * cantidad) + " €");
      } else{
        System.out.println("Polos en blanco:      " + cantidad);
        System.out.println("Precio unitario:      " + base + " €");
        System.out.println("Total textil:         " + (base * cantidad) + " €");
      }
      if (tecnica == 1){
        base = base + 2;
        System.out.println("Serigrafía (c.u.):      2.00 €");
        System.out.println("Total serigrafía:     " + 2*cantidad);
      }
      if (tecnica == 2){
        base = base + 3;
        System.out.println("Bordado (c.u.):       3.00 €");
        System.out.println("Total bordado:        " + 3*cantidad);
      }
    }
    
    if (cantidad >= 40 && cantidad <=99){
      base = 3.9;
      if (colores == 2){
      base = base + (base*0.2);
      System.out.println("Polos en color:         " + cantidad);
      System.out.println("Precio unitario:        " + base + " €");
      System.out.println("Total textil:           " + (base * cantidad) + " €");
      } else{
        System.out.println("Polos en blanco:      " + cantidad);
        System.out.println("Precio unitario:      " + base + " €");
        System.out.println("Total textil:         " + (base * cantidad) + " €");
      }
      
      //Variación de precios según la técnica si se piden más o menos de 50u.
      if (cantidad >= 40 && cantidad <=50){
        if (tecnica == 1){
        base = base + 2;
        System.out.println("Serigrafía (c.u.):     2.00 €");
        System.out.println("Total serigrafía:     " + 2*cantidad);
        }
      if (tecnica == 2){
        base = base + 3;
        System.out.println("Bordado (c.u.):    3.00 €");
        System.out.println("Total bordado:     " + 3*cantidad);
        }
      } else {
        if (tecnica == 1){
        base = base + 1.5;
        System.out.println("Serigrafía (c.u.):     1.50 €");
        System.out.println("Total serigrafía:   " + 1.5*cantidad);
        }
        if (tecnica == 2){
        base = base + 2.5;
        System.out.println("Bordado (c.u.):         2.50 €");
        System.out.println("Total bordado:           " + 2.5*cantidad);
        }
      }
    }
    
    if (cantidad >= 100){
      base = 3.2;
      if (colores == 2){
      base = base + (base*0.2);
      System.out.println("Polos en color:         " + cantidad);
      System.out.println("Precio unitario:        " + base + " €");
      System.out.println("Total textil:           " + (base * cantidad) + " €");
      } else{
        System.out.println("Polos en blanco:      " + cantidad);
        System.out.println("Precio unitario:      " + base + " €");
        System.out.println("Total textil:         " + (base * cantidad) + " €");
      }
      if (tecnica == 1){
        base = base + 1.5;
        System.out.println("Serigrafía (c.u.):      1.50 €");
        System.out.println("Total serigrafía:       " + 1.5*cantidad);
      }
      if (tecnica == 2){
        base = base + 2.5;
        System.out.println("Bordado (c.u.):       2.50 €");
        System.out.println("Total bordado:         " + 2.5*cantidad);
      }
    }
    
    iva = cantidad*base*0.21;
    System.out.println("Precio base total:      " + (cantidad*base) +" €");
    System.out.println("IVA:                    " + iva + " €");
    System.out.println("Precio base total:      " + ((cantidad*base)+iva) + " €");
  } 
 }
