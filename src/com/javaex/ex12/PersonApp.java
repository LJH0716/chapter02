package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		/*
		Person p01 = new Person("이정화", 31);
		p01.showInfo();
		*/
		/*
		Student s01 = new Student("서울고등학교");
		System.out.println(s01.toString());
		*/
		
		/*
		Student s02 = new Student();
		s02.setName("이정화");
		s02.setAge(31);
		s02.setSchoolName("서울고등학교");
		
		//System.out.println(s02.toString());
		*/
		
		Student s03 = new Student("이정화", 31, "서울고등학교");
		System.out.println(s03.getName());
		System.out.println(s03.toString());
	}

}
