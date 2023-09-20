/**
 * @file BattleField.java
 * @author nashdev255
 */

import java.util.ArrayList;

import Characters.Fighters.Fighter;
import Characters.Monsters.Monster;

/**
 * Fighters and monsters will fight in this field.
 */
public class BattleField {
  private ArrayList<Fighter> fighters = new ArrayList<>();
  private ArrayList<Monster> monsters = new ArrayList<>();

  public BattleField(ArrayList<Fighter> fighters, ArrayList<Monster> monsters) {
    this.fighters = fighters;
    this.monsters = monsters;
  }
}
