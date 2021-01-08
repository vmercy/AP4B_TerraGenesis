
package game.Species;

public class Shark extends Fish {

  public Shark() {
    m_price = 500.0;
    m_name = "Shark";
    addPrey("Aquatic Mammal");
    addPrey("Tuna");
  }

}