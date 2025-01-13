package StaticPractice;

public class StaticDemo {
	
	static int a=10;
	int b =20;
	
	static void m1()
	{
		System.out.println("this is m1 static method");
	}
	
	void m2()
	{
		System.out.println("this is m2 non-static method");
}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	/*

	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		//System.out.println(b); //gives error bcoz non-static, accessed by object
		//m2();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();

		sd.m();
		*/
}
