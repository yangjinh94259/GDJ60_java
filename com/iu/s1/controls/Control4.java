package com.iu.s1.controls;

public class Control4 {

	public static void main(String[] args) {
		//다중 선택
		//switch case
		int num = 1;
		System.out.println("1.햄버거, 2.샌드위치, 3.샐러드");
		
		//case에 변수명, 실수 안됨, 정수형만 가능
		//switch()에 문자 들어가서 똑같은걸 찾는건 가능
		
		switch(num) {
		case 1: 
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("그외 나머지"); 
			break;
		}
		
	}

}
