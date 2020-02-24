/*
 * Autor: Carlos Henrique
 * Data: 24/02/2020
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		String name = keyboard.nextLine();
		Double salary = keyboard.nextDouble();
		Double sales = keyboard.nextDouble();
		
		// 0.15 equals a 15% of total sales
		Double totalSalary = salary + (sales * 0.15);
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));
		keyboard.close();
	}
}
