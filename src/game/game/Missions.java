package game;

import java.util.Vector;
import java.awt.Color;

public class Missions {
  private Mission m_currentMission;
  private final byte nbMissionsTotal = 12;
  private Vector<Mission> m_missionsList;
  
  public Missions()
  {
    m_missionsList = new Vector<Mission>(nbMissionsTotal);
    this.fill();
    m_currentMission = m_missionsList.get(0);
  }

  public Mission getCurrentMission()
  {
    return m_currentMission;
  }
  
  private byte getNbMissions()
  {
    return (byte)m_missionsList.size();
  }

  /**
   * @brief completes current mission and set current mission to next one
   */
  public void nextMission()
  {
    //TODO: skip already completed missions
    //m_currentMission.complete();
    byte nextMissionIndex = (byte) m_missionsList.indexOf(m_currentMission);
    nextMissionIndex++;
    if(nextMissionIndex<getNbMissions())
    {
      m_currentMission = m_missionsList.get(nextMissionIndex);
    }
  }

  private Mission findMission(String missionName_p)
  {
    for (Mission mission : m_missionsList) {
      if(mission.getTitle()==missionName_p)
        return mission;
    }
    return null;
  }

  /**
   * completes targetted mission
   * @param missionName_p name of target mission
   * @return true if target was found
   */
  public boolean setCompleted(String missionName_p)
  {
    Mission target = findMission(missionName_p);
    if(target!=null)
      target.complete();
    else
      return false;
    return true;
  }

  public double getReward(String missionName_p)
  {
    return findMission(missionName_p).getReward();
  }

  public String getDescription(String missionName_p)
  {
    return findMission(missionName_p).getDescription();
  }
  
  public void fill()
  {
    m_missionsList.add(new Mission("Add animal","Add an animal to the planet",500.0));
    m_missionsList.add(new Mission("Build a factory","Add a factory in the city",500));
    m_missionsList.add(new Mission("Build a laboratory","Add a laboratory in the city to unlock the purchase of animals",500));
    m_missionsList.add(new Mission("Build a botanical garden","Add a botanical garden in the city to unlock the purchase of plants",500));
    m_missionsList.add(new Mission("Build a dormitory","Add a dormitory to the city to house the settlers",500));
    m_missionsList.add(new Mission("Buy a material","Buy building material to construct buildings",500));
    m_missionsList.add(new Mission("Buy a tree","Buy a tree to allow photosynthesis",500));
    m_missionsList.add(new Mission("Reach 25% on all atmospheric conditions","Achieve 25% of conditions",500));
    m_missionsList.add(new Mission("Reach 50% on all atmospheric conditions","achieve 50% of conditions",500));
    m_missionsList.add(new Mission("Reach 75% on all atmospheric conditions","Achieve 75% of conditions",500));
    m_missionsList.add(new Mission("Achieve 100% atmospheric conditions","Achieve 100% of conditions",500));
  }

  /**
   * @brief return the color representation that corresponds to the missions completion status from red to green
   */
  public Color getColor()
  {
    byte red, green;
    double achievement = percentAchieved();
    red = (byte) (255-(achievement*255));
    green = (byte) (255 * achievement);
    return (new Color(red, green, 0));
  }

  public int nbMissionsAchieved()
  {
    int nb = 0;
    for(Mission mission: m_missionsList)
    {
      if(mission.isCompleted())
        nb++;
    }
    return nb;
  }

  public double percentAchieved()
  {
    return (double)nbMissionsAchieved()/getNbMissions();
  }
}