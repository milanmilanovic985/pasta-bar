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

}
