
package Game.Species;


import static Game.Species.Plant.numbreOfPlant;
import static Game.Species.Tree.numbreOfTree;
import static Game.Species.Vegetal.carbonDioxydeAbsorbed;

public class Human extends Mammal {
    
    private String nom;
    private  String sex;
    private  double taille;

    @Override
    public double getTaille() {
        return taille;
    }

    @Override
    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    private  String urlPhoto;

    public Human(){
        super();
    }


    public Human(String nom, String sex,double taille, String urlPhoto) {
        this.nom = nom;
        this.sex = sex;
        this.urlPhoto = urlPhoto;
        this.taille = taille;
    }


    public Mammal createHuman(String nom, String sex,double taille, String urlPhoto){
        this.nom = nom;
        this.sex = sex;
        this.urlPhoto = urlPhoto;
        this.taille = taille;
        Human human = new Human(this.nom,this.sex,this.taille,this.urlPhoto);
        carbonDioxydeAbsorbed += taille;
        return  human;
    }

    private double displaySizeBiomasse(){
        double longueur = numbreOfTree*2 +numbreOfPlant*1.005;
        double surface = longueur*longueur;
        return surface;

    }



}