package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear(2010);
		s01.setTrack(3);
		System.out.println(s01.toString());
		
		
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", -2007);
		System.out.println(s02.toString());
		
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "G-DRAGON", 2012, 4);
		System.out.println(s03.toString());
		
	
		
		
		
		
		
	}

}
