package ederson_cardoso_exercise1;

public class QuestionBankTest {

	public static void main(String[] args) {

		try {
			// creating object question
			QuestionBank questionBank = new QuestionBank();

			// call method inputAnswer with a questionBank object
			questionBank.inputAnswer();

		} catch (Exception e) {
			System.out.println("--------------------------------\n" 
							 + "You've entered an invalid option.\n"
							 + "------------------Program closed!");
		}
	}

}
