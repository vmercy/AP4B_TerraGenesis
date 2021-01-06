package game;

public class Mission {

  Mission()
  {

  }

  /**
   * title of the mission
   */
  private String m_title;
  private String m_description;
  private double m_reward;
  private boolean m_achieved;

  /**
   * 
   * @return true if the mission is Achieved
   */
  public boolean isAchieved()
  {
    return m_achieved;
  }

  public String getTitle()
  {
    return m_title;
  }

  public String getDescription()
  {
    return m_description;
  }

}
