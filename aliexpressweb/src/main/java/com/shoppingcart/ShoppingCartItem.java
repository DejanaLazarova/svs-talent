package com.shoppingcart;

public class ShoppingCartItem {

	private String name;
	private int quantity;
	public ShoppingCartItem(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ShoppingCart [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	
}
