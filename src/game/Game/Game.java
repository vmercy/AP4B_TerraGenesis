
package Game;

import java.util.*;
import java.time.*;

public class Game {
    
    
    private double money;
        
    private double atmosphere;
        
    private double oxygen;
    
    private double carbonDioxide;
    
    private double biomass;
    

    
    
    private Planet ;

    
    private Mission ;

    
    private Money ;

    
    private Settings ;

    
    private double getMoney() {
        return money;
    }

    private double getAtmosphere() {
        return atmosphere;
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




    
    private void setMoney(double money) {
        this.money = money;
    }

    private void setAtmosphere(double temperature) {
        this.temperature = temperature;
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

 
    /**
    * @param None
    * @brief Lors de l'initialisation de Game, les paramètres sont définis à 0 (jauge de progression en %)
    */

    public Game() 
    {
    	this.money = 0;
    	this.atmosphere = 0;
    	this.oxygen = 0;
    	this.carbonDioxide = 0;
    	this.biomass = 0;
    }
    
    /**
     * @param Animal animal_p
     * @brief Lorsque qu'une espèce est instaurée avec succès sur la planète, la jauge de Co2 monte 
     */
    
    public void AnimalSpeciesIntroduced(Animal animal_p)
    {
    	double newCarbonDioxide;
    	this.carbonDioxide += animal_p.ca
    }
    	
    
    
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un végétal est instauré avec succès sur la planète, la jauge d'O2 monte
     */
    
    public void vegetalSpeciesIntroduced(Animal animal_p)
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
    
    