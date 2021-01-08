
package game.Species;

import javax.swing.*;

public class SmallFish extends Fish {

  public SmallFish() {
    m_price = 50.0;
    m_name = "Small Fish";
    this.addPrey("Shrimp");
    this.addPrey("Single Cell Organism");
  }

}