
package Game.spacies;


public class AquaticMammal extends Animal {
    
    
    private Mammal mammal;

    
    
    private AquaticAnimal aquaticAnimal;

    
    
    private Animal animal;

    public Mammal getMammal() {
        return this.mammal;
    }

    public AquaticAnimal getAquaticAnimal() {
        return this.aquaticAnimal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setMammal(Mammal mammal) {
        this.mammal =mammal ;
    }

    public void setAquaticAnimal(AquaticAnimal aquaticAnimal) {
        this.aquaticAnimal =aquaticAnimal ;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }



    
    
    public AquaticMammal() {
    
    
    }


}