package Operators;

public class Non_Static_variable {
	// whic var declare wiht out static 
//	non static var belongs to  object/instance so that's why class not providing the m/m for 
	// non static var so 
	// we have to  provid m/m for non static var 
	// using new key word and class name 
	int d = 96; 
	int e = 56;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(new Non_Static_variable().d); // new class_name().var_name
		System.out.println(new Non_Static_variable().e); 
		
		// or only one time object 
		// class_name ob_name = new class_name();
		
		Non_Static_variable obj = new Non_Static_variable();
		System.out.println(obj.d);
		System.out.println(obj.e);
		
		
		
		Demo_1 d = new Demo_1();
		System.out.println(d.a);
}}

class Demo_1 {
	int a = 25;
}


