package ws01.aufgabe1;

public class Aufgabe1 {

	static boolean istNull(double value) {
		if(value >= Math.pow(-10, -6) && value <= Math.pow(10, -6)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(istNull(0.000001));
	}
}
