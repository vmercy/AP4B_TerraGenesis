package game;

public class EnergyPlant extends Facility {
  public EnergyPlant() {
    this.m_price = 500.0;
    this.m_name = "Energy Plant";
    this.m_conditionEvolutions.add("Water", +2.5);
    this.m_conditionEvolutions.add("Temperature", +3.1);
    this.m_conditionEvolutions.add("Oxygen", +2.8);
    this.m_conditionEvolutions.add("Carbon dioxide", +2.8);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);

    this.m_necessaryMaterials.add("Wood");
    this.m_necessaryMaterials.add("Metal");
    this.m_necessaryMaterials.add("Zinc");
    this.m_necessaryMaterials.add("Copper");
    this.m_necessaryMaterials.add("Iron");
    this.m_necessaryMaterials.add("Gold");
  }
}
