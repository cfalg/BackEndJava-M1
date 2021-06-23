package M2;

/**
 * 
 * @author Carles Falgueras - Date 15/06/2021 - BackEndJava
 * 
 *         Nivell 2 - Fase 1
 *         Crea una aplicació que dibuixi una escala de nombres, sent
 *         cada línia nombres començant en un i acabant en el nombre de la
 *         línia. Aquest
 *         és un exemple, si introduïm un 5 com a alçada:
 */

public class LletresRepetidesNivell2Fase1 {

	public static void main(String[] args) {
		int Alçada = 5;

		for (int i = 1; i <= Alçada; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");

		}

	}

}
