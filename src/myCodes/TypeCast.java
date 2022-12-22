package myCodes;

public class TypeCast {

	public static void main(String[] args) {
				int id = 25;
				double idNum = (double) id;
				byte idNumber = (byte) idNum;
				System.out.println(id);					// Original value remains same.
				System.out.println(idNum);			//A copy of the value takes the form of the new data type
				System.out.println(idNumber);
	}

}
