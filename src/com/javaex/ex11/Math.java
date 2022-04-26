package com.javaex.ex11;

public class Math {

	//필드
	private static double pi = 3.14;
	
	//생성자
	//메소드 getter/setter
	//메소드 일반
	public static int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
	public static double circleArea(int radius) {
		
		double area = pi*radius*radius;
		return area;
	}

}
