package game.Species;

import game.Money;

public abstract class Animal extends Species {

  private static final int NB_ANIMAL_TYPES = 9;
  private String[] m_preys;

  public Animal() {
    m_preys = new String[NB_ANIMAL_TYPES];
    for (int i = 0; i < NB_ANIMAL_TYPES; i++)
      m_preys[i] = "";
  }

  /**
   * adds a new prey to the animal preys collection
   */
  protected void addPrey(String newPrey_p) {
    int i = 0;
    for (i = 0; m_preys[i] != ""; i++)
      ;
    m_preys[i] = newPrey_p;
  }

  private boolean checkPreys(Animals currentAnimals) {
    for (String string : m_preys) {
      if (string != "" && !currentAnimals.findAnimal(string))
        return false;
    }
    return true;
  }

  /**
   * @return -1 if at least one prey is missing
   * @return 0 if the player is out of money
   * @return 1 if the player can buy the animal
   */
  public int canBuy(Animals currentAnimals_p, Money currentMoney_p) {
    if (!checkPreys(currentAnimals_p))
      return 0;
    if (m_price > currentMoney_p.getAmount())
      return -1;
    return 1;
  }

}