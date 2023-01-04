package com.iu.s4.objects3.p1;

public class Secret {

	public int point = 500;
	public int money = 1000000000;		//접근지정자가 따로 지정되지 않아 default가 기본으로 선언되어 같은 패키지 내에서만 사용 가능
	
	public Secret() {	//기본 생성자
		
	}
	
	public void s1() {
		System.out.println("Secret의 s1 메소드 실행");
		
	}
	
	void s2() {
		System.out.println("Default");
	}
	
}
