import java.net.*;
import java.io.*;
import java.util.Scanner; 




public class TreasureWeight {
	

	public static void main(String[] args)  {
			
		//creates new instance of Bank class
		TreasureWeight treasureweight = new TreasureWeight();
		
	

	System.out.println("-----Treasure Weight----");
		treasureweight.run();
			

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
				
		while (again) {
			
			// ask user if weight in staters or pounds
			System.out.println("Result in Staters or lbs? - 1. Staters 2. Lbs");
			int choice=scanner.nextInt();
			
				
			//get Metal from user set Metal in TreasureCalc
			if (choice==1) {
			
				System.out.println("Enter Currency 1. Staters 2. Ducats 3. Decims:");
				String metal = scanner.next();
				metal = treasurecalc.setCurrency(metal);
				System.out.println("Enter amount in lbs:");
				double amt = scanner.nextDouble();
				
				coincount = treasurecalc.getCoinCount(metal, amt);
				System.out.println("Number of "+metal+" coins is "+coincount);
				
			
			}else {
				
				System.out.println("Enter Currency 1. Gold, 2. Silver 3. Copper 4. Staters 5. Ducats :");
				String metal = scanner.next();
				metal = treasurecalc.setMetal(metal);
			
				System.out.println("Enter amount in staters:");
				double amt = scanner.nextDouble();
			
				// staters to weight calculations
		
				weight = treasurecalc.getWeight(metal, amt);
				// Output Weight of treausre in lbs
				System.out.println("Weight of "+metal+" is "+weight+"lbs.");
			
			}
			
			System.out.println("Again? 1-yes 2-no");
			
			int againStr = scanner.nextInt();
			
				if (againStr == 2) {
						System.out.println(againStr+" Goodbye!");
						again=false;
						break;
				}	else {
						System.out.println(againStr+" Again!");
						again=true;			
				}
				
		}
		
		
		
	}

	

}