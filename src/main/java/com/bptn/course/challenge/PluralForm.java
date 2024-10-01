package com.bptn.course.challenge;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		int amt;
		String word;
		
		System.out.println("enter amount");
		amt = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter singular noun");
		word = scanner.nextLine();

		
	    // check if amt == 1 print amt word 
	    // 
		// check the end of the words to see if it match the rules we have 
	    // if word end by -fe we replace the end by ves 
	    // else if sh or ch replace by es 
	    // else if -us replace by i 
	    // else if end by y 
	        // if -ay or oy or ey or uy add s
	        // else replace y by ies 

	    // else add s at the end 
		
		// issue encountered using == to compare was giving false working had to use equals function 
		
		
		if(amt == 1)  {
			System.out.println(amt + " " + word);
		} else {

			if ( word.endsWith("fe")) {
				System.out.println(amt + " "+ word.substring(0, word.length()-2)+"ves");
			} else if (word.endsWith("sh") || word.endsWith("ch")) {
				System.out.println(amt + " "+ word+"es");

			} else if(word.endsWith("us")) {
				System.out.println(amt + " "+ word.substring(0, word.length()-2)+"i");

			} else if (word.endsWith("y")) {
				if(word.endsWith("ay") || word.endsWith("oy")|| word.endsWith("ey") || word.endsWith("uy")) {
					System.out.println(amt + " "+ word+"s");
				} else {
					System.out.println(amt + " "+ word.substring(0, word.length()-1)+"ies");

				}
			} else {
				System.out.println(amt + " " + word +"s");

			}
			
		}
		
		scanner.close();
		
		
	}

}
