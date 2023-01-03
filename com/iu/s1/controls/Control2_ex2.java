package com.iu.s1.controls;
import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//평균이 60점 이상인가?
		//과목당 40점 미만이면 불합격
		//합격 불합격 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("영어 점수 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("수학 점수 입력하세요");
		int num3 = sc.nextInt();
		
		double hab = num1 + num2 + num3;
		double avg = hab/3;
		
		boolean flag = false;
		
		/* if(avg >= 60 && num1 > 40 && num2 > 40 && num3 > 40) {
			System.out.println("평균이 " + avg + "점 입니다");
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("평균이 " + avg + "점 입니다");
			System.out.println("불합격입니다.");
		}	*/
		
		if(avg >=60) {
			flag = true;
		}
		if(num1 < 40 || num2 < 40 || num3 < 40) {
			flag = false;
		}
		else {
			flag = true;
		}
		if(flag) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
			

	}

}
