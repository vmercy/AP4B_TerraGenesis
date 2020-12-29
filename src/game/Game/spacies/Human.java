
package Game.spacies;


public class Human extends Mammal {
    
    private String nom;
    private  String sex;

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


    public Human(String nom, String sex, String urlPhoto) {
        this.nom = nom;
        this.sex = sex;
        this.urlPhoto = urlPhoto;
    }

    public Human createHuman(String nom, String sex, String urlPhoto){
        return new Human(nom,sex,urlPhoto);
    }

    public void choosePlanet(){

    }
    private void displayBiomasse(){

    }
    


}