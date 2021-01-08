
package game.Species;

import javax.swing.*;

import static game.Species.Vegetal.carbonDioxydeAbsorbed;


public class Shrimp extends Fish {



    public Shrimp() {
    }
    private Fish shrim;
    public Fish createFish(String nom,double taille, String urlPhoto){
        if(taille>15){
            JOptionPane.showMessageDialog(null,"Taille trop grande pour ce type de poisson");
        }else {
            setNom(nom);
            setTaille(taille);
            setUrlPhoto(urlPhoto);
            this.shrim  = new Fish(getNom(),getTaille(),getUrlPhoto());
            carbonDioxydeAbsorbed += taille;
        }
        return this.shrim;

    }

}