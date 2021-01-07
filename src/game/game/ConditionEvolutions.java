package game;

import java.util.Vector;

public class ConditionEvolutions {
  private Vector<ConditionEvolution> m_conditionEvolutions;

  public ConditionEvolutions()
  {
    m_conditionEvolutions = new Vector<ConditionEvolution>();
  }

  public void add(String conditionName_p, double evolution_p)
  {
    m_conditionEvolutions.add(new ConditionEvolution(conditionName_p, evolution_p));
  }
}
