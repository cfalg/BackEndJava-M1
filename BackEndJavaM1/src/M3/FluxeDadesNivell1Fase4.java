package M3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 17/06/2021 - BackEndJava
 * 
 *         Nivell 1 - Fase 4
 *         Creeu un nou array de caràcters (char array[])per cada una de les
 *         ciutats que tenim. La mida dels nous arrays sera la llargada de cada
 *         string ( string nomCiutat.Length).
 *         Ompliu els nous arrays lletra per lletra.
 *         Mostreu per consola els nous arrays amb els noms invertits (Ex:
 *         Barcelona - anolecraB).
 */

public class FluxeDadesNivell1Fase4 {

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

		// Crem al Array
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		arrayCiutats.add(a);
		arrayCiutats.add(b);
		arrayCiutats.add(c);
		arrayCiutats.add(d);
		arrayCiutats.add(e);
		arrayCiutats.add(f);

		System.out.println("Ciutat amb els noms invertits:");

		// Creem un Array list per guardar tot els noms de les ciutats invertides
		ArrayList<char[]> arrayCiutatsInvertides = new ArrayList<char[]>();

		// Recorrem el Array de ciutats per poder posar el nom invertit
		for (int i = 0; i < arrayCiutats.size(); i++) {
			// System.out.println(arrayCiutats.get(i));

			// creem un array de Char per guardar una a una les lletres en ordre invers
			char[] ciutatInvertida = new char[arrayCiutats.get(i).length()];

			// Tal com diu el enunciat dimensionem cada registre del Array ciutat Invertides
			// amb la mida de caracters que té la ciutat
			arrayCiutatsInvertides.add(ciutatInvertida);

			// inicialitzem la variable per poder guardar cada una de les lletres en el
			// array de char
			int k = 0;

			// ara que tenim una ciutat la reseguim lletra per lletre de final a principi i
			// posem cada caracter al array
			for (int j = arrayCiutats.get(i).length(); j > 0; j--) {
				// possem sobre una variable char cada una de les lletres
				char a1 = arrayCiutats.get(i).charAt(j - 1);
				// System.out.println(a1);

				// col.loquem la lletra dintre del array de char
				ciutatInvertida[k] = a1;
				k++;
			}
			// una vegada tenim el array de char ple insertem el array de char en el
			// ArrayList de ciutats invertides
			arrayCiutatsInvertides.set(i, ciutatInvertida);

			// pintem per consola el nom de la ciutat del dret i del reves
			System.out.println(arrayCiutats.get(i) + " - " + String.valueOf(arrayCiutatsInvertides.get(i)));
		}

	}

}
