package InheritanceDemo;

class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		

		Test t=new Test();
		
		// t.x=200;  //error becoz of final keyword
		
		System.out.println(t.x);
	}

}
