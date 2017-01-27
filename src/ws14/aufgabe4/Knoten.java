package ws14.aufgabe4;

public class Knoten {

	private String name;
	private Knoten next;

	public Knoten(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knoten getNext() {
		return next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

	public String toString() {
		return name;
	}

}
