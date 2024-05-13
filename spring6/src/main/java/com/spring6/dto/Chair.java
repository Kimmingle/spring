package com.spring6.dto;

public class Chair implements Goods {
	private int price;

	
	@Override
	public String toString() {
		return "Chair [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
