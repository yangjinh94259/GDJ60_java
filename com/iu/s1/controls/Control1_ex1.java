package com.iu.s1.controls;
import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로 부터 국어 영어 수학 점수 입력 받음
		//총점과 평균을 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그외 나머지는 F를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력하세요");
		double num1 = sc.nextDouble();
		System.out.println("영어 점수 입력하세요");
		double num2 = sc.nextDouble();
		System.out.println("수학 점수 입력하세요");
		double num3 = sc.nextDouble();
		
		double hab = num1 + num2 + num3;
		double avg = hab/3;
		
		String level = "F";
		
		if(avg >= 90) {
			System.out.println("평균이 " + avg + "점 입니다");
			//System.out.println("A" + "입니다.");
			level = "A";
		}
		if(avg >= 80) {
			System.out.println("평균이 " + avg + "점 입니다");
			//System.out.println("B" + "입니다.");
			level = "B";
		}
		if(avg >= 70) {
			System.out.println("평균이 " + avg + "점 입니다");
			//System.out.println("C" + "입니다.");
			level = "C";
		}
	/*	else {
			System.out.println("평균이 " + avg + "점 입니다");
			//System.out.println("F" + "입니다.");
			level = "F";
		}	*/
		
		//출력문은 딱 한번만 사용
		System.out.println(level);

	}

}
