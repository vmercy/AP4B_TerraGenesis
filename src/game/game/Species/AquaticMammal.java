package game.Species;

import javax.swing.*;

import java.util.Random;

import static game.Species.Vegetal.carbonDioxydeAbsorbed;

public class AquaticMammal extends Animal {

  private static int energyNeed = 110;
  private int energyProgress;

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

  private String urlPhoto;

  public AquaticMammal() {
    super();
    m_price = 50.0;
  }

  public AquaticMammal(String nom, double taille, String urlPhoto) {
    this.nom = nom;
    this.urlPhoto = urlPhoto;
    this.taille = taille;
  }

  public AquaticMammal createAquatiqueMammal(String nom, double taille, String urlPhoto) {
    this.nom = nom;
    this.urlPhoto = urlPhoto;
    this.taille = taille;
    AquaticMammal aquaticMammal = new AquaticMammal(this.nom, this.taille, this.urlPhoto);
    carbonDioxydeAbsorbed += taille;
    return aquaticMammal;
  }

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

}