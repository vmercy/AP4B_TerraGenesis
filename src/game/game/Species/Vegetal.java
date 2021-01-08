
package game.Species;

import javax.swing.*;

import game.Money;

public class Vegetal extends Species {

  public Vegetal() {

  }

  /**
   * @return -1 if there is no insect
   * @return 0 if the player is out of money
   * @return 1 if the player can buy the vegetal
   */
  public int canBuy(Animals animals_p, Money currentMoney_p) {
    if (!animals_p.hasInsect())
      return 0;
    if (m_price > currentMoney_p.getAmount())
      return -1;
    currentMoney_p.sub(m_price);
    return 1;
  }

}