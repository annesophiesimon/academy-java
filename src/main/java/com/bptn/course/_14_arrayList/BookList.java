package com.bptn.course._14_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// Create a new arrayList Mybooks
		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to the list
		myBooks.add("Americanah".toLowerCase());
		myBooks.add("Mille petit rien".toLowerCase());
		myBooks.add("Home coming".toLowerCase());

		int counter = 1;

		// display all books
		System.out.println(myBooks);
		for (String book : myBooks) {
			System.out.println("Book " + counter + ": " + book);
			counter++;
		}

		// display fitstBook
		System.out.println(myBooks.getFirst());
		System.out.println(myBooks.get(0));

		// delete book
		myBooks.remove(1);

		System.out.println(myBooks);

		// search for a book

		if (myBooks.contains("Home coming".toLowerCase())) { // we can use ignoreCase()
			System.out.println("Book Found");
		} else {
			System.out.println("Book not found");
		}

		// size
		System.out.println(myBooks.get(myBooks.size() - 1));

	}

}
