package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		int [] ar2 = new int[2];
		
		//키보드로 부터 숫자를 입력 받아 해당 숫자 만큼 배열을 생성
		
		//배열에 값을 키보드로 부터 입력을 받고
		
		//값들을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		int [] ar3 = new int[num];
		
		for(int i=0; i < ar3.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력");
			ar3[i]=sc.nextInt();
		}
		
		for(int i=0; i < num; i++) {
			System.out.println(ar3[i]);
		}
		System.out.println(ar[3]);
		
	}

}
