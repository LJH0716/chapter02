package com.javaex.ex10;

	//static 사전조사

	public class GoodsApp {
		//필드
		//생성자
		//메소드 getter/setter
		//메소드 일반
		
		public static void main(String[] args) {

			Goods camera = new Goods("니콘", 400000);
			System.out.println(camera.toString());
			
			Goods computer = new Goods();
			computer.setName("LG그램");
			computer.setPrice(900000);
			System.out.println(computer.toString());
			
			Goods cup = new Goods("머그컵", 2000);
			System.out.println(cup.toString());
			
			
			System.out.println(Goods.count);
			
		}

	}


