package com.bptn.course._15_iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
	
	public static void main(String[] args) {
		
		// Create a new arrayList Mybooks
		ArrayList<String> myBooks = new ArrayList<>();
		
		// Add 3 favorite books to the list
		myBooks.add("Americanah".toLowerCase());
		myBooks.add("Mille petit rien".toLowerCase());
		myBooks.add("Home coming".toLowerCase());
		
		
		//Display all books 
		Iterator<String> iterator = myBooks.iterator();
				
		while(iterator.hasNext()) {
			String bookName = iterator.next();
			System.out.println(bookName);
		}
	}
	


}
