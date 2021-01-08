
package game.Species;

import javax.swing.*;

public class Plant extends Vegetal {

  public Plant()
  {
    m_price = 50.0;
    this.m_name= "Plant";
    this.m_conditionEvolutions.add("Water", 0.0);
    this.m_conditionEvolutions.add("Temperature", 0.0);
    this.m_conditionEvolutions.add("Oxygen", +1.52);
    this.m_conditionEvolutions.add("Carbon dioxide", +0.2);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);
  }
  
}