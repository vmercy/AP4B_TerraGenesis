
package Game.Species;

import javax.swing.*;

import static Game.Species.Vegetal.carbonDioxydeAbsorbed;


public class Mackerel extends Fish {


    public Mackerel() {
           super();

    }

    private Fish makerel;
    public Fish createFish(String nom,double taille, String urlPhoto){
        if(taille>20){
            JOptionPane.showMessageDialog(null,"Taille trop grande pour ce type de poisson");
        }else {
            setNom(nom);
            setTaille(taille);
            setUrlPhoto(urlPhoto);
             this.makerel  = new Fish(getNom(),getTaille(),getUrlPhoto())  ;
            carbonDioxydeAbsorbed += taille;
        }
        return this.makerel;

    }

    public static void main(String arg[]){
        Mackerel f = new Mackerel();
        Species sp =new Species();
        testCreateFish(f,"Mackerel",8,"home/photo-mackerel");
        testEat(sp,f,"Fish","Animal");
    }
}