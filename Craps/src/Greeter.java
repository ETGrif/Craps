import java.util.Scanner;

public class Greeter
	{

		public static String name;

		public static void greet()
			{

				System.out.println("Welcome to the Craps Table! What's your name?");
				Scanner userInput = new Scanner(System.in);
				name = userInput.nextLine();
				System.out.println("Hello, " + name + "! Do you know how to play craps?[y/n]");
				String response = userInput.nextLine();
				if (response.equals("n"))
					{
						giveInstructions();
					}

				System.out.println(name + ", you're ready to play!");
			}

		public static void giveInstructions()
			{

				System.out.println("Two six-sided dice are rolled and are added together. If the sum is a\n"
						+ "2 (snake eyes) or a 12 (box cars), the player loses instantly. If the sum is\n"
						+ "a 7 or an 11, the player wins instantly. If any other sum is rolled, that\n"
						+ "number becomes “the point.” Now the player rolls until he or she either gets\n"
						+ "the point and wins or rolls a 7 and loses..");
			}

		public static String getName()
			{
				return name;
			}

	}
