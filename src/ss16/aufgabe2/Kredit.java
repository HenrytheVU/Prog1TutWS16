package ss16.aufgabe2;

public class Kredit {

	public static int tilgung(double kreditsumme, double schuldzins, double tilgungsrate) {
		
		int years = 0;

		for (int i = 1; kreditsumme > 0; i++) {
			kreditsumme += (kreditsumme * schuldzins / 100);
			System.out.println("Kreditsumme nach Zins: " + kreditsumme);
			kreditsumme -= tilgungsrate;
			System.out.println("Kreditsumme nach Tilgung: " + kreditsumme);
			years = i;
			System.out.println("Anzahl der Jahre: " + years);
		}

		return years;
	}

	public static void main(String[] args) {
		System.out.println(tilgung(10000, 2.5, 1000));
	}
}
