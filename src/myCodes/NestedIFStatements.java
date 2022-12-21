package myCodes;

import java.util.Scanner;

public class NestedIFStatements {

	public static void main(String[] args) {
		int score;
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your test score: ");
		score = scanner.nextInt();
		
		if (score > 90) {
			if(score > 95)
				grade = "A+";
			else {
				grade = "A";
			}
		}
			
		else if (score > 80) {
			if(score > 85)
				grade = "B+";
			else {
				grade = "B";
			}
		}
			
		else if (score > 70) {
			if(score > 75)
				grade = "C+";
			else {
				grade = "C";
			}
		}
		else if (score > 600) {
			if(score > 65)
				grade = "D+";
			else {
				grade = "D";
			}
		}
		else 
			grade = "F";
		
		System.out.println("Your grade is: " + grade);


	}

}
