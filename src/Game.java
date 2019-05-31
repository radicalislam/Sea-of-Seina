//The main class where the game will be played
import java.util.Scanner;
public class Game
{
	//private static boolean cursed = false;
	public static Scanner sc;
	private static Ship ship;
	
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
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
		System.out.println("\nType the name of which ship you would like to choose");
		ship = Ship.chooseShip();
		
	    System.out.print("Captain SHO!!!! Wake up, its time to sail we need to save princess Seina. ");    
	    pressEnterToCombat();
	    
	    
	    for(int i = 1; i <= 9; i++)//9 days "i did the most of all the groups" -skylar kinney 2019 the fucking idiot Code wouldnt run all this time cuz he put a > instead of a < 
	    { 
	    	System.out.println("Day" + i);
	    	pressEnterToContinue();
	    	for(int x = 0; x < 3; x++) //3 events per day
		    {
		    	pressEnterToCombat();
		    	Encounter.Event(ship);
		    }
		    eatFood(); 
		    Shop(ship);
	    } 
	    
	    System.out.println("Sho reaches the main kingdom and lies with Seina forever ZA ENDO!");
	    sc.close();  
	}
	    
	//chooseShip();

	
	public static void printShipStats()
	{
		System.out.println("Current status:\nhp: " + ship.getHp() + "\nfood:" + ship.getFood() + "\ngold:" + ship.getGold() + "\nmoral" + ship.getMorale() + "\ncrew" + ship.getCrew() + "\ncannon" + ship.getCannons());
	}
	
	//Each crew member eats one ration of food
	public static void eatFood()
	{
		ship.setFood(ship.getFood() - ship.getCrew());
		System.out.println(ship.getFood() + " rations are left");
		youDied();
	}
	
	public static void Shop(Ship yourShip)
	{
		System.out.println("You have come up to a port.");
		pressEnterToContinue();
		System.out.println("What would you like to buy?");
		System.out.println("NOTE:You may only purchase one of the 2 options each day. Choose wisely.");
		System.out.println("A: HP");
		System.out.println("B: Food");
		String option2 = sc.nextLine();
		if( option2.equalsIgnoreCase("b"))
		{
			System.out.println("1 food = 1 gold");
			ship.setFood(ship.getFood() + 1);
			System.out.println(ship.getFood());
			System.out.println(ship.getGold());
		}
		if( option2.equalsIgnoreCase("a"))
		{
			System.out.println("Fix Ship (no matter the capacity, your health would rise up to 100) = 5 gold");
			while(ship.getHp() < 101)
			{
				ship.setHp(ship.getHp() + 1);
			}
			ship.setHp(ship.getHp());
			ship.setGold(ship.getGold() - 5);
			System.out.println(ship.getHp());
			System.out.println(ship.getGold());
		}
	}
	
	
	//Method to continue the game on any input
	public static void pressEnterToContinue()
	{
		System.out.println("Press \"ENTER\" to continue...");
		sc.nextLine();
	}
    	
    //Prints a bunch of lines to clear the screen 
    public static void clearScreen()
    {
        for(int i = 0; i < 50; i++)
        {
            System.out.println();
        }
    }
    
    
    //Shows the player ASCII art to show they died
    protected static void youDied()
    {
    	if(ship.getHp() <= 0 || ship.getFood() <= 0)
    	{
        System.out.println(" __     ______  _    _   _____ _____ ______ _____  ");
        System.out.println(" \\ \\   / / __ \\| |  | | |  __ \\_   _|  ____|  __ \\ ");
        System.out.println("  \\ \\_/ / |  | | |  | | | |  | || | | |__  | |  | |");
        System.out.println("   \\   /| |  | | |  | | | |  | || | |  __| | |  | |");
        System.out.println("    | | | |__| | |__| | | |__| || |_| |____| |__| |");
        System.out.println("    |_|  \\____/ \\____/  |_____/_____|______|_____/ ");
        clearScreen();
        main(new String[1]);
    	}
    }
     
	public static void pressEnterToCombat()
	{
		System.out.println("Press \"ENTER\" to continue...");
		sc.nextLine();
		clearScreen();
	}
} 

