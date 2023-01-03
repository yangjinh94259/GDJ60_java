package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//학생수 입력
		//학생수 만큼 이름 입력, a, b
		//학생수 만큼 학생의 번호, 국어, 영어, 수학 입력
		//a학생의 번호 :	
		//a학생의 국어 :
		//a학생의 영어 :
		//a학생의 수학 :
		//모든 학생의 정보 출력
		//이름	번호	국어	영어	수학	총점	평균
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int hab = sc.nextInt();
		String [] names = new String[hab];		//이름들을 담을 배열
		int [] nums = new int[names.length];	//번호들을 담을 배열
		int [] nums1 = new int[names.length];	//국어 점수 
		int [] nums2 = new int[names.length];	//영어 점수
		int [] nums3 = new int[names.length];	//수학 점수
		int [] nums4 = new int[names.length];	//총점
		double [] nums5 = new double[names.length];	//평균

		for(int i=0; i < names.length; i++) {
			System.out.println(i + 1 + "번째 학생 이름 입력");
			names[i] = sc.next();
			System.out.println(names[i] + "학생의 번호 입력");
			nums[i] = sc.nextInt();
			System.out.println(names[i] + " 학생의 국어 점수 입력");
			nums1[i] = sc.nextInt();
			System.out.println(names[i] + " 학생의 영어 점수 입력");
			nums2[i] = sc.nextInt();
			System.out.println(names[i] + " 학생의 수학 점수 입력");
			nums3[i] = sc.nextInt();
			nums4[i] = nums1[i] + nums2[i] + nums3[i];			//총점을 담은 배열에 국 영 수 배열에 담길 nums를 더해 담는다
			nums5[i] =	nums4[i] / 3.0; 
			
		}
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(int i=0; i < names.length; i++) {
//			System.out.print("이름 : " + names[i] + "\t" + " 번호 : " + nums[i] + "\t" + "국어 점수 : " + nums1[i] + "\t " + "영어 점수 : " + nums2[i] + "\t " + "수학 점수 : " + nums3[i]);
//			System.out.println("\n" + "총점 : " + nums4[i] + "\t" + "평균 : " + nums5[i]);
			System.out.print(names[i]+ " \t ");
			System.out.print(nums[i]+ " \t ");
			System.out.print(nums1[i]+ " \t ");
			System.out.print(nums2[i]+ " \t ");
			System.out.print(nums3[i]+ " \t ");
			System.out.print(nums4[i]+ " \t ");
			System.out.println(nums5[i]);
		}
	}

}
	