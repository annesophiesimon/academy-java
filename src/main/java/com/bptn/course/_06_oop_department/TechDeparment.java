package com.bptn.course._06_oop_department;

class TechDeparment extends Department {
	
	private double totalPurchaseAmount;

	public TechDeparment(String name, int noOfEmployees, double totalPurchaseAmount) {
		super(name, noOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
