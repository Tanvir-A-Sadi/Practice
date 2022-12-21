package myCodes;

import java.util.Scanner;

/*
 * 	Operators are used to perform operations on variables and values.
 * Java divides the operators into the following groups:

		-	Arithmetic operators
		-	Assignment operators
		-	Comparison operators
		-	Logical operators
		-	Bitwise operators
	assignments operators assigns value to a variable located on the left of the operator base on the 
	operation being performed on the right.	
		= 			x = 5 		sets x equal to 5
		+=		x += 5		adds 5 to existing value of x
		-=			x -= 5		subtracts 5 from existing value of x
		*=		x *=5		Multiplies value of x by 5
		/=			x /=5		divides existing value of x by 5
		%= 		x %= 5		divides existing value of x and assigns the remainder to x
		
	
 * 
 */
public class AssignmentOperators {

	public static void main(String[] args) {
		int x = 5;		// assigns the value of 5 to x
		int y = 2;
		y += x;
		System.out.println("Value of y now: " + y);
	}

}
