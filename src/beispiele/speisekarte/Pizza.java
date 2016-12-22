package beispiele.speisekarte;

public class Pizza {

	String name;
	int diameter;
	double price;

	public Pizza(String name, int diameter, double price) {
		this.name = name;
		this.diameter = diameter;
		this.price = price;
	}

	public String toString() {
		return "Name: " + name + " Durchmesse: " + diameter + " Preis: " + price;
	}

}
