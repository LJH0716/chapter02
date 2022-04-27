package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		Shape s = new Shape("빨강", "노랑");

		Rectangle r = new Rectangle("빨강", "검정", 5, 5);
		System.out.println(r.getWidth()); // 자식의 메소드 사용가능

		// 메모리에는 다 올라가고 부모쪽만 보인다.(섞어쓰기)
		Shape sr = new Rectangle("빨강", "검정", 15, 15);
		// System.out.println(r01.getWidth()) //자식의 메소드를 사용할 수 없다;

		// Shape 배열에 모든 도형을 담아서 관리하고 싶다

		// Shape배열 생성
		Shape[] sArray = new Shape[6];

		// 사각형 2개
		Shape r01 = new Rectangle("빨강", "검정", 4, 4);
		Shape r02 = new Rectangle("주황", "검정", 5, 5);

		// 원 2개
		Shape c01 = new Circle("노랑", "검정", 6);
		Shape c02 = new Circle("초록", "검정", 7);

		// 삼각형 2개
		Shape t01 = new Triangle("파랑", "검정", 8, 8);
		Shape t02 = new Triangle("남색", "검정", 9, 9);

		// 배열에 도형담기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;

		// System.out.println(sArray[0].getWidth());
		// System.out.println(sArray[0].toString());

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());

		}

		System.out.println(((Rectangle) sArray[0]).getWidth());

	}

}
