//The main class where the game will be played
public class Game
{
	private boolean cursed;
	
	
	// Constructor for objects of class Game
	public Game()
	{
		cursed = false;
	}
	
	//Opening of the game
	System.out.print("Welcome to Sea of Seina \n");
	pressEnterToContinue();
	
	System.out.print("There are 4 different classes to choose from, each with their own strengths and weaknesses \n");
	System.out.print("Your options are: \n");
	System.out.print("Royal seaman:\r\n" + 
			"Food, 100 kg\r\n" + 
			"Crew, 20\r\n" + 
			"Cannons, 10\r\n" + 
			"Gold, 60\r\n" + 
			"ShipHp,150\r\n" + 
			"Morale, 60% on a scale of 0%-100%\r\n" + 
			" \n");
	System.out.print("Pirate:\r\n" + 
			"Food, 90 kg\r\n" + 
			"Crew, 30\r\n" + 
			"Cannons, 6\r\n" + 
			"Gold, 30\r\n" + 
			"ShipHp,90\r\n" + 
			"Morale, 40% on a scale of 0%-100%\r\n" + 
			" \n");
	System.out.print("Merchant:\r\n" + 
			"Food, 100 kg\r\n" + 
			"Crew, 5\r\n" + 
			"Cannons, 0\r\n" + 
			"Gold, 150\r\n" + 
			"Morale, 50% on a scale of 0%-100%\r\n" + 
			"ShipHp, 50\r\n" + 
			"+30% discount on all port trades\r\n" + 
			" \n");
	System.out.print("Mercenary:\r\n" + 
			"Food, 60 kg\r\n" + 
			"Crew, 15\r\n" + 
			"Cannons, 15\r\n" + 
			"Gold, 50\r\n" + 
			"ShipHp,100\r\n" + 
			"Morale, 35% on a scale of 0%-100%\r\n" + 
			" \n");
	
	//where the player chooses their ship
	System.out.println("");
	System.out.println("Type the name of which ship you would like to choose");
	String shipChoice = readLine(">");
	        
	while(true)
	{
		if(shipChoice.equalsIgnoreCase("royal seaman") || shipChoice.equalsIgnoreCase("royal") || shipChoice.equalsIgnoreCase("royal seamen") || shipChoice.equalsIgnoreCase("seaman"))
		{
			System.out.println("You've chosen Royal Seaman");
			boat = r;
		    break;
		}
	            
		if(shipChoice.equalsIgnoreCase("pirate"))
		{
			System.out.println("You've chosen pirate");
			boat = p;
			break;
		}
		            
		if(shipChoice.equalsIgnoreCase("mercenary") || shipChoice.equalsIgnoreCase("mercenery") || shipChoice.equalsIgnoreCase("mercanary"))
		{
			System.out.println("You've chosen mercenary");
			boat = m;
			break;
		}
		            
		if(shipChoice.equalsIgnoreCase("merchant"))
		{
			 System.out.println("You've chosen merchant");
				boat = $;
				break;
		}
		
		else
		{
			System.out.println("Try again");
			shipChoice = readLine(">");
		}
	}
		
	
	
	//Each crew member eats one ration of food
	public int eatFood()
	{
		food -= crew;
		System.out.println(food + � rations are left�);
	}
		
}
