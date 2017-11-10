// PiDucks - Sean Roudnitsky, Kaitlin Wan, Eric Wong
// APCS01--Pd2
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

import java.util.Scanner;

public class Protagonist {
    // initializes instance variables for class Protagonist
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double att;

    // Constructor; input the name of your character
    public Protagonist(String aName) {
	name = aName;
	health = 125;
	strength = 10;
	defense = 40;
	att = 1;
    }

    //returns whether or not the character is alive
    public boolean isAlive() {
	return health > 0;
    }

    // returns the value of your characters' defense variable
    public int getDefense() {
	return defense;
    }

    // returns the name of your character
    public String getName() {
	return name;
    }
    
    // method to decrease the HP of your character
    public void lowerHP(int a) {
	health -= a;
    }

    // method to attack a monster
    public int attack(Monster monster) {
	int damage;
	damage = (int) ((strength * att) - monster.getDefense());
	return damage;
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
	
