package com.spring1.dto;

public class Pencil implements Product {
	private String proName;
	private int price;
	
	
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pencil(String proName, int price) {
		super();
		this.proName = proName;
		this.price = price;
	}
	public Pencil() {
		super();
	}
	@Override
	public String toString() {
		return "Pencil [proName=" + proName + ", price=" + price + "]";
	}
	
}
