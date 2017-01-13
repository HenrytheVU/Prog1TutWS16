package ss16.aufgabe3;

public class Baum {

	private Baumtyp typ;
	private int hauptastAnzahl;

	public Baum(Baumtyp typ, int hauptastAnzahl) {
		this.typ = typ;
		this.hauptastAnzahl = hauptastAnzahl;
	}

	public Baumtyp getBaumtyp() {
		return this.typ;
	}

	public int getHauptastAnzahl() {
		return this.hauptastAnzahl;
	}

	public void setHauptastAnzahl(int anzahl) {
		this.hauptastAnzahl = anzahl;
	}

	@Override
	public String toString() {
		return "Baumtyp: " + typ + " Anzahl der Hauptaeste: " + hauptastAnzahl;
	}
}
