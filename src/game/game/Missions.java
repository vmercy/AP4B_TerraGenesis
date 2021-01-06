package game;

import java.util.Vector;

public class Missions {
  
  
  private final byte nbMissionsTotal = 12;
  private Vector<Mission> m_missionsList;
  
  public Mission()
  {
    m_missionsList = new Vector<Mission>();

  }
  
  public void fill()
  {
    m_missionsList.add(new Mission("Ajouter d'animal","Ajouter un animal à la planète",500)); //TODO
    m_missionsList.add(new Mission("Construire une usine","Ajouter une usine dans la ville",500)); //TODO
    m_missionsList.add(new Mission("Construire un laboratoire ","Ajouter un laboratoire dans la ville pour débloquer l'achat d'animaux",500)); //TODO
    m_missionsList.add(new Mission("Construire un jardin botanique","Ajouter un jardin botanique dans la ville pour débloquer l'achat de végétaux",500)); //TODO
    m_missionsList.add(new Mission("Construire un dortoir","Ajouter un dortoir à la ville pour abriter les colons",500)); //TODO
    m_missionsList.add(new Mission("Acheter un matériau ","Acheter un matériau de construction pour construire des bâtiments",500)); //TODO
    m_missionsList.add(new Mission("Acheter un arbre","Acheter un arbre pour permettre la photosynthèse",500)); //TODO
    m_missionsList.add(new Mission("Atteindre 25 % de conditions atmosphériques ","Atteindre 25% de conditions remplies ",500)); //TODO
    m_missionsList.add(new Mission("Atteindre 50 % de conditions atmosphériques ","Atteindre 50% de conditions remplies ",500)); //TODO
    m_missionsList.add(new Mission("Atteindre 75 % de conditions atmosphériques ","Atteindre 75% de conditions remplies ",500)); //TODO
    m_missionsList.add(new Mission("Atteindre 100 % de conditions atmosphériques ","Atteindre 100% de conditions remplies ",500)); //TODO
  }

  public int nbMissionsAchieved()
  {
    int nb = 0;
    for(Mission mission: m_missionsList)
    {
      if(mission.isAchieved())
        nb++;
    }
    return nb;
  }

  public double percentAchieved()
  {
    return (double)nbMissionsAchieved()/nbMissionsTotal;
  }

  
}
