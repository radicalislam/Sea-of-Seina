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
		if(Percentile > 0.35 && Percentile <= 0.38) /*UFo*/
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
		if(Percentile > 0.38 && Percentile <= 0.53) /*Help a stranded ship*/
			{
				System.out.println("You come across a ragged ship. As you get closer they are yelling for help and food.");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Offer to fix their sails");
				System.out.print("B: Pretend to help them then take over the ship");
				System.out.print("C: Ignore");
				String option = sc.nextLine();
				eventCount++;
			}	
		if(Percentile > 0.53 && Percentile <= 0.60) /*Help a stranded ship*/
			{
				System.out.println("You come across your crews, acting weird and pleasant.");
				pressEnterToContinue();
				System.out.println("It seems to be that they somehow got their hands in some illegal scrooms.");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Join the fun");
				System.out.print("B: 'You animals. This ship is a drug free vessel'");
				String option = sc.nextLine();
				eventCount++;
			}	
		if(Percentile > 0.60 && Percentile <= 0.62) /*Siren Risa*/
			{
				System.out.println("Your ship is covered in a strong mist, and hear a silky girl's voice.");
				pressEnterToContinue();
				System.out.println("It gradually forms as a song in your head.");
				pressEnterToContinue();
				System.out.println("'Become our therapist~... Is anyone there?... Could you come over here...'");
				pressEnterToContinue();
				System.out.println("A siren pops out of the water, and rests on the mast");
				pressEnterToContinue();
				System.out.println("It seems to be that they somehow got their hands in some illegal scrooms.");
				System.out.print("What would you do?");
				System.out.print("A: Give in");
				System.out.print("B: 'If I were to choose between your twin sister and Seina's dog, I would choose the dog!'");
				String option = sc.nextLine();
				eventCount++;
			}	
		if(Percentile > 0.60 && Percentile <= 0.70) /*Royal Ship*/
			{
				System.out.println("You come across a grand ship. It seems to be a research vessel, that hads a royal families' flag up.");
				pressEnterToContinue();
				System.out.println("Sho: It is the Endeavor...");
				pressEnterToContinue();
				if(ship.getBoat() == 'r') /*If Royal Ship*/
					{
						System.out.print("Your ship just sails by along with a couple of waves and cheering.");
					}	
				if(ship.getBoat() == '$')
					{
						System.out.print("What would you do?");
						System.out.print("A: Royals:'We shall ask for a tenth of your gold, as we are permitting the sails of our sea.");
						System.out.print("B: Sho:'Money beats you fool's lives in terms of value!'");
						String option = sc.nextLine();
						eventCount++;
					}	
				else
					{
						System.out.print("Sho: Prepare the Cannons!"); /*Engage in battle*/
						eventCount++;
					}	

			}
		if(Percentile > 0.70 && Percentile <= 0.80) /*Wrecked Ship*/
			{
				System.out.println("You come across something that once used to be a merchant's ship");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Board and Loot");
				System.out.print("B: Ignore");
				String option = sc.nextLine();
				eventCount++;
			}
		if(Percentile > 0.80 && Percentile <= 0.82) /*Doby Mick Whale*/
			{
				System.out.println("The ship jerks to the right. It is as if something scraped against it.");
				pressEnterToContinue();
				System.out.println("Sho: NANI?");
				pressEnterToContinue();
				System.out.println("Right next to your ship, a huge whale jumps out and dives back in the water");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Sho: 'Get the cannons ready!'");
				System.out.print("B: Sho: 'Full Sail Ahead!!!'");
				System.out.print("C: Grab alot of bread, and try to feed it");
				String option = sc.nextLine();
				eventCount++;
			}
		if(Percentile > 0.82 && Percentile <= 0.83)/*Flying Dutchman*/
			{
				System.out.println("At night, in the far distance a green light steadily approaches.");
				pressEnterToContinue();
				System.out.println("As it gets closer, you realize it is a ship moving at an incredible speed.");
				pressEnterToContinue();
				System.out.println("The side of the ship is written as 'The Flying Dutchman'");
				pressEnterToContinue();
				System.out.print("What would you do?");
				System.out.print("A: Enter Combat");
				System.out.print("B: Offer your crew for safety");
				String option = sc.nextLine();
				eventCount++;
			}
		if(Percentile > 0.83 && Percentile <= 0.84)/*Kraken*/
			{
				System.out.println("The ship jerks to the right. It is as if something scraped against it.");
				pressEnterToContinue();
				System.out.println("Sho: NANI?");
				pressEnterToContinue();
				System.out.println("Right next to your ship, a huge tentacle squirms out of the water.");
				pressEnterToContinue();
				//Put here the combat
				eventCount++;
			}
		if(Percentile > 0.84 && Percentile <= 0.94)/*Vortex*/
		{
			System.out.println("Crew: Captain! The ship's way is blocked by a vortex!");
			pressEnterToContinue();
			System.out.print("What would you do?");
			System.out.print("A: Sho: 'No matter! Full Sail Ahead!'");
			System.out.print("B: Avoid the vortex");
			String option = sc.nextLine();
			eventCount++;
		}
		if(Percentile > 0.94 && Percentile <= 0.99)/*Stowaway*/
		{
			System.out.println("Crew: Captain! We have found this kid snucking in our ship!");
			pressEnterToContinue();
			System.out.print("What would you do?");
			System.out.print("A: Throw him overboard");
			System.out.print("B: Make him part of your crew");
			String option = sc.nextLine();
			eventCount++;
		}
		if(Percentile > 0.99 && Percentile <= 0.1)/*GERMAN SHIP*/
		{
			System.out.println("Crew: 'YO WTF! CAPTAIN THERE IS A SHIP MADE OF METAL ON THE SEA?!'");
			pressEnterToContinue();
			System.out.println("Sho: 'WHAT... IS... THAT?!'");
			pressEnterToContinue();
			System.out.println("A man on the 'metal' ship comes out and yells.");
			pressEnterToContinue();
			System.out.println("Stroheim: 'BEHOLD OUR GERMAN SHIP! GERMAN TECHNOLOGY IS NUMBER ONE!!!'");
			pressEnterToContinue();
			System.out.print("What would you do?");
			System.out.print("A: Enter Combat"); //get onesidedly destroyed no matter what
			System.out.print("B: Praise Stroheim and have him modify your ship");//expensive af
			System.out.print("C: Bow down and praise him. Your grandma told you to never mess with crazy people with crazy inventions.");
			String option = sc.nextLine();
			eventCount++;
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