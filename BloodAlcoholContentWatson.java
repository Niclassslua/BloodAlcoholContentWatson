package BloodAlcoholContentWatson;

public class BloodAlcoholContentWatson {
	public static void main(String[] args) {
		System.out.println("Specify mass of absorbed alcohol in grams (g): ");
		int a = Integer.parseInt(System.console().readLine()); // Input is set equal to "a" (where "a" is integer).

		System.out.println("Specify mass of the person in kilograms (kg, integer): ");
		int m = Integer.parseInt(System.console().readLine()); // Input is set equal to "m" (where "m" is integer).

		System.out.println("Specify gender of the person (0 -> woman, 1 -> man): ");
		int gender = Integer.parseInt(System.console().readLine()); // Input is set equal to "gender" (where "gender" is integer).

		System.out.println("Specify the height of the person in centimeters (cm, whole number): ");
		int height = Integer.parseInt(System.console().readLine()); // Input is set equal to "height" (where "height" is integer).

		System.out.println("Specify age of the person in years: ");
		int age = Integer.parseInt(System.console().readLine()); // Input is set equal to "age" (where "age" is integer).

		double gkw = 0; // " gkw" is initialized as double to accept fractional numbers as value.

		if (gender == 0) { // If the gender is "0" -> woman.
			gkw = -2.097 + 0.1069 * height + 0.2466 * m;
			double c = (0.8 * a) / (1.055 * gkw); // Formula is applied with all previously read variables.

			System.out.println("The blood alcohol concentration is: " + c + " per mille, according to Watson's formula."); // Blood alcohol concentration
		} else if (gender == 1) { // If the gender is "1" -> man.
			gkw = 2.447 - 0.09516 * age + 0.1074 * height + 0.3362 * m;
			double c = (0.8 * a) / (1.055 * gkw); // Formula is applied with all previously read variables.

			System.out.println("The blood alcohol concentration is: " + c + " per mille, according to Watson's formula."); // Blood alcohol concentration
		} else { // If the gender is anything other than "0" or "1" -> not woman or man.
			System.out.println("Gender invalid! Formula could not be applied.");
		}

		// Use of "return;" is 'bypassed' by the calculation after the "gender == 0/1" queries.
	}
}
