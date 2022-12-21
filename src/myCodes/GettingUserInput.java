package myCodes;
import java.util.Scanner;

public class GettingUserInput {
/*
 * what is input? -- input is anything that user enters using keyboard for the program to use.
 * in order to get user input from the keyboard you must import java.util.Scanner
 * you must declare the scanner object first. Then using the object you can get user input
 * assigning the input to any appropriate variable. 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("You entered: " + name);
		}

}
