package beispiele;

public class ArrayBeispiele {

	public static void main(String[] args) {
		
//		int[] intArray = new int[3];
//
//		for (int i = 0; i < intArray.length; i++) {
//			intArray[i] = i + 1;
//			System.out.print("[" + intArray[i] + "]");
//		}
		
		String[] stringArray = new String[6];
		stringArray[0] = "Hallo";
		stringArray[1] = " ";
		stringArray[2] = "was";
		stringArray[3] = " ";
		stringArray[4] = "geht";
		stringArray[5] = "?";
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
		

	}

}
