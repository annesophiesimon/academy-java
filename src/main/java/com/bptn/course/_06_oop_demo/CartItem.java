package com.bptn.course._06_oop_demo;

class CartItem {
	private Product product;
	private int cartQuantity;

	public CartItem(Product product, int quantity) {
		if(quantity> product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock");
			
		}
		this.product = product;
		this.cartQuantity = quantity;
	}
	
	// Getters / accessors 
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getCartQuantity () {
		return this.cartQuantity;
	}
	
	public double getTotalPrice() {
		return product.getProductPrice() * this.cartQuantity;
	}
	

}
