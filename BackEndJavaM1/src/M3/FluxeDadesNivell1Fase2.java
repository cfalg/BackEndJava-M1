package M3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 17/06/2021 - BackEndJava
 * 
 *         Nivell 1 - Fase 2
 *         Un cop tenim els noms de les ciutats guardats en variables haurem de
 *         pasar l’informacio a un array (arrayCiutats).
 *         Quan tinguem l’array ple, haurem de mostrar per consola el nom de les
 *         ciutats ordenadas per ordre alfabetic.
 */

public class FluxeDadesNivell1Fase2 {

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

		System.out.println("El nom de les ciutats són = " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);

		// Creem al Array
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		arrayCiutats.add(a);
		arrayCiutats.add(b);
		arrayCiutats.add(c);
		arrayCiutats.add(d);
		arrayCiutats.add(e);
		arrayCiutats.add(f);

		// fem servir el objecte Collections per tal de poder ordenar
		Collections.sort(arrayCiutats);

		System.out.println("**** Array Ciutats Ordendades *****");
		// Mostrem el array ordenat
		for (String ciutat : arrayCiutats) {
			System.out.println(ciutat);
		}

	}

}
