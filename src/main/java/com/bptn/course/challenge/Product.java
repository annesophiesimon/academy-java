package com.bptn.course.challenge;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Create your instance variables
	private int id;
	private String name;
	private double price;

	// Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Create a static method "countProducts"
	public static long countProducts(List<Product> products) {

		// Filter products based on the price and get the count of products

		long count = products.stream() // call stream method to be able to call filter
				.filter((product) -> product.price < 30000) // add contition for the filter
				.count(); // call count method

		return count;
	}

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productsList = new ArrayList<Product>();

		// Add products to the list
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		// Call "countProducts" method and hold return type in "count" variable
		// count is a static method so don't nned to create an object to call the method
		long count = Product.countProducts(productsList);

		// Print the count of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}
