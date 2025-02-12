package MethodConstructor;

public class Overloading {
	
	int a=10, b=20;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
//	void sum(int p, int q)    //show error duplicate method
//	{
//		System.out.println(p+q);
//	}

	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)
	{
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {

		Overloading obj=new Overloading();
		obj.sum();
		obj.sum(3, 4);
		obj.sum(10.2, 3);
		obj.sum(3, 10.5);
		obj.sum(1, 20, 30);
		
	}

}
