// PiDucks - Sean Roudnitsky, Kaitlin Wan, Eric Wong
// APCS01--Pd2
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

import java.util.Scanner;

public class Monster extends Character{
    //instance variables for the monster
    private String name;

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

}
	
