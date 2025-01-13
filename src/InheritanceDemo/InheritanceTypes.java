package InheritanceDemo;


class A
{
	int a ;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}



public class InheritanceTypes {
	
	public static void main(String[] args) {
		
		/*
		B objb = new B();
		System.out.println(objb.a);
		System.out.println(objb.b);
		
		objb.display();
		objb.show();
		*/
		
		C cobj = new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.show();
		cobj.display();
		cobj.print();
	
	}

}
