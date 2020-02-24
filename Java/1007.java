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
		
		Integer A = keyboard.nextInt();
		Integer B = keyboard.nextInt();
		Integer C = keyboard.nextInt();
		Integer D = keyboard.nextInt();
		Integer DIFERENCA = A * B - C * D; 
	
		System.out.println("DIFERENCA = " + DIFERENCA);
		keyboard.close();
	}
}
