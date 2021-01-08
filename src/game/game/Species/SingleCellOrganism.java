
package game.Species;

import javax.swing.*;

import static game.Species.Vegetal.carbonDioxydeAbsorbed;


public class SingleCellOrganism extends Fish {




    public SingleCellOrganism() {

    }

    private Fish singelCellOrganique;
    public Fish createFish(String nom,double taille, String urlPhoto){
        if(taille>10){
            JOptionPane.showMessageDialog(null,"Taille trop grande pour ce type de poisson");
        }else {
            setNom(nom);
            setTaille(taille);
            setUrlPhoto(urlPhoto);
            this.singelCellOrganique  = new Fish(getNom(),getTaille(),getUrlPhoto());
            carbonDioxydeAbsorbed += taille;
        }
        return this.singelCellOrganique;

    }

}