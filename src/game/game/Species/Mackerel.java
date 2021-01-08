
package game.Species;

public class Mackerel extends Fish {

  public Mackerel()
  {
    m_price = 120.0;
    m_name = "Mackerel";
    this.addPrey("Small Fish");
    this.addPrey("Shrimp");
  }
}