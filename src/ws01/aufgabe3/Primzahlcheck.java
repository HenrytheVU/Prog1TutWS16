package ws01.aufgabe3;

import java.util.Scanner;

public class Primzahlcheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int zahl = scanner.nextInt();
			if (zahl < 2) {
				System.out.println("Ungueltige Zahl: " + zahl);
				continue;
			}
			for (int i = 2; i < zahl; i++) {
				if (zahl % i == 0) {
					System.out.println("Zahl ist keine Primzahl");
					System.exit(-1);
				}
			}
			System.out.println("Zahl ist eine Primzahl");
			System.exit(-1);
		}
	}
}
