package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {5, 1, 4};
		//1.데이터 추가
		//0번 인덱스에 추가
		//2.데이터 삭제
		//0번 인덱스 삭제
		//3.종료
		boolean check = true;
		
		while(check) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.종료");
			int num = sc.nextInt();
			if(num == 1) {				//데이터 추가
					System.out.println("추가 숫자 입력");
					num = sc.nextInt();
					int [] copy = new int[ar.length + 1];
					copy[0] = num;
					for(int i=0; i < ar.length; i++) {
						copy[i+1] = ar[i];
					}
					ar = copy;
			}	
			else if(num == 2){			//데이터 삭제
				int [] copy = new int[ar.length - 1];
				
				for(int i=0; i < copy.length; i++) {
					copy[i] = ar[i + 1];
				}
				ar = copy;
			}
			else {						//종료
				System.out.println("종료");
				break;
			}
			
			for(int i=0; i<ar.length; i++) {
				System.out.println(ar[i]);
			}
		}
	}
}
