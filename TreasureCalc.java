
public class TreasureCalc {
		
	// Set Metal -----------------------------------
	
	public String setMetal(String metal) {
		
		switch (metal) {
		case "1":
			metal="gold";
			break;
		case "2":
			metal="silver";
			break;
		case "3":
			metal="copper";
			break;
		case "4":
			metal="staters";
			break;
		case "5":
			metal="ducats";
			break;
		case "6":
			metal="decims";
			break;
		
		}
		return metal;
	}
	
	
	// getWeight -----------------------------------

	public double getWeight(String metal, double amt) {
		
		double weight=0.0;
	
		switch (metal) {
		case "gold":
			weight = amt*.0005;
			weight = weight/16;
		break;
		
		case "silver":
			weight = amt*.035;
			weight = weight/16;
		break;
		
		case "copper":
			weight = amt*4;
			weight = weight/16;
		break;
		//staters roughly the weight of the scaajawea dollar
		case "staters":
			weight = amt*.26;
			weight = weight/16;
		break;
		//ducats roughly the weight of a quarter
		case "ducats":
			weight = amt*.2;
			weight = weight/16;
		break;
		
		}
		return weight;
		
	}
	
	// CoinCount -----------------------------------
	
	public double getCoinCount(String metal, double amt) {
		double coincount=0.0;
		
		switch (metal) {
			//staters roughly the weight of the Sacajawea dollar
		case "staters":
			coincount = amt*61.53;		
		break;
		//ducats roughly the weight of a quarter
		case "ducats":
			coincount = amt*80;
		break;
		case"decims":
			coincount = amt*160;
		break;
			
		
		}
		return coincount;
		
	}
	

}
