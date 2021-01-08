package game.Species;

public class AquaticMammal extends Animal {

  public AquaticMammal()
  {
    this.m_price = 50.0;
    this.m_name = "Aquatic Mammal";
    this.addPrey("Small Fish");
    this.addPrey("Shrimp");
  }

}