
package game.Species;

public class Tuna extends Fish {

  public Tuna() {
    m_price = 100.0;
    m_name = "Tuna";
    this.addPrey("Mackerel");
    this.addPrey("Small Fish");

  }

}