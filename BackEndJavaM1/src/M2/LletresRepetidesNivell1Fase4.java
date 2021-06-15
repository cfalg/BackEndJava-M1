package M2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Carles Falgueras - Date 14/06/2021 - BackEndJava / *
 * 
 *         Nivell 1 Fase 4 Crea una altra llista amb el teu cognom on cada posició
 *         correspongui a una lletra. Fusiona les dues llistes en una sola. A
 *         més, afegeix una posició amb un espai buit entre la primera i la
 *         segona. És a dir, partim de la llista name i surname i al acabar
 *         l’execució només tindrem una que es dirà fullName.
 */

public class LletresRepetidesNivell1Fase4 {

	public static void main(String[] args) {

		ArrayList<Character> NameLlista = new ArrayList<Character>();
		char[] Nom = { 'L', 'E', 'O'};

		for (char c : Nom) {
			NameLlista.add(c);
		}
		
		
		ArrayList<Character> SurNameLlista = new ArrayList<Character>();
		char[] CogNom = { 'M', 'E', 'S', 'S', 'I'};

		for (char c : CogNom) {
			SurNameLlista.add(c);
		}
		
		
		ArrayList<Character> FullNameLlista = new ArrayList<Character>();
		FullNameLlista.addAll(NameLlista);
		FullNameLlista.add(' ');
		FullNameLlista.addAll(SurNameLlista);
		
		System.out.println(FullNameLlista.toString());
		
		

		
	}

}

