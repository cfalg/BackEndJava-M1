package M2;

/**
 * 
 * @author Carles Falgueras - Date 15/06/2021 - BackEndJava
 * 
 *         Nivell 2 - Fase 1
 *         Crea una aplicaci� que dibuixi una escala de nombres, sent
 *         cada l�nia nombres comen�ant en un i acabant en el nombre de la
 *         l�nia. Aquest
 *         �s un exemple, si introdu�m un 5 com a al�ada:
 */

public class LletresRepetidesNivell2Fase1 {

	public static void main(String[] args) {
		int Al�ada = 5;

		for (int i = 1; i <= Al�ada; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");

		}

	}

}
