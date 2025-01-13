package AccessModifier;

public class AdderMain {

	public static void main(String[] args) {
	
		
		Adder addobj=new Adder();
		
		addobj.sum();
		
		addobj.sum(100, 200);
		
		addobj.sum(10.5, 20);
		
		addobj.sum(10,15.6);
		
		addobj.sum(20, 30, 40);
	}

}

