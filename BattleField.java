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

  /**
   * Switch turn.
   */
  private void readyToNextTurn() {
    this.isFightersTurn = !isFightersTurn;
  }

  /**
   * Returns sum of all fighters hp.
   */
  private int calcSumOfAllFightersHp() {
    int sumOfAllFightersHp = 0;
    for(Fighter fighter : fighters) {
      sumOfAllFightersHp += fighter.getHp();
    }
    return sumOfAllFightersHp;
  }

  /**
   * Returns sum of all monsters hp.
   */
  private int calcSumOfAllMonstersHp() {
    int sumOfAllMonstersHp = 0;
    for(Monster monster : monsters) {
      sumOfAllMonstersHp += monster.getHp();
    }
    return sumOfAllMonstersHp;
  }

  /**
   * when fighter win
   */
  private void fightersWin() {
    System.out.println("YOU WIN!!!!!");
  }

  private void fightersLose() {
    System.out.println("YOU LOSE...");
  }

  public BattleField(ArrayList<Fighter> fighters, ArrayList<Monster> monsters) {
    this.fighters = fighters;
    this.monsters = monsters;
    this.init();
    this.cycleTurn();
  }

  /**
   * Do cycle of battle routine.
   */
  public void cycleTurn() {
    // Judge which side will attack next.
    if(isFightersTurn) {
      this.fightersTurn();
    } else {
      this.monstersTurn();
    }

    // Judge whether or not either fighters or monsters are dead.
    if(this.calcSumOfAllFightersHp() == 0) {
      this.fightersWin();
      return;
    } else if(this.calcSumOfAllMonstersHp() == 0) {
      this.fightersLose();
      return;
    }

    // Switch turn.
    readyToNextTurn();

    // Do this routine again.
    cycleTurn();
  }
}
