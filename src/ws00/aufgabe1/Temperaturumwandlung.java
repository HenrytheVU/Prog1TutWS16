package ws00.aufgabe1;

public class Temperaturumwandlung {

	public static void main(String[] args) {
//		System.out.println("Fahrenheit \t Celcius");
//		for (int i = 0; i <= 300; i++) {
//			double celciusDegree = (5.0 / 9.0) * (i - 32);
//			System.out.println(i + "\t\t" + celciusDegree);
//		}

		// mit while-Schleife
		int fahrenheit = 0;
		System.out.println("Fahrenheit \t Celcius");
		while (fahrenheit <= 300) {
			System.out.println(fahrenheit + "\t\t" + (5.0 / 9.0) * (fahrenheit - 32));
			fahrenheit++;
		}

	}

}
