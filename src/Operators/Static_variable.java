package Operators;

public class Static_variable {

	//static var we are declare out side a method 
		// with help of the static key word 
		// this satic var belongs to class so that why we can call directlly 
		// static var we can call as class var becouse it belongs to class it self 
		static int b = 56;
		
		public static void main(String[] args) {
			
			 int a = 25; //local var
			
			{
				int b = 50; //local var
				System.out.println(a);
				System.out.println(b); // 50
			}
			System.out.println(b);  // 56
			System.out.println( Demo.c);//58
			// when we have static var  othere class  we can call using the . op

		}

	}

	class Demo{
		static int c = 58;
	
	
		

	}

