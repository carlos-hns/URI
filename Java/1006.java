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
		
		Double A = keyboard.nextDouble();
		Double B = keyboard.nextDouble();
		Double C = keyboard.nextDouble();
		Double MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0; 
	
		System.out.println("MEDIA = " + String.format("%.1f", MEDIA));
		keyboard.close();
	}
}
