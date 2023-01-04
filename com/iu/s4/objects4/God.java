package com.iu.s4.objects4;

public class God {

	private String name;
	
	private God() {
		
	}
	
	public  static God makeGod() {
		God god = new God();
		return god; //new God();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
