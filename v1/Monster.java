// PiDucks - Sean Roudnitsky, Kaitlin Wan, Eric Wong
// APCS01--Pd2
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

import java.util.Scanner;

public class Monster {
    //instance variables for the monster
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double att;

    public Monster() {
	//Scanner sc = new Scanner(System.in);
	//name = sc.next();
    
    // constructor to initialize values
	name = "Basper the Bhost";
	health = 150;
	strength = (int)(Math.random() *45) + 20;
	defense = 20;
	att = 1;
    }

    // returns whether or not the monster is alive
    public boolean isAlive() {
	return health > 0;
    }

    // returns defense attribute of monster
    public int getDefense() {
	return defense;
    }

    // returns name of monster
    public String getName() {
	return name;
    }

    //method to lower the HP of monster
    public void lowerHP(int a) {
	health -= a;
    }

    // method to attack a character
    public int attack(Protagonist a) {
	int damage;
	damage = (int) ((strength * att) - a.getDefense());
	return damage;
    }

}
	
