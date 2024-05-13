package com.spring5.dto;

//import lombok.ToString;
//
//@ToString

public class Store {
	private int storeNum;
	private String storeName;
	
	
	public Store(int storeNum, String storeName) {
		super();
		this.storeNum = storeNum;
		this.storeName = storeName;
	}
	public Store() {}
	
	public int getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	@Override
	public String toString() {
		return "Store [storeNum=" + storeNum + ", storeName=" + storeName + "]";
	}
	
}
