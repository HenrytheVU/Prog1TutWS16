package beispiele;

import java.util.Scanner;

public class ScannerBespiele {

	public static void main(String[] args) {

		// scanner initialisiern und von der Console lesen
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		int zahl1 = scanner.nextInt();

		System.out.println("Bitte geben Sie die zweite Zahl ein: ");
		int zahl2 = scanner.nextInt();

		int summe = zahl1 + zahl2;
		System.out.println("Die Summe ist: " + summe);

		// blank scanner.nextLine() for consuming Enter -> \n
		scanner.nextLine();

		// String einlesen:
		System.out.println("Bitte geben Sie den ersten Satz ein:");
		String stringInput1 = scanner.nextLine();

		System.out.println("Bitte geben Sie den zweiten Satz ein:");
		String stringInput2 = scanner.nextLine();

		System.out.println("Ergebnis: " + stringInput1 + " " + stringInput2);

		scanner.close();

	}

}
