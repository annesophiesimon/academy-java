package com.bptn.course._06_oop;

// Inheritance
class SavingsAccount extends BankAccount {

	private double InterestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		// constructor of the parent class
		super(accountNumber, initialBalance);
		this.InterestRate = interestRate;
	}

	public void applyInterest() {
		double interest = getBalance() * InterestRate / 100;
		deposit(interest);
	}

}
