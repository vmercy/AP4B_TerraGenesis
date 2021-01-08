
package game;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JOptionPane;

import game.Species.Animal;
import game.Species.Species;
import game.Species.Vegetal;

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
    m_animals = new Vector<Species>();
    m_vegetals = new Vector<Species>();
    m_humans = new Vector<Species>();
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
  private Vector<Species> m_animals;
  private Vector<Species> m_vegetals;
  private Vector<Species> m_humans;

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

  /**
   * @param Animal animal_p
   * @brief Lorsque qu'une esp�ce animale est instaur�e avec succ�s sur la
   *        plan�te, la jauge de Co2 monte
   */

  public void animalSpeciesIntroduced(Animal animal_p) {
    if (m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() < 100) {
      m_planet.m_planetAtmosphere.incrementCondition("Carbon dioxide", animal_p.getcarbonDioxideProduced());
    }

    if (m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() >= 100) {
      m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").setCurrentValue(1);
    }
  }

  /**
   * @param Vegetal vegetal_p
   * @brief Lorsque qu'une esp�ce v�g�tale est instaur�e avec succ�s sur la
   *        plan�te, la jauge d'O2 monte
   */

  public void vegetalSpeciesIntroduced(Vegetal vegetal_p) {
    if (m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() < 100) {
      m_planet.m_planetAtmosphere.incrementCondition("Oxygen", vegetal_p.getOxygenGiven());
    }

    if (m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() >= 100) {
      m_planet.m_planetAtmosphere.findCondition("Oxygen").setCurrentValue(1);
    }
  }

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
