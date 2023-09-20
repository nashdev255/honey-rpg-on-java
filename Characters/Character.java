/**
 * @file Character.java
 * @author nashdev255
 */

package Characters;

/**
 * The base class of Fighter, Monster.
 */
public class Character {
  private String name;
  private int hp, maxhp, atk, def, spd;
  private int level, minLevel = 1, maxLevel = 100;

  public Character(String name, int maxhp, int atk, int def, int spd, int level) {
    this.name = name;
    this.maxhp = maxhp;
    this.hp = this.maxhp;
    this.atk = atk;
    this.def = def;
    this.spd = spd;
    this.level = level;
  }

  /**
   * Show every status which character has.
   */
  public void printStatus() {
    System.out.println("<Status>");
    System.out.println("NAME : " + this.name);
    System.out.println("HP : " + this.hp + '/' + this.maxhp);
    System.out.println("ATK : " + this.atk);
    System.out.println("DEF : " + this.def);
    System.out.println("SPD : " + this.spd);
  }
}
