package ss16.aufgabe3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Wald wald = new Wald(new Baum[500]);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < wald.getBaeume().length; i++) {
			System.out.println("Bitte einen Baumtyp auswählen 0 für BUCHE, 1 für EICHE oder 2 für ANDERER");
			int typ = sc.nextInt();
			System.out.println("Bitte geben Sie die Anzahl der Hauptaeste an: ");
			int hauptastAnzahl = sc.nextInt();
			wald.getBaeume()[i] = new Baum(Baumtyp.values()[typ], hauptastAnzahl);
		}
		sc.close();
	}

}
