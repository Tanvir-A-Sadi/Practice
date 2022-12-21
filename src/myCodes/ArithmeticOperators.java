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
		
	Arithmetic operators are used to perform common mathematical operations.
	+		Addition			Adds together two values						x + y
	- 		Subtraction	subtract one value from another				x - y
	*		Multiplication	Multiplies two values								x * y
	/		Division			Divides one value by another					x / y
	%		Modulus			Returns the division remainder				x % y
	++ 	Increment		Increases value of a variable by 1			++x
	--		Decrement		Decreases	value of a variable by 1			--x
	
 */


public class ArithmeticOperators {

	public static void main(String[] args) {
		int i, j, k, l;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first value: ");
		i = scan.nextInt();
		System.out.println("Please enter second value: ");
		j = scan.nextInt();
		k = i + j;
		l = i - j;
		System.out.println("The total of the values is: " + k);
		System.out.println("The difference of the values is: " + l);

	}

}
