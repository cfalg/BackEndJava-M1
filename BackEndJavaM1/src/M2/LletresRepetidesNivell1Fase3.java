package M2;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Carles Falgueras - Date 14/06/2021 - BackEndJava / *
 * 
 *         Nivell 1 Fase 3 Emmagatzemar en un Map tant les lletres de la llista
 *         com el nombre de vegades que apareixen. Has de recòrrer l'array
 *         anterior i anar comptant el número de vegades que apareix cada
 *         caràcter.
 */

public class LletresRepetidesNivell1Fase3 {

	public static void main(String[] args) {

		String Nom = "Leo Messi";
		
		HashMap<String, Integer> Mapa = new HashMap<String, Integer>();

		String Clau = "";
		Integer Valor = 0;

		//Inicialitzem el HashMap
		for (int i = 0; i < Nom.length(); i++) {
			String c = String.valueOf(Nom.charAt(i));
			Clau = c;
			Mapa.put(Clau, Valor);
		}


		//Assignem valors
		for (int i = 0; i < Nom.length(); i++) {
		
			String c = String.valueOf(Nom.charAt(i));
			Clau = c;

			Mapa.put(Clau, Mapa.get(Clau)+1);
		}
		
		System.out.println(Mapa.toString());

		//Pintem la sortida
		System.out.println(Nom);
		//System.out.println(Mapa.entrySet());
		for(Map.Entry<String, Integer> entrada: Mapa.entrySet()) {
			System.out.println("clau='"+entrada.getKey()+"', valor="+entrada.getValue());
		}
		
	}

}

