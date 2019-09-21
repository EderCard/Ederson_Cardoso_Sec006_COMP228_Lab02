package ederson_cardoso_exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * QuestionBank.java - Question test simulator based on an array of questions
 * 
 * @author Ederson Cardoso
 *
 */
public class QuestionBank {
	// field arrays to store questions and answers
	private String[] questionList = new String[5];
	private int[] correctAnswer = new int[5];

	/**
	 * This method simulate question bank storing questions in an array
	 */
	private void simulateQuestion() {
		// array to store questions
		questionList[0] = "Question 01" 
						+ "\nWhat the correct anwser?" 
						+ "\n[1] correct" 
						+ "\n[2] wrong" 
						+ "\n[3] wrong"
						+ "\n[4] wrong";
		questionList[1] = "Question 02" 
						+ "\nWhat the correct anwser?" 
						+ "\n[1] wrong" 
						+ "\n[2] correct" 
						+ "\n[3] wrong"
						+ "\n[4] wrong";
		questionList[2] = "Question 03" 
						+ "\nWhat the correct anwser?"
						+ "\n[1] wrong" + "\n[2] wrong" 
						+ "\n[3] correct"
						+ "\n[4] wrong";
		questionList[3] = "Question 04" 
						+ "\nWhat the correct anwser?" 
						+ "\n[1] wrong" 
						+ "\n[2] wrong" 
						+ "\n[3] wrong"
						+ "\n[4] correct";
		questionList[4] = "Question 05" 
						+ "\nWhat the correct anwser?" 
						+ "\n[1] correct" 
						+ "\n[2] wrong"
						+ "\n[3] wrong"
						+ "\n[4] wrong";
	} // end of simulateQuestion method

	/**
	 * This method check the correct answer based on userInput
	 * @param counter
	 * @param userInput
	 * @return
	 */
	private boolean checkAnswer(int counter, int userInput) {
		// array to store the correct answer for the questions
		correctAnswer[0] = 1;
		correctAnswer[1] = 2;
		correctAnswer[2] = 3;
		correctAnswer[3] = 4;
		correctAnswer[4] = 1;

		// local variable
		boolean result = false;

		// switch for checking userAnswer
		switch (userInput) {
		// check if user input is 1 - 4
		case 1:
		case 2:
		case 3:
		case 4:
			// if answer is correct returns true, otherwise returns false
			if (userInput == correctAnswer[counter]) {
				result = true;
			} else {
				result = false;
			}
			break;
		default:
			break;
		}
		return result;
	} // end of checkAnswer method

	/**
	 * This method generate a random message based on userAnswer
	 * @param check
	 * @return
	 */
	private String generateMessage(boolean check) {
		// local variable
		String resultMessage = null;

		// create random object
		Random randomObject = new Random();

		// if userAnswer is correct show a random congratulation message
		if (check == true) {
			switch (randomObject.nextInt(4)) {
			case 0:
				resultMessage = "Very Good!";
				break;
			case 1:
				resultMessage = "Excellent!";
				break;
			case 2:
				resultMessage = "Keep up the good work!";
				break;
			case 3:
				resultMessage = "Nice work!";
				break;
			}
		}
		// if userAnswer is wrong show a random sorry message
		else if (check == false) {
			switch (randomObject.nextInt(4)) {
			case 0:
				resultMessage = "No. Please try again.";
				break;
			case 1:
				resultMessage = "Wrong. Try once more.";
				break;
			case 2:
				resultMessage = "Don't give up!";
				break;
			case 3:
				resultMessage = "No. Keep trying.";
				break;
			}
		}
		return resultMessage;
	} // end of generateMessage method

	/**
	 * This method interact with the user
	 */
	public void inputAnswer() {

		// local variables
		int counter;
		int correctAnswer = 0;
		int userAnswer;
		boolean check = false;
		double finalScore;

		// call simulateQuestion method
		simulateQuestion();

		// generate input
		Scanner input = new Scanner(System.in);

		// loop to go through all questions
		for (counter = 0; counter < questionList.length;) {

			// show question
			System.out.println(questionList[counter]);

			// ask for answer
			System.out.print("Enter your answer: ");
			userAnswer = input.nextInt();

			// check result
			check = checkAnswer(counter, userAnswer);

			// if the userAnswer is correct, move to next question and count as correctAnswer
			if (check == true) {
				counter++;
				correctAnswer++;
			}
			// if the userAnswer is wrong, just move to the next question
			else if (check == false) {
				counter++;
			}

			System.out.println("-----------" + generateMessage(check) + "-----------");

		}

		System.out.println("Number of correct answer is: " + correctAnswer);

		// calculate final score
		finalScore = (double) correctAnswer / questionList.length * 100;
		// show final score
		System.out.println("Your final score is: " + finalScore + "%");

		input.close();

	} // end inputAnswer method

} // end class
