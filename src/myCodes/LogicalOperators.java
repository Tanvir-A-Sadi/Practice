package myCodes;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/*
 * 
&& 	"Logical and"	Returns true if both statements are true	x < 5 &&  x < 10	
&		"Logical and" evaluates the both operand regardless if the first condition is true or not
|| 		"Logical or"	Returns true if one of the statements is true	x < 5 || x < 4
|		"Logical or" 	evaluates the both operand regardless if the first condition is true or not	
!		"Logical not"	Reverse the result, returns false if the result is true
 * 
 */
public class LogicalOperators {

	public static void main(String[] args) {
		int i, j, k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value: ");
		i = scan.nextInt();
		System.out.println("Enter second value: ");
		j = scan.nextInt();
		
		if (i>0 && j >0) {
			k = i + j;
			System.out.println("The total is: " + k);
		} else if (i < 0 || j < 0){
			System.out.println("Invalid Entry");
		}
		

	}

}
