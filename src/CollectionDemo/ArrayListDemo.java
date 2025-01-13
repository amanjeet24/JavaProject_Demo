package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		ArrayList mylist=new ArrayList();
		
		//List mylist=new ArrayList();

		//ArrayList<Integer> mylist=new ArrayList<Integer>();
		//ArrayList <Employee> mylist=new ArrayList<Employee>();		//Employee is a class
		
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(null);
		mylist.add(100);
		
		System.out.println("Size of arraylist:" +mylist.size());
		System.out.println(mylist);
		
		mylist.remove(5);
		System.out.println("After removing element from arraylist:" +mylist);
		
		mylist.add(2, "java");
		System.out.println("After inserting element in arraylist:" +mylist);
		
		mylist.set(2, "Python");
		System.out.println("After replacing element in arraylist:" +mylist);
		
		System.out.println(mylist.get(3));
		
		/*
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		/*
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//using iterator
		
		//Iterator <String> it=mylist.iterator(); for homogeneous data//optional
		
		Iterator <Object> it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println(mylist.isEmpty());
		
		ArrayList mylist2=new ArrayList();
		
		mylist2.add("a");
		mylist2.add("b");
		mylist2.add(true);
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println(mylist.isEmpty());
	}

}
