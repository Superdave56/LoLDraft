// This program selects a champion

class Champion {
  private String name;
  boolean isMeta;
  String role;
  String dmg_type;
  int tier;
  
  // getters and setters for instance variables
  String getName() {
  	return name; 
  }
  
  void setName(String aName) {
  	name = aName;
  }
  
  String getRole() {
  	return role; 
  }
  
  void setRole(String aRole) {
  	role = aRole;
  }
  
  boolean getIsMeta() {
  	return isMeta; 
  }
  
  void setIsMeta(boolean aIsMeta) {
  	isMeta = aIsMeta;
  }
  
  String getDmg_type() {
  	return dmg_type; 
  }
  
  void setDmg_type(String aDmg_type) {
  	dmg_type = aDmg_type;
  }

  int getTier() {
  	return tier; 
  }
  
  void setTier(int aTier) {
  	tier = aTier;
  }
  
  public void pick() {
  	System.out.println("You have selected " + getName() + ".");
  	System.out.println("In Meta: " + getIsMeta());
  	System.out.println("Role: " + getRole());
  	System.out.println("Damage type: " + getDmg_type());
  	System.out.println("Tier: " + getTier());
  }
}

class ChampionTestDrive {
	public static void main (String args[]) {
	Champion one = new Champion();
	one.setName("Ahri");
	one.setIsMeta(true);
	one.setRole("Mid");
	one.setDmg_type("AP");
	one.setTier(1);
	
	one.pick();
	}
}