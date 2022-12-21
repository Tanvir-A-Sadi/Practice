package inheritance;

public class Main {

	public static void main(String[] args) {
		System.out.println("A deer has the following characteristics: ");
		Deer deer1 = new Deer();
		deer1.lives();
		deer1.legs();
		deer1.run();
		
		System.out.println("\nA tiger has the following characteristics: ");		
		Tiger tiger1 = new Tiger();
		tiger1.lives();
		tiger1.legs();
		tiger1.food();
		
		System.out.println("\nA monkey has the following characteristics: ");
		Monkey monkey1 = new Monkey();
		monkey1.lives();
		monkey1.legs();
		monkey1.jump();
	}

}
