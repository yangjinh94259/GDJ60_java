package com.iu.s4.objects4;


public final class God {	//class 앞에 final이 붙으면 상속을 하지 말라는 뜻

	private static final String MY_NAME = "";	//myName
	
	private static God god;
	
	private  God() {
		//this.name = "test";
	}
	
	public  static God getInstance() {
		
		if(God.god == null) {
			God.god = new God();
		}
			
		return God.god; //new God();
	}

	public final String getName() {
		return null;
		//return name;
	}

	public void setName(String name) {
		//this.name = name;
	}
	
}
