package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		//로그인 시도 총 5번 시도가능
		//반복문 종료 후 로그인이 성공했으면 "환영합니다"출력
		//실패 시 "은행방문하세요" 출력
		
		for(int i=0; i < 5; i++) {
			System.out.println("ID 입력");	
			int a = sc.nextInt();
			System.out.println("pw 입력");
			int b = sc.nextInt();
			
			if(a == id && b == pw) {
				i = 6;
				check = true;
				System.out.println("로그인 성공");
			}	
			else{
				System.out.println("로그인 실패");
			}
		}
		if(check) {
		System.out.println("환영합니다");
		}
		else {
		System.out.println("은행 방문하세요");
		}
		System.out.println("반복문 종료");
	}

}
