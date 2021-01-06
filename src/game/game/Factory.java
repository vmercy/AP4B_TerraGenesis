package game;

public class Factory {
  
    private String m_name;
    
    private double m_biomassGain = 2.0;
  
  Factory()
  {
    m_name = "BLA";
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