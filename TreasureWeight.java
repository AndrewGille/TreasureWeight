import java.net.*;
import java.io.*;
import java.util.Scanner; 

/*
 * ********************************************************************
 * A program to calculate the weight of Treasure in the world of Kiron
 * Helps develop currency system and understand how much treasure
 * characters in the world need to haul!  
 * 
 * Version 2.0 with mysql connectivity and exchange rates coming soon!
 * ********************************************************************
 * 
 */


public class TreasureWeight {
	

	public static void main(String[] args)  {
	
		//creates new instance of TreasureWeight class
		TreasureWeight treasureweight = new TreasureWeight();
		
	

	System.out.println("-----Treasure Weight----");
		treasureweight.run(); //Runs Program
			

	}
	
	// Run -----------------------------------

	public void run() {
	
		double weight =0.0;
		double coincount = 0.0;
		boolean again=true;
			
			//Scanner
			Scanner scanner = new Scanner(System.in);
			
			//Call Treasure Calc to create Calc functions
				TreasureCalc treasurecalc;
				treasurecalc = new TreasureCalc();
				
	
			
			// ask user if weight in staters or pounds
			System.out.println("Welcome to the Kiron Treasure Weight Calculator");
			System.out.println("You can calculate either the weight of the treausre or the number of coins by weight");
			System.out.println("Express the value of your coins in Staters (Roughly the value of $1USD) ");
			System.out.println("Express weight in lbs.  (Yeah, Kiron uses the Imperial system of measurement)");
			System.out.println("*******************************************************************************");
			while (again) {
			System.out.println("Result in weight or lbs? - 1. Number of Coins per lb. 2. Weight of Treasure based on value");
			int choice=scanner.nextInt();
			
				
			//get Metal from user set Metal name in TreasureCalc
			if (choice==1) {
			
				System.out.println("Enter Currency 1. Staters 2. Ducats 3. Decims:");
				int metal = scanner.nextInt();
				
				//Create metals string for name of metal 
				
				String metals;
				metals = treasurecalc.setCurrency(metal);
				
				//User enters weight of the coins
				
				System.out.println("Enter amount in lbs:");
				double amt = scanner.nextDouble();
				
				//Calculates number of coins for weight
				
				coincount = treasurecalc.getCoinCount(metals, amt);
				System.out.println("Number of "+metals+" coins is "+coincount);
				
			
			}else {
				
				//User enters type of currency to weigh
				
				System.out.println("Enter Currency 1. Gold, 2. Silver 3. Copper 4. Staters 5. Ducats :");
				int metal = scanner.nextInt();
				
				//Create metals string for name of metal 
				String metals;
				metals = treasurecalc.setMetal(metal);
			
				//Enter the amount of coins expressed in reserve currency (Staters)
				
				System.out.println("Enter amount in staters:");
				double amt = scanner.nextDouble();
			
				// Calculate weight based on total value of coins in reserve currency (Staters)
		
				weight = treasurecalc.getWeight(metals, amt);
				
				// Output Weight of coins in lbs
				System.out.println("Weight of "+metals+" is "+weight+"lbs.");
			
			}
			
			//  Loop if user wants to perform another calculation
			
			System.out.println("Again? 1-yes 2-no");
			
			int againStr = scanner.nextInt();
			
				if (againStr == 2) {
						System.out.println("Goodbye!");
						again=false;
						break;
				}	else {
						System.out.println("Again!");
						again=true;			
				}
				
		}
		
		
		
	}

	

}