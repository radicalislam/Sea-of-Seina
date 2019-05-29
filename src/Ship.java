import java.util.Scanner;

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
	public Ship(int f, int g, int c, int ca, int h, int m)
	{
		food = f;
		gold = g;
		crew = c;
		cannons = ca;
		hp = h;
		morale = m;
				
	}

	public void chooseShip()
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
	public static int attack()
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
		return boat;
	}

	public int getFood() {
		return food;
	}

	public int getGold() {
		return gold;
	}

	public int getCrew() {
		return crew;
	}

	public int getCannons() {
		return cannons;
	}

	public int getMorale() {
		return morale;
	}

	public int getHp() {
		return hp;
	}

	public char getBoat() {
		return boat;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public void setCannons(int cannons) {
		this.cannons = cannons;
	}

	public void setMorale(int morale) {
		this.morale = Math.max(0, Math.min(100, morale));
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setBoat(char boat) {
		this.boat = boat;
	}
}

