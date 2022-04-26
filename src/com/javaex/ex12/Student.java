package com.javaex.ex12;

public class Student extends Person{

	//필드
	private String schoolName;

	
	//생성자 ****자식 생성자 실행하려고 하면->부모생성자가 먼저 실행되고, 자식 생성자 실행됨
	//아무것도 지정해주지 않으면 디폴트 생성자 실행됨(부모)
	public Student() {
		super();
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	


	//메소드 -getter/setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + super.getName() + ", getAge()=" + super.getAge() + "]";
	}

	
	//메소드 -일반
}
