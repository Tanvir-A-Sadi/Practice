package constructor;

public class ConstructorDefinition {
	String name;
	int idNum;
	int age;
	boolean usCitizen;
	// default constructor: this should run automatically when an object is created.
	public ConstructorDefinition()
	{
		System.out.println("I am inside default constructor!");
	}
	public ConstructorDefinition(String n, int i, int a, boolean u)
	{
		this.name = n;
		this.idNum = i;
		this.age = a;
		this.usCitizen = u;
		System.out.println("Name = " + name  +
									 "\nIdNum = " + idNum +
									 "\nAge " + age +
									 "\nUsCitized = " + usCitizen);

}
}
