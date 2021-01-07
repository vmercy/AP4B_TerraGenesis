package game;

import java.util.Vector;

public class City {
  private Vector<Factory> m_factories;
  private Vector<Dormitory> m_dormitories;
  private Vector<OxygenSupply> m_oxygenSupplies;
  private Vector<BotanicGarden> m_botanicGardens;
  private Vector<EnergyPlant> m_energyPlants;
  private Vector<Laboratory> m_laboratories;

  public City()
  {
    m_factories = new Vector<Factory>();
    m_dormitories = new Vector<Dormitory>();
    m_oxygenSupplies = new Vector<OxygenSupply>();
    m_botanicGardens = new Vector<BotanicGarden>();
    m_energyPlants = new Vector<EnergyPlant>();
    m_laboratories = new Vector<Laboratory>();
  }
}
