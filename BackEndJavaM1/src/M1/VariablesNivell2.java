package M1;

/**
 * 
 * @author Carles Falgueras - Date 02/06/2021 - BackEndJava / *
 * 
 *         Nivell 2 Declara una variable double. Assigna-li un valor amb 4
 *         decimals Declara variables de tipus: int, float i string Fes un
 *         "cast" de la variable double a cada una de les variables que has
 *         creat anteriorment per inicialitzar-les i pinta-les per pantalla.
 */
public class VariablesNivell2 {

	public static void main(String[] args) {
		
		double VariableDouble= 3.1416d;
		System.out.println(VariableDouble + " Double");
		
		int VariableInt=(int)VariableDouble;
		System.out.println(VariableInt + " Int");
		
		float VariableFloat = (float)VariableDouble;
		System.out.println(VariableFloat + " Float");
		
		String VariableString=Double.toString(VariableDouble);
		System.out.println(VariableString + " String");
		

	}

}
