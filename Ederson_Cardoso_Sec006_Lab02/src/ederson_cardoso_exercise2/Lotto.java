package ederson_cardoso_exercise2;

import java.util.Random;

/**
 * Lotto.java - Lotto game
 * 
 * @author Ederson Cardoso
 *
 */
public class Lotto {

	// create random object
	Random randomObject = new Random();

	// field array to store three random numbers
	private int[] randomInteger = new int[3];

	/**
	 * Default constructor based on fields
	 * 
	 * @param randomInteger
	 */
	public Lotto(int[] randomInteger) {
		this.randomInteger = randomInteger;
	}

	//
	/**
	 * Overloaded constructor using random numbers
	 */
	public Lotto() {
		for (int counter = 0; counter < randomInteger.length; counter++) {
			// random number for interval: ((max - min) + 1) + min
			this.randomInteger[counter] = randomObject.nextInt((9 - 1) + 1) + 1;
		}
	}

	/**
	 * This method returns the array of integers
	 * 
	 * @return
	 */
	public int[] arrayLotto() {
		return randomInteger;
	}

} // end of class
