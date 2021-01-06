package game;

import java.util.Vector;

public class Factories
{
  Factories()
  {
    
  }

  private Vector<Factory> factories = new Vector<Factory>(50);

  public int getNbFactories()
  {
    return factories.size();
  }


  public void fill()
  {
    Factory newFact = new Factory("USINE UN");
    factories.add(newFact);

    Factory newFact2 = new Factory("USINE DEUX", 4.2);
    factories.add(newFact2);

    Factory newFact3 = new Factory("USINE TROIS");
    factories.add(newFact3);
  }
}
