package game;

import java.util.Comparator;
import java.util.Vector;

public class BuildingMaterials {
  private Vector<BuildingMaterial> m_listOfMaterials;
  private final byte NB_BUILDING_MATERIALS = 9;

  BuildingMaterials()
  {
    m_listOfMaterials = new Vector<BuildingMaterial>();
    fill();
  }

  public void fill()
  {
    m_listOfMaterials.add(new BuildingMaterial("Wood", 100.0));
    m_listOfMaterials.add(new BuildingMaterial("Iron", 1000.0));
    m_listOfMaterials.add(new BuildingMaterial("Metal", 500.0));
    m_listOfMaterials.add(new BuildingMaterial("Concrete", 800.0));
    m_listOfMaterials.add(new BuildingMaterial("Soil", 50.0));
    m_listOfMaterials.add(new BuildingMaterial("Zinc", 850.0));
    m_listOfMaterials.add(new BuildingMaterial("Copper", 950.0));
    m_listOfMaterials.add(new BuildingMaterial("Gold", 2000.0));
    m_listOfMaterials.add(new BuildingMaterial("Stone", 600.0));
    //sort by price
    m_listOfMaterials.sort(new Comparator<BuildingMaterial>(){
      @Override
      public int compare(BuildingMaterial BM1, BuildingMaterial BM2)
      {
        if(BM1.getPrice()<BM2.getPrice()) return -1;
        if(BM1.getPrice()>BM2.getPrice()) return 1;
        return 0;
      }
    });;
  }

  private BuildingMaterial find(String materialName_p)
  {
    for (BuildingMaterial buildingMaterial : m_listOfMaterials) {
      if(buildingMaterial.getName()==materialName_p)
        return buildingMaterial;
    }
    return null;
  }

  public BuildingMaterial getMaterial(String materialName_p)
  {
    return find(materialName_p);
  }

  public String[] getMaterialsNames()
  {
    String[] materialNames = new String[NB_BUILDING_MATERIALS];
    for (BuildingMaterial buildingMaterial : m_listOfMaterials) {
      materialNames[m_listOfMaterials.indexOf(buildingMaterial)]=buildingMaterial.getName();
    }
    return materialNames;
  }
}
