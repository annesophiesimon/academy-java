package com.bptn.course._06_oop_department;

class SalesDepartment extends Department {
	
	private double totalSalesAmount;

	public SalesDepartment(String name, int noOfEmployees, double totalSalesAmount) {
		super(name, noOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}

}
