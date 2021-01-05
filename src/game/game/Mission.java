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
  private boolean m_achieved;

  /**
   * 
   * @return true if the mission is Achieved
   */
  public boolean isAchieved()
  {
    return m_achieved;
  }




    /**
     * @param index_p index of mission to evaluate
     * @return true if the mission is Achieved
     */
  public boolean isAchieved(int index_p)
  {

      return true;
  }
  
}
