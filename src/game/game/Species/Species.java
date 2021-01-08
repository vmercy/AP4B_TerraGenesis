package game.Species;

import game.ConditionEvolutions;
import game.ConditionEvolution;
import game.PlanetAtmosphere;

public class Species {

  protected String m_name;
  protected double m_price;

  protected ConditionEvolutions m_conditionEvolutions;

  public Species() {
    m_conditionEvolutions = new ConditionEvolutions();
  }

  public Species(PlanetAtmosphere planet_p) {
    this();
    updateConditions(planet_p);
  }


  /**
   * updates planet conditions after species creation
   * @param planet_p
   */
  public void updateConditions(PlanetAtmosphere planet_p)
  {
    for (ConditionEvolution condEvol : m_conditionEvolutions.getConditionEvolutions()) {
      planet_p.findCondition(condEvol.getConditionName()).increment(condEvol.getEvolution());
    }
  }

  public double getPrice() {
    return m_price;
  }

  public String getName() {
    return m_name;
  }
}
