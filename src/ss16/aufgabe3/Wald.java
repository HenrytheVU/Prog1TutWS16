package ss16.aufgabe3;

public class Wald {

	private Baum[] baeume;

	public Wald(Baum[] baeume) {
		this.baeume = baeume;
	}

	public Baum[] getBaeume() {
		return baeume;
	}

	public void setBaeume(Baum[] baeume) {
		this.baeume = baeume;
	}

	@Override
	public String toString() {
		String value = "";
		for (int i = 0; i < baeume.length; i++) {
			value += baeume[i].toString() + "\n";
		}
		return value;
	}
}
