package com.bptn.course.challenge;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
      //  System.out.print("Enter the number of elements: ");
        // Fetch the input from the user and store in the variable called n
        int n = scanner.nextInt();
        int first = 0; // First element of Fibonacci series
        int second = 1; // Second element of Fibonacci series
        // Initialize next number 
        int nextVal = 0;
        
   

        System.out.print("Fibonacci Series up to " + n + " elements: ");

        // Print the first n elements of Fibonacci serie
        
        for (int i = 0; i<n; i++) {
        	// Print first element 
        	if(i == 0) {
        		System.out.print(first + " ");
        	}
        	else if(i== 1) {
        		System.out.print(second + " ");
        	}else {
        		// calculate next value 
        		nextVal = first + second;
        		// Print the next value 
        		System.out.print(nextVal + " ");
        		// move element forward 
        		first = second;
        		second = nextVal;
        		
        	   }     

        }

        scanner.close();

	}

}
