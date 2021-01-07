package game;

public class EnergyPlant extends Facility
{
  public EnergyPlant()
  {
    this.m_price = 500.0;
    this.m_name = "Energy plant";
    this.m_conditionEvolutions.add("Water", -1.5);
    this.m_conditionEvolutions.add("Temperature", +1.1);
    this.m_conditionEvolutions.add("Oxygen", +0.8);
    this.m_conditionEvolutions.add("CarbonDioxide", +0.8);
    this.m_conditionEvolutions.add("Pressure", -0.2);
    this.m_conditionEvolutions.add("Biomass", -0.1);
  }
}
