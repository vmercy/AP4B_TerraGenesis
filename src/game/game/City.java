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

  public Vector<Factory> getFactories()
  {
    return m_factories;
  }
  public Vector<Dormitory> getDormitories()
  {
    return m_dormitories;
  }
  public Vector<OxygenSupply> getOxygenSupplies()
  {
    return m_oxygenSupplies;
  }
  public Vector<BotanicGarden> getBotanicGardens()
  {
    return m_botanicGardens;
  }
  public Vector<EnergyPlant> getEnergyPlants()
  {
    return m_energyPlants;
  }
  public Vector<Laboratory> getLaboratories()
  {
    return m_laboratories;
  }
}
