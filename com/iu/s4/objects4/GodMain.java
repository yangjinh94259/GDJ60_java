package com.iu.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
		
		God god = God.makeGod();
		god.setName("유일신");
		
		System.out.println("God : " + god);
		System.out.println("Name : " + god.getName());
		
	}

}
