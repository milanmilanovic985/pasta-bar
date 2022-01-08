package pasta_bar;

import java.util.Scanner;

public class Pasta_bar {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] ingredients = { "MAKARONE", "ŠPAGETE", "BOLOGNESE", "ĆURETINA", "GOVEĐA PRŠUTA", "SLANINA", "PILETINA",
				"4 SIRA", "DIMLJENI SIR", "PARMEZAN", "PAVLAKA", "PESTO SOS", "NAPOLITANA", "POVRĆE MIX", "PEČURKE",
				"KUTIJA" };
		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		double totalPrice = 0;
		String ingredientName = "";
		System.out.println("Izvolite!!");
		while (!ingredientName.equals("PORUČI")) {
			System.out.print("Izaberite sastojak za pastu : ");
			ingredientName = s.nextLine();
			ingredientName = ingredientName.toUpperCase();
			ingredientName = ingredientName.trim();
			int index = findIngredient(ingredients, ingredientName);
			if (index >= 0) {
				totalPrice = totalPrice + price[index];
			} else if (index == -2) {
				System.out.println("Pogrešan unos!!!");
			}

		}
		System.out.print("Unesite vaš broj telefona : ");
		String phone = s.next();
		phone = phone.trim();
		boolean isRegularCustomer = isRegularCustomer(phoneNumbers, phone);
		if (isRegularCustomer) {
			totalPrice = totalPrice * 0.9;
		}
		System.out.println("Vaša pasta iznosi " + String.format("%.0f", totalPrice) + " rsd.");
		System.out.println("Prijatno!!");

	}
	public static int findIngredient(String[] ingredients, String ingredientName) {
		if (ingredientName.equals("PORUČI")) {
			return -1;
		}
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredientName.equals(ingredients[i])) {
				return i;
			}
		}
		return -2;
	}
	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phone.equals(phoneNumbers[i])) {
				return true;
			}
		}
		return false;
	}

}
