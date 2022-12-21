package myCodes;

import java.util.Scanner;

public class SortSelection {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter few numbers and I will sort them for you");
		System.out.println("How many numbers do you have to enter: ");
		size = scanner.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value " + (i + 1));
			anArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {
			int minValue = anArray[i];
			for (int j = i + 1; j < size; j++) {
				if (anArray[j] < anArray[i]) {
					minValue = anArray[j];
					anArray[j] = anArray[i];
					anArray[i] = minValue;
				}
			}
		}
		System.out.println("The sorted values are as follows.");
		for (int i = 0; i < size; i++) {
			System.out.print(anArray[i] + " ");
		}
	}
}
