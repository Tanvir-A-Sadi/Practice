package myCodes;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		int value;
		int total = 0;
		Scanner scanner = new Scanner(System.in); // Scanner object is created with the name scanner
		System.out.println("Enter 5 values and I will give you the total: ");
		for(int i = 0; i < 5; i++) {		// For loop construction, This loop will run until value is less than 5
			System.out.println("Enter Value " + (i+1) + ": ");
			value = scanner.nextInt();
			total +=value;
		}
		System.out.println("Total is now: " + total);
		

	}

}
