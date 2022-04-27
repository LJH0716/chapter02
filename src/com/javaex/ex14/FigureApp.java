package com.javaex.ex14;

public class FigureApp {

	public static void main(String[] args) {
		Rectangle[] rectangle = new Rectangle[2];
		rectangle[0] = new Rectangle("빨강", "검정", 4, 4);
		rectangle[1] = new Rectangle("주황", "검정", 5, 5);
		for (int i = 0; i < 2; i++) {
			rectangle[i].draw();
		}

		Triangle[] triangle = new Triangle[2];
		triangle[0] = new Triangle("빨강", "검정", 4, 4);
		triangle[1] = new Triangle("보라", "검정", 10, 10);
		for (int i = 0; i < 2; i++) {
			triangle[i].draw();
		}

		Circle[] circle = new Circle[2];
		circle[0] = new Circle("보라", "빨강", 3);
		circle[1] = new Circle("보라", "검정", 3);
		for (int i = 0; i < 2; i++) {
			circle[i].draw();
		}
		
		
		
		
	}
}
