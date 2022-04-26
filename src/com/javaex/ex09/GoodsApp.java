package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		Goods[] goodsArray = new Goods[3];
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[2].getPrice());
		System.out.println(goodsArray[1].toString());
	
		System.out.println("==================================");
		goodsArray[0].showInfo();
		goodsArray[1].showInfo();
		goodsArray[2].showInfo();
		System.out.println("==================================");
		
		for(int i=0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		

	}

}
