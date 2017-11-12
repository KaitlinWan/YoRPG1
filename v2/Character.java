
public class Character {
	
	int health;
    int strength;
    int defense;
    double att;
    
  //returns whether or not the character is alive
    public boolean isAlive(){
    	return health > 0;
    }

    // returns the value of your characters' defense variable
    public int getDefense(){
    	return defense;
    }
    
    public void lowerHP(int a) {
    	health -= a;
    	}

    public int attack(Character attackee) {
    	int damage;
    	damage = (int) ((strength * att) - attackee.getDefense());
    	return damage;
        }
}
