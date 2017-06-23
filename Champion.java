// This class selects a champion

public class Champion {
  private String name;
  private boolean isMeta;
  private boolean isCarry;
  private String tier;
  private String role;
  private String dmg_type;
  private String[] tier_list = {"S","A","B","C"};
  private String[] role_list = {"Top","Jungle","Mid","Bot","Support"};
  private String[] dmg_type_list = {"AD","AP"};
  
// Getters and setters for instance variables
  String getName() {
  	return name; 
  }
  
  void setName(String aName) {
  	name = aName;
  }
  
  boolean getIsMeta() {
  	return isMeta; 
  }
  
  void setIsMeta(boolean aIsMeta) {
  	isMeta = aIsMeta;
  }
  
  boolean getIsCarry() {
  	return isCarry; 
  }
  
  void setIsCarry(boolean aIsCarry) {
  	isCarry = aIsCarry;
  }
  
  String getRole() {
  	return role; 
  }
  
  void setRole(String aRole) {
	for(String cell : role_list) {
		if (aRole == cell) {
			role = aRole;
			break;
		}
	}
  }
  
  String getDmg_type() {
  	return dmg_type; 
  }
  
  void setDmg_type(String aDmg_type) {
	for(String cell : dmg_type_list) {
		if (aDmg_type == cell) {
			dmg_type = aDmg_type;
			break;
		}
	}
	
  }

  String getTier() {
  	return tier; 
  }
  
  void setTier(String aTier) {
	for(String cell : tier_list) {
		if (aTier == cell) {
			tier = aTier;
			break;
		}
	}
  }
  
// Display champion details
  public void pick() {
  	System.out.println("You have selected " + getName() + ".");
  	System.out.println("Is a carry: " + getIsCarry());
  	System.out.println("In Meta: " + getIsMeta());
  	System.out.println("Role: " + getRole());
  	System.out.println("Damage type: " + getDmg_type());
  	System.out.println("Tier: " + getTier());
  	System.out.println();
  }
}
