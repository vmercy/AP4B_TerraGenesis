package game.Species;


import javax.swing.*;

public abstract class Animal extends Species {
    
    public static final int MAX_ENERGY = 200;
    private int strenght;
    private String typeOfAnimals;
    private int energyGiven;
    private int energyNeed;
    protected int getStrenght() {
        return strenght;
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


    
    public Animal() {
    
    
    }




    public abstract void eat(Species species);



}