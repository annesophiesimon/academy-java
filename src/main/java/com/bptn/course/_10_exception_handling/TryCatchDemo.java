package com.bptn.course._10_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {
	
	public static void tryCatchDemo() {
				String str = "123";
		int num = 0;
		
		// outer try for string to integer conversion
		try {
			int input = Integer.parseInt(str); // conversion of string to integer
			// inner try for division by zero
			try {
				int result = input / num;
			} catch (ArithmeticException e) {
				System.out.println("Error: Cannot divide by zero");
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input!");
		}
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many element do you want in the array ");
			int arraySize = scanner.nextInt();
			int[] numbers = new int[arraySize];
			System.out.println("Enter  " + arraySize + "elements for the array");
			
			for (int i = 0; i < arraySize; i++) {
				numbers[i] = scanner.nextInt();
			}
			
			System.out.println("Enter 2 number for division ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int result = num1 / num2;
			System.out.println("Element at index 10 is:" + numbers[10]);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array only contains");
		} catch (InputMismatchException e) {
			System.out.println("Error: please enter a valid number");
		} finally {
			System.out.println("Program ended");
		}
	}

}
