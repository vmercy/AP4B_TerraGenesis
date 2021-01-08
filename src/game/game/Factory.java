package game;

public class Factory extends Facility {
  
  Factory()
  {
    this.m_price = 600.0;
    this.m_name = "Factory";
    this.m_conditionEvolutions.add("Water", 0.0);
    this.m_conditionEvolutions.add("Temperature", 0.0);
    this.m_conditionEvolutions.add("Oxygen", 0.0);
    this.m_conditionEvolutions.add("Carbon dioxide", +3.2);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);

    this.m_necessaryMaterials.add("Metal");
    this.m_necessaryMaterials.add("Concrete");
    this.m_necessaryMaterials.add("Zinc");
    this.m_necessaryMaterials.add("Iron");
  }

}