package MethodConstructor;

public class StudentMain {

	public static void main(String[] args) {


		//Student stud=new Student();
		
		//reference variable
		/*
		stud.sid=101;
		stud.sname="John";
		stud.grad='A';
		
		*/
		
		//using method
	//	stud.setStudentData(102, "David", 'A');
		//stud.printStudentData();
		
		//using constructor
		
		Student stu=new Student(101,"Jack",'A');
		stu.printStudentData();

	}

}
