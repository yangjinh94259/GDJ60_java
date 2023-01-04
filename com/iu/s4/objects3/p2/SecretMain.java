package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;	//패키지 명은 * 사용 불가, 클래스 명은 * 사용 가능

public class SecretMain {
	//객체 생성 반드시 필수
	public static void main(String[] args) {
		
		Secret secret = new Secret();
		com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret();	//풀패키지 명을 작성
		
		secret.money = 1;
		
		secret.s1();
//		secret.s2();	default 선언되어 사용 불가
		
		System.out.println(secret.point);	
//		System.out.println(secret.monety);	money가 오류뜨는 이유는 접근지정자때문
		
		Test test = new Test();
		System.out.println(test.point);
		
	}

}
