/*
 * Autor: Carlos Henrique
 * Data: 24/02/2020
 */

import java.util.Scanner;
import java.util.Locale;

public class _1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		// How the code of piece not will be used
		// i don't save on variable
		
		Double totalAmount = 0.0;
		for (int i=0; i < 2; i++) {
			
			keyboard.nextInt();
			Integer quantity = keyboard.nextInt();
			Double unityValue = keyboard.nextDouble();
			
			
			totalAmount += quantity * unityValue;
		}
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalAmount));
		keyboard.close();
	}
}
