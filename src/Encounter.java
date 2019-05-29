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
		if(Percentile > 0.15 && Percentile <= 0.35) //Storm
			{
				System.out.println("Crew: Captain Sho! It seems we have weathering company!");
				pressEnterToContinue();
				System.out.println();
				System.out.println("Sho: Bloody hell. I hope we past get this one too.");
				pressEnterToContinue();
				
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