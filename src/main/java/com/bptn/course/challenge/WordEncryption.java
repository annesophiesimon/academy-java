package com.bptn.course.challenge;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		 /* 
        1. User enter a word 
        2. programm shift each leter by one position in alphabet
        3. Wrapping arround form 'z' to 'a'
        4. Non-alphabet should remain unchanged 
        
        Question?
        How do I know if a char is non-alphabetic? 
        if char >= a AND char <= z and same for maj
        How to shift one char to the next? 

        I can check int ascii = (int) char +1;
        next char --> char newChar = (char) ascii;

        So the logic would be 
        initialize encryptedWord variable 
        for a given word 
        Loop over the word 
        Check if special char 
            --> yes : append the char to the encryptedWord
            --> No: find the next letter and append to the encryptedWord
        */

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word you'd like to encrypt");
		String userInput = scanner.next();
		// initialize encrypted word 
		String wordEncrypted = "";
		// initialize ascii variable
		int ascii;
		
		for(int i= 0; i<userInput.length(); i++) {
			if( (userInput.charAt(i) >= 'a' && userInput.charAt(i)<= 'z') ||   (userInput.charAt(i) >= 'A' && userInput.charAt(i)<= 'Z')) {
				// find next letter for lower case 
				// need to handle z to a 
			if	(userInput.charAt(i) >= 'a' && userInput.charAt(i)<= 'z') {
				// next letter is ascii + 1 and we'll cast it to char 
				// if the letter is = to 'z' we'll just append 'a' 
				if(userInput.charAt(i) == 'z') {
					wordEncrypted+='a';
				} else {
					ascii = (int) userInput.charAt(i);
					wordEncrypted+= (char) (ascii+1);
				}				
			} else {
				// find next letter for upper case 
				// need to handle Z to A 
				// follow same logic used for lower case 
				if(userInput.charAt(i) == 'Z') {
					wordEncrypted+='A';
				} else {
					ascii = (int) userInput.charAt(i);
					wordEncrypted+= (char) (ascii+1);
				}	
			}
			} else {
				wordEncrypted+=userInput.charAt(i);
			}
		}
		
		System.out.println("Encrypted word: " + wordEncrypted);
		scanner.close();
	}

}
