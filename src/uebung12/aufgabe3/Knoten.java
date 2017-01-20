package uebung12.aufgabe3;

public class Knoten {

	int zahl;
	Knoten pre;
	Knoten next;

	public Knoten(int zahl, Knoten pre, Knoten next) {
		this.zahl = zahl;
		this.next = next;
		this.pre = pre;
	}

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}

	public Knoten getPre() {
		return pre;
	}

	public void setPre(Knoten pre) {
		this.pre = pre;
	}

	public Knoten getNext() {
		return next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

}
