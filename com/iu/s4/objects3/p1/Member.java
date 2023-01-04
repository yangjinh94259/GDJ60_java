package com.iu.s4.objects3.p1;

public class Member {

	//비만관리 회원등록
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	

	public Member() {
		
	}
	
	public Member(int age) {
		if(age > 0 || age < 200) {
			this.age = age;
		}
	}
	
	//setter 메소드
	//set + 변수명의 첫글자를 대문자로 바꾼것
	//데이터를 외부로 집어 넣음
	
	//getter 메소드
	//get + 변수명의 첫글자를 대문자로 바꾼것
	//데이터를 내부로 가져옴
	
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Ki : " + this.ki);
		System.out.println("Muge : " + this.muge);
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getKi() {
		return ki;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public double getMuge() {
		return muge;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	
}
