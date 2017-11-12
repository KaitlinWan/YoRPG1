// PiDucks - Sean Roudnitsky, Kaitlin Wan, Eric Wong
// APCS01--Pd2
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

import java.util.Scanner;

public class Protagonist extends Character {
    // initializes instance variables for class Protagonist
    private String name;
    
    // Constructor; input the name of your character
    public Protagonist(String aName) {
	name = aName;
	health = 125;
	strength = 10;
	defense = 40;
	att = 1;
    }


    // returns the name of your character
    public String getName() {
	return name;
    }
    
    // prepares for a special attack by:
    // halving defense and doubling attack
    public void specialize() {
	defense /= 2;
	att *= 2;
    }

    // normalizes attack and defense values follwing specialization
    public void normalize() {
	defense *= 2;
	att /= 2;
    }

}
	
