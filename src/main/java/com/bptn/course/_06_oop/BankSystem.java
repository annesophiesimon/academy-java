package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("987654", 1200.00);

		myAccount.displayAccountInfo();

		System.out.println("DEPOSIT 2514.43");

		myAccount.deposit(2514.43);

		myAccount.displayAccountInfo();

		System.out.println("\n");

		BankAccount newAccount = new BankAccount("128894", 899.00);

		newAccount.displayAccountInfo();

		SavingsAccount saving = new SavingsAccount("Saving123", 500, 1.00);
		saving.applyInterest();
		saving.displayAccountInfo();
		
		CheckingAccount myChecking = new CheckingAccount("Checking123", 5000, 300);
		myChecking.displayAccountInfo();
		myChecking.withdraw(5250);
		myChecking.displayAccountInfo();

	}

}
