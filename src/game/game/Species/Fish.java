package game.Species;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

import static game.Species.Vegetal.carbonDioxydeAbsorbed;

public class Fish extends Animal {

  private static int energyNeed = 80;
  private int energyProgress;

  private int generateEnergy(int interval) {
    Random r = new Random();
    int enrgy = r.nextInt(interval);
    return enrgy;
  }

  @Override
  public int eat(Species species) {
    String message = "Niveau maximal d'energie atteint";
    switch (species.getType()) {
      case "Animal":
        switch (this.getTypeOfAnimals()) {
          case "AquaticMammal":
            if (getEnergyGiven() <= MAX_ENERGY) {
              if (this.energyProgress <= energyNeed) {
                setEnergyGiven(MAX_ENERGY / energyNeed);
                this.energyProgress += generateEnergy(energyNeed + 20);
              } else {
                JOptionPane.showMessageDialog(null, message);
              }
            } else {
              JOptionPane.showMessageDialog(null, "Niveau maximal d'energie atteint");
            }
            break;
          case "Mammal":
            if (getEnergyGiven() <= MAX_ENERGY) {
              if (this.energyProgress <= energyNeed) {
                setEnergyGiven(MAX_ENERGY / energyNeed - 10);
                this.energyProgress += generateEnergy(energyNeed + 15);
              } else {
                JOptionPane.showMessageDialog(null, message);
              }
            } else {
              JOptionPane.showMessageDialog(null, "Niveau maximal d'energie atteint");
            }
            break;
          case "Insect":
            if (getEnergyGiven() <= MAX_ENERGY) {
              if (this.energyProgress <= energyNeed) {
                setEnergyGiven(MAX_ENERGY / energyNeed + 140);
                this.energyProgress += generateEnergy(energyNeed);
                ;
              } else {
                JOptionPane.showMessageDialog(null, message);
              }
            } else {
              JOptionPane.showMessageDialog(null, "Niveau maximal d'energie atteint");
            }
            break;
          case "Fish":
            if (getEnergyGiven() <= MAX_ENERGY) {
              if (this.energyProgress <= energyNeed) {
                setEnergyGiven(MAX_ENERGY / energyNeed + 180);
                this.energyProgress += generateEnergy(energyNeed + 10);
              } else {
                JOptionPane.showMessageDialog(null, message);
              }
            } else {
              JOptionPane.showMessageDialog(null, "Niveau maximal d'energie atteint");
            }
            break;

        }
      default:
        if (getEnergyGiven() <= MAX_ENERGY) {
          if (this.energyProgress <= energyNeed) {
            setEnergyGiven(MAX_ENERGY / energyNeed + 200);
            this.energyProgress += generateEnergy(energyNeed + 5);
          } else {
            JOptionPane.showMessageDialog(null, message);
          }
        } else {
          JOptionPane.showMessageDialog(null, "Niveau maximal d'energie atteint");
        }
    }
    return this.energyProgress;

  }

  private String nom;
  private String urlPhoto;
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

  public Fish() {
  }

  public void setUrlPhoto(String urlPhoto) {
    this.urlPhoto = urlPhoto;
  }

  public Fish(String nom, double taille, String urlPhoto) {
    this.nom = nom;
    this.urlPhoto = urlPhoto;
    this.taille = taille;
  }

  public Fish createFish(String nom, double taille, String urlPhoto) {
    this.nom = nom;
    this.urlPhoto = urlPhoto;
    this.taille = taille;
    Fish fish = new Fish(this.nom, this.taille, this.urlPhoto);
    carbonDioxydeAbsorbed += this.taille;
    return fish;
  }

  public int getEnergyProgress() {
    return energyProgress;
  }

  public void setEnergyProgress(int energyProgress) {
    this.energyProgress = energyProgress;
  }

  @Override
  public String toString() {
    return "Ajout réussi :  Fish{" + "energyProgress=" + this.energyProgress + ", nom='" + nom + '\'' + ", taille="
        + taille + ", tabFish=" + tabFish + '}';
  }

  private ArrayList tabFish;

  public static void testEat(Species sp, Fish f, String typeOfAnimal, String typeOfSpecies) {
    f = new Fish();
    sp = new Species();
    sp.setType(typeOfSpecies);
    f.setTypeOfAnimals(typeOfAnimal);
    int energy = f.eat(sp);
    System.out.println(" Energy : " + energy);
  }

  public static void testCreateFish(Fish f, String nom, double taille, String urlPhoto) {
    f = new Fish();
    f.setTypeOfAnimals("Fish");
    f.createFish(nom, taille, urlPhoto);
    System.out.println(AddchaineAlimentaire(f));
    System.out.println(f);
  }

  public static void main(String arg[]) {

    Fish f = new Fish();
    Species sp = new Species();
    testCreateFish(f, "Makerau", 10, "home/photo-makerau");
    testEat(sp, f, "AquaticMammal", "Animal");

  }
}