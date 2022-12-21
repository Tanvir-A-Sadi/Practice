package myCodes;

public class Exponent {

	public static void main(String[] args) {
		System.out.println(Math.pow(5, 2)); // by default system stores the value as a double
		System.out.println((int)Math.pow(5, 2)); // caste the double value as an integer.
		int i = (int)Math.pow(5, 3);
		System.out.println("The value of i is now: " + i);
	}

}
