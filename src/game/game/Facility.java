package game;

import java.util.Vector;

public class Facility {
  
  /**
   * name of facility entered by the player //TODO : add textfield to interface
   */
  private String m_name;
  protected ConditionEvolutions m_conditionEvolutions;

  public Facility()
  {
    m_conditionEvolutions = new ConditionEvolutions();
  }

}
