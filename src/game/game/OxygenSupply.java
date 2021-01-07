package game;

public class OxygenSupply extends Facility
{
  public OxygenSupply()
  {
    this.m_conditionEvolutions.add("Water", -0.5);
    this.m_conditionEvolutions.add("Temperature", +0.4);
    this.m_conditionEvolutions.add("Oxygen", +1.5);
    this.m_conditionEvolutions.add("CarbonDioxide", -0.5);
    this.m_conditionEvolutions.add("Pressure", -0.5);
    this.m_conditionEvolutions.add("Biomass", 0.0);
  }
}
