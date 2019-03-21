package com.playingcards;

public class DeckMain {
	
	public static void main(String[] args) {
		
		int numberOfUsers = 3;
		int n = 10; // Number of cards to deal for test
		Deck deck = new Deck();
		deck.printStack();
		
		System.out.println(
				"----------------------------  After shuffle -----------------------------------------------\n");
		deck.shuffle(30);
		deck.printStack();
		
		System.out.println(
				"----------------------------  Dealing " + n + " cards with " + numberOfUsers + " Users -----------------------------------------------\n");
		
		for (int i = 1; i<=numberOfUsers; i++ ) {
			
			System.out.println(
					"----------------------------  Dealing  User " + i  + " with " +  n + " cards  -----------------------------------------------\n");
			for (int j = 0; j < n; j++) {
				deck.deal();
			}
			
		}
	}


}
