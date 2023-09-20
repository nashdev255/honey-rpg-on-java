/**
 * @file Main.java
 * @author nashdev255
 * @brief Compile this file and execute to demonstrate.
 */

import java.util.ArrayList;

import Characters.Fighters.Fighter;
import Characters.Monsters.Monster;

class Main {
  public static void main(String[] Args) {
    Fighter lumine = new Fighter("Lumine", 1000, 100, 100, 100, 1, "eclipse");
    Monster slime  = new Monster("Slime", 1000, 100, 100, 100, 1);

    ArrayList<Fighter> fighters = new ArrayList<>();
    ArrayList<Monster> monsters = new ArrayList<>();
    fighters.add(lumine);
    monsters.add(slime);

    BattleField battleField = new BattleField(fighters, monsters);
  }
}
