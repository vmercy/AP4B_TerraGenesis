
package Game.spacies;

import Game.Game;
import Game.spacies.Animal;

import javax.swing.*;

import static Game.spacies.Vegetal.carbonDioxydeAbsorbed;


public class Mammal extends Animal {
    



    
    
    public Mammal() {
    
    }

    private String nom;
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

    private  String urlPhoto;



    public Mammal(String nom,double taille, String urlPhoto) {
        this.nom = nom;
        this.urlPhoto = urlPhoto;
        this.taille = taille;
    }

    public Mammal createAquatiqueMammal(String nom, String urlPhoto){
        Mammal Mammal = new Mammal(nom,taille,urlPhoto);
        carbonDioxydeAbsorbed += taille;
        return  Mammal;
    }


    private static int energyNeed = 200;
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


}