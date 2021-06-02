package M1;

/**
 * 
 * @author Carles Falgueras - Date 01/06/2021 - BackEndJava / *
 */
public class VariablesNivell1Fase3 {
	public static void main(String[] args) {
		// Crea tres variables string e inicialitzales amb les dades pertinents (nom,
		// cognom1, cognom2).
		String nom = "Lionel";
		String cognom1 = "Messi";
		String cognom2 = "Cuccittini";

		// Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes,
		// any).
		int dia = 1;
		int mes = 6;
		int any = 2021;

		// Mostra per pantalla les variables string concatenant-les en aquest ordre
		// (cognom1 + cognom2, + nom).
		System.out.println(cognom1 + " " + cognom2 + ", " + nom);

		// Mostra per pantalla les variables int concatenant-les amb �/� entre cada una
		// d�elles.
		System.out.println(dia + "/" + mes + "/" + any);

		/* FASE 2 - Sabent que l�any 1948 es un any de trasp�s: */
		System.out.println("------------");

		// Creeu una constant amb el valor de l�any (1948).
		int ANY = 1948;

		// Creeu una variable que guardi cada quan hi ha un any de trasp�s
		int CadaQuantAnyTraspass = 4;

		// Calculeu quants anys de trasp�s hi ha entre 1948 i el vostre any de naixement
		// i emmagatzemeu el valor resultant en una variable.
		int AnyNaixament = 1987;
		int y = 0;

		// Mostreu per pantalla el resultat del c�lcul.
		System.out.println("Anys de trasp�s de " + ANY + " fins " + AnyNaixament);

		/* FASE 3 - */
		// Creeu una variable bool que sera certa si l�any de naixement �s de trasp�s o
		// falsa si no ho �s.
		// En cas de que la variable bool sigui certa, heu de mostrar per consola una
		// frase on ho digui, en cas de ser falsa mostrareu la frase pertinent. Creeu
		// dues variables string per guardar les frases.
		boolean IsAnyNaixamentTraspas = false;

		// Feu servir un bucle for, mostrant tots aquests anys.
		for (int i = ANY; i < AnyNaixament; i = i + CadaQuantAnyTraspass) {

			System.out.print(i + " ");

			y++;

			if (i == AnyNaixament) {
				IsAnyNaixamentTraspas = true;
			}

		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Nombre d'anys de trasp�s des de " + ANY + " fins " + AnyNaixament + ": " + y);

		System.out.println("------------");
		System.out.println("");
		System.out.println("");
		if (IsAnyNaixamentTraspas) {
			System.out.println("L'Any " + AnyNaixament + " es de trasp�s");
		} else {
			System.out.println("L'Any " + AnyNaixament + " No es de trasp�s");
		}

	}

}
