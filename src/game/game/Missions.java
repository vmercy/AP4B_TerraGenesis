package game;

import java.util.Vector;

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

  /**
   * @brief completes current mission and set current mission to next one
   */
  public void nextMission()
  {
    m_currentMission.complete();
    byte nextMissionIndex = (byte) m_missionsList.indexOf(m_currentMission);
    nextMissionIndex++;
    m_currentMission = m_missionsList.get(nextMissionIndex);
  }

  private Mission findMission(String missionName_p)
  {
    for (Mission mission : m_missionsList) {
      if(mission.getTitle()==missionName_p)
        return mission;
    }
    return null;
  }

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
    m_missionsList.add(new Mission("Add animal","Add an animal to the planet",500));
    m_missionsList.add(new Mission("Build a factory","Add a factory in the city",500));
    m_missionsList.add(new Mission("Build a laboratory","Add a laboratory in the city to unlock the purchase of animals",500));
    m_missionsList.add(new Mission("Build a botanical garden","Add a botanical garden in the city to unlock the purchase of plants",500));
    m_missionsList.add(new Mission("Construire un dortoir","Add a dormitory to the city to house the settlers",500));
    m_missionsList.add(new Mission("Buy a material ","Buy building material to construct buildings",500));
    m_missionsList.add(new Mission("Buy a tree","Buy a tree to allow photosynthesis",500));
    m_missionsList.add(new Mission("Reach 25% atmospheric conditions ","Achieve 25% of conditions met ",500));
    m_missionsList.add(new Mission("Reach 50% atmospheric conditions ","Reach 50% of conditions met ",500));
    m_missionsList.add(new Mission("Reach 75% atmospheric conditions ","Achieve 75% of conditions met ",500));
    m_missionsList.add(new Mission("Achieve 100% atmospheric conditions ","Achieve 100% of conditions met ",500));
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
    return (double)nbMissionsAchieved()/nbMissionsTotal;
  }
}
