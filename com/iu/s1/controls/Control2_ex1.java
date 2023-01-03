package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		//키보드로 부터 id, pw를 입력받아서 로그인 처리
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("아이디를 입력하세요");
		int mid = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int mpw = sc.nextInt();
		
		if(id == mid && pw == mpw) {
			System.out.println("환영합니다");
		}
		else {
			System.out.println("다시 확인해주세요");
		}

	}

}
