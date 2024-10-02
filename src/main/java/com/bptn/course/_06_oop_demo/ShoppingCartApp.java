package com.bptn.course._06_oop_demo;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Product p1 = new Product("P001", "Laptop", 1500, 10);
		Product p2 = new Product("P002", "Smartphone", 500, 20);
		Customer customer = new Customer("c001", "testCustomer", "test@email.fr");
		
		customer.getCart().addProdcutToCart(p2, 4);	
		customer.getCart().addProdcutToCart(p1, 7);
		
		customer.checkout();
		
		Order order = new Order(customer);
		
		order.placeOrder();

	


	}

}
