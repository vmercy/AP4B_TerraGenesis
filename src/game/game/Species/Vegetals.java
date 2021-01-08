package game.Species;

import java.util.Vector;

public class Vegetals{

  private Vector<Vegetal> m_vegetals;
  private final int NB_VEGETAL_TYPES = 2;

  public Vegetals()
  {
    m_vegetals = new Vector<Vegetal>();
  }

  public Vegetal createVegetalFromType(String type_p)
  {
    for (Vegetal vegetal : getVegetalSample()){
      if(vegetal.getName()==type_p)
        return vegetal;
    }
    return null;
  }

  public void addVegetal(Vegetal vegetal_p)
  {
    this.m_vegetals.add(vegetal_p);
  }

  public Vector<Vegetal> getVegetalSample()
  {
    Vector<Vegetal> sample = new Vector<Vegetal>();
    sample.add(new Tree());
    sample.add(new Plant());
    return sample;
  }

  public String[] getVegetalSampleStrings()
  {
    String[] sampleStrings = new String[NB_VEGETAL_TYPES];
    Vector<Vegetal> sample = getVegetalSample();
    for (Vegetal vegetalSample : sample) {
      sampleStrings[sample.indexOf(vegetalSample)] = vegetalSample.getName();
    }
    return sampleStrings;
  }


  public Vector<Vegetal> getVegetals()
  {
    return m_vegetals;
  }

}