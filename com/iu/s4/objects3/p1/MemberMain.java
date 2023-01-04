package com.iu.s4.objects3.p1;

import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		
		member.setName("iu");
		member.setAge(30);
		member.setKi(180);
		member.setMuge(70);
		
		member.info();
		
		
		
//		member.name = "iu";
//		int age = 0;
//		
//		if(age > 0 && age < 200) {
//			member.age = age;
//		}
//
	}

}
