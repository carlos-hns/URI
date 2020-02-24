/*
 * Autor: Carlos Henrique
 * Data: 24/02/2020
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		Integer A = keyboard.nextInt();
		Integer B = keyboard.nextInt();
		Integer SOMA = A + B; 
	
		System.out.println("SOMA = " + SOMA);
		keyboard.close();
	}
}
