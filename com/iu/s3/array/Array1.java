package com.iu.s3.array;

public class Array1 {

	public static void main(String[] args) {
		//primitive type
		//숫자,(정수형:byte, short, int, long, 실수형:float, double), 문자 char, 논리형 boolean
		//reference type
		//String
		
		double d1 = 1.2;
		d1 = 5.3;
		//변수선언 공식
		//데이터타입 변수명
		if(d1 > 0) {
			int num = 10;
		}
		//배열 선언 공식
		//모을려고 하는 데이터타입 [] 변수명
		
		double [] ar = new double[2];
		int [] ar2 = new int[3];
		System.out.println(d1);
		System.out.println(ar);
		ar[0] = 3.3;	
		ar[1] = 5.2;
		
		System.out.println(ar[0]);
		
		System.out.println(ar2[0]); 	//Heap 영역은 반자동 초기화
										//ar2 배열에 넣은 값이 없어서 0으로 출력
		int [] ar3 = {1,2,3};
		int ar4 [] = {2,3,4};
		
		for(int i=0; i < 3; i++) {
			System.out.println(ar3[i]);
		}
	}

}
