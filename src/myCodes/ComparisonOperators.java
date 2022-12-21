package myCodes;

import java.util.Scanner;

/*
 * Operators are used to perform operations on variables and values.
 * Java divides the operators into the following groups:

		-	Arithmetic operators
		-	Assignment operators
		-	Comparison operators
		-	Logical operators
		-	Bitwise operators
 * Comparison operators are used to compare two values. This is important in programming, because it helps us to find answers and make decisions.
 * The return value of a comparison is either true or false. These values are known as Boolean values
 *  Compariosn operators are:
 *     ==		"Equal to"       							x == y;
 *     != 		"Not Equal to" 							x != y;
 *     >			"Greater than" 							x > y;
 *     <			"Less than"								x < y;
 *     >=		"Greater than or equal to"			x >= y;
 *     <= 		"Less than or equal to" 				x <= y; 	
 */

public class ComparisonOperators {

	public static void main(String[] args) {
		int i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first value: ");
		i = scan.nextInt();
		System.out.println("Please enter second value: ");
		j = scan.nextInt();
		
		if (i == j) {
			System.out.println("Value 1 is equal to value 2");
		} else if (i > j) {
			System.out.println("value 1 is greater than value 2");
		} else {
			System.out.println("Undetermined!");
		}

	}

}
