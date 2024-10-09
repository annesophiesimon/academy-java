package com.bptn.course._15_iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// create
		LinkedList<String> myList = new LinkedList<>();

		// insert

		myList.add("test1");
		myList.add("test2");
		myList.add("test3");
		myList.addFirst("test 0");
		myList.addLast("test end");
		myList.add(2, "test4");

		System.out.println(myList);

		// Read
		Iterator<String> iterator = myList.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}
		System.out.println("first element: " + myList.element());
		System.out.println("index 3 " + myList.get(3));

		// Delete
		// myList.remove();
		// myList.remove(2);
		// myList.removeFirstOccurrence("test1");

	}

}
