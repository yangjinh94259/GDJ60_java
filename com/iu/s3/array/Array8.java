package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		int [] ar = {9, 5, 8, 3, 6};
		int num = 0;
		//9, 8, 6, 5, 3 => 내림차순
		//3, 5, 6, 8, 9 => 오름차순
		//0: 1,2,3,4	95836
		//1: 2,3,4		98536
		//2: 3,4		98635
		//3: 4			98653
		//2중 for문
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = i+1; j < ar.length; j++) {	//0도 가능. 근데 부등호 반대, 연산을 좀 더 많이 할뿐. //i+1인 이유는 0은 이미 결정, 그다음자리인 1부터 비교하기 위해서  
				if(ar[i] < ar[j]) {	//a[0] 일때 a[0~7] 까지 비교해서 a[0]자리 결정->이걸 a[6]만큼 7번 돈다. 그래서 정렬. > 오름차순 <내림차순
					num = ar[i];
					ar[i] = ar[j];
					ar[j] = num;
				}
			}
		} //sort end
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}//print end
}
}