
package game;

import java.util.*;
import java.time.*;








public class City {
    
    
    private boolean dormitory;

    
    
    private boolean oxygenSupply;

    
    
    private boolean energyPlant;

    
    
    private int nbFactory;

    
    
    private String cityName;

    
    
    private Planet ;

    
    
    private Factory ;

    private boolean isDormitory() {
        return dormitory;
    }

    private boolean isOxygenSupply() {
        return oxygenSupply;
    }

    private boolean isEnergyPlant() {
        return energyPlant;
    }

    private int getNbFactory() {
        return nbFactory;
    }

    private String getCityName() {
        return cityName;
    }

    public Planet get() {
        return ;
    }

    public Factory get() {
        return ;
    }

    private void setDormitory(boolean dormitory) {
        this.dormitory = dormitory;
    }

    private void setOxygenSupply(boolean oxygenSupply) {
        this.oxygenSupply = oxygenSupply;
    }

    private void setEnergyPlant(boolean energyPlant) {
        this.energyPlant = energyPlant;
    }

    private void setNbFactory(int nbFactory) {
        this.nbFactory = nbFactory;
    }

    private void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void set(Planet ) {
        this. = ;
    }

    public void set(Factory ) {
        this. = ;
    }

    public void link(Planet _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Factory _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }

    
    
    public double produceRessources() {
    
    
    }
    
    
    public City() {
    
    
    }


}