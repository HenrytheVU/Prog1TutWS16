package ws01.aufgabe3;

import java.util.Scanner;

public class PrimzahlcheckMusterloesung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zahl = scanner.nextInt();

		while (!isValid(zahl)) {
			System.out.println("Zu untersuchende Zahl: " + zahl);
			System.out.println("FEHLER");
			zahl = scanner.nextInt();
		}

		if (isPrime(zahl)) {
			System.out.println("Zu untersuchende Zahl: " + zahl);
			System.out.println("Zahl ist eine Primzahl");
		} else {
			System.out.println("Zu untersuchende Zahl: " + zahl);
			System.out.println("Zahl ist keine Primzahl");
		}
		scanner.close();

	}

	static boolean isValid(int value) {
		return value >= 2;
	}

	static boolean isPrime(int value) {
		if (value == 2)
			return true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
