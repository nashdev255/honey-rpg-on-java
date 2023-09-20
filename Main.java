/**
 * @file Main.java
 * @author nashdev255
 * @brief Compile this file and execute to demonstrate.
 */

import Characters.Fighters.Fighter;

class Main {
  public static void main(String[] Args) {
    Fighter character = new Fighter("Lumine", 1000, 100, 100, 100, 1);
    character.printStatus();
  }
}
