package ws15.aufgabe2;

import java.util.Scanner;

public class ISBN {

	// 2a
	public static boolean isISBN(String input) {
		char[] charArray = input.toCharArray();
		int sum = 0;
		int k = 1;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != '-') {
				sum += (charArray[i] - '0') * k;
				k++;
			}
		}
		System.out.println("Summe: " + sum);
		System.out.println("sum % 11 = " + sum % 11);
		return sum % 11 == 0;
	}

	// 2b
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine ISBN ein:");
		String input = sc.nextLine();
		System.out.println("Die eingebene ISBN ist: " + isISBN(input));
		sc.close();
	}
}
