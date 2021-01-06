package Game.Species;


import javax.swing.*;
import java.util.ArrayList;

public abstract class Animal extends Species {
    
    public static final int MAX_ENERGY = 200;
    private int strenght;
    private String typeOfAnimals;
    private int energyGiven;
    private int energyNeed;


    private double taille;
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




    public abstract int eat(Species species);

    public static   ArrayList AddchaineAlimentaire(Animal animal){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        ArrayList<Mammal> mammal = new ArrayList<>();
        ArrayList<AquaticMammal> aquaticMammal = new ArrayList<>();
        ArrayList<Fish> fish = new ArrayList<>();
        ArrayList<Insect> insect = new ArrayList<>();
       for (Animal a :animals){
           if(a.getTypeOfAnimals() =="Mammal"){
               mammal.add((Mammal) a);
           }else if (a.getTypeOfAnimals() =="aquaticMammal"){
               aquaticMammal.add((AquaticMammal) a);
           }else if(a.getTypeOfAnimals() =="Fish") {
               fish.add((Fish) a);
           }else if(a.getTypeOfAnimals() =="Insect") {
               insect.add((Insect) a);
           }
       }
       ArrayList <Animal> chaine = new ArrayList<>();
        ArrayList <String> st = new ArrayList<>();
       for (Mammal m:mammal){
           chaine.add(m);
           st.add(m.getNom());
       }
        for (AquaticMammal m:aquaticMammal){
            chaine.add(m);
            st.add(m.getNom());
        }
        for (Fish m:fish){
            chaine.add(m);
            st.add(m.getNom());
        }
        for (Insect m:insect){
            chaine.add(m);
            st.add(m.getNom());
        }

        for (String m:st){
         System.out.println(m);
        }
        return st;
    }

}