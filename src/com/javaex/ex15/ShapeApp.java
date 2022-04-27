package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01.toString());
		*/
		
		//배열
		Rectangle[] rArray = new Rectangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		//////////////////////////////////////
		//사각형
		Rectangle r01 = new Rectangle("빨강","검정", 4, 6);
		Rectangle r02 = new Rectangle("파랑","검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		//////////////////////////////////////
		//원
		Circle c01 = new Circle("빨강","검정", 5);
		Circle c02 = new Circle("파랑","검정", 10);
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		//////////////////////////////////////
		//삼각형
		Triangle t01 = new Triangle("빨강","노랑", 30, 10);
		Triangle t02 = new Triangle("파랑","검정", 10, 10);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}

	

}
