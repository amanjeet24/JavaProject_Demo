package InterfaceEx;


interface Shape
{
	int length=10;		//final and static by default
	int height=20;
	
	
	void circle();	//abstract method
	
	default void square()
	{
		System.out.println("default method");
	}
	
	static void rectangle()
	{
		System.out.println("static method");
	}
}

public class InterfaceDemo implements Shape
{

	public void circle()
	{
		System.out.println("abstract method");
	}
	
	void triangle()
	{
		System.out.println("triangle");
	}
	
	int x=100, y=200;
	
	public static void main(String[] args) {
		
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle();
		idobj.square();
		
		Shape.rectangle();
	
		idobj.triangle();
		System.out.println(idobj.x+idobj.y);
		
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
		System.out.println(Shape.length * Shape.height);
	}

}
