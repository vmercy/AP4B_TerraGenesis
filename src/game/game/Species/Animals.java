package game.Species;

import java.util.Vector;

public class Animals
{
  private Vector<Animal> m_animals;
  private static final int NB_ANIMAL_TYPES = 9;

  public Animals()
  {
    m_animals = new Vector<Animal>();
  }

  public Vector<Animal> getAnimalSample()
  {
    Vector<Animal> sample = new Vector<Animal>(NB_ANIMAL_TYPES);
    sample.add(new Insect());
    sample.add(new AquaticMammal());
    sample.add(new Shark());
    sample.add(new Tuna());
    sample.add(new Mackerel());
    sample.add(new SmallFish());
    sample.add(new Shrimp());
    sample.add(new SingleCellOrganism());
    return sample;
  }

  public Vector<Animal> getAnimals()
  {
    return m_animals;
  }

  public String[] getAnimalSampleStrings()
  {
    String[] sampleStrings = new String[NB_ANIMAL_TYPES];
    Vector<Animal> sample = getAnimalSample();
    for (Animal animalSample : sample) {
      sampleStrings[sample.indexOf(animalSample)] = animalSample.getName();   
    }
    return sampleStrings;
  }

  public Animal createAnimalfromType(String type_p)
  {
    for (Animal animal : getAnimalSample()) {
      if(animal.getName()==type_p)
        return animal;
    }
    return null;
  }

  public void addAnimal(Animal animal_p)
  {
    m_animals.add(animal_p);
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