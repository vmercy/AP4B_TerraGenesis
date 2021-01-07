package game;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JOptionPane;

public class PlanetAtmosphere
{
  private Vector<Condition> m_conditions;
  private static int NBCONDITIONS = 6;

  public PlanetAtmosphere()
  {
    m_conditions = new Vector<Condition>(NBCONDITIONS);
    //TODO: adjust parameters for each condition
    m_conditions.add(new Condition("Water", "Amount of water in the planet", 0.0, 0.20, 0.20, 1.0));
    m_conditions.add(new Condition("Temperature", "Temperature of planet atmosphere", 0.0, 0.20, 0.20, 1.0));
    m_conditions.add(new Condition("Oxygen", "Oxygen rate in the air", 0.0, 0.20, 0.20, 1.0));
    m_conditions.add(new Condition("Carbon dioxide", "Carbon dioxide rate in the air", 0.0, 0.20, 0.20, 1.0));
    m_conditions.add(new Condition("Pressure", "Atmosphere of the planet", 0.0, 0.20, 0.20, 1.0));
    m_conditions.add(new Condition("Biomass", "Energy obtained from factories", 0.0, 0.15, 0.15, 1.0));
  }

  public Vector<Condition> getConditions()
  {
	  return m_conditions;
  }
  
  public Condition findCondition(String conditionName_p)
  {
    for (Condition condition : m_conditions) {
      if(condition.getName()==conditionName_p)
        return condition;
    }
    return null;
  }

  public boolean incrementCondition(String conditionName_p, double value_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.increment(value_p);
      return true;
    }
    return false;
  }  

  /**
   * @return number of currently completed conditions
   * TODO: use for missions : e.g. complete a mission when 2 conditions are completed simultaneously
   */
  public int nbCompleted()
  {
    int nb = 0;
    for (Condition condition : m_conditions) {
      if(condition.isCompleted())
        nb++;
    }
    return nb;
  }
  
  public boolean isAllCompleted()
  {
    return (nbCompleted() == NBCONDITIONS);
  }
 
}