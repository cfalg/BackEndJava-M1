package M2;

import java.text.DecimalFormat;

/**
 * 
 * Nivell 3 - Fase 1
 * En aquest exercici es proposa un exercici complex de comprovacions i bucles
 * per crear un cronòmetre digital que vagi mostrant el temps transcorregut en
 * format rellotge hh:mm:ss amb un segon d'espera.
 * Només necessites 3 variables int (hour, minutes, seconds)
 * El cronòmetre ha de tenir 6 dígits en tot moment i ha d'iniciar a 00:00:00
 * L’aplicació no ha de finalitzar mai.
 * Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000);
 */

public class LletresRepetidesNivell3Fase1 {

	public static void main(String[] args) {
		int Hour = 0;
		int Minutes = 0;
		int Seconds = 0;
		String Clock = null;

		// fem format al text per afegir els 0
		String formatoDeseado = "00";
		DecimalFormat formateador = new DecimalFormat(formatoDeseado);

		// Bucle Hores
		for (int h = 0; h < 24; h++) {

			// Bucle minuts
			for (int m = 0; m < 60; m++) {
				// Bucle segons
				for (int s = 0; s < 60; s++) {
					Clock = formateador.format(h);
					Clock = Clock + ":";
					Clock = Clock + formateador.format(m);
					Clock = Clock + ":";
					Clock = Clock + formateador.format(s);

					System.out.println(Clock);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
