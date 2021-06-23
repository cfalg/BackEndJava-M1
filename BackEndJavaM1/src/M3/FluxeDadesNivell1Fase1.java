package M3;

import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 16/06/2021 - BackEndJava
 * 
 *         Nivell 1 - Fase 1
 *         Crea sis variables tipu string buides.
 *         Demana per consola que s’introdueixin els noms.
 *         Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia,
 *         Malaga, Cadis, Santander) per teclat.
 *         Mostra per consola el nom de les 6 ciutats.
 */

public class FluxeDadesNivell1Fase1 {

	public static void main(String[] args) {

		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;

		// Demana per consola que s’introdueixin els noms.
		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix el nom de 6 ciutats");

		System.out.println("Introdueix el nom de la ciutat #1 = ");
		a = reader.next();
		System.out.println("Introdueix el nom de la ciutat 21 = ");
		b = reader.next();
		System.out.println("Introdueix el nom de la ciutat #3 = ");
		c = reader.next();
		System.out.println("Introdueix el nom de la ciutat #4 = ");
		d = reader.next();
		System.out.println("Introdueix el nom de la ciutat #5 = ");
		e = reader.next();
		System.out.println("Introdueix el nom de la ciutat #6 = ");
		f = reader.next();

//		System.out.println("El nom de la ciutat #1 es "+a);
//		System.out.println("El nom de la ciutat #2 es "+b);
//		System.out.println("El nom de la ciutat #3 es "+c);
//		System.out.println("El nom de la ciutat #4 es "+d);
//		System.out.println("El nom de la ciutat #5 es "+e);
//		System.out.println("El nom de la ciutat #6 es "+f);

		// Mostra per consola el nom de les 6 ciutats.
		System.out.println("El nom de les ciutats són = " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
	}

}
