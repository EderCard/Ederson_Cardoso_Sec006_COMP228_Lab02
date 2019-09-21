package ederson_cardoso_exercise3;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {

		System.out.println("Sorted array in descending order: " + Arrays.toString(Sort.sortNumbers(5, 3, 7, 4)));
		System.out.println("Sorted array in descending order: " + Arrays.toString(Sort.sortNumbers(3, 7, 4)));
		System.out.println("Sorted array in descending order: " + Arrays.toString(Sort.sortNumbers(3, 7)));
		System.out.println("Sorted array in descending order: " + Arrays.toString(Sort.sortNumbers(3)));
	}

}
