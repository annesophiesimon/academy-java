package com.bptn.course._06_oop_department;

 class Department {
	private String name;
	private int noOfEmployees;

	public Department(String name, int noOfEmployees) {
		this.name = name;
		this.noOfEmployees = noOfEmployees;
	}

	public void displayInfo() {
		System.out.println("Name of department: " + name);
		System.out.println("Number of employees: " + noOfEmployees);
	}

}
