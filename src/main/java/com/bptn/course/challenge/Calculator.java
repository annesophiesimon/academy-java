package com.bptn.course.challenge;

import java.util.Scanner;

public class Calculator {
	

	 public static void main(String[] args) {
	        // Instantiate scanner 
	        Scanner scanner = new Scanner(System.in);
	        // declare variables 
	        double resultOperation;
	        int choiceOperationInput;
	        double firstNumber;
	        double secondNumber;
	        int continueProgramInput = 0;

	        // Do while: We want to loop while the user decide to continue 
	        //and we will at least ask execute once
	        do {
	            // Print the choice of the Calculator and direction for user
	            System.out.println(" /…Calculator Menu…/ \n");
	            System.out.println(" Press 1 for addition \n Press 2 for subtraction \n Press 3 for multiplication \n Press 4 for division \n Press 5 to square a number \n Press 6 to find a square root \n Press 7 to find the reciprocal");
	            System.out.println("Choose the operation you want to do");
	            choiceOperationInput = scanner.nextInt();

	            // Check if input user is valid if not print message 
	            if(!(choiceOperationInput <=1 || choiceOperationInput <=7)) {
	                System.out.println("Invalid choice! Please make a valid choice.");

	            } 
	            // if input is valid we ask to choose a number
	            else {
	             System.out.println("Enter the first number");
	             firstNumber = scanner.nextDouble();
	  
	            // check if operation require 1 or 2 number 
	            // if else statement to execute the coresponding operation
	            if(choiceOperationInput >=1 && choiceOperationInput <= 4 ){
	                     System.out.println("Enter the second number");
	                    secondNumber = scanner.nextDouble();
	                    if(choiceOperationInput == 1) {
	                        resultOperation = firstNumber + secondNumber;
	                        System.out.println("The addition of the numbers "+ firstNumber + " and "+ secondNumber + " is = "+ resultOperation);

	                    } else if (choiceOperationInput == 2) {
	                        resultOperation = firstNumber - secondNumber;
	                        System.out.println("The substraction of the numbers "+ firstNumber + " and "+ secondNumber + " is = "+ resultOperation);

	                     } else if (choiceOperationInput == 3) {
	                            resultOperation = firstNumber * secondNumber;
	                            System.out.println("The product of the numbers "+ firstNumber + " and "+ secondNumber + " is = "+ resultOperation);

	                        } else if (choiceOperationInput == 4) {
	                            // check if second number is 0 
	                             if(secondNumber == 0 ) {
	                                System.out.println("Error: Division by 0 is not allowed");
	                             } else {

	                                 resultOperation = firstNumber / secondNumber;
	                                System.out.println("Dividing "+ firstNumber + " by "+ secondNumber + " the quotient is "+ resultOperation + " The remainder is " + firstNumber%secondNumber);
	                             }
	                            
	                        } 

	            } else {    
	                        // If else statement for operation that only require one number     
	                        if(choiceOperationInput == 5) {
	                            resultOperation = firstNumber * firstNumber;
	                            System.out.println("The Square of the number " + firstNumber + " is = " + resultOperation);

	                        }  else if( choiceOperationInput == 6) {
	                                resultOperation = Math.sqrt(firstNumber);
	                                System.out.println("The square root of "+ firstNumber +" is = "+ resultOperation);

	                            }  else {
	                                    // handle division by 0
	                                     if(firstNumber == 0 ) {
	                                System.out.println("Error: Division by 0 is not allowed");
	                             } else {
	                                 resultOperation = 1 / firstNumber;
	                                    System.out.println("The Reciprocal of the number " + firstNumber + " is = " + resultOperation);

	                             }
	                                   
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
	    /*  
	        Summary:
	        Having to think of different case was challenging: 
	        When i did the flow chart, I assumed all operations would need the 2 numbers input
	        So my lesson learned, when I do the flow chart or pseudo code is to think more of
	        what the operation would involve. So, I can think of the different cases ahead of time.

	        Also, what have been challenging is knowing what error scenario I should cover
	        because when test failed, I am unsure of what could be the problem.


	    */

	}

