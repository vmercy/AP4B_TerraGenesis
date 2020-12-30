
package Game.spacies;

import Game.Game;
import Game.spacies.Fish;

import javax.swing.*;

import static Game.spacies.Vegetal.carbonDioxydeAbsorbed;


public class Mackerel extends Fish {


    public Mackerel() {

           super();

    }

    private Fish makerel;
    public Fish createFish(String nom,double taille, String urlPhoto){
        if(taille>20){
            JOptionPane.showMessageDialog(null,"Taille trop grande pour ce type de poisson");
        }else {
             this.makerel  = new Fish(nom,taille,urlPhoto)  ;
            carbonDioxydeAbsorbed += taille;
        }
        return this.makerel;

    }
}