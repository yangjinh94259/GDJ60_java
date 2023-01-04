package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer();
		
		Character character = null;
		
		character = archer1;		//character type == archer type
		
		archer1.attack();
		
		archer1 = (Archer)character;
		
		
		
//		Magition magition = new Magition();		//abstract 메소드가 있기 떄문에 객체 생성을 못함
		IceMagition magition = new IceMagition(); 
		magition.getMp();
		magition.setMp(0);
		magition.setName("");
		
		Archer archer = new Archer();
		archer.setDex(0);
		archer.setLevel(3);
		
		magition.attack();
		archer.attack();
		
//		Character character = new Character("");	//추상클래스는 객체 생성을 막음

	}

}
