package com.spring4.vo;

import com.spring4.dto.Store;

public class InjectionJava1 {
	
	private Store store;

	public InjectionJava1(Store store) {
		super();
		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	
	public void setStore(Store store) {
		this.store = store;
	}
	
}
