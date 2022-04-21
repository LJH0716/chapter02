package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드 - gs
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("*상품이름: " + name);;
		System.out.println("*가격: " + price);
		System.out.println("");
	}

	
}
