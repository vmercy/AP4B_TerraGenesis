package game;

/**
 * ConditionEvolution represent the evolution of one condition
 */
public class ConditionEvolution {
  private String m_conditionName;
  private double m_evolution; 
  
  public ConditionEvolution()
  {
    m_conditionName = "";
    m_evolution = 0.0;
  }

  public ConditionEvolution(String conditionName_p, double conditionEvolution_p)
  {
    m_conditionName = conditionName_p;
    m_evolution = conditionEvolution_p;
  }

  public double getEvolution()
  {
    return m_evolution;
  }
}
