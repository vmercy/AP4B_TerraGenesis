
package game.Species;

import javax.swing.*;

public class Tree extends Vegetal {

  public Tree()
  {
    this.m_price = 150.0;
    this.m_name= "Tree";
    //TODO: delete condition evolutions with zero value (do the same for facilities)
    this.m_conditionEvolutions.add("Water", 0.0);
    this.m_conditionEvolutions.add("Temperature", +0.5);
    this.m_conditionEvolutions.add("Oxygen", +5.12);
    this.m_conditionEvolutions.add("Carbon dioxide", +1.0);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);
  }

}