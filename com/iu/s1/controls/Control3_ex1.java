package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : TRPG
		//법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		//1. HP보충(포션) 2. MP보충 3. 마법1 4. 마법2 5. 턴 넘기기
		//HP, MP는 보충 시 최대 40 끝
		//보충시 랜덤하게 0~40 사이의 숫자를 받아서 HP, MP에 더하기
	//	int test = random.nextInt(5);		//0~5 미만의 정수 하나를 리턴
	//	int test2 = random.nextInt(31);		//0~30 미만의 정수 하나를 리턴
	//	System.out.println("test : " + test);
	//	System.out.println("test2 : " + test2);
		
		System.out.println("1. HP보충(포션) 2. MP보충 3. 마법1 4. 마법2 5. 턴 넘기기");
		int select = sc.nextInt();
		if(select == 1) {
			int h = random.nextInt(41);
			hp = hp + h;
			if(hp > 40) {
				hp = 40;
			}
			System.out.println(hp);
		}
		else if(select == 2) {
			int m = random.nextInt(41);
			mp = mp + m;
			if(mp > 40) {
				mp = 40;
			}
		}
		else if(select == 3) {
			//주문
			//mp 3씩 감소
			//0~5 이하의 수치를 공격
			mp = mp - 3;
			System.out.println("MP를 3소모 하여 공격");
			System.out.println("남은 MP : " + mp);
			System.out.println("아브라카타브라~~");
			int p = random.nextInt(6);
			System.out.println("몬스터가 공격 받았습니다 " + p + "공격");
			monsterHp = monsterHp - p;
		}
		else if(select == 4) {
			//주문
			//mp 5씩 감소
			//0~10 이하의 수치를 공격
			mp = mp - 5;
			System.out.println("MP를 5소모 하여 공격");
			System.out.println("남은 MP : " + mp);
			System.out.println("윙가르디움 레비오우사~~~");
			int p1 = random.nextInt(11);
			System.out.println("몬스터가 공격 받았습니다 " + p1 + "공격");
			monsterHp = monsterHp - p1;
		}
		else {
			System.out.println("턴 종료");
		}
		
		//유저의 이름과 HP, MP
		//몬스터의 이름과 HP
		System.out.println(name + " HP : " + hp + " MP : " + mp);
		System.out.println(monsterName + " MonsterHP : " + monsterHp);
		
		/*if(num == 1) {
			System.out.println("HP 포션을 먹습니다");
			int hpPotion = random.nextInt(40);
			int total = hp + hpPotion;
			if(total <= 40) {
				System.out.println("HP : " + total);
			}
			else{
				total = total >= 40 ?  40 : total;
				System.out.println("이미 최대 HP : " + total);
			}
		}
		else if(num == 2) {
			System.out.println("MP 포션을 먹습니다");
			int mpPotion = random.nextInt(40);
			int total2 = mp + mpPotion;
			if(total2 <= 40) {
				System.out.println("MP : " + total2);
			}
			else {
				total2 = total2 >= 40 ?  40 : total2;
				System.out.println("이미 최대 MP : " + total2);
			}
		}
		else if(num == 3) {
			System.out.println("마법 공격1 발동");
		}
		else if(num == 4) {
			System.out.println("마법 공격2 발동");
		}
		else if(num == 5) {
			System.out.println("턴 종료");
		}*/
	}

}
