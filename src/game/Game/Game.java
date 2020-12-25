
package Game;

import java.util.*;
import java.time.*;








public class Game {
    
    
    private double money;

    
    
    private double temperature;

    
    
    private double pression;

    
    
    private double oxygen;

    
    
    private double biomass;

    
    
    private double water;

    
    
    private Planet ;

    
    
    private Mission ;

    
    
    private Money ;

    
    
    private Settings ;

    private double getMoney() {
        return money;
    }

    private double getTemperature() {
        return temperature;
    }

    private double getPression() {
        return pression;
    }

    private double getOxygen() {
        return oxygen;
    }

    private double getBiomass() {
        return biomass;
    }

    private double getWater() {
        return water;
    }

    public Planet get() {
        return ;
    }

    public Mission get() {
        return ;
    }

    public Money get() {
        return ;
    }

    public Settings get() {
        return ;
    }

    private void setMoney(double money) {
        this.money = money;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private void setPression(double pression) {
        this.pression = pression;
    }

    private void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    private void setBiomass(double biomass) {
        this.biomass = biomass;
    }

    private void setWater(double water) {
        this.water = water;
    }

    public void set(Planet ) {
        this. = ;
    }

    public void set(Mission ) {
        this. = ;
    }

    public void set(Money ) {
        this. = ;
    }

    public void set(Settings ) {
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

    public void link(Mission _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Money _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }

    public void link(Settings _) {
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

    
    
    public Game() {
    
    
    }
    /**
    * @param newMoney
    */

    
    
    public void setMoney(double newMoney) {
    
    
    }


}