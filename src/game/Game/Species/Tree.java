
package Game.Species;


import javax.swing.*;

public class Tree extends Vegetal {
    

    public static int numbreOfTree  = 0;
    private String nom;
    private  boolean iscorrectTreeCreated = false;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isIscorrectTreeCreated() {
        return this.iscorrectTreeCreated;
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
    
    public Tree() {
        super();
    }

    public boolean createTree(int nombreDePoint,String nom, double taille, double epaisseur,double oxy){
        double oxygene = getOxygenGiven();
        double gazcarbonique = getCarbonDioxydeAbsorbed();
        if(oxygene != 0 && gazcarbonique != 0 && nombreDePoint !=0){
            if(oxygene >= oxy && gazcarbonique >=oxy ){
                this.nom = nom;
                if(nombreDePoint >0 ){
                    if(taille <= nombreDePoint){
                        this.taille = taille;
                        this.iscorrectTreeCreated = true ;
                    }else {
                        JOptionPane.showMessageDialog(null,"Nombre de nombreDePoint insuffisant pour un arbre de cette taille. Veuillez réduire la taille");
                    }
                    //this.taille = taille <= nombreDePoint ? taille:nombreDePoint;
                    this.epaisseur = epaisseur <= nombreDePoint ? epaisseur/nombreDePoint:epaisseur/nombreDePoint+epaisseur;
                    this.couleur = "green";
                }else {
                    this.taille =0;
                    this.epaisseur = 0;
                    this.couleur = "orange";
                }
                numbreOfTree +=oxy*oxy*nombreDePoint;
                setOxygenGiven(oxygene-oxy);
                setCarbonDioxydeAbsorbed(gazcarbonique-oxy);
            }
            }


        return  this.iscorrectTreeCreated;
    }




}