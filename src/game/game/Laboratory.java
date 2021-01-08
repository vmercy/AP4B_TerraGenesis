package game;

public class Laboratory extends Facility {
  public Laboratory()
  {
    this.m_price = 1000.0;
    this.m_name = "Laboratory";
    this.m_conditionEvolutions.add("Water", +2.5);
    this.m_conditionEvolutions.add("Temperature", +2.0);
    this.m_conditionEvolutions.add("Oxygen", +3.4);
    this.m_conditionEvolutions.add("Carbon dioxide", 0.0);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", +4.8);

    this.m_necessaryMaterials.add("Concrete");
    this.m_necessaryMaterials.add("Gold");
  }
}
