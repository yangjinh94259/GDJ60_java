package com.iu.s4.objects4;

public class CardMain {

	public static void main(String[] args) {
		
		//클래스명.변수명
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("red");
		card.setNumber(1);
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		
		Card.size = 8;
		card.info();
		card2.info();
		
	}

}
