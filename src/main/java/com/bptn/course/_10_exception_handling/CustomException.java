package com.bptn.course._10_exception_handling;

public class CustomException {
	
	private double accountBalance;
	
	public CustomException(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amountToWithdraw) throws InsufficientBalanceException {
		if(accountBalance >= amountToWithdraw) {
			this.accountBalance -= amountToWithdraw;
			 System.out.println("Withdrawal Successful!");
		} else {
			throw new InsufficientBalanceException("Insufficient funds!");
		}
	}
	

}
