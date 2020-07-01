package initialization;

public class Person {
	
	//final variables have to be initialized in one of the three ways
	//1. simultaneously with declaration
	//2. in the constructor
	//3. in the instance block initialization
	
	final int age = 28; //initialization with declaration
	final String name;
	final String direction;
	//final String direction2; // does not compile
	{direction="Dresden Germany";} // initialization in the instance block
	
	
	public Person(){
		name="Raul Alejandro"; // initialization in the constructor
	}
	
	
	public static void main(String[] args) {
		Person  person = new Person();
		System.out.println("The Person Object the atributte age with value= " + person.age);
		System.out.println("The Person Object the atributte name with value= " + person.name);
		System.out.println("The Person Object the atributte direction with value= " + person.direction);		
	}
}
