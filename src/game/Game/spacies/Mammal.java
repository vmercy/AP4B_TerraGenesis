
package Game.spacies;

import Game.Game;
import Game.spacies.Animal;


public class Mammal extends Animal {
    
    
    private Vertebrate vertebrate;

    
    
    private Animal animal;

    public Vertebrate getVertebrate() {
        return this.vertebrate;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void set(Vertebrate vertebrate) {
        this.vertebrate = vertebrate ;
    }

    public void set(Animal animal) {
        this.animal = animal;
    }


    
    
    public Mammal() {
    
    
    }


}