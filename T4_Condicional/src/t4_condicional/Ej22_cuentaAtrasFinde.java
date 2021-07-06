/**
 * Ejercicio 22
 * Realiza un programa que, dado un día de la semana (de lunes a viernes)
 * y una hora (horas y minutos), calcule cuántos minutos faltan para el
 * fin de semana. Se considerará que el fin de semana comienza el viernes
 * a las 15:00h. Se da por hecho que el usuario introducirá un día y hora
 * correctos, anterior al viernes a las 15:00h.
 *
 * @author cruz
 *
 */
//package t4;

import java.util.Scanner;

public class Ej22_cuentaAtrasFinde {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca el día de la semana: ");
		String dia = s.nextLine();
		System.out.print("Introduzca la hora: ");
		int hora = Integer.parseInt(s.nextLine());
		int minutos = 0;

		switch (dia) {
			case "lunes":
				minutos = 4 * 24 * 60;
				break;
			case "martes":
				minutos = 3 * 24 * 60;
				break;
			case "miércoles":
				minutos = 2 * 24 * 60;
				break;
			case "jueves":
				minutos = 24 * 60;
				break;
			default:
		}

	}
}
