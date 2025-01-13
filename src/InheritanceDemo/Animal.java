package InheritanceDemo;

public class Animal {
	
	String colour="white";
	
	void eat()
	{
		System.out.println("eating.......");
	}

}

class Dog extends Animal
{
	String colour="black";
	
	void displayColour()
	{
		System.out.println(super.colour);
	}
	
	void eat()
	{
		//System.out.println("eating bread.......");
		super.eat();
	}

}
