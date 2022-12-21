package myCodes;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int desiredMonth;
		String month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number and I will tell you \nthe month coorespond with that number: ");
		desiredMonth = scanner.nextInt();
		
		switch(desiredMonth) {	// switch condition begins here
		case 1: 
			month = "January";
			break;						// if condition is true, then break out of this switch
		case 2: 							// if not continue to the following code
			month = "February";	// if no condition is true, it goes to default value
			break;
		case 3: 
			month = "March";
			break;
		case 4: 
			month = "April";
			break;
		case 5: 
			month = "May";
			break;
		case 6: 
			month = "June";
			break;
		case 7: 
			month = "July";
			break;
		case 8: 
			month = "August";
			break;
		case 9: 
			month = "Septemmber";
			break;
		case 10: 
			month = "October";
			break;
		case 11: 
			month = "November";
			break;
		case 12: 
			month = "December";
			break;
		default:
			month = "Invalid Entry!";
		}
		System.out.println("The month for given value is: " + month);

	}

}
