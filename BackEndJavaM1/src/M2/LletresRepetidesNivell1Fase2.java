package M2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Carles Falgueras - Date 08/06/2021 - BackEndJava / *
 * 
 *         Nivell 1 Fase 2 Canvia la taula per una llista (List<Character>) Al
 *         bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’.
 *         Sinó, imprimeix: ‘CONSONTANT’. Si trobes un numero, mostra per
 *         pantalla: ‘Els noms de persones no contenen números!’.
 */

public class LletresRepetidesNivell1Fase2 {

	public static void main(String[] args) {

		ArrayList<Character> NomList = new ArrayList<Character>();

		char[] Nom = { 'C', 'A', 'R', 'L', 'E', 'S', ' ', 'F', 'A', 'L', 'G', 'U', 'E', 'R', 'A', 'S', '1' };

		for (char c : Nom) {
			NomList.add(c);
		}

		System.out.println("\nContingut del ArrayList: " + NomList);

		Iterator<Character> it = NomList.iterator();

		while (it.hasNext()) {

			Character c = (Character) it.next();

			// Primer mirem si hi ha algun numero = Type=9=Numero
			if (c.getType(c) == 9) {
				System.out.println(c + " -->" + "Els noms de persones no contenen números!");
			} else {

				if ("A".equals(c.toString()) || "E".equals(c.toString()) || "I".equals(c.toString())
						|| "O".equals(c.toString()) || "U".equals(c.toString())) {

					System.out.println(c + " -->" + "VOCAL");
				} else {
					System.out.println(c + " -->" + "CONSONANT");
				}
			}
			;

		}

	}

}
