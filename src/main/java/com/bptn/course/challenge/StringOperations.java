package com.bptn.course.challenge;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// Instantiate scanner 
        Scanner scanner = new Scanner(System.in);
        // declare variables 
        int choiceOperationInput;
        String firstString;
        String secondString;
        int continueProgramInput = 0;

        // Do while: We want to loop while the user decide to continue 
        //and we will at least ask execute once
        do {
            // Print the choice of the Calculator and direction for user
            System.out.println(" /…String Menu…/ \n");
            System.out.println(" Press 1 for Palindrome Check \n Press 2 to reverse a String \n Press 3 to Concatenate two Strings \n Press 4 for String Comparison \n Press 5 to Calculate the Length of String \n");
            System.out.println("Choose the string operation you want to do");
            choiceOperationInput = scanner.nextInt();

            // Check if input user is valid if not print message 
            if(!(choiceOperationInput <=1 || choiceOperationInput <=5)) {
                System.out.println("Invalid choice! Please make a valid choice.");

            } 
            // if input is valid we ask to choose a number
            else {
             System.out.println("Enter First string:");
             firstString = scanner.next();
  
            // check if operation require 1 or 2 String 
            // if else statement to execute the corresponding operation
            if(choiceOperationInput == 3 || choiceOperationInput == 4 ){
                     System.out.println("Enter Second string:");
                    secondString = scanner.next();
                    if(choiceOperationInput == 3) {
                    	// concatenate 2 strings 
                    	System.out.println(firstString+secondString);

                    } else {
                    		// string comparison
                    		if(firstString.equals(secondString)) {
                    			System.out.println("The entered strings are equal");
                    		} else {
                    			System.out.println("The entered strings are not equal");

                    		}
                    		                        
                    } 

            } else {    
                        // If else statement for operation that only require one string     
                        if(choiceOperationInput == 1) {
                           // check if string is Palindrome 
                           // reverse string 
                        		// initialize string variable 
                        		// loop over string from end to start and append char at index i to the reversed string variable
                           // compare the initial string to the reversed string 
                           // if they're equals string is palindrome
                        	String reversedString = "";
                        	for(int i=firstString.length()-1; i>=0; i--) {
                        		reversedString+= firstString.charAt(i);	
                        	}
                        	if(reversedString.equals(firstString)) {
                        		System.out.println(firstString + " is a palindrome");
                        		
                        	} else {
                        		System.out.println(firstString + " is not a palindrome");

                        	}

                        }  else if( choiceOperationInput == 2) {
                        		// reverse string
                          		String reversedString = "";
                          		for(int i=firstString.length()-1; i>=0; i--) {
                          			reversedString+= firstString.charAt(i);	
                          		}
                          		System.out.println("The reverse string of " + firstString + " is " + reversedString);

                            }  else if (choiceOperationInput == 5) {
                            	System.out.println("The length of the entered string is: "+ firstString.length());
                            	
                            }
                    }
      
            }
            // print message to ask if the user want to continue 
             System.out.println("To continue calculation Press 1, else press any other number to exit");
             continueProgramInput = scanner.nextInt();

        } while (continueProgramInput == 1); // while user input 1 we continue the loop
        
       //close scanner
       scanner.close(); 
    

	}

}
