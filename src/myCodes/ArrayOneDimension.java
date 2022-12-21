package myCodes;

import java.util.Scanner;

public class ArrayOneDimension {

	public static void main(String[] args) {
		// Declare an array of integers
		int [] anArray;
		int size = 3;
		Scanner scanner = new Scanner(System.in);
		
		//allocate memory for integers
		anArray = new int[size];
		//initialize array elements
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i+1) + ": ");
			anArray[i] = scanner.nextInt();
		}
		
		System.out.println("You have entered: ");
		for (int i = 0; i < size; i++) {
			System.out.println("Element " + (i+1) + ": " + anArray[i]);
		}

	}

}
