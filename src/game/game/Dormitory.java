package game;

public class Dormitory extends Facility {
  public Dormitory() {
    this.m_price = 300.0;
    this.m_name= "Dormitory";
    this.m_conditionEvolutions.add("Water", 0.0);
    this.m_conditionEvolutions.add("Temperature", +0.5);
    this.m_conditionEvolutions.add("Oxygen", 0.0);
    this.m_conditionEvolutions.add("Carbon dioxide", 0.0);
    this.m_conditionEvolutions.add("Pressure", 0.0);
    this.m_conditionEvolutions.add("Biomass", 0.0);

    this.m_necessaryMaterials.add("Wood");
    this.m_necessaryMaterials.add("Concrete");
  }
}
