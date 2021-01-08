package game;

public class OxygenSupply extends Facility
{
  public OxygenSupply()
  {
    this.m_price = 1500.0;
    this.m_name = "Oxygen Supply";
    this.m_conditionEvolutions.add("Water", +5.0);
    this.m_conditionEvolutions.add("Temperature", +3.4);
    this.m_conditionEvolutions.add("Oxygen", +5.5);
    this.m_conditionEvolutions.add("Carbon dioxide", 0.0);
    this.m_conditionEvolutions.add("Pressure", +4.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);

    this.m_necessaryMaterials.add("Metal");
    this.m_necessaryMaterials.add("Concrete");
    this.m_necessaryMaterials.add("Iron");
  }
}
