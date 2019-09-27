package ederson_cardoso_exercise2;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		try {
			// local variables
			int userInput;

			// generate input
			Scanner input = new Scanner(System.in);

			// loop 5 times to play the game
			for (int count = 1; count <= 5; count++) {
				// reset sum
				int sum = 0;
				// create new Lotto object
				Lotto game = new Lotto();

				// ask for user answer
				System.out.print("Enter a number between 3 and 27: ");
				userInput = input.nextInt();

				// check if user entered a valid option between 3 to 27
				if (userInput < 3 || userInput > 27) {
					System.out.println("Invalid choice.");
				} else {
					// loop to show the numbers generated and their sum
					for (int counter = 0; counter < game.arrayLotto().length; counter++) {
						System.out.println("\tNumber[" + counter + "] is: " + game.arrayLotto()[counter]);
						sum += game.arrayLotto()[counter];
					}

					System.out.println("For this round the sum is: " + sum);

					// if the user guess is correct, he win the game and finish it
					if (sum == userInput) {
						System.out.println("***Congratulations! You got it!***");
						break;
					} else {
						System.out.println("Sorry! I won this time. Try again.");
					}
				}
			}
			System.out.println("------End of Game-----");

			input.close();

		} catch (Exception e) {
			System.out.println("--------------------------------\n" 
		                     + "You've entered an invalid option.\n"
		                     + "------------------Program closed!");
		}
	}
}
