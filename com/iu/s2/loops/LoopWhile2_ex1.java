package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//게임
		//1. 로그인 2. 로그인한 사용자만 게임 가능
		
		//---------------------로그인 파트------------------------
		//1.로그인 2.종료
		//1: id, pw 입력 후 로그인 판단
		//2: 종료
		
		//----------게임 진행 파트---------------------------------
		//1.로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//초기 골드 0
		//5렙 달성시 1000골드 지급
		//10렙 달성시 2000골드 지급
		//15렙 달성시 3000골드 지급
		//모든 몬스터의 경험치는 동일
		//1 -> 2 : 3
		//2 -> 3 : 6
		//3 -> 4 : 9
		//4 -> 5 : 12
		//......
		//14 -> 15 : 52
		//만렙 달성 축하, 현재 골드 출력
		
		boolean check = true;
		int id = 1234;
		int pw = 5678;
		
		while(check) {								//while문에 check가 true이므로 무한반복
			System.out.println("1.로그인   2.종료");	
			int select = sc.nextInt();			
			if(select == 1) {						
				System.out.println("ID 입력");
				int mid = sc.nextInt();
				System.out.println("PW 입력");
				int mpw = sc.nextInt();
				
				if(mid == id && mpw == pw) {
					System.out.println("로그인 성공");
					break;							//break를 만나므로 while문에는 true로 입력
				}
				else {
					System.out.println("로그인 실패");
				}
			}
			else {
				System.out.println("게임을 종료합니다");
				check =! check;						//not 연산자를 사용, false가 되어 while문 종료
			}
			
				}if(check) {						//while문이 true이므로 if문 실행
				int gold = 0;
				int level = 1;
				for(; level < 15; level++) {		//사용자의 15 레벨까지 정하는 for문
					System.out.println("현재 레벨 : " + level);
					
					if(level % 5 == 0) {			//사용자가 5의 배수 레벨 달성 시 주는 골드 if문
						System.out.println(level + "렙 달성 축하금");
						gold = gold + level / 5 * 1000;
					}
					
//					if(level == 5){
//						System.out.println("5렙 달성 축하금");
//						gold += 1000;
//					}
//					if(level == 10) {
//						System.out.println("10렙 달성 축하금");
//						gold += 2000;
//					}
					
					for(int m = 0; m < level * 3; m++) {	//사용자의 레벨이 3의 배수 마다 레벨업을 하게 하는 for문
						System.out.println(m + 1 +"번째 사냥 성공");
						
					}
					
					System.out.println("축 레벨업");
			}//바깥 for
				System.out.println(level + "렙 달성 축하");	//레벨업과 가지고 있는 골드 확인
				gold = gold + level / 5 * 1000;
				System.out.println("Gold : " + gold);
		}
	}
}