package myCodes;

import java.util.Scanner;

/*
 * There are 8 premitive datatypes; They are as follows:
 * - byte - 8 bit of data 
 * - Short - 16 bit of data
 * - int (integer) - 32 bit of data
 * - long - 64 bit of data
 * - float - holds around 6 to 7 decimal points
 * - double - holds larger decimal points
 * - char - characters
 * - boolean - true or false
 */

public class Datatypes 
{

	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter age: ");
			Byte age = scan.nextByte();
			System.out.println("Enter ID Number: ");
			Short idNum = scan.nextShort();
			System.out.println("Enter balance: ");
			int balance = scan.nextInt();
			System.out.println("Enter account number: ");
			Long accountNum = scan.nextLong();
			System.out.println("Enter GPA: ");
			Float gpa = scan.nextFloat();
			System.out.println("Enter value for pie: ");
			Double pie = scan.nextDouble();
			System.out.println("Enter Middle Initial: ");
			char middleInitial = scan.next().charAt(0);
			System.out.println("US Citizen? : ");
			boolean status = scan.nextBoolean();
			
			System.out.println(" You entered: ");
			System.out.println(" age: " + age);
			System.out.println(" IDNum: " + idNum);
			System.out.println(" Balance: " + balance);
			System.out.println(" Account Number: " + accountNum);
			System.out.println(" GPA: " + gpa);
			System.out.println(" Pie: " + pie);
			System.out.println(" Middle Initial: " + middleInitial);
			System.out.println(" Status: " + status);

	}

}
