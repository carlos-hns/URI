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
		
		Integer number = keyboard.nextInt();
		Integer hoursWorked = keyboard.nextInt();
		Double valueForHour = keyboard.nextDouble();
		Double salary = hoursWorked * valueForHour; 
	
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", salary));
		keyboard.close();
	}
}
