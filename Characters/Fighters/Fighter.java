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
  private String codeName;

  public Fighter(String name, int maxhp, int atk, int def, int spd, int level, String codeName) {
    super(name, maxhp, atk, def, spd, level);
    this.codeName = codeName;
  }

  public void printStatus() {
    System.out.println("==============================");
    System.out.println("<Status>");
    System.out.println("NAME : " + this.name + ' ' + '~' + this.codeName + '~');
    System.out.println("LEVEL : " + this.level);
    System.out.println("HP : " + this.hp + '/' + this.maxhp);
    System.out.println("ATK : " + this.atk);
    System.out.println("DEF : " + this.def);
    System.out.println("SPD : " + this.spd);
    System.out.println("==============================");
  }
}
