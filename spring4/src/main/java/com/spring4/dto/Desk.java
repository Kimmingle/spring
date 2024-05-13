package com.spring4.dto;

public class Desk implements Goods {  //굿즈를 당기면 데스크는 따라올것
	
	private double size;

	@Override
	public String toString() {
		return "Desk [size=" + size + "]";
	}

	public Desk(double size) {
		super();
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Desk() {
		super();
	}
	
	

}
