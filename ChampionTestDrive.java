public class ChampionTestDrive {
	public static void main (String args[]) {
		int numOfAD = 0;
		int numOfAP = 0;
		
		Champion[] blue = new Champion[5];
		blue[0] = new Champion();
		blue[1] = new Champion();
		
		blue[0].setName("Ahri");
		blue[0].setIsCarry(true);
		blue[0].setIsMeta(true);
		blue[0].setRole("Mid");
		blue[0].setDmg_type("AP");
		blue[0].setTier("A");
		blue[0].pick();
		
		blue[1].setName("Leona");
		blue[1].setIsCarry(false);
		blue[1].setIsMeta(false);
		blue[1].setRole("Support");
		blue[1].setDmg_type("AD");
		blue[1].setTier("C");
		blue[1].pick();
		
		// get number of AD and AP champions
		for (int i=0; i <= 1; i++) {
			if (blue[i].getIsCarry() == false) {
				continue;
			}
			String x = blue[i].getDmg_type();
			if (x == "AD") {
				numOfAD++;
			}
			else {
				numOfAP++;
			}
		}
		
		// team comp damage type breakdown
		System.out.println("Number of AD carries on team: " + numOfAD);
		System.out.println("Number of AP carries on team: " + numOfAP);
		if (numOfAD == numOfAP) {
			System.out.println("Your team comp is balanced.");
		}
		else if(numOfAD > numOfAP) {
			System.out.println("Your team comp is AD heavy.");
		}
		else {
			System.out.println("Your team comp is AP heavy.");
		}
	}
}