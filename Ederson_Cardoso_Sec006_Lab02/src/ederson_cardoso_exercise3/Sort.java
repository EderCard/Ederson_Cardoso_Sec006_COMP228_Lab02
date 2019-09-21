package ederson_cardoso_exercise3;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    /**
     * This method creates an array with 4 elements and returns it sorted on reverse order
     * @param number1
     * @param number2
     * @param number3
     * @param number4
     * @return
     */
	public static Integer[] sortNumbers(int number1, int number2, int number3, int number4) {

		Integer[] array = new Integer[4];
		array[0] = number1;
		array[1] = number2;
		array[2] = number3;
		array[3] = number4;

		Arrays.sort(array, Collections.reverseOrder());

		return array;

	}
    /**
     * This overload method creates an array with 3 elements and returns it sorted on reverse order
     * @param number1
     * @param number2
     * @param number3
     * @return
     */
	public static Integer[] sortNumbers(int number1, int number2, int number3) {

		Integer[] array = new Integer[3];
		array[0] = number1;
		array[1] = number2;
		array[2] = number3;

		Arrays.sort(array, Collections.reverseOrder());

		return array;

	}
    /**
     * This overload method creates an array with 2 elements and returns it sorted on reverse order
     * @param number1
     * @param number2
     * @return
     */
	public static Integer[] sortNumbers(int number1, int number2) {

		Integer[] array = new Integer[2];
		array[0] = number1;
		array[1] = number2;

		Arrays.sort(array, Collections.reverseOrder());

		return array;

	}
    /**
     * This overload method creates an array with 1 element and returns it sorted on reverse order
     * @param number1
     * @return
     */
	public static Integer[] sortNumbers(int number1) {

		Integer[] array = new Integer[1];
		array[0] = number1;

		Arrays.sort(array, Collections.reverseOrder());

		return array;

	}
}
