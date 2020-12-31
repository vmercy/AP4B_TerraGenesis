
package Game.Species;


import Game.Game;
import Game.Species.Animal;

import javax.swing.*;

import static Game.spacies.Vegetal.carbonDioxydeAbsorbed;

public class Insect extends Animal {
    
    
    public Insect() {
    }

    private static int energyNeed = 20;
    private  int energyProgress;

    @Override
    public void eat(Species species) {
        String message ="message";
        switch (species.getType()){
            case "Animal":
                switch (this.getTypeOfAnimals()){
                    case "AquaticMammal":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Mammal":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed-10);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Insect":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed+140);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Fish":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed+180);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;


                }
            default:
                if(getEnergyGiven()<=MAX_ENERGY){
                    if(this.energyProgress<=energyNeed){
                        setEnergyGiven(MAX_ENERGY/energyNeed+200);
                        this.energyProgress += getEnergyGiven();
                    }else {
                        JOptionPane.showMessageDialog(null,message);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                }
        }
    }

    private String nom;
    private  String urlPhoto;
    private double taille;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }



    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Insect(String nom,double taille, String urlPhoto) {
        this.nom = nom;
        this.urlPhoto = urlPhoto;
        this.taille = taille;
    }

    public Fish createInsect(String nom,double taille, String urlPhoto){
        Fish fish;
        if(taille>4){
            JOptionPane.showMessageDialog(null,"Taille trop grande ce type de poisson");
        }else {
             fish = new Fish(nom, taille, urlPhoto);
            carbonDioxydeAbsorbed += taille;
            return fish;
        }
        return null;
    }

}