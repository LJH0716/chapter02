package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		
	//Goods computer = new Goods("LG그램", 900000);
			//Goods camera = new Goods("니콘", 400000);
			
			Goods computer = new Goods("LG그램", 900000);
			
			Goods camera = new Goods("니콘");
			camera.setPrice(400000);
			
			Goods cup = new Goods();
			cup.setName("머그컵");
			cup.setPrice(2000);
			
			
			
			System.out.println(computer.toString());
			System.out.println(camera.toString());
			System.out.println(cup.toString());
			
			//computer.showInfo();
			//camera.showInfo();
			
			

	}

}
