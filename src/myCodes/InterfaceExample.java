package myCodes;
/*An interface is a completely "abstract class" that is used 
to group related methods with empty bodies:
To access the interface methods, the interface must be "implemented" 
(kind of like inherited) by another class with 
the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class:
*/
interface WaterbottleInterface {
	String color = "Blue";

	void fillup();

	void pourout();
}
// The interface needs to be implemented using following method
public class InterfaceExample implements WaterbottleInterface {

	public static void main(String[] args) {
		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample();
				ex.fillup();
				ex.pourout();
	}

	@Override
	public void fillup() {
		System.out.println("Bottle is now filled up!");
		
	}

	@Override
	public void pourout() {
		System.out.println("Bottle is now empty!");
		
	}
}
