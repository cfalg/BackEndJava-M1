package M3;

import java.util.Scanner;

/**
 * @author Carles Falgueras - Date 24/06/2021 - BackEndJava
 * 
 *         Nivell 3
 *         Escriviu un programa que donat un numero N retorni la seqüència de
 *         Fibonacci fins al numero N.La seqüència de Fibonacci és la sèrie de
 *         nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... El número següent es
 *         troba sumant els dos números anteriors.
 */

public class FluxeDadesNivell3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Introdueix un número d'allargada seqüència Fibonacci =");
		int allargada= reader.nextInt();

		//dimensionem el array a la mida que hagi indicat el usuari
		int[] fibonacci = new int[allargada];
		
		//primer FOR per informar els valors
		for (int i = 0; i < fibonacci.length; i++) {
			//controlem els dos primeres opcions ja que no podem sumar els anteriors i ens fallaria
			if (i==0) {
				fibonacci[i]=0;
			} else if (i==1) {
				fibonacci[i]=1;
				
			} else {
				fibonacci[i]= (fibonacci[i-1]+fibonacci[i-2]);
			}
				
		}
		
		//segon FOR per pintar per pantalla el resultat
		System.out.println("La seqüència de Fibonacci de " + fibonacci.length + " és: ");
		for (int i : fibonacci) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("****************************");
	
	}

}
