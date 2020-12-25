
package Game.spacies;


public class Fish extends Animal {
    
    
    private Invertebrate invertebrate;

    
    
    private Vertebrate vertebrate;

    
    
    private AquaticAnimal aquaticAnimal;

    
    
    private Animal animal;

    public Invertebrate getInvertebrate() {
        return this.invertebrate;
    }

    public Vertebrate getVertebrate() {
        return this.vertebrate;
    }

    public AquaticAnimal getAquaticAnimal() {
        return this.aquaticAnimal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void set(Invertebrate invertebrate) {
        this.invertebrate = invertebrate ;
    }

    public void set(Vertebrate vertebrate) {
        this.vertebrate = vertebrate;
    }

    public void set(AquaticAnimal aquaticAnimal ) {
        this.aquaticAnimal =aquaticAnimal ;
    }

    public void set(Animal animal) {
        this.animal = animal;
    }



}