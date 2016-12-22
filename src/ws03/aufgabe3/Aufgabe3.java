package ws03.aufgabe3;

public class Aufgabe3 {

	public static boolean enthaeltNurOktalZiffern(char[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] < '0' || input[i] > '7') {
				System.out.println(input[i]);
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[] input = "01234567".toCharArray();
		System.out.println(enthaeltNurOktalZiffern(input));
	}

}
