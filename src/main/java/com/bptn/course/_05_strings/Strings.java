package com.bptn.course._05_strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
			
		
		String userName = "testuser";
		System.out.println(userName.length()); // not a property but a method compared to array 
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(4));
		System.out.println(userName.substring(2, 4));
		System.out.println(userName.equals("testuser"));
		System.out.println(userName.trim());
		System.out.println(userName.indexOf('e')); // first occurrence of 'e'
		
		// Read user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		// Declare storage variables 
		String inputUser = scanner.nextLine();
		int vowelCount = 0;      // can be short too if we know the input size 
		int consonantCount = 0;
		
		// convert everything to lower case
		String lowerCaseInput = inputUser.toLowerCase();
		// loop through each character in the string
		for(int i=0; i<lowerCaseInput.length(); i++) {
			char ch = lowerCaseInput.charAt(i);
			// check if its vowel or consonant
			if(ch=='a' || ch=='e' || ch == 'i' || ch=='o'|| ch== 'u') {
				// update the count 
				vowelCount++;
			} else if(ch>='a' && ch<='z') {
				consonantCount++;
			}
		}

		
		// print the count 
		System.out.println("Number of voweel"+ vowelCount );
		System.out.println("Number of voweel"+ consonantCount );
		
		
		scanner.close();
		
		
	}
}
