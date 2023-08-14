package numberGame;

import java.util.Random;
import java.util.Scanner;


public class RandomNumberGenerator {
	// main method
	public static void main(String[] args) {

		// creating random object by using new keyword
		Random random = new Random();

		// Generating a random integer between 0 (inclusive) and 100 (exclusive)
		int randomNumber = random.nextInt(100);
		//System.out.println("Random number :" + randomNumber);
		// Scanner class for taking input from user
		Scanner sc = new Scanner(System.in);

		// three chances user have to correct guess
		int chances = 3;

		// correctGuess track guessed number correct or not .
		boolean correctGuess = false;

		// track the number of attempts
		for (int attempt = 1; attempt <= chances; attempt++) {

			// Guessing from user
			System.out.println("Enter your Guess Number (Attempt " + attempt + "):");
			int guess = sc.nextInt();
			// checking guess number is correct or not .
			if (guess == randomNumber) {
				System.out.println("hurray you won the game");
				correctGuess = true;
				break;
			} else if (guess < randomNumber) {
				System.out.println("your guess is low ");
			} else {
				System.out.println("Your guess is too high. Try again!");
			}
			System.out.println();
		}

		// out of chances
		if (!correctGuess) {
			System.out.println("Out of chances. Try again next time!");

		}
		sc.close();
	}
}
