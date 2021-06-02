package M1;

/**
 * 
 * @author Carles Falgueras - Date 02/06/2021 - BackEndJava / *
 * 
 *         Nivell 3 
 *         Declara un array de numeros int e inicialitzala amb valors
 *         del 1 al 10 Rota l’array sense utilitzar un array auxiliar ni
 *         llibreries. Pots utilizar una variable auxiliar
 */
public class VariablesNivell3 {

	public static void main(String[] args) {

		int[] ArrayInt= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Pintar array ordre normal");
		for (int i=0; i<ArrayInt.length; i++) {
			System.out.print(ArrayInt[i]+" ");
		}
		
		
		System.out.println("\n\nPintar array ordre invers");
		for (int i=ArrayInt.length; i>0; i--) {
			System.out.print(ArrayInt[i-1]+" ");
		}
	}

}
