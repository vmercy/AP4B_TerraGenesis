
package game.Species;


import javax.swing.*;

public class Vegetal extends Species {
    
    
    private double oxygenGiven;
    private double carbonDioxydeAbsorbed;



   // private Species species;

    public double getOxygenGiven() {
        return oxygenGiven;
    }

    protected double getCarbonDioxydeAbsorbed() {
        return carbonDioxydeAbsorbed;
    }

    /*public Species getSpecies() {
        return this.species;
    }*
    public void set(Species species ) {
        this.species = species;
    }

     */

    protected void setOxygenGiven(double oxygenGiven) {
        this.oxygenGiven = oxygenGiven;
    }

    protected void setCarbonDioxydeAbsorbed(double carbonDioxydeAbsorbed) {
        this.carbonDioxydeAbsorbed = carbonDioxydeAbsorbed;
    }

    public Vegetal() {
    }

    public void createOxygeneAndCO2(double nombreDePoint){
        if(nombreDePoint<=0){
            JOptionPane.showMessageDialog(null,"Nombre de nombreDePoint insuffisant pour produire l'oxygene!");
        }else {
            this.oxygenGiven += this.oxygenGiven*nombreDePoint;
            this.carbonDioxydeAbsorbed += this.carbonDioxydeAbsorbed*nombreDePoint;
        }
    }
}