package ws15.aufgabe3;

public class Schliessfachtuer {

	// 3a
	private int nummer;
	private boolean open;

	public Schliessfachtuer(int nummer, boolean open) {
		setNummer(nummer);
		setOpen(open);
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	// 3b
	public String toString() {
		if (open) {
			return "o";
		} else {
			return "z";
		}
	}
	
	public static void main(String[] args) {
		
	}
}
