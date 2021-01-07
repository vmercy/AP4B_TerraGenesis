package game;

import java.util.Vector;

public class City {
  private Vector<Factory> m_factories;
  private Vector<Dormitory> m_dormitories;
  private Vector<OxygenSupply> m_oxygenSupplies;
  private Vector<BotanicGarden> m_botanicGardens;
  private Vector<EnergyPlant> m_energyPlants;
  private Vector<Laboratory> m_laboratories;

  private final int NB_FACILITIES_TYPE = 6;

  public City()
  {
    m_factories = new Vector<Factory>();
    m_dormitories = new Vector<Dormitory>();
    m_oxygenSupplies = new Vector<OxygenSupply>();
    m_botanicGardens = new Vector<BotanicGarden>();
    m_energyPlants = new Vector<EnergyPlant>();
    m_laboratories = new Vector<Laboratory>();
  }

  private Vector<Facility> getFacilitiesSample()
  {
    Vector<Facility> sample = new Vector<Facility>(NB_FACILITIES_TYPE);
    sample.add(new Dormitory());
    sample.add(new OxygenSupply());
    sample.add(new Laboratory());
    sample.add(new Factory());
    sample.add(new EnergyPlant());
    sample.add(new BotanicGarden());
    return sample;
  }

  public String[] getFacilitiesNames()
  {
    String[] facilitesNames = new String[NB_FACILITIES_TYPE];
    Vector<Facility> facilitiesSample = getFacilitiesSample();
    for (Facility sample : facilitiesSample) {
      facilitesNames[facilitiesSample.indexOf(sample)] = sample.getName();
    }
    return facilitesNames;
  }

  public void buildFactory()
  {

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
