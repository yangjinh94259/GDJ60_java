package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {8,5,13,9,6};
		int j = 0;
		//키보드로 부터 삭제하고 싶은 값을 입력 받기
		System.out.println("숫자 입력 : 8, 5, 13, 9, 6");
		int num = sc.nextInt();
		
		int [] copy = new int[ar.length-1];
		
		for(int i=0; i < ar.length; i++) {
			if(ar[i] == num) {
				continue;
			}
			copy[j] = ar[i];
			j++;
		}
		
		ar = copy;
		
		for(int i=0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
				
	}

}
