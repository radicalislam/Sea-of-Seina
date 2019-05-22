
public class Ship extends Game
{
	// instance variables
    private int food;
	private int gold;
	private int crew;
	private int cannons;
	private int morale;
	private int hp;
	private char boat;
	
	
	/**
	* Constructor for objects of class Ship
	*/
	public Ship()
	{
		// initialize instance variables
		
	}
	
	public chooseShip()
	{
		while(true)
		{
			if(shipChoice.equalsIgnoreCase("royal seaman") || shipChoice.equalsIgnoreCase("royal") || shipChoice.equalsIgnoreCase("royal seamen") || shipChoice.equalsIgnoreCase("seaman"))
			{
				System.out.println("You've chosen Royal Seaman");
				return boat = r;
			    break;
			}
		            
			if(shipChoice.equalsIgnoreCase("pirate"))
			{
				System.out.println("You've chosen pirate");
				return boat = p;
				break;
			}
			            
			if(shipChoice.equalsIgnoreCase("mercenary") || shipChoice.equalsIgnoreCase("mercenery") || shipChoice.equalsIgnoreCase("mercanary"))
			{
				System.out.println("You've chosen mercenary");
				return boat = m;
				break;
			}
			            
			if(shipChoice.equalsIgnoreCase("merchant"))
			{
				System.out.println("You've chosen merchant");
				return boat = $;
				break;
			}
			
			else
			{
				System.out.println("Try again");
				shipChoice = readLine(">");
			}
		}
	}
	
	//
	public int attack()
	{
		//If the # of crew >= the # of cannons then deal 2d4 damage per cannon
		//If the # of crew < the # of cannons then deal 2d4 damage per crew
		//If 0 cannons, then deal 0 damage
		if(crew >= cannons)
		{
			
			//BE SURE TO TEST
			int sum = 0;
			for(int i = 0; i < cannons; i++)
			{
				//rolls 2d4 damage
				sum += (int) ((Math.random() * 4) + 1 + (Math.random() * 4) + 1);
			}
		return sum;
		}
		
		if(crew < cannons)
		{
			int sum = 0;
			for(int i = 0; i < crew; i++)
			{
				//rolls 2d4 damage
				sum += (int) ((Math.random() * 4) + 1 + (Math.random() * 4) + 1);
			}
		return sum;
		}
	}
}

