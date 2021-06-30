package M4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 28/06/2021 - BackEndJava
 * 
 *         Nivell 2
 * 
 * 
 * 
 * 
 *         Revisaràs l'exercici anterior modificant-lo per afegir
 *         noves excepcions més adients.
 * 
 *         Modifica la revisió de la comanda de la següent manera: si un usuari
 *         introdueix un plat que no existeix, inmediatament executa una
 *         excepció general (new Exception) per avisar que el producte no
 *         existeix, per tant no s'ha d'afegir a la llista, però el bucle ha de
 *         seguir executant-se.
 *         Llança una excepció general (new Exception) a la pregunta Si/No per
 *         seguir demanant, en cas de que l'usuari no introdueixi cap de les
 *         paraules clau. S'ha de tornar a preguntar si es vol seguir demanant o
 *         no.
 * 
 */

public class RestaurantNivell2 {

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
		calcularComanda();
		mostrarImportComanda();

		System.out.println("***** Fi del Programa. Fins aviat!!! **** ");

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
		System.out.println("\n");

	}

	/*
	 * Un cop plens els dos arrays haurem de mostrar-los
	 */
	private static void mostrarMenu() {

		System.out.println("El menú d'avui és");
		for (int i = 0; i < plats.length; i++) {
			System.out.println("  " + plats[i] + " -----> " + preus[i] + " €");

		}
		System.out.println("\n");
	}

	/*
	 * ... i preguntar que es vol per menjar, guardarem la informació en una List
	 */
	private static void demanarMenu() {

		// seguirDemanant = 1:Si / 0:No
		int seguirDemanant = 1;
		Scanner reader = new Scanner(System.in);

		while (seguirDemanant == 1) {
			System.out.println("Introdueix nom de Pizza");
			String platDemanat = reader.next();

			// Bloc que validará que el plat demanat existeixi
			try {
				validaPlat(platDemanat);
				comanda.add(platDemanat);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			// Bloc que validará que
			/*
			 * Llança una excepció general (new Exception) a la pregunta Si/No per seguir
			 * demanant, en cas de que l'usuari no introdueixi cap de les paraules clau.
			 * S'ha de tornar a preguntar si es vol seguir demanant o no.
			 */

			seguirDemanant = volsSeguirDemanant();

		}

		System.out.println("\n" + "Fi de la petició de la comanda");
		reader.close();

	}

	// Funció específica que fará un bucle i fins que el usuari no posi 1 o 2 no
	// sortirá del bucle
	private static int volsSeguirDemanant() {

		Scanner reader = new Scanner(System.in);
		int seguir = 0;
		do {
			System.out.println("Vols seguir demanant ('1=Si'/'2=No')");

			try {

				// Això em donava errors de bucle infinit int i = reader.nextInt();
				int i = Integer.parseInt(reader.nextLine());
				if (i == 1) {
					seguir = 1;
				} else if (i == 2) {
					seguir = 2;
				} else {
					System.out.println("El número introduit (" + i + ") no es correcte.");
				}

			} catch (NumberFormatException e) {
				System.out.println("Aquesta opció sel.leccionada no és un número.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				System.out.println("Aquesta opció sel.leccionada no es correcte.");
				seguir = 0;
			}

		} while ((seguir != 1 && seguir != 2));

		return seguir;
	}

	/*
	 * Funció que validará si el plat introduit per l'usuari existeix a la carta o
	 * no
	 */
	private static void validaPlat(String platDemanat) throws Exception {

		boolean platTrobat = false;
		for (int i = 0; i < plats.length; i++) {
			if (platDemanat.equalsIgnoreCase(plats[i])) {
				platTrobat = true;
			}

		}

		if (platTrobat == false) {
			throw new Exception("Aquesta plat demanat (" + platDemanat + ") NO existeix");
		}

	}

	/*
	 * Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb
	 * l’array que hem fet al principi. En el cas que la informació que hem
	 * introduït a la List coincideixi amb la del array, haurem de sumar el preu del
	 * producte demanat; en el cas contrari haurem de mostrar un missatge que digui
	 * que el producte que hem demanat no existeix.
	 * 
	 */
	private static void calcularComanda() {
		System.out.println("Càlcul Comanda");

		// per cada comanda feta mirem si es igual a cada un dels plats del menu
		for (String c : comanda) {

			boolean comandaCorrecte = false;
			// Reseguim tots els plats del menú per si son igual
			for (int i = 0; i < plats.length; i++) {
				if (c.equalsIgnoreCase(plats[i])) {
					preuTotal = preuTotal + preus[i];
					comandaCorrecte = true;
				}
			}

			// Si no s'ha trobat la comanda
			if (!comandaCorrecte) {
				System.out.println("El producte que hem demanat (" + c.toString() + ") no existeix");
			}

		}

	}

	/*
	 * Finalment mostrarem el preu total de la comanda i els bitllets/monedes amb
	 * les quals s'hauria de pagar
	 */
	private static void mostrarImportComanda() {

		System.out.println("\nEl preu total de la comanda és de " + preuTotal);

		int euro1 = 1;
		int euro2 = 2;
		int euro5 = 5;
		int euro10 = 10;
		int euro20 = 20;
		int euro50 = 50;
		int euro100 = 100;
		int euro200 = 200;
		int euro500 = 500;

		int b500 = preuTotal / euro500;
		preuTotal = preuTotal % euro500;
		System.out.println(b500 + " bitllets de " + euro500 + " €");

		int b200 = preuTotal / euro200;
		preuTotal = preuTotal % euro200;
		System.out.println(b200 + " bitllets de " + euro200 + " €");

		int b100 = preuTotal / euro100;
		preuTotal = preuTotal % euro100;
		System.out.println(b100 + " bitllets de " + euro100 + " €");

		int b50 = preuTotal / euro50;
		preuTotal = preuTotal % euro50;
		System.out.println(b50 + " bitllets de " + euro50 + " €");

		int b20 = preuTotal / euro20;
		preuTotal = preuTotal % euro20;
		System.out.println(b20 + " bitllets de " + euro20 + " €");

		int b10 = preuTotal / euro10;
		preuTotal = preuTotal % euro10;
		System.out.println(b10 + " bitllets de " + euro10 + " €");

		int b5 = preuTotal / euro5;
		preuTotal = preuTotal % euro5;
		System.out.println(b5 + " bitllets de " + euro5 + " €");

		int b2 = preuTotal / euro2;
		preuTotal = preuTotal % euro2;
		System.out.println(b2 + " Moneda de " + euro2 + " €");

		int b1 = preuTotal / euro1;
		preuTotal = preuTotal % euro1;
		System.out.println(b1 + " Moneda de " + euro1 + " €");
	}

}
