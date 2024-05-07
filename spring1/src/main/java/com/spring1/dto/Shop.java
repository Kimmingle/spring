package com.spring1.dto;

public class Shop {
	private String shopName;
	private Product product; //선언은 가능 (필드주입-Pencil을 가져오기 위함?)
	
	
	
	public Shop(String shopName, Product product) {
		super();
		this.shopName = shopName;
		this.product = product;
	}
	public Shop() {
		super();
	}
	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", product=" + product + "]";
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
