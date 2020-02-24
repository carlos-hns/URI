/*
 * Autor: Carlos Henrique
 * Data: 24/02/2020
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		Double A = keyboard.nextDouble();
		Double B = keyboard.nextDouble();
		Double MEDIA = (A * 3.5) + (B * 7.5) / 11.0; 
	
		System.out.println("PROD = " + String.format("%.5f", MEDIA));
		keyboard.close();
	}
}
