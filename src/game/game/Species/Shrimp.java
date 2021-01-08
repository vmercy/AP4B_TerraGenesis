
package game.Species;

public class Shrimp extends Fish {
  public Shrimp()
  {
    this.m_price = 30.0;
    this.m_name = "Shrimp";
    addPrey("Single Cell Organism");
  }
}