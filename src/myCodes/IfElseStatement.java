package myCodes;

import java.util.Scanner;

/*
 * 
You can use few conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use "if" to specify a block of code to be executed, if a specified condition is true
Use "else" to specify a block of code to be executed, if the same condition is false
Use "else if" to specify a new condition to test, if the first condition is false
Use "switch" to specify many alternative blocks of code to be executed
 * 
 */
public class IfElseStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		int score = scan.nextInt();

		if (score > 90) {
			System.out.println("Nice work!");
		} else {
			System.out.println("Good try! Keep on working hard.");
		}

	}

}
