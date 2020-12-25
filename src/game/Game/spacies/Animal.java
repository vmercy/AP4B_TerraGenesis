package Game.spacies;


public class Animal extends Species {
    
    
    private int strenght;

    
    
    private byte typeOfAnimals;

    
    
    private int energyGiven;

    
    
    private int energyNeed;

    
    
    private Species species;

    protected int getStrenght() {
        return strenght;
    }

    protected byte getTypeOfAnimals() {
        return typeOfAnimals;
    }

    protected int getEnergyGiven() {
        return energyGiven;
    }

    protected int getEnergyNeed() {
        return energyNeed;
    }

    public Species getSpecies() {
        return this.species;
    }

    protected void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    protected void setTypeOfAnimals(byte typeOfAnimals) {
        this.typeOfAnimals = typeOfAnimals;
    }

    protected void setEnergyGiven(int energyGiven) {
        this.energyGiven = energyGiven;
    }

    protected void setEnergyNeed(int energyNeed) {
        this.energyNeed = energyNeed;
    }


    
    public Animal() {
    
    
    }


    
    
    public void eat(Animal animal) {
    
    
    }


}