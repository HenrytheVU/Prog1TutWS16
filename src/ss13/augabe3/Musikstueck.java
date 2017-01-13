package ss13.augabe3;

public class Musikstueck {

	private String interpret;
	private String liedname;
	private int laenge = STANDARDLAENGE;

	public static final int STANDARDLAENGE = 240;

	public Musikstueck(String interpret, String liedname, int laenge) {
		setInterpret(interpret);
		setLiedname(liedname);
		setLaenge(laenge);
	}

	public String getInterpret() {
		return interpret;
	}

	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}

	public String getLiedname() {
		return liedname;
	}

	public void setLiedname(String liedname) {
		this.liedname = liedname;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		if (laenge >= 60 && laenge <= 600) {
			this.laenge = laenge;
		}
	}

}
