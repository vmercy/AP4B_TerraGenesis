package game;

public class Factory extends Facility {
  
  Factory()
  {
    this.m_price = 600.0;
    this.m_name = "Factory";
    this.m_conditionEvolutions.add("Water", -0.5);
    this.m_conditionEvolutions.add("Temperature", -0.5);
    this.m_conditionEvolutions.add("Oxygen", -0.8);
    this.m_conditionEvolutions.add("CarbonDioxide", +1.2);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", -0.4);
  }

}