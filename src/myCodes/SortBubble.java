package myCodes;

import java.util.Scanner;

public class SortBubble {

	public static void main(String[] args) {
		int size;
		int[] anArray;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter few random number and I will sort them usirng bubble sort.");
		System.out.println("How many number do you wish to enter? ");
		size = scanner.nextInt();
		anArray = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value " + (i + 1) + ": ");
			anArray[i] = scanner.nextInt();
		}
		System.out.println("Before sort, the values are in the following order:");
		for (int i = 0; i < size; i++)
			System.out.print(anArray[i] + " ");

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - (i + 1); j++) {
				if (anArray[j] > anArray[j + 1]) {
					int temp = anArray[j];
					anArray[j] = anArray[j + 1];
					anArray[j + 1] = temp;
				}
			}
		}
		System.out.println("\nAfter sort, the values are in the following order:");
		for (int i = 0; i < size; i++)
			System.out.print(anArray[i] + " ");

	}

}
