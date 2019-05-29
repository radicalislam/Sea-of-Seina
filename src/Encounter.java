/**
* Write a description of class Encounter here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Encounter extends Game
{
	// instance variables - replace the example below with your own
	private int x;
	private static int eventCount = 0;
	/**
	* Constructor for objects of class Encounter
	 * @return 
	*/
	public static void Event(Ship ship)
	{
		// Initialize instance variables
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
}