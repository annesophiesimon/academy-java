package com.bptn.course._06_oop_demo;

class Customer {
	
	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	
	public Customer(String customerId, String customerName, String customerEmail) {
		this.customerID = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
		
	}
	
	// getter for customerName
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String customerID() {
		return this.customerID;
	}
	
	public String customerEmail() {
		return this.customerEmail;
	}
	
	public ShoppingCart getCart() {
		return this.cart;
	}
	
	public void checkout() {
		System.out.println("Processing order for "+ customerName + "...");
	}

}



