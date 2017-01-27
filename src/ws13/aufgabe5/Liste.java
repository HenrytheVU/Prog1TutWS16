package ws13.aufgabe5;

public class Liste {

	private Knoten start;

	public String[] toArray() {
		int length = 0;
		Knoten currentNode = start;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			length++;
		}
		String[] result = new String[length];
		currentNode = start;
		for (int i = 0; i < result.length; i++) {
			result[i] = currentNode.getName();
			currentNode = currentNode.getNext();
		}
		return result;
	}

	public static void main(String[] args) {
		Liste list = new Liste();
		list.start = new Knoten("A", new Knoten("B", new Knoten("C", null)));

		for (int i = 0; i < list.toArray().length; i++) {
			System.out.println(list.toArray()[i]);
		}
		
	}

}
