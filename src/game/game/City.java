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

  public Facility createFacilityFromType(String type_p)
  {
    for (Facility facility : getFacilitiesSample()){
      if(facility.getName()==type_p)
        return facility;
    }
    return null;
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

  /**
   * add facility to the appropriate vector
   * @param facilityType_p
   * @param facility
   * @param facilityName
   */
  public void addFacility(String facilityType_p, Facility facility, String facilityName_p)
  {
    facility.setName(facilityName_p);
    switch(facilityType_p)
    {
      case "Factory":
      {
        addFactory(facility);
       break; 
      }
      case "Dormitory":
      {
        addDormitory(facility);
       break; 
      }
      case "Oxygen Supply":
      {
        addOxygenSupply(facility);
       break; 
      }
      case "Botanic Garden":
      {
        addBotanicGarden(facility);
       break; 
      }
      case "Energy Plant":
      {
        addEnergyPlant(facility);
       break; 
      }
      case "Laboratory":
      {
        addLaboratory(facility);
       break; 
      }
    }
  }

  public void addFactory(Facility facility)
  {
    this.m_factories.add((Factory)facility);
  }  
  public void addDormitory(Facility facility)
  {
    this.m_dormitories.add((Dormitory) facility);
  }
  public void addOxygenSupply(Facility facility)
  {
    this.m_oxygenSupplies.add((OxygenSupply) facility);
  }
  public void addBotanicGarden(Facility facility)
  {
    this.m_botanicGardens.add((BotanicGarden) facility);
  }
  public void addEnergyPlant(Facility facility)
  {
    this.m_energyPlants.add((EnergyPlant) facility);
  }
  public void addLaboratory(Facility facility)
  {
    this.m_laboratories.add((Laboratory)facility);
  }

}
