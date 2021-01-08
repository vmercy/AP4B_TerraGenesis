package game;

public class BotanicGarden extends Facility
{
  public BotanicGarden()
  {
    this.m_price = 1200.0;
    this.m_name = "Botanic Garden";
    this.m_conditionEvolutions.add("Water", +3.9);
    this.m_conditionEvolutions.add("Temperature", +0.0);
    this.m_conditionEvolutions.add("Oxygen", +5.2);
    this.m_conditionEvolutions.add("Carbon dioxide", 0.0);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", +6.4);

    this.m_necessaryMaterials.add("Wood");
    this.m_necessaryMaterials.add("Metal");
  }
}
