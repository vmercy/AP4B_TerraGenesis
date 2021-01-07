package game;

public class Factory extends Facility {
  
    private String m_name;
    
    private double m_biomassGain = 2.0; //TODO: remove
  
  Factory()
  {
    this.m_conditionEvolutions.add("Water", -0.5);
    this.m_conditionEvolutions.add("Temperature", -0.5);
    this.m_conditionEvolutions.add("Oxygen", -0.8);
    this.m_conditionEvolutions.add("CarbonDioxide", +1.2);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", -0.4);
  }

  Factory(String name_p)
  {
    m_name = name_p;
  }

  Factory(String name_p, double biomassGain_p)
  {
    m_name = name_p;
    m_biomassGain = biomassGain_p;
  }
  
  public double getBiomassGain()
  {
    return m_biomassGain;
  }

  public String getName()
  {
    return this.m_name;
  }  
}