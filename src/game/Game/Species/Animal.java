package Game.Species;

import javax.swing.*;

public class Animal extends Species {
    
    public static final int MAX_ENERGY = 200;
    private double carbonDioxideProduced;
    private int strenght;
    private String typeOfAnimals;
    private int energyGiven;
    private int energyNeed;
    protected int getStrenght() {
        return strenght;
    }

    
    public double getcarbonDioxideProduced() {
        return carbonDioxideProduced;
    }
    
    protected String getTypeOfAnimals() {
        return typeOfAnimals;
    }
    
    protected int getEnergyGiven() {
        return energyGiven;
    }

    protected int getEnergyNeed() {
        return energyNeed;
    }

    
    public void setcarbonDioxideProduced(double carbonDioxideProduced) {
        this.carbonDioxideProduced = carbonDioxideProduced;
    }
    
    protected void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    protected void setTypeOfAnimals(String typeOfAnimals) {
        this.typeOfAnimals = typeOfAnimals;
    }

    protected void setEnergyGiven(int energyGiven) {
        this.energyGiven = energyGiven;
    }

    protected void setEnergyNeed(int energyNeed) {
        this.energyNeed = energyNeed;
    }


    
    public Animal(double carbonDioxideProduced, int strenght, string typeOfAnimals) {
    	this.carbonDioxideProduced = carbonDioxideProduced;
    	this.strenght = strenght;
    	this.typeOfAnimals = typeOfAnimals;
    }




    public abstract void eat(Species species);



}