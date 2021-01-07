package game;

public class Laboratory extends Facility {
  public Laboratory()
  {
    this.m_conditionEvolutions.add("Water", +0.5);
    this.m_conditionEvolutions.add("Temperature", +0.0);
    this.m_conditionEvolutions.add("Oxygen", +0.4);
    this.m_conditionEvolutions.add("CarbonDioxide", -0.2);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", +0.8);
  }
}
