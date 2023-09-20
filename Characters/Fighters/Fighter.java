/**
 * @file Fighter.java
 * @author nashdev255
 */

package Characters.Fighters;

import Characters.Character;

/**
 * Users operate their own fighters created according to this class.
 */
public class Fighter extends Character {
  public Fighter(String name, int maxhp, int atk, int def, int spd) {
    super(name, maxhp, atk, def, spd);
  }
}
