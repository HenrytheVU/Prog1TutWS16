package ws99.aufgabe1;

import java.util.Scanner;

public class PositivNegativ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int positiveCounter = 0;
		int negativeCounter = 0;
		int input = 1;

		while (input != 0) {
			System.out.println("Bitte geben eine ganze Zahl ein: ");
			input = scanner.nextInt();
			if (istNegativ(input)) {
				negativeCounter++;
			} else if (istPositiv(input)) {
				positiveCounter++;
			}
		}
		scanner.close();
		// Ctrl + Shift + F
		System.out.println("Es wurden " + positiveCounter + " positive Zahlen eingegeben");
		System.out.println("Es wurden " + negativeCounter + " negative Zahlen eingegeben");
	}
	
	static boolean istNegativ(int zahl) {
		if(zahl < 0){
			return true;
		} else {
			return false;
		}
	}
	
	static boolean istPositiv(int zahl) {
		if(zahl > 0) {
			return true;
		} else {
			return false;
		}
	}

}
