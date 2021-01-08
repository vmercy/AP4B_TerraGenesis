package game;

import java.util.Vector;


public class PlanetAtmosphere
{
  private Vector<Condition> m_conditions;
  private static int NBCONDITIONS = 6;

  public PlanetAtmosphere()
  {
    m_conditions = new Vector<Condition>(NBCONDITIONS);
    m_conditions.add(new Condition("Water", 0.0, 0.20, 0.20, 100.0));
    m_conditions.add(new Condition("Temperature", 0.0, 0.20, 0.20, 100.0));
    m_conditions.add(new Condition("Oxygen",0.0, 0.20, 0.20, 100.0));
    m_conditions.add(new Condition("Carbon dioxide", 0.0, 0.20, 0.20, 100.0));
    m_conditions.add(new Condition("Pressure", 0.0, 0.20, 0.20, 100.0));
    m_conditions.add(new Condition("Biomass", 0.0, 0.15, 0.15, 100.0));
  }

  /**
   * 
   * @param threshold_p threshold in percent
   * @return true if all conditions are avobe the threshold
   */
  public boolean areAllConditionsAbove(int threshold_p)
  {
    for (Condition condition : m_conditions) {
      if(condition.getCurrentValuePercent()<threshold_p)
        return false;
    }
    return true;
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

  /**
   * get current condition value from condition name
   * @param conditionName_p condition name
   * @return condition value
   */
  public double getConditionValue(String conditionName_p)
  {
    return findCondition(conditionName_p).getCurrentValue();
  }
 
  public double getConditionValuePercent(String conditionName_p)
  {
    return findCondition(conditionName_p).getCurrentValuePercent();
  }
}