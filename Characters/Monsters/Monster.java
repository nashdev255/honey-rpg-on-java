/**
 * @file Monster.java
 * @author nashdev255
 */

package Characters.Monsters;

import Characters.Character;

/**
 * Define opponents against fighters.
 */
public class Monster extends Character {
  public Monster(String name, int maxhp, int atk, int def, int spd, int level) {
    super(name, maxhp, atk, def, spd, level);
  }

  public void printStatus() {
    System.out.println("==============================");
    System.out.println("<Status>");
    System.out.println("NAME : " + this.name);
    System.out.println("LEVEL : " + this.level);
    System.out.println("HP : " + this.hp + '/' + this.maxhp);
    System.out.println("ATK : " + this.atk);
    System.out.println("DEF : " + this.def);
    System.out.println("SPD : " + this.spd);
    System.out.println("==============================");
  }
}
