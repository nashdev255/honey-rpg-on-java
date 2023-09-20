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
}
