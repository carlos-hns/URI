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
		
		double A = keyboard.nextDouble();
		double B = keyboard.nextDouble();
		Double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0; 
	
		System.out.println("MEDIA = " + String.format("%.5f", MEDIA));
		keyboard.close();
	}
}
