/**
 * @file Main.java
 * @author nashdev255
 * @brief Compile this file and execute to demonstrate.
 */

import Characters.Character;

class Main {
  public static void main(String[] Args) {
    Character character = new Character("Lumine", 1000, 100, 100, 100);
    character.printStatus();
  }
}
