package com.bptn.course.demo_loop_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopArrayListDemp {

	public static void main(String[] args) {

		// for loop index
		// Find the max grade in the array

		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(79);
		grades.add(56);
		grades.add(98);
		grades.add(70);

		int maxGradeIndex = 0;

		for (int i = 1; i < grades.size() - 1; i++) {
			if (grades.get(i) > grades.get(maxGradeIndex)) {
				maxGradeIndex = i;
			}
		}

		System.out.println("Max grade is: " + grades.get(maxGradeIndex));

		// for each loop
		// Print each grade

		for (int grade : grades) {
			System.out.println(grade);
		}

		// Removing element in a for loop
		// example loop to remove odd number in a for loop

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		numbers.add(12);

		// Attempt to remove even numbers in a for loop
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i); // Remove even numbers
			}
		}

		// expect []
		// loop is skipping numbers
		System.out.println("List after removal: " + numbers);

		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Integer number = iterator.next();
			if (number % 2 == 0) {
				iterator.remove();
			}
		}

		System.out.println(numbers);

		// No loop needed contains method
		// example find target

		ArrayList<String> names = new ArrayList<>();
		names.add("Nimi");
		names.add("Emmanuel");
		names.add("Sophie");

		String target = "Sophie";

		System.out.println(names.contains(target));

		target = "Alice";

		System.out.println(names.contains(target));

	}

}
