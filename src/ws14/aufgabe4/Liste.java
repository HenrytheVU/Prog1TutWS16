package ws14.aufgabe4;

public class Liste {
	Knoten start = null;
	Knoten ende = null;

	public void fuegeHinzu(Knoten k) {
		if (isEmpty()) {
			start = k;
			ende = k;
		} else {
			ende.setNext(k);
			ende = k;
		}
	}

	public Knoten entferneErstenKnoten() {
		if (isEmpty()) {
			return null;
		}
		if (start.getNext() == null) {
			Knoten result = start;
			start = null;
			ende = null;
			return result;
		}
		Knoten result = start;
		start = start.getNext();
		return result;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public String toString() {
		String value = "";
		Knoten currentNode = start;
		while (currentNode != null) {
			value += currentNode.getName() + ", ";
			currentNode = currentNode.getNext();
		}
		return value;
	}

	public static void main(String[] args) {
		Liste list = new Liste();
		list.fuegeHinzu(new Knoten("A"));
		list.fuegeHinzu(new Knoten("B"));
		list.fuegeHinzu(new Knoten("C"));

		System.out.println(list);

		System.out.println(list.entferneErstenKnoten());
		System.out.println(list.entferneErstenKnoten());
		System.out.println(list.entferneErstenKnoten());
		System.out.println(list.entferneErstenKnoten());
		System.out.println(list);
	}

}
