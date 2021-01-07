package game;

import java.util.Vector;

public class Facility {
  
  /**
   * name of facility entered by the player
   */
  private String m_name;
  protected ConditionEvolutions m_conditionEvolutions;
  protected Vector<String> m_necessaryMaterials;

  public Facility()
  {
    m_conditionEvolutions = new ConditionEvolutions();
    m_necessaryMaterials = new Vector<String>();
    m_name = "";
  }

  public void setName(String newName_p) //TODO : add textfield to interface
  {
    m_name = newName_p;
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
    return true;
  }

}
