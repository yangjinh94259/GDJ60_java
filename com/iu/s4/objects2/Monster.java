package com.iu.s4.objects2;

import java.util.Scanner;

public class Monster {
	
	//멤버변수, instance 변수
	String name;
	int power = 10;		//Heap에 만들어진 영역
	int hp = 100;
	
	public boolean checkValue(Monster monster) {
		//나의 power와 같고, 나의 hp가 같다면 true 리턴, false 리턴
		
		if(monster.hp == this.hp && monster.power == this.power) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//멤버메소드, instance method
	//공격
	
	//어슬렁
	
//	public void info(int a) {		오버로딩 
//									메소드의 이름이 같아야함
//	}								메개변수의 데이터타입이(변수명은 X) 달라야함
	
	public void info() {
		System.out.println(this);
		//참조변수 this : class내부에서만 사용 가능, 생성된 객체 주소를 담음
		System.out.println(this.name);
		//this는 생략 가능
		System.out.println(hp);
		
		this.attack();
	}
	
	public void attack() {
		System.out.println("공격합니다");
		//this.info();
	}
	
	public void setHp(int hp) {
		this.hp = hp;	//this 생략 가능하지만 같을땐 this를 써서 구분해야함
	}
	
}
