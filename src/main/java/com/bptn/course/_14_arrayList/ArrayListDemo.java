package com.bptn.course._14_arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	
	
	public static void  main(String[] args) {
		
		ArrayList myList = new ArrayList(); // this will work and we can add element that has different type
		myList.add("Hello");
		myList.add(17);
		// generics 
		List<String> arrayList = new ArrayList(); // this work too bad practise 
		
		// C -> Create 
		ArrayList<String> groceries = new ArrayList<>();  // they can only add String / restrict specific type 
		// when we make a new arrayList java will reserve storage for 10 items 
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Eggs");
		
		//R -> Read 
		System.out.println("Groecery List" + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());
		
		// U -> Update 
		groceries.set(1, "Coffee");
		
		// D -> Delete
		
		groceries.remove(2);
		System.out.println("Grocery List:" + groceries);


		

		
	}
}
