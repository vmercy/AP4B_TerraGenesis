package game;

public class Mission {

  /**
   * @brief default constructor
   */
  public Mission()
  {
    m_title = "";
    m_description = "";
    m_reward = 0.0;
    m_completed = false;
  }

  /**
   * @brief constructor with given title, description and reward
   * @param title_p title of the mission
   * @param description_p description of the mission
   * @param reward_p reward associated with the mission
   */
  public Mission(String title_p, String description_p, double reward_p)
  {
    super();
    m_title = title_p;
    m_description = description_p;
    m_reward = reward_p;
  }

  /**
   * title of the mission
   */
  private String m_title;
  /**
   * description of the mission
   */
  private String m_description;
  /**
   * reward associated with the mission
   */
  private double m_reward;
  /**
   * true if the mission is completed
   */
  private boolean m_completed;

  /**
   * 
   * @return true if the mission is Achieved
   */
  public boolean isCompleted()
  {
    return m_completed;
  }

  public String getTitle()
  {
    return m_title;
  }

  public String getDescription()
  {
    return m_description;
  }

  public double getReward()
  {
    return m_reward;
  }

  public void complete()
  {
    this.m_completed = true;
  }
}
