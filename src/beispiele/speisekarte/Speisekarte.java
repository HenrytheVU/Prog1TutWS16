package beispiele.speisekarte;

public class Speisekarte {

	String restaurantName;
	String address;
	int telephone;
	Pizza[] pizzaArray = new Pizza[1];

	public Speisekarte(String restaurantName, String address, int telephone, Pizza[] pizzaArray) {
		this.restaurantName = restaurantName;
		this.address = address;
		this.telephone = telephone;
		this.pizzaArray = pizzaArray;
	}

	public String toString() {
		String header = "Restaurant: " + restaurantName + " Adresse: " + address + " Tel: " + telephone;
		String pizzas = "\n";

		for (int i = 0; i < pizzaArray.length; i++) {
			pizzas += i + 1 + " " + pizzaArray[i].toString() + "\n";
		}

		return header + pizzas;

	}

}
