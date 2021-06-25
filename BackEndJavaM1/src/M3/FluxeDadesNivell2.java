package M3;

import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 23/06/2021 - BackEndJava
 * 
 *         Nivell 2
 *         En aquest exercici crearàs un array bidimensional on introduiràs 3
 *         notes per a 5 alumnes. Es calcularà la nota mitjana de cada alumna i
 *         s'indicarà si han suspès o no.
 *         Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes.
 *         Omple l’array amb un bucle demanant els valors per pantalla (nota
 *         entre 0 i 10), has d’identificar per pantalla quan és una agrupació
 *         d’un alumne nou .
 *         Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si
 *         l'alumne ha aprovat o suspès
 */

public class FluxeDadesNivell2 {

	public static void main(String[] args) {

		int[][] notes = new int[5][3];
		Scanner reader = new Scanner(System.in);

		// fem els dos for per obtenir pels 5 alumenes les 3 notes
		for (int i = 0; i < notes.length; i++) {
			System.out.println("");
			for (int j = 0; j < 3; j++) {
				System.out.println("Introdueix la nota " + (j + 1) + " per el alumne " + (i + 1) + "");
				notes[i][j] = reader.nextInt();
			}
		}

		System.out.println("*********************");

		// Tornem a recorre el array per fer la mitjana aritmètica
		for (int i = 0; i < notes.length; i++) {
			int mitjana = 0;
			for (int j = 0; j < notes[i].length; j++) {
				mitjana = mitjana + notes[i][j];
			}
			mitjana = mitjana / notes[i].length;

			if (mitjana >= 5) {
				System.out.println("L'alumne " + (i + 1) + " ha aprovat amb una nota mitjana de " + mitjana);
			} else {
				System.out.println("L'alumne " + (i + 1) + " ha suspés amb una nota mitjana de " + mitjana);
			}

		}
	}

}
