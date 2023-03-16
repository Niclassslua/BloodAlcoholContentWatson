package uebung01;

import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

public class BloodAlcoholContentWatson {
	public static void main(String[] args) {
		println("XXXX Gebe Masse des aufgenommen Alkohols in Gramm (g) an: ");
		int a = readInt(); // Eingabe wird gleich "a" gesetzt (wobei "a" ganzahlig ist).

		println("Gebe Masse der Person in Kilogram (kg, ganzzahlig) an: ");
		int m = readInt(); // Eingabe wird gleich "m" gesetzt (wobei "m" ganzahlig ist).

		println("Gebe Geschlecht der Person (0 -> Frau, 1 -> Mann) an: ");
		int gender = readInt(); // Eingabe wird gleich "gender" gesetzt (wobei "gender" ganzahlig ist).

		println("Gebe Körpergröße der Person in Centimeter (cm, ganzzahlig) an: ");
		int height = readInt(); // Eingabe wird gleich "height" gesetzt (wobei "height" ganzahlig ist).

		println("Gebe Alter der Person in Jahren an: ");
		int age = readInt(); // Eingabe wird gleich "age" gesetzt (wobei "age" ganzahlig ist).

		double gkw = 0; // "gkw" wird initalisiert als double um sog. "fractional numbers" als Wert
						// annehmen zu können.

		if (gender == 0) { // Wenn das Geschlecht "0" -> Frau ist.
			gkw = -2.097 + 0.1069 * height + 0.2466 * m;
			double c = (0.8 * a) / (1.055 * gkw); // Formel wird mit allen vorher eingelesenen Variablen angewendet.

			println("Die Blutalkoholkonzentration beträgt: " + c + " Promille, nach Watson-Formel."); // Blutalkoholkonzentration
																										// wird
																										// ausgegeben
		} else if (gender == 1) { // Wenn das Geschlecht "1" -> Mann ist
			gkw = 2.447 - 0.09516 * age + 0.1074 * height + 0.3362 * m;
			double c = (0.8 * a) / (1.055 * gkw); // Formel wird mit allen vorher eingelesenen Variablen angewendet.

			println("Die Blutalkoholkonzentration beträgt: " + c + " Promille, nach Watson-Formel."); // Blutalkoholkonzentration
																										// wird
																										// ausgegeben
		} else { // Wenn das Geschlecht alles andere als "0" oder "1" -> nicht Frau oder Mann
					// ist.
			println("Geschlecht ungültig! Formel konnte nicht angewendet werden.");
		}

		// Nutzung von "return;" wird durch die Berechnung nach den "gender == 0/1"
		// Abfragen umgangen.

	}
}