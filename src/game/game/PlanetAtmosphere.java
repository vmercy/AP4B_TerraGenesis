package game;

import java.util.Vector;

public class PlanetAtmosphere
{
  private static int NBCONDITIONS = 5;

  public PlanetAtmosphere()
  {
    m_conditions = new Vector<Condition>(NBCONDITIONS);
    m_conditions.add(new Condition("Temperature", "Temperature of planet atmosphere"));
    
  }

  private Vector<Condition> m_conditions;

  private Condition findCondition(String conditionName_p)
  {
    for (Condition condition : m_conditions) {
      if(condition.getName()==conditionName_p)
        return condition;
    }
    return null;
  }

  public boolean incrementCondition(String conditionName_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.increment();
      return true;
    }
    return false;
  }

  public boolean decrementCondition(String conditionName_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.decrement();
      return true;
    }
    return false;
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

  public boolean decrementCondition(String conditionName_p, double value_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.decrement(value_p);
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