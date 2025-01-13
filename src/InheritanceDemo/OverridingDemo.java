package InheritanceDemo;


class Bank
{
	double roi()
	{
		return 0;
	}
}

class Scotia extends Bank
{
	double roi()
	{
		return 10.5;
	}
}
class RBC extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		

		Scotia sc=new Scotia();
		System.out.println(sc.roi());
		
		RBC rb=new RBC();
		System.out.println(rb.roi());
	}

}
