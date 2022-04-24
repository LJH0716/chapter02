package com.javaex.ex06;

public class Goods {

	//매개변수=파라미터,인자
	//생성자 오버로딩->파라미터가 다름(이걸로 구분해서 골라쓰기)
	
	// 필드
		private String name;
		private int price;

		// 생성자
		public Goods() {  //기본생성자
			//***** 메모리에 올리는일(클래스를 인스턴스화)
			System.out.println("Good()");
		}
		

		public Goods(String name) {
			//***** 메모리에 올리는일(클래스를 인스턴스화)
			//추가로직
			this.name = name;
			System.out.println("Goods(1)");
		}
		
		/*
		public Goods(int price) {
			//***** 메모리에 올리는일(클래스를 인스턴스화)
			//추가로직
			this.price = price;
		}
		*/
		public Goods(String name, int price) {
			//***** 메모리에 올리는일(클래스를 인스턴스화)
			//추가로직
			this.name = name;
			this.price = price;
			System.out.println("Goods(2)");
		}
		
		
		// 메소드 gs
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		//메소드 - 일반 html(2일)
		public void showInfo(){
		    System.out.println("상품이름: " + name);
		    System.out.println("가격: " + price);
		    System.out.println("");
		}


		@Override
		public String toString() {
			return "Goods [name=" + name + ", price=" + price + "]";
		}
	
	
}
