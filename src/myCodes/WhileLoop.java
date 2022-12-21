package myCodes;

import java.util.Scanner;

//while loop runs until the condition is proved to be false;
 
public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Please enter few values and I willl tell you the total of values entered:");	
		i = scanner.nextInt();
		while (i >= 0) {
			j += i;
			System.out.println("Enter value: ");
			i = scanner.nextInt();			
		}
		System.out.println("The total is now: " + j);
	}

}
