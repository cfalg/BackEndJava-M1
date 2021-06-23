package M3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 17/06/2021 - BackEndJava
 * 
 *         Nivell 1 - Fase 3
 *         Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i
 *         guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
 *         Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
 */

public class FluxeDadesNivell1Fase3 {

	public static void main(String[] args) {

		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;

//		// Demana per consola que s’introdueixin els noms.
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Introdueix el nom de 6 ciutats");
//
//		System.out.println("Introdueix el nom de la ciutat #1 = ");
//		a = reader.next();
//		System.out.println("Introdueix el nom de la ciutat 21 = ");
//		b = reader.next();
//		System.out.println("Introdueix el nom de la ciutat #3 = ");
//		c = reader.next();
//		System.out.println("Introdueix el nom de la ciutat #4 = ");
//		d = reader.next();
//		System.out.println("Introdueix el nom de la ciutat #5 = ");
//		e = reader.next();
//		System.out.println("Introdueix el nom de la ciutat #6 = ");
//		f = reader.next();
//
//		System.out.println("El nom de les ciutats són = " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);

		// Temporal per fer proves i no tenir que entrar les dades cada test
		a = "Barcelona";
		b = "Madrid";
		c = "Valencia";
		d = "Malaga";
		e = "Cadis";
		f = "Santander";

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

		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();

		System.out.println("**** Array Ciutats Ordendades *****");
		// Mostrem el array ordenat
		for (String ciutat : arrayCiutats) {
			System.out.println(ciutat);
			// aprofitem el bucle per introduir les dades al ArrayCiutatModificadas
			ArrayCiutatsModificades.add(ciutat.replace("a", "4"));
		}

		// Per fer més clar el codi tornem a fer un segon bucle per mostrar les ciutats
		// modificades
		System.out.println("**** Array Ciutats Modificades *****");
		for (String ciutatModificada : ArrayCiutatsModificades) {
			System.out.println(ciutatModificada);
		}

	}

}
