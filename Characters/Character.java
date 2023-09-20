/**
 * @file Character.java
 * @author nashdev255
 */

package Characters;

/**
 * The base class of Fighter, Monster.
 */
public abstract class Character {
  protected String name;
  protected int hp, maxhp, atk, def, spd;
  protected int level, minLevel = 1, maxLevel = 100;

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
  public abstract void printStatus();
}
