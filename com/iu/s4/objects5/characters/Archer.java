package com.iu.s4.objects5.characters;

public class Archer extends Character implements AttackAble{	//Interface는 ,하고 여러개 가능, 상속은 하나만 가능
	//private String name
	
	private int dex;
	
	public Archer() {
		super("");	//내부적으로 생략되있음
	}
	
	public void attack() {
		System.out.println("활 공격");
	}
	
	public void move() {
		System.out.println("이동");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
}
