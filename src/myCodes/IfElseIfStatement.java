package myCodes;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter you test score: ");
		score = scanner.nextInt();
		
		if (score > 90)
			grade = 'A';
		else if (score > 80)
			grade = 'B';
		else if (score >70)
			grade = 'C';
		else if (score > 60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("Your grade is: " + grade);

	}

}
