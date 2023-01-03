package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수를 입력
		//학생 수 만큼 점수 입력
		//총 합계를 출력
//		System.out.println("학생 수 입력");
//		int total = sc.nextInt();
//		int sum = 0;
//		for(int i=0; i < total; i++) {
//			System.out.println("점수 입력");
//			int num = sc.nextInt();
//			sum = num + sum;		
//		}
//		System.out.println("총 합계 : " + sum);
		
		System.out.println("초 입력");	//5
		int sec = sc.nextInt();
		
		for(int i=0; i < 60; i++) {
			System.out.println(i + "초");
			if(i == sec) {
				i = 59;
			}
		}
		System.out.println("종료");
	}

}
