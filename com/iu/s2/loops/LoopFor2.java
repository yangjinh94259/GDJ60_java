package com.iu.s2.loops;

public class LoopFor2 {

	public static void main(String[] args) {
		//반복문 내의 보조문
		// 1. break;
		//반복문 내에서 break를 만나면 그 즉시 반복문 종료
		for(int i=0; i < 10; i++) {
			System.out.println(i);
			if(i % 2 == 0) {
				continue;	//break 반대로 continue를 만나면 다시 증감식으로 올라감(결과가 1,3,5,7,9으로 찍힘)
				
			}
			System.out.println(i);
		}
		System.out.println("반복문 종료");
		// 2. continue;
		// 1) for : 그 즉시 증감식으로 이동
		// 2) while :	그 즉시 조건식으로 이동

	}

}
