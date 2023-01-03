package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문 횟수를 입력");
		int i = sc.nextInt();
		
		for(int a=0; a < i; a++) {
			System.out.println("Hello World");
			System.out.println("Good Bye");
			System.out.println(a);
		}
		
		
		System.out.println("프로그램 종료");
	
	}

}
