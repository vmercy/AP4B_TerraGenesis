
package game;

import java.util.*;
import java.time.*;








public class Settings {
    
    
    private double moneyStart;

    
    
    private double temperatureStart;

    
    
    private double pressionStart;

    
    
    private double oxygenStart;

    
    
    private double biomassStart;

    
    
    private double waterStart;

    
    
    private Game ;

    private double getMoneyStart() {
        return moneyStart;
    }

    private double getTemperatureStart() {
        return temperatureStart;
    }

    private double getPressionStart() {
        return pressionStart;
    }

    private double getOxygenStart() {
        return oxygenStart;
    }

    private double getBiomassStart() {
        return biomassStart;
    }

    private double getWaterStart() {
        return waterStart;
    }

    public Game get() {
        return ;
    }

    private void setMoneyStart(double moneyStart) {
        this.moneyStart = moneyStart;
    }

    private void setTemperatureStart(double temperatureStart) {
        this.temperatureStart = temperatureStart;
    }

    private void setPressionStart(double pressionStart) {
        this.pressionStart = pressionStart;
    }

    private void setOxygenStart(double oxygenStart) {
        this.oxygenStart = oxygenStart;
    }

    private void setBiomassStart(double biomassStart) {
        this.biomassStart = biomassStart;
    }

    private void setWaterStart(double waterStart) {
        this.waterStart = waterStart;
    }

    public void set(Game ) {
        this. = ;
    }

    public void link(Game _) {
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

    
    
    public void bool success() {
    
    
    }
    
    
    public Settings() {
    
    
    }


}