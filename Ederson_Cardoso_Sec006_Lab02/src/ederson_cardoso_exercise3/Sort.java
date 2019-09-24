package ederson_cardoso_exercise3;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
	/**
	 * This method use a variable number of arguments to return a sorted array in a
	 * descending order
	 * 
	 * @param numbers
	 * @return
	 */
	public static Integer[] sortNumbers(int... numbers) {

		Integer[] array = new Integer[numbers.length];

		int counter = 0;

		// loop for each value in the list of parameters
		for (int value : numbers) {
			array[counter] = value;
			counter++;
		}
		Arrays.sort(array, Collections.reverseOrder());

		return array;
	}
}
