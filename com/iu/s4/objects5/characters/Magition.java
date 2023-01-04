package com.iu.s4.objects5.characters;

public abstract class Magition extends Character{		//1개 이상의 추상메소드가 있으면 오버라이딩하거나 추상메소드로 만듬

	private int mp;
	
	public Magition() {
		super("sdf");	//super()는 부모의 생성자 호출
		System.out.println();
	}
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public abstract void spell();
	
}
