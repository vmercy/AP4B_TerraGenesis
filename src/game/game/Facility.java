package game;

import java.util.Vector;

public class Facility {
  
  /**
   * name of facility entered by the player
   */
  protected String m_name;
  protected double m_price;
  protected ConditionEvolutions m_conditionEvolutions;
  protected Vector<String> m_necessaryMaterials;

  public Facility()
  {
    m_conditionEvolutions = new ConditionEvolutions();
    m_necessaryMaterials = new Vector<String>();
    m_name = "";
  }

  /**
   * create a facility and update given planet conditions
   * @param name_p custom name provided by user
   * @param planet_p
   */
  public Facility(String name_p, PlanetAtmosphere planet_p)
  {
    this();
    setName(name_p);
    updateConditions(planet_p);
  }

  public void setName(String newName_p) //TODO : add textfield to interface
  {
    m_name = newName_p;
  }

  public String getName()
  {
    return m_name;
  }

  /**
   * updates planet conditions after facility creation
   * @param planet_p
   */
  public void updateConditions(PlanetAtmosphere planet_p)
  {
    for (ConditionEvolution condEvol : m_conditionEvolutions.getConditionEvolutions()) {
      planet_p.findCondition(condEvol.getConditionName()).increment(condEvol.getEvolution());
    }
  }

  /**
   * builds a facility if the player has enough money and the necessary building materials
   * @param m_currentMoney current money amount owned by player
   * @param m_currentBuildingMaterials current building materials owned by the player
   * @return true if build is possible
   * @note this methods does not add any element to the corresponding city vector attribute
   */
  public boolean build(Money m_currentMoney, BuildingMaterials m_currentBuildingMaterials)
  {
    for (String necessaryMaterial : m_necessaryMaterials) {
      if(!m_currentBuildingMaterials.getMaterial(necessaryMaterial).isOwned())  
        return false;
    } 
    if(m_currentMoney.getAmount()<this.m_price)
      return false;
    return true;
  }

}
