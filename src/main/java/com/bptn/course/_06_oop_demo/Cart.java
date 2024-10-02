package com.bptn.course._06_oop_demo;

class ShoppingCart { 

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// addProductToCart 
	
	public void addProdcutToCart(Product product, int quantity) {
		if(itemCount<=4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStock(quantity);
			
		} else {
			throw new IllegalArgumentException("Cart full!");
		}
	}
	
	// showProductInCart
public CartItem[] showProductInCart() {
	CartItem[] currentItems = new CartItem[itemCount];
	for(int i=0; i<this.itemCount; i++) {
		currentItems[i] = items[i];
	}	
	return currentItems;
}

}
