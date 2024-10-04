package com.bptn.course._10_exception_handling;

public class ThrowThrowsThrowable {
	
	//throw 
	// throw new IllegalArgumentException
	 public static void checkBalance(double balance) throws IllegalArgumentException {
		  if (balance < 0) {
		   throw new IllegalArgumentException("Account balace cannot be negative");
		  } else {
		   System.out.println("Withdrawal successful!");
		  }
		 }
	 

}
