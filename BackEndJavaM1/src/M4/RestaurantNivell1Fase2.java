package M4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 25/06/2021 - BackEndJava
 * 
 *         Fase 2
 *         Haurem d’omplir els dos arrays anteriorment creats, afegint el nom
 *         del plat i despanrés el preu. Es pot fer de dues formes: Es pot fer
 *         us d'un diccionari de dades precarregat (Java HashMap) o amb un bucle
 *         demanant les dades a l'usuari.
 *         Un cop plens els dos arrays haurem de mostrar-los i preguntar que es
 *         vol per menjar, guardarem la informació en una List.
 *         Haurem de preguntar si es vol seguir demanant menjar. Podeu fer
 *         servir el sistema (1:Si / 0:No), per tant haureu de crear un altre
 *         variable int per guardar la informació.
 * 
 */

public class RestaurantNivell1Fase2 {

	private static int euro1 = 1;
	private static int euro2 = 2;
	private static int euro5 = 5;
	private static int euro10 = 10;
	private static int euro20 = 20;
	private static int euro50 = 50;
	private static int euro100 = 100;
	private static int euro200 = 200;
	private static int euro500 = 500;

	static int preuTotal = 0;
	static String plats[] = new String[10];
	static int preus[] = new int[10];
	static ArrayList<String> comanda = new ArrayList<String>();

	// Programa principal
	public static void main(String[] args) {

		precarregaMenu();
		mostrarMenu();
		demanarMenu();
		
	}

	/*
	 * Haurem d’omplir els dos arrays anteriorment creats, afegint el nom
	 * del plat i despanrés el preu. Es pot fer de dues formes: Es pot fer
	 * us d'un diccionari de dades precarregat (Java HashMap) o amb un bucle
	 * demanant les dades a l'usuari.
	 */
	private static void precarregaMenu() {
		// Dades precarregades
		HashMap<String, Integer> preuPlat = new HashMap<String, Integer>();
		preuPlat.put("Bufalina", 12);
		preuPlat.put("4 Formaggi", 12);
		preuPlat.put("Pino Daniele", 18);
		preuPlat.put("Margherita", 9);
		preuPlat.put("Prosciutto", 10);
		preuPlat.put("Parmiffiana", 11);
		preuPlat.put("Al Tonno", 13);
		preuPlat.put("Carbonara", 11);
		preuPlat.put("Massimo Troise", 17);
		preuPlat.put("Ortolana", 12);

		int contador = 0;
		for (Map.Entry<String, Integer> entry : preuPlat.entrySet()) {
			// omplim el array plats amb cada un del nom dels plats
			plats[contador] = entry.getKey();
			// omplim el array preus amb cada un del preus del plats
			preus[contador] = entry.getValue();
			contador++;
		}
		System.out.println("");

	}

	/*
	 * Un cop plens els dos arrays haurem de mostrar-los 
	 */
	private static void mostrarMenu() {

		System.out.println("El menú d'avui és");
		for (int i = 0; i < plats.length; i++) {
			System.out.println("  " + plats[i] + " -----> " + preus[i] + " €");

		}

	}

	
	/* 
	 *  ... i preguntar que es vol per menjar, guardarem la informació en una List
	 */
	private static void demanarMenu() {

		// seguirDemanant = 1:Si / 0:No
		int seguirDemanant = 1;
		Scanner reader = new Scanner(System.in);

		while (seguirDemanant == 1) {
			System.out.println("Introdueix nom de Pizza");
			comanda.add(reader.nextLine());

			System.out.println("Vols seguir demanant ('Si'/'No')");
			if ("No".equals(reader.nextLine())) {
				seguirDemanant = 0;
			}
		}

		System.out.println("\n" + "Fi de la petició de la comanda");
		reader.close();
	}

	
	
}
