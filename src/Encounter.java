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
				System.out.println("What would you do?");
				System.out.println("A: Barter");
				System.out.println("B: Attack");
				
				System.out.println("C: Board");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					System.out.println("1 food = 1 gold");
					ship.setFood(ship.getFood() + 1);
					System.out.println(ship.getFood());
					System.out.println(ship.getGold());
					pressEnterToContinue();
				}
				{
					if( option.equalsIgnoreCase("b"))
					{
						ship.setGold(ship.getGold() + 10);
						System.out.println(ship.getGold());
						pressEnterToContinue();
					}
				}
				if( option.equalsIgnoreCase("c"))
				{
					ship.setCrew(ship.getCrew() + 3 );
					ship.getCrew();
					pressEnterToContinue();
				}
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
						System.out.println("What would you do?");
						System.out.println("A: Diplomacy");

						System.out.println("B: Flee");
						String option = sc.nextLine();
						if( option.equalsIgnoreCase("a"))
						{
							ship.setFood(ship.getGold() - 5);			
							System.out.println(ship.getGold());
							pressEnterToContinue();
						}
						eventCount++;
					}
				else
					{
						System.out.println("A: Fight");
						System.out.println("B: Flee");
						String option = sc.nextLine();
						if( option.equalsIgnoreCase("a"))
						{
							Combat(ship, Ship.createpirateShip());
						}
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
				System.out.println("What would you do?");
				System.out.println("A: Roll Up Sails");
				System.out.println("B: Go Around");
				
				System.out.println("C: Go Straight Through");
				{
					ship.setFood(ship.getMorale() - 1);			
					System.out.println(ship.getMorale());
					ship.setFood(ship.getFood() - 1);
					ship.setCrew(ship.getCrew() - 1);			
					System.out.println(ship.getCrew());
					System.out.println(ship.getFood());
					pressEnterToContinue();
				}
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("b"))
				{
					ship.setFood(ship.getFood() - 1);			
					System.out.println(ship.getFood());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("c"))
				{
					ship.setFood(ship.getMorale() - 1);			
					System.out.println(ship.getMorale());
					ship.setFood(ship.getFood() - 1);
					ship.setCrew(ship.getCrew() - 1);			
					System.out.println(ship.getCrew());
					System.out.println(ship.getFood());
					pressEnterToContinue();
				}
				eventCount++;
			}
		if(Percentile > 0.30 && Percentile <= 0.35)
			{
				System.out.println("You are in the quater, listening to your crew's moans of suffering.");
				pressEnterToContinue();
				System.out.println("What would you do?");
				System.out.println("A: Pass out extra rations");
				System.out.println("B: You: Who told you weaklings to slack off?");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					ship.setFood(ship.getFood() - 1);			
					System.out.println(ship.getFood());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					ship.setCrew(ship.getCrew() - 4);		
					System.out.println(ship.getCrew());
					pressEnterToContinue();
				}
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
				eventCount++;
			}
		
		if(Percentile > 0.38 && Percentile <= 0.53) /*Help a stranded ship*/
			{
				System.out.println("You come across a ragged ship. As you get closer they are yelling for help and food.");
				pressEnterToContinue();
				System.out.println("What would you do?");
				System.out.println("A: Offer to fix their sails");
				System.out.println("B: Pretend to help them then take over the ship");
				System.out.println("C: Ignore");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					ship.setMorale(ship.getMorale() + 1);
					ship.setGold(ship.getGold() - 10);
					System.out.println(ship.getMorale());		
					System.out.println(ship.getGold());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					ship.setMorale(ship.getMorale() - 5);
					ship.setFood(ship.getFood() + 10);
					ship.setGold(ship.getGold() + 10);
					System.out.println(ship.getMorale());					
					System.out.println(ship.getGold());
					System.out.println(ship.getFood());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("c"))
				{
					System.out.println("You sail away, listening to the cries of plead and help.");
					pressEnterToContinue();
				}
				eventCount++;
			}	
		if(Percentile > 0.53 && Percentile <= 0.60) /*Drug Season*/
			{
				System.out.println("You come across your crews, acting weird and pleasant.");
				pressEnterToContinue();
				System.out.println("It seems to be that they somehow got their hands in some illegal scrooms.");
				pressEnterToContinue();
				System.out.println("What would you do?");
				System.out.println("A: Join the fun");
				System.out.println("B: 'You animals. This ship is a drug free vessel'");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					ship.setFood(ship.getFood() - 5);
					ship.setMorale(ship.getMorale() + 5);
					ship.setCrew(ship.getCrew() - 2);
					System.out.println(ship.getFood());
					System.out.println(ship.getMorale());
					System.out.println(ship.getCrew());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					ship.setMorale(ship.getMorale() - 1);
					pressEnterToContinue();
					System.out.println(ship.getMorale());
					pressEnterToContinue();
				}
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
				System.out.println("What would you do?");
				System.out.println("A: Give in");
				System.out.println("B: 'If I were to choose between your twin sister and Seina's dog, I would choose the dog!'");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					System.out.println("She hands out a dead body and says, 'I'll give you my therapist'");
					pressEnterToContinue();
					ship.setCrew(ship.getCrew() - 5);
					ship.setGold(ship.getFood() - 5);
					ship.setFood(ship.getGold() - 5);
					System.out.println("The corpse is cursed, giving your ship bad luck.");
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					Combat(ship, Ship.createSiren());
					pressEnterToContinue();
				}
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
						System.out.println("Your ship just sails by along with a couple of waves and cheering.");
						eventCount++;
					}	
				if(ship.getBoat() == '$')
					{
						System.out.println("What would you do?");
						System.out.println("A: Royals:'We shall ask for a tenth of your gold, as we are permitting the sails of our sea.");
						System.out.println("B: Sho:'Money beats you fool's lives in terms of value!'");
						String option = sc.nextLine();
						if( option.equalsIgnoreCase("a"))
						{
							ship.setGold(ship.getGold() - 10);
							System.out.println(ship.getGold());
							pressEnterToContinue();
						}
						if( option.equalsIgnoreCase("b"))
						{
							Combat(ship, Ship.createEndeavor());
							pressEnterToContinue();
						}
						eventCount++;
					}	
				else
					{
						System.out.println("Sho: Prepare the Cannons!"); /*Engage in battle*/
						pressEnterToContinue();
						Combat(ship, Ship.createEndeavor());
						pressEnterToContinue();
						eventCount++;
					}	

			}
		
		if(Percentile > 0.70 && Percentile <= 0.79) /*Wrecked Ship*/
			{
				System.out.println("You come across something that once used to be a merchant's ship");
				pressEnterToContinue();
				System.out.println("What would you do?");
				System.out.println("A: Board and Loot");
				System.out.println("B: Ignore");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					System.out.println("As you inspect the ship, you see that these merchants died from starvation...");
					pressEnterToContinue();
					ship.setGold(ship.getGold() + 5);
					System.out.println(ship.getGold());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					System.out.println("As you sail away, you observe wrecked peace of wood crumble and sink to the ocean floor...");
					pressEnterToContinue();
				}
				eventCount++;
			}
		if(Percentile > 0.79 && Percentile <= 0.80) /*Sea Witch Cocone*/
		{
			System.out.println("You come across a big whirlpool. Upon getting closer, the most ugliest 'thing' rise from the water.");
			pressEnterToContinue();
			System.out.println("What would you do?");
			System.out.println("A: Sho: 'CONCENTRATE FIRE!!!");
			System.out.println("B: Marry");
			System.out.println("C: Escape");
			String option = sc.nextLine();
			if( option.equalsIgnoreCase("a"))
			{
				Combat(ship, Ship.createSeaWitchCocone());
				pressEnterToContinue();
			}
			if( option.equalsIgnoreCase("b"))
			{
				System.out.println("Your destined has been changed from Seina to Cocone. You lose your will to live and hang yourself.");
				while(ship.getHp() > 0)
				{
					ship.setHp(ship.getHp() - 1);
				}
				youDied();
			}
			if( option.equalsIgnoreCase("c"))
			{
				double o = Math.random();
				if(o > 0.8)
				{
					System.out.println("The wind blessed you in your favor, and quickly escaped from such being.");
					pressEnterToContinue();
				}
				else
				{
					System.out.println("Sho hears a whisper. 'It is your fate to end this sea's horror. You must do it...'");
					Combat(ship, Ship.createSeaWitchCocone());
					pressEnterToContinue();
				}
			}
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
				System.out.println("What would you do?");
				System.out.println("A: Sho: 'Get the cannons ready!'");
				System.out.println("B: Sho: 'Full Sail Ahead!!!'");
				System.out.println("C: Grab alot of bread, and try to feed it");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					Combat(ship, Ship.createdobyMick());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					System.out.println("The whale dissapears back into the depth of the sea");
				}
				if( option.equalsIgnoreCase("c"))
				{
					ship.setMorale(ship.getMorale() + 50);
					ship.setFood(ship.getFood() - 3);
					System.out.println("The whale starts splashing around with joy.");
					pressEnterToContinue();
					System.out.println(ship.getFood());
					System.out.println(ship.getMorale());
				}
					
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
				System.out.println("What would you do?");
				System.out.println("A: Enter Combat");
				System.out.println("B: Offer your crew's soul for mercy");
				String option = sc.nextLine();
				if( option.equalsIgnoreCase("a"))
				{
					Combat(ship, Ship.createFlyingDutchman());
					pressEnterToContinue();
				}
				if( option.equalsIgnoreCase("b"))
				{
					ship.setCrew(ship.getCrew() - 5);
					ship.setMorale(ship.getMorale() - 5);
					System.out.println("You hear your crew's cry of despair, rage, and terror");
					pressEnterToContinue();
					System.out.println(ship.getCrew());
					System.out.println(ship.getMorale());
				}
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
				Combat(ship, Ship.createKraken());
				pressEnterToContinue();
				eventCount++; 
			}
		if(Percentile > 0.84 && Percentile <= 0.94)/*Vortex*/
		{
			System.out.println("Crew: Captain! The ship's way is blocked by a vortex!");
			pressEnterToContinue();
			System.out.println("What would you do?");
			System.out.println("A: Sho: 'No matter! Full Sail Ahead!'");
			System.out.println("B: Avoid the vortex");
			String option = sc.nextLine();
			if( option.equalsIgnoreCase("a"))
			{
				double u = Math.random();
				if(u > 0.5)
				{
					System.out.println("Your sailing skill was masterful, making it safely past the sea");
					pressEnterToContinue();
				}
				else
				{
					System.out.println("The vortex is too powerful, swallowing a significant aspect of your ship");
					pressEnterToContinue();
					ship.setFood(ship.getFood() - 3);
					ship.setCrew(ship.getCrew() - 2);
					ship.setHp(ship.getHp() - 10);
					System.out.println(ship.getFood());
					System.out.println(ship.getCrew());
					System.out.println(ship.getHp());
					pressEnterToContinue();
				}
			}
			if( option.equalsIgnoreCase("b"))
			{
				ship.setFood(ship.getFood() - 3);
				System.out.println("The Vortex was mighty, swallowing some of your barrels of fruits.");
				pressEnterToContinue();
				System.out.println(ship.getFood());
				pressEnterToContinue();
			}
			eventCount++;
		}
		if(Percentile > 0.94 && Percentile <= 0.99)/*Stowaway*/
		{
			System.out.println("Crew: Captain! We have found this kid snucking in our ship!");
			pressEnterToContinue();
			System.out.println("What would you do?");
			System.out.println("A: Throw him overboard");
			System.out.println("B: Make him part of your crew");
			String option = sc.nextLine();
			if( option.equalsIgnoreCase("a"))
			{
				ship.setMorale(ship.getMorale() - 5);
				System.out.println(ship.getMorale());
				pressEnterToContinue();
			}
			if( option.equalsIgnoreCase("b")) 
			{
				System.out.println("Everyone: Welcome aboard lad!");
				pressEnterToContinue();
				ship.setCrew(ship.getCrew() + 1);
				System.out.println(ship.getCrew());
				pressEnterToContinue();
			}
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
			System.out.println("What would you do?");
			System.out.println("A: Enter Combat"); //get one-sidedly destroyed no matter what
			System.out.println("B: Praise Stroheim and have him modify your ship");//expensive af
			System.out.println("C: Bow down and praise him. Your grandma told you to never mess with crazy people with crazy inventions.");
			String option = sc.nextLine();
			if( option.equalsIgnoreCase("a"))
			{
				Combat(ship, Ship.createGermany());
				youDied();
			}
			if( option.equalsIgnoreCase("b"))
			{
				System.out.println("Stroheim: 'An upgradeeeee? We shall charge you about 100000000 gold!'");
				pressEnterToContinue();
				System.out.println("To the vast difference of wealth and technology, by the he realized, Sho was on the ground bowing down to the German ship...");	
				pressEnterToContinue();
			}
			eventCount++;
		}
	}
	

	
	private static void Combat(Ship yourShip, Ship Mob)
	{ 
		while(Mob.getHp() > 0)
		{
			System.out.println(yourShip.getHp()); 
			System.out.println(Mob.getHp()); 
			pressEnterToCombat();
			yourShip.setHp(yourShip.getHp()-Mob.attack());
			Mob.setHp(Mob.getHp()-yourShip.attack());
			youDied();
		} 
		clearScreen();
		System.out.println("Crew: Captain, we are victorious!");
		pressEnterToContinue();
		yourShip.setGold(yourShip.getGold()+Mob.getGold());
		System.out.println(yourShip.getGold());
	}
	

	
	
	public static int getEventCount() {
		return eventCount;
	}
}