package myCodes;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int score, numStudent = 0;
		char anotherStudent;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Enter student's score: ");
			score = scanner.nextInt();
			if(score > 0 && score <=100) {
				numStudent++;
			}
			else {
				System.out.println("Invalid Entry!");
			}
			System.out.println("Do you want to run this program again? \nEnter"
					+ " Y for Yes: ");
			anotherStudent = scanner.next().charAt(0);
			
		} while(anotherStudent == 'Y' || anotherStudent == 'y');
		System.out.println("You have " + numStudent + " students in total!");
	}

}
