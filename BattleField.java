/**
 * @file BattleField.java
 * @author nashdev255
 */

import java.util.ArrayList;
import java.util.Random;

import Characters.Fighters.Fighter;
import Characters.Monsters.Monster;

/**
 * Fighters and monsters will fight in this field.
 */
public class BattleField {
  private ArrayList<Fighter> fighters = new ArrayList<>();
  private ArrayList<Monster> monsters = new ArrayList<>();
  private boolean isFightersTurn;

  /**
   * Initialize fields.
   */
  private void init() {
    // set turn randomly
    Random random = new Random();
    this.isFightersTurn = random.nextBoolean();
  }

  private int calcSumOfAllFightersHp() {
    
  }

  public BattleField(ArrayList<Fighter> fighters, ArrayList<Monster> monsters) {
    this.fighters = fighters;
    this.monsters = monsters;
    this.init();
    this.cycleTurn();
  }

  public void cycleTurn() {
    if(fighters.)

    if(isFightersTurn) {
      this.fightersTurn();
    } else {
      this.monstersTurn();
    }
  }
}
