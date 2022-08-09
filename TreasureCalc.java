import java.util.ArrayList;

public class TreasureCalc {
		
	// Set Metal -----------------------------------
	// Uses an Array List to determine metal name based on user input
	// Version 2.0 will pull this from an updatable mysql db
	
	public String setMetal(int metal) {
		
		//subtract 1 from choice since Array LIst starts at (0), this will be more elegant in 2.0
		metal=metal-1;
		
		ArrayList<String> metals = new ArrayList<String>();
	    metals.add("gold");
	    metals.add("silver");
	    metals.add("copper");
	    metals.add("staters");
	    metals.add("ducats");
	    metals.add("decims");	    	    

	    //Get metal name from Array List and set it to a returnable string 
	    String setmetal = metals.get(metal);

	    
		return setmetal;
	}
	
	
	// Set Currency -----------------------------------
	
	public String setCurrency(int metal) {
		
		//subtract 1 from choice since Array LIst starts at (0)
		metal=metal-1;
		
		ArrayList<String> metals = new ArrayList<String>();
	    metals.add("staters");
	    metals.add("ducats");
	    metals.add("decims");   
	    
	    //Get metal name from Array List and set it to a returnable string 
	    
	    String setmetal = metals.get(metal);
		
	
		return setmetal;
	}
	
	
	// getWeight -----------------------------------

	public double getWeight(String metals, double amt) {
		
		//pulls in name of metal and weight of metal 
		
		
		// declare weight variable
		double weight=0.0;
	
		
		//calculate metal weight by name 
		switch (metals) {
		
		// Gold has a set value of 2000 Staters/oz
		case "gold":
			weight = amt*.0005;
			weight = weight/16;
		break;
		// Silver has a set value of 30 Staters/oz
		case "silver":
			weight = amt*.035;
			weight = weight/16;
		break;
		// Copper has a set value of .25 Staters/oz
		case "copper":
			weight = amt*4;
			weight = weight/16;
		break;
		//staters roughly the weight of the US Sacagawea dollar coin
		case "staters":
			weight = amt*.26;
			weight = weight/16;
		break;
		//ducats roughly the weight of a US quarter
		case "ducats":
			weight = amt*.2;
			weight = weight/16;
		break;
		
		}
		return weight;
		
	}
	
	// CoinCount -----------------------------------
	
	public double getCoinCount(String metals, double amt) {
		double coincount=0.0;
		
		switch (metals) {
		//staters roughly the weight of the Sacajawea dollar about 61/lb.
		case "staters":
			coincount = amt*61.53;		
		break;
		//ducats roughly the weight of a quarter about 80/lb.
		case "ducats":
			coincount = amt*80;
		break;
		// Decims are 1/10 oz of gold about the size of a penny and are worth about 200 Staters. 10/oz 160/lb.    
		case"decims":
			coincount = amt*160;
		break;
			
		
		}
		return coincount;
		
	}
	

}
