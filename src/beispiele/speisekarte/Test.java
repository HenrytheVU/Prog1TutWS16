package beispiele.speisekarte;

public class Test {

	public static void main(String[] args) {
		// Bitte definieren Sie eine Speisekarte für das Restaurant
		// Luigi Restaurante, Adresse: 97070 Wuerzburg, Tel: 931666666
		// Diese Speisekarte enthält 3 verschiedene Pizzen:
		// Vierkaese, 30 cm, 4,99€
		// Salami, 30 cm, 3,99€
		// Hawai, 25 cm, 4,99€
		
		Pizza vierkaese = new Pizza("Vierkaese", 30, 4.99);
		Pizza salami = new Pizza("Salami", 30, 3.99);
		Pizza hawai = new Pizza("Hawai", 25, 4.99);
		
		Pizza[] pizzaArray = new Pizza[3];
		pizzaArray[0] = vierkaese;
		pizzaArray[1] = salami;
		pizzaArray[2] = hawai;
		
		Speisekarte speisekarte = new Speisekarte("Luigi Restaurante", "97070 Wuerzburg", 931666666, pizzaArray);
		
		System.out.println(speisekarte);

	}

}
