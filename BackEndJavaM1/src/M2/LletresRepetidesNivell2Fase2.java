package M2;

import java.util.Scanner;

/**
 * 
 * Nivell 2 - Fase 2
 * Crea una aplicaci� que dibuixi una pir�mide invertida de asteriscs. Nosaltres
 * li vam passar l'altura de la pir�mide per teclat. Aquest �s un exemple:
 */

public class LletresRepetidesNivell2Fase2 {

	public static void main(String[] args) {
		int Al�ada = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix una al�ada:");
		Al�ada=reader.nextInt();

		
		for (int i = 1; i < Al�ada; i++) {
			
			for (int j = 1; j <i; j++) {
				System.out.print(' ');
			}
			
			for (int j = i; j < Al�ada-i; j++) {
				System.out.print('*');
			}
			System.out.println("");

		}
		
	}

}
