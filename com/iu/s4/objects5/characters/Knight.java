package com.iu.s4.objects5.characters;

public class Knight extends Character implements AttackAble{

	int strong;
	
//	Item item = new Sword();
	Item item = new Staff();
	
	public void attack() {
		item.a();
		
	}
	
}
