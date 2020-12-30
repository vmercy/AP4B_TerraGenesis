
package Game;

import java.util.*;
import java.time.*;

public class Game {
    
    
    private double money;

    
    
    private double temperature;

    
    
    private double pression;

    
    
    private double oxygen;
    

    private double carbonDioxide;
    
    
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
    
    private double getCarbonDioxide() {
        return carbonDioxide;
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
    
    private void setCarbonDioxide(double carbonDioxide) {
        this.carbonDioxide = carbonDioxide;
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

    
 
    /**
    * @param None
    * @brief Lors de l'initialisation de Game, les paramètres sont définis à 0 (jauge de progression en %)
    */

    public Game() 
    {
    	this.setMoney(0);
    	this.setPression(0);
    	this.setOxygen(0);
    	this.pression(0);
    	this.setWater(0);
    	this.biomass(0);
    }
    
    /**
     * @param Animal animal_p
     * @brief Lorsque qu'une espèce est instaurée avec succès sur la planète, la jauge de Co2 monte 
     */
    
    public void AnimalSpeciesIntroduced(Animal animal_p)
    {
    	double newCarbonDioxide;
    	newCarbonDioxide = this.carbonDioxide + animal_p.getCarbonDioxideProduced();
    	this.setOxygen(newCarbonDioxide);
    }
    
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un végétal est instauré avec succès sur la planète, la jauge d'O2 monte
     */
    
    public void AnimalSpeciesIntroduced(Animal animal_p)
    {
    	double newOxygen;
    	newOxygen = this.oxygen + vegetal_p.getOxygenGiven();
    	this.setOxygen(newOxygen);
    }
    
    /**
     * @param None
     * @brief Si les jauges d'O2 et de Co2 sont à 10% (progression dans le jeu ce n'est pas une répartition)
     * 		  alors la jauge d'atmosphère passe à 10%
     */
    
    public void atmosphereFirstAdvanced()
    {
    	if(this.getCarbonDioxide()>=10 && this.getOxygen()>=10)
    	{
    		this.setPression(10);
    	}
    }
    
    /**
     * @param None
     * @brief Si les jauges d'O2 et de Co2 sont à 20% (individuellement) alors la jauge d'atmosphère passe à 20%
     */
    
    public void atmosphereFirstAdvanced()
    {
    	double newOxygen;
    	newOxygen = this.oxygen + vegetal_p.getOxygenGiven();
    	this.setOxygen(newOxygen);
    }
    
    