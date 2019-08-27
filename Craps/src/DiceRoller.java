
public class DiceRoller
	{

		public static int roller(int numberOfDice, int sides)
			{

				String diceText = "";
				int total = 0;
				for (int i = 0; i < numberOfDice; i++)
					{
						int random = (int) (Math.random() * sides + 1);
						total += random;
						if (i == numberOfDice - 2)
							{
								diceText += random + " and ";

							} else
							{
								diceText += random + ", ";
							}
						

					}

				System.out.println("You rolled a " + diceText +" for a total of "+total+".");
				return total;
			}

	}
