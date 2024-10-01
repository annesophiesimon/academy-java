package com.bptn.course._06_oop;

// public abstraction 
class AccountDetails { // default modifier is private, we can manually write public, final, ^rotected
	// encapsulation
	private String accountHolderName;
	private double balance;

	public void deposit() {

	}

	public void withdraw(double amount) {

	}

	// Polymorphism
	public void withdraw(double amount, int typeOfNote) {

	}

	public void showAccountDetails() {

	}

}

// inherit use the word extends and the className 

// best practise use a different file for each class 
// we can use them within same package without import 
// We need one public class in a package and all others should be set to private 