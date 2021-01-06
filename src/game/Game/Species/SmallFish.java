
package Game.Species;

import javax.swing.*;

import static Game.Species.Vegetal.carbonDioxydeAbsorbed;


public class SmallFish extends Fish {
    
    


    
    
    public SmallFish() {
    }

    private Fish makerel;
    public Fish createFish(String nom,double taille, String urlPhoto){
        if(taille>5){
            JOptionPane.showMessageDialog(null,"Taille trop grande ce type de poisson");
        }else {
            this.makerel  = new Fish(nom,taille,urlPhoto);
            carbonDioxydeAbsorbed += taille;
        }
        return this.makerel;

    }

}