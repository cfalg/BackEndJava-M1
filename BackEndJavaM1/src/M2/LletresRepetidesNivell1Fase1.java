package M2;

/**
 * 
 * @author Carles Falgueras - Date 08/06/2021 - BackEndJava / *
 * 
 *         Nivell 1 - Fase 1 Crea una taula (char[]) amb el teu nom on cada
 *         posició correspongui a una lletra. Fes un bucle que recorri aquesta
 *         taula i mostri per consola cadascuna de les lletres.
 */

public class LletresRepetidesNivell1Fase1 {

	public static void main(String[] args) {

		char[] Nom = { 'C', 'A', 'R', 'L', 'E', 'S', ' ', 'F', 'A', 'L', 'G', 'U', 'E', 'R', 'A', 'S' };

		for (char c : Nom) {
			System.out.print(c + " ");
		}
	}

}
