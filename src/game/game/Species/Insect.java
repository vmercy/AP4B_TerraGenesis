package game.Species;

public class Insect extends Animal {
  public Insect()
  {
    m_price = 20.0;
    m_name = "Insect";
    addPrey("Single Cell Organism");
  }

}