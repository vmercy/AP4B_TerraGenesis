
package game.Species;


import javax.swing.*;

public class Vegetal extends Species {
    
    
    public static   double oxygenGiven;
    public static double carbonDioxydeAbsorbed;



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

    protected void setOxygenGiven(double oxygenGive) {
        oxygenGiven = oxygenGive;
    }

    protected void setCarbonDioxydeAbsorbed(double carbonDioxydeAbsorbe) {
        carbonDioxydeAbsorbed = carbonDioxydeAbsorbe;
    }

    public Vegetal() {
    }

    public void createOxygene(double nombreDePoint){
        if(nombreDePoint<=0){
            JOptionPane.showMessageDialog(null,"Nombre de nombreDePoint insuffisant pour produire l'oxygene!");
        }else {
            oxygenGiven += oxygenGiven*nombreDePoint;
            //carbonDioxydeAbsorbed += carbonDioxydeAbsorbed*nombreDePoint;
        }
    }
}