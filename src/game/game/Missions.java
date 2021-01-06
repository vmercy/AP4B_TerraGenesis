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
    m_missionsList.add(new Mission("Ajouter un animal","Ajouter un animal à la planète",500));
    m_missionsList.add(new Mission("Construire une usine","Ajouter une usine dans la ville",500));
    m_missionsList.add(new Mission("Construire un laboratoire ","Ajouter un laboratoire dans la ville pour débloquer l'achat d'animaux",500));
    m_missionsList.add(new Mission("Construire un jardin botanique","Ajouter un jardin botanique dans la ville pour débloquer l'achat de végétaux",500));
    m_missionsList.add(new Mission("Construire un dortoir","Ajouter un dortoir à la ville pour abriter les colons",500));
    m_missionsList.add(new Mission("Acheter un matériau ","Acheter un matériau de construction pour construire des bâtiments",500));
    m_missionsList.add(new Mission("Acheter un arbre","Acheter un arbre pour permettre la photosynthèse",500));
    m_missionsList.add(new Mission("Atteindre 25 % de conditions atmosphériques ","Atteindre 25% de conditions remplies ",500));
    m_missionsList.add(new Mission("Atteindre 50 % de conditions atmosphériques ","Atteindre 50% de conditions remplies ",500));
    m_missionsList.add(new Mission("Atteindre 75 % de conditions atmosphériques ","Atteindre 75% de conditions remplies ",500));
    m_missionsList.add(new Mission("Atteindre 100 % de conditions atmosphériques ","Atteindre 100% de conditions remplies ",500));
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
