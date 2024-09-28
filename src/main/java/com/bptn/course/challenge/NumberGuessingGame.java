package com.bptn.course.challenge;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
        /*
        1. Ask user to guess a number between 1 to 100
        2. Compare guess value to the target number 
            loop do while 
            do : 
            if guess < target --> print to low 
            if guess > --> print to high 
            
            while (guess != target)
        
        loops ends when user find the taget so we print congrats 
    */
		Scanner scanner = new Scanner(System.in);
		int targetNumber = 23;
		int guess;
		
		do {
			System.out.println("Please enter a number between 1 and 100.");
			guess = scanner.nextInt();
			if(guess < targetNumber) {
				System.out.println("Too low! Try again.");
			} else if (guess > targetNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number correctly!");
			}

			
		} while (guess != targetNumber);
		
		
		scanner.close();

	}

}
