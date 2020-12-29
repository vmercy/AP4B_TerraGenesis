
package Game.spacies;


public class Vegetal extends Species {
    
    
    private double oxygenGiven;
    private double carbonDioxydeAbsorbed;


    private Species species;

    protected double getOxygenGiven() {
        return oxygenGiven;
    }

    protected double getCarbonDioxydeAbsorbed() {
        return carbonDioxydeAbsorbed;
    }

    public Species getSpecies() {
        return this.species;
    }

    protected void setOxygenGiven(double oxygenGiven) {
        this.oxygenGiven = oxygenGiven;
    }

    protected void setCarbonDioxydeAbsorbed(double carbonDioxydeAbsorbed) {
        this.carbonDioxydeAbsorbed = carbonDioxydeAbsorbed;
    }

    public void set(Species species ) {
        this.species = species;
    }


    
    
    public Vegetal() {
    
    
    }
    /**
    * @param vegetal
    */

    
    
    public void reproduce(Vegetal vegetal) {
    
    
    }

    public double createOxygene(double price){
        return this.oxygenGiven;
    }


}