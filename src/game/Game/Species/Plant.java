
package Game.Species;

import Game.Game;
import Game.Species.Vegetal;

import javax.swing.*;


public class Plant extends Vegetal {

    private static final double LENGTH_OF_PLANT =1.5;
    public static int numbreOfPlant  = 0;
    private String nom;
    private  boolean iscorrectPlanCreated = false;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isIscorrectPlanCreated() {
        return this.iscorrectPlanCreated;
    }


    public double getTaille() {
        return this.taille;
    }



    public double getEpaisseur() {
        return this.epaisseur;
    }


    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    private double taille;
    private double epaisseur;
    private  String couleur;
    private Vegetal vegetal;

    public Vegetal getVegetal() {
        return this.vegetal;
    }

    public void set(Vegetal vegetal) {
        this.vegetal = vegetal;
    }



    
    
    public Plant() {
    }


    public boolean createPlant(int nombreDePoint,String nom,double epaisseur,double oxy){
        double oxygene = getOxygenGiven();
        double gazcarbonique = getCarbonDioxydeAbsorbed();
        if(oxygene != 0 && gazcarbonique != 0 && nombreDePoint !=0){
            if(oxygene >= oxy && gazcarbonique >=oxy ){
                this.nom = nom;
                if(nombreDePoint >0 ){
                    if(LENGTH_OF_PLANT <= nombreDePoint){
                        this.taille = LENGTH_OF_PLANT;
                        this.iscorrectPlanCreated = true ;
                    }else {
                        JOptionPane.showMessageDialog(null,"Nombre de nombreDePoint insuffisant pour un arbre de cette taille. Veuillez réduire la taille");
                    }
                   // this.taille = LENGTH_OF_PLANT <= nombreDePoint ? LENGTH_OF_PLANT:nombreDePoint;
                    this.epaisseur = epaisseur <= nombreDePoint ? epaisseur/nombreDePoint:epaisseur/nombreDePoint+epaisseur;
                    this.couleur = "green";
                }else {
                    this.taille =0;
                    this.epaisseur = 0;
                    this.couleur = "orange";
                }
                numbreOfPlant +=oxy*oxy*nombreDePoint;
                setOxygenGiven(oxygene-oxy);
                setCarbonDioxydeAbsorbed(gazcarbonique-oxy);
            }
        }

        return  this.iscorrectPlanCreated;
    }

}