/*
 * Autor: Carlos Henrique
 * Data: 24/02/2020
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		Double pi = 3.14159;
		Double raio = keyboard.nextDouble();
		Double area = pi * (raio * raio);
		
		System.out.println("A=" + String.format("%.4f", area));
		keyboard.close();
	}
}