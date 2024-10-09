package com.bptn.course._18_PuttingEverythingTogether;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {

		// Create a new linkedlist called task
		LinkedList<String> tasks = new LinkedList<>();

		// create a new Hashset for storing completed task

		HashSet<String> completesTasks = new HashSet<>();

		/*
		 * Type safety: The method add(Object) belongs to the raw type ArrayList.
		 * References to generic type ArrayList<E> should be parameterized
		 */

		ArrayList numbers = new ArrayList<>();

		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		System.out.println("numbers: " + numbers);

		// create scanner

		Scanner scanner = new Scanner(System.in);

		// store user input

		int choice;

		do {

			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter your task");
				String userTask = scanner.nextLine();
				tasks.add(userTask);
				System.out.println("Task added");
				break;
			case 2:
				// check if theres any tasks in the linkedlist
				if (tasks.isEmpty()) {
					System.out.println("To task found!");

				} else {
					System.out.println("Pick a task to mark as complete");
					Iterator<String> iterator = tasks.iterator();
					int count = 1;
					while (iterator.hasNext()) {
						System.out.print(count + "-" + iterator.next());
					}
					int taskNumber = scanner.nextInt();

					completesTasks.add(tasks.get(taskNumber - 1));
					tasks.remove(taskNumber - 1);
					System.out.println("Task mark as completed ");
					break;

				}
			case 3:
				System.out.println("pending tasks");
				for (String task : tasks) {
					System.out.println(task);
				}
				break;
			case 4:
				System.out.println("completed Task ");
				if (completesTasks.isEmpty()) {
					System.out.println("Cno completed tasks!");
				} else {
					for (String task : completesTasks) {
						System.out.println(task);
					}
				}
				break;

			case 5:
				System.out.println("Thank you");
				break;

			}

		} while (choice != 5);
		scanner.close();

	}

}
