package com.playcards.test;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.playingcards.Deck;
import com.playingcards.Deck.Card;
import com.playingcards.Deck.Suit;
import com.playingcards.Deck.Value;

public class DeckTest {

	private int numberOftime = 10;
	private int currentCount;

	Deck deck = new Deck();
	private Card[] cards;

	private Suit[] suits;
	private Value[] values;
	private int size;

	// Initializing for test cases
	@Before
	public void init() {
		size = 52;
		currentCount = 0;
		cards = new Card[size];
		suits = Suit.values();
		values = Value.values();

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards[currentCount++] = deck.new Card(suits[i], values[j]);
			}

		}

	}

	@Test
	public void shuffleTest() {
		Random rand = new Random();

		for (int i = 0; i < numberOftime; i++) {
			int m = rand.nextInt(currentCount);
			int n = rand.nextInt(currentCount);

			Card temp = cards[m];
			cards[m] = cards[n];
			cards[n] = temp;
		}

	}

}
