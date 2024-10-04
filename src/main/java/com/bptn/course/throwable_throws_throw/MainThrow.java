package com.bptn.course.throwable_throws_throw;

import java.io.IOException;

public class MainThrow {

	public static void main(String[] args) {
		
		// Throw 	
		int age = 15;
		ThrowExample throwExample = new ThrowExample();
		//throwExample.checkAge(age);
		
		// Throw in a try catch block
		try {
			throwExample.checkAge(age);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		//Throws 
		ThrowsKeyword throwsExample = new ThrowsKeyword();
		try {
			throwsExample.readFile("../"); // This will throw IO Exception 
		} catch(IOException e) {
			System.out.println("Caught IOEXCEPTION:" + e.getMessage());
		}

	}

}
