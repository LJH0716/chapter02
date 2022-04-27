package com.javaex.ex15;

public class Rectangle extends Shape{

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super();
		//System.out.println("Rectangle()");
	}


	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		//System.out.println("Rectangle(4)");
	}


	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	// 메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + super.fillColor + ", lineColor="
				+ super.lineColor + "]";
	}


	
	public void draw() {
		System.out.println("[면색:" + super.fillColor + ", 선색:" + super.lineColor + 
		                        ", 가로:" + this.width + ", 세로:" + this.height + 
		                        "] 사각형을 그렸습니다. " );
	}


}
