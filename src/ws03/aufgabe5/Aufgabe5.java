package ws03.aufgabe5;

public class Aufgabe5 {

	public static char[] ersetzeUmlaute(char[] input) {
		int length = 0;
		for (int i = 0; i < input.length; i++) {
			length++;
			if (istUmlaut(input[i])) {
				length++;
			}
		}
		char[] output = new char[length];
		
		int index = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 'ä') {
				output[index++] = 'a';
				output[index++] = 'e';
			} else if (input[i] == 'Ä') {
				output[index++] = 'A';
				output[index++] = 'e';
			} else if (input[i] == 'ö') {
				output[index++] = 'o';
				output[index++] = 'e';
			} else if (input[i] == 'Ö') {
				output[index++] = 'O';
				output[index++] = 'e';
			} else if (input[i] == 'ü') {
				output[index++] = 'u';
				output[index++] = 'e';
			} else if (input[i] == 'Ü') {
				output[index++] = 'U';
				output[index++] = 'e';
			} else {
				output[index++] = input[i];
			}
		}
		return output;
	}

	public static boolean istUmlaut(char c) {
		char[] umlaute = { 'ä', 'Ä', 'ö', 'Ö', 'ü', 'Ü' };
		for (int i = 0; i < umlaute.length; i++) {
			if (umlaute[i] == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		char[] text = "Übelrichendes Öl und Abfälle".toCharArray();
		System.out.println(new String(ersetzeUmlaute(text)));
	}
}
