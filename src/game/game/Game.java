
package game;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JOptionPane;

import game.Species.Animals;
import game.Species.Species;
import game.Species.Vegetals;

public class Game {

  /**
   * @param None
   * @brief Lors de l'initialisation de Game, les param�tres sont d�finis � 0
   *        (jauge de progression en %)
   */

  public Game() {
    m_buildingMaterials = new BuildingMaterials();
    m_missions = new Missions();
    m_money = new Money();
    m_city = new City();
    m_planet = new Planet();
    m_conditionThread = new ConditionThread();
    m_conditionThread.start();
    m_animals = new Animals();
    m_vegetals = new Vegetals();
    //m_humans = new Humans();
  }

  private class CompleteMissions extends Thread {

    @Override
    public void run() {
      while (true) {

        // remplir pour chaque mission

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          e1.printStackTrace();
        }
      }
    }
  }

  private Missions m_missions;
  private Planet m_planet;
  private BuildingMaterials m_buildingMaterials;
  private Money m_money;
  private City m_city;
  private ConditionThread m_conditionThread;
  private Animals m_animals;
  private Vegetals m_vegetals;
  //private Humans m_humans;

  public City getCity() {
    return m_city;
  }

  public Planet getPlanet() {
    return m_planet;
  }

  public Missions getMissions() {
    return m_missions;
  }

  public Money getMoney() {
    return m_money;
  }

  public BuildingMaterials getMaterials() {
    return m_buildingMaterials;
  }

  public Animals getAnimals()
  {
    return m_animals;
  }

  public Vegetals getVegetals()
  {
    return m_vegetals;
  }

  /*
  public Humans getHumans()
  {
    return m_humans;
  }
  */

  public class ConditionThread extends Thread {
    Vector<Condition> conditions = m_planet.getPlanetAtmosphere().getConditions();

    boolean allCompleted = false;

    public void run() {

      while (true) {

        for (Condition condition : conditions) {
          if(!condition.getDisplayed() && condition.getCurrentValuePercent()>=100)
            {
              JOptionPane.showMessageDialog(null, "Parameter " + condition.getName() + " conducive to life !");
              condition.setDisplayed();
            }
        }

        if (m_planet.m_planetAtmosphere.isAllCompleted() && !allCompleted) {
          JOptionPane.showMessageDialog(null,
              "All the parameters conducive to life are there! You can now add humans to the planet");
          allCompleted = true;
        }

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          e1.printStackTrace();
        }
      }
    }
  }

}
