package game.Species;

import java.util.Vector;

public class Animals
{
  private Vector<Animal> m_animals;

  public Animals()
  {
    m_animals = new Vector<Animal>();
  }

  public boolean findAnimal(String animalType_p)
  {
    for (Animal animal : m_animals) {
      if(animal.getName()==animalType_p)
        return true;
    }
    return false;
  }

  public boolean hasInsect()
  {
    return findAnimal("Insect");
  }
}