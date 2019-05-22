//The main class where the game will be played
import java.util.Scanner;
public class Game
{
	public static void main(String args[])
	{
		private boolean cursed = false;
		
		
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
		  
		Scanner in = new Scanner(System.in);  
	    System.out.print("Enter your name: ");    
	    String name = in.next();   
	    System.out.println("Name: " + name);
		
		    
		
		//chooseShip();
			
			
		//Each crew member eats one ration of food
		public int eatFood()
		{
			food -= crew;
			System.out.println(food + “ rations are left”);
		}
		
		
		//Method to continue the game on any input
		public void pressEnterToContinue(){
			   System.out.println("Press \"ENTER\" to continue...");
			   Scanner scanner = new Scanner(System.in);
			   scanner.nextLine();
			}
	    
	    //Prints a bunch of lines to clear the screen
	    private void clearScreen()
	    {
	        for(int i = 0; i < 18; i++)
	        {
	            System.out.println("");
	        }
	    }
	    
	    //Shows the player ASCII art to show they died
	    private void youDied()
	    {
	        System.out.println(" __     ______  _    _   _____ _____ ______ _____  ");
	        System.out.println(" \\ \\   / / __ \\| |  | | |  __ \\_   _|  ____|  __ \\ ");
	        System.out.println("  \\ \\_/ / |  | | |  | | | |  | || | | |__  | |  | |");
	        System.out.println("   \\   /| |  | | |  | | | |  | || | |  __| | |  | |");
	        System.out.println("    | | | |__| | |__| | | |__| || |_| |____| |__| |");
	        System.out.println("    |_|  \\____/ \\____/  |_____/_____|______|_____/ ");
	        String endGame = readLine("");
	        youDied();
	    }

	}
}

