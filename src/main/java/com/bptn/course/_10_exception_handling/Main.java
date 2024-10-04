package com.bptn.course._10_exception_handling;


public class Main {

	public static void main(String[] args) {
		
		// Call trycatch demo
		
		TryCatchDemo.tryCatchDemo();

		  // throw
		  // throw new IllegalArgumentException
		  double accountBalance = -500.00;
		  try{
			  ThrowThrowsThrowable.checkBalance(accountBalance);
		   
		  } catch (IllegalArgumentException e) {
		   System.out.println("Not enough money to withdraw!" + e);
		  }
		 
		  // call custom exception
		  
		  CustomException myDemo = new CustomException(600.00);
		  try {
			  myDemo.withdraw(500);
		  } catch(InsufficientBalanceException e) {
			  System.out.print(e.getMessage());
		  }

	} 

}

