package M1;

/**
 * 
 * @author Carles Falgueras - Date 01/06/2021 - BackEndJava / *
 */
public class VariablesNivell1Fase2 {
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

		// Mostra per pantalla les variables int concatenant-les amb “/” entre cada una
		// d’elles.
		System.out.println(dia + "/" + mes + "/" + any);

		
		/* FASE 2 - Sabent que l’any 1948 es un any de traspàs: */
		System.out.println("------------");
		
		//	Creeu una constant amb el valor de l’any (1948).
		int ANY = 1948;
		
		//	Creeu una variable que guardi cada quan hi ha un any de traspàs
		int CadaQuantAnyTraspass=4;
		
		// Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
		int AnyNaixament=1974;
		int y=0;
		
		//	Mostreu per pantalla el resultat del càlcul.
		System.out.println("Anys de traspàs de "+ANY+" fins "+AnyNaixament);
		
		//	Feu servir un bucle for, mostrant tots aquests anys.
		for (int i = ANY; i < AnyNaixament; i=i+CadaQuantAnyTraspass) {
			
			System.out.print(i + " ");
			
			y++;
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Nombre d'anys de traspàs des de "+ ANY + " fins " + AnyNaixament+": "+y);

	}

}
