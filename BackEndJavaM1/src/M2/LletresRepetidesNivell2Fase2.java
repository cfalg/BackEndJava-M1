package M2;

import java.util.Scanner;

/**
 * 
 * @author Carles Falgueras - Date 15/06/2021 - BackEndJava
 * 
 *         Nivell 2 - Fase 2
 *         Crea una aplicació que dibuixi una piràmide invertida de asteriscs.
 *         Nosaltres
 *         li vam passar l'altura de la piràmide per teclat. Aquest és un
 *         exemple:
 */

public class LletresRepetidesNivell2Fase2 {

	public static void main(String[] args) {
		int Alçada = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix una alçada:");
		Alçada = reader.nextInt();

		for (int i = 1; i < Alçada; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}

			for (int j = i; j < Alçada - i; j++) {
				System.out.print('*');
			}
			System.out.println("");

		}

	}

}
