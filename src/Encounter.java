public class Encounter extends Game
{
	
	private static int eventCount = 0;
	
	public static void Event(Ship ship)
	{
		double Percentile = Math.random();
		if(Percentile > 0 && Percentile <= 0.05) /*Merchant Ship*/
			{
				System.out.println("You see a beautiful three-masted, square rigged 'East Indiaman' type ship sailing towards you.");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Barter");
				System.out.print("B: Attack");
				System.out.print("C: Board");
				String option = sc.nextLine();
				eventCount++;
				
			}
		if(Percentile > 0.05 && Percentile <= 0.15) /*Pirate Ship*/
			{
				System.out.println("You see a ship of a black flag with a skull in the center.");
				pressEnterToContinue();
				System.out.println("Sho: Pirates...");
				pressEnterToContinue();
				System.out.print("What would you do?");

				if(ship = '$')

				if(ship.getBoat() == '$')

					{
						System.out.print("What would you do?");
						System.out.print("A: Diplomacy");
						System.out.print("B: Flee");
						String option = sc.nextLine();
						eventCount++;
					}
				else
					{
						System.out.print("A: Fight");
						System.out.print("B: Flee");
						String option = sc.nextLine();
						eventCount++;
					}
			}
		if(Percentile > 0.15 && Percentile <= 0.30) //Storm
			{
				System.out.println("Crew: Captain Sho! It seems we have weathering company!");
				pressEnterToContinue();
				System.out.println();
				System.out.println("Sho: Bloody hell. I hope we past get this one too.");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Roll Up Sails");
				System.out.print("B: Go Around");
				System.out.print("C: Go Straight Through");
				String option = sc.nextLine();
				eventCount++;
			}
		if(Percentile > 0.30 && Percentile <= 0.35)
			{
				System.out.println("You are in the quater, listening to your crew's moans of suffering.");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Pass out extra rations");
				System.out.print("B: You: Who told you weaklings to slack off?");
				String option = sc.nextLine();
				eventCount++;
			}
		if(Percentile > 0.35 && Percentile <= 0.38)
			{
				System.out.println("It is night, where Sho is gazing at the star, thinking of Seina.");
				pressEnterToContinue();
				System.out.println("As you were unconciously staring at the star, you realize that the star's light is flickering.");
				pressEnterToContinue();
				System.out.println("You: What in Blazes is that?!");
				pressEnterToContinue();
				System.out.println("The light gets bigger, until you can see that it is some kind of disc.");
				pressEnterToContinue();
				System.out.println("The disc stops right above the mast, and after a short pause flies back up to the distance of space");
				pressEnterToContinue();
				System.out.println("Sho keeps this mysterious encounter to himself, being reminded our world is a mysterious place . . .");
			}
	}
	
		
	}
	
	private static void Shop()
	{
		System.out.println("You have come up to a port.");
		pressEnterToContinue();
		System.out.print("What would you like to buy?");
		System.out.print("A: HP");
		System.out.print("B: Food");
		String option2 = sc.nextLine();
		if( option2.equalsIgnoreCase("a"))
		{
			System.out.println("1 food = 1 gold");
		}
	}
	
	
	
	
	public static int getEventCount() {
		return eventCount;
	}
}