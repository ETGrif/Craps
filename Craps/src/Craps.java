import java.util.Scanner;

public class Craps {

	public static int point;
	public static int currentRoll;
	public static boolean stillPlaying;
	public static boolean hasWon;

	public static void main(String[] args) {
		Greeter.greet();
		boolean wantsToPlay = true;
		while (wantsToPlay) {

			rollPoint();
			if (stillPlaying) {
//								System.out.println("Test: Roll to match");
				rollToMatch();
			}
			endText();

			wantsToPlay = askToPlayAgain();
		}
	}

	public static void rollPoint() {
		// roll
		System.out.println("Time for you roll your Point.");
		int currentRoll = DiceRoller.roller(2, 6);

		// evaluate point roll\

		if (currentRoll == 7 || currentRoll == 11)
		// if 7 or 11, wins
		{
//						System.out.println("Test:Immediate Win");
			stillPlaying = false;
			hasWon = true;

		} else if (currentRoll == 2 || currentRoll == 12)
		// if 2 or 12, loses
		{
//						System.out.println("Test: Immediate Loss");
			stillPlaying = false;
			hasWon = false;
		} else
		// otherwise, set currentRoll to point
		{

			point = currentRoll;
			System.out.println("The Point is now " + point + ".");
			stillPlaying = true;
		}
	}

	public static void rollToMatch()

	{
		System.out.println("Now you must roll to match the point, without rolling a 7.");

		while (stillPlaying) {
			// roll
			int currentRoll = DiceRoller.roller(2, 6);

			// evaluate
			if (currentRoll == point)
			// if is Point, wins
			{
				stillPlaying = false;
				hasWon = true;

			} else if (currentRoll == 7)
			// if a 7, losses
			{
				stillPlaying = false;
				hasWon = false;

			}
			// otherwise, keep rolling

		}

	}

	public static void endText() {
		if (hasWon) {
			System.out.println("Congrats, " + Greeter.getName() + "! You won!!");
		} else {
			System.out.println("Sorry, " + Greeter.getName() + ", you lost!");
		}

	}

	public static boolean askToPlayAgain() {
		// ask to play again
		System.out.println("Would you like to play again?[y/n]");
		Scanner userInput = new Scanner(System.in);
		String response = userInput.nextLine();
		if (!response.equals("y")) {
			System.out.println("Alright, " + Greeter.getName() + ". Good Bye!");
			return false;
		} else {
			return true;
		}
	}

}
