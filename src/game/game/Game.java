
package Game;


import javax.swing.JOptionPane;

import Game.Species.Animal;
import Game.Species.Vegetal;


public class Game {
    
    
    private double money;
        
    private double atmosphere;
        
    private double oxygen;
    
    private double carbonDioxide;
    
    private double biomass;
    
    
    public double getMoney() {
        return money;
    }

    public double getAtmosphere() {
        return atmosphere;
    }

    public double getOxygen() {
        return oxygen;
    }
    
    public double getCarbonDioxide() {
        return carbonDioxide;
    }

    public double getBiomass() {
        return biomass;
    }




    
    public void setMoney(double money) {
        this.money = money;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }
    
    public void setCarbonDioxide(double carbonDioxide) {
        this.carbonDioxide = carbonDioxide;
    }

    public void setBiomass(double biomass) {
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
    
    public void animalSpeciesIntroduced(Animal animal_p)
    {
    	double addCarbonDioxide;
    	addCarbonDioxide = animal_p.getcarbonDioxideProduced();
    	addCarbonDioxide = animal_p.getcarbonDioxideProduced();

    	this.carbonDioxide += addCarbonDioxide;
    }
    	
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un végétal est instauré avec succès sur la planète, la jauge d'O2 monte
     */
    
    public void vegetalSpeciesIntroduced(Vegetal vegetal_p)
    {
    	double addOxygen;
    	addOxygen = vegetal_p.getOxygenGiven();
    	this.oxygen += addOxygen;
    }
    
    /**
     * @param None
     * @brief Si les jauges d'O2 et de Co2 sont à 10% (progression dans le jeu ce n'est pas une répartition)
     * 		  alors la jauge d'atmosphère passe à 10%
     */
    
    public void atmosphereStateUpdate()
    {
    	if(this.carbonDioxide>=10 && this.carbonDioxide<20 && this.oxygen>=10 && this.oxygen<20)
    	{
    		this.atmosphere = 10;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 10% !");
    	}
    	if(this.carbonDioxide>=20 && this.carbonDioxide<30 && this.oxygen>=20 && this.oxygen<30)
    	{
    		this.atmosphere = 20;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 20% !");
    	}
    	if(this.carbonDioxide>=30 && this.carbonDioxide<40 && this.oxygen>=30 && this.oxygen<40)
    	{
    		this.atmosphere = 30;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 30% !");
    	}
    	if(this.carbonDioxide>=40 && this.carbonDioxide<50 && this.oxygen>=40 && this.oxygen<50)
    	{
    		this.atmosphere = 40;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 40% !");
    	}
    	if(this.carbonDioxide>=50 && this.carbonDioxide<60 && this.oxygen>=50 && this.oxygen<60)
    	{
    		this.atmosphere = 50;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 50% !");
    	}
    	if(this.carbonDioxide>=60 && this.carbonDioxide<70 && this.oxygen>=60 && this.oxygen<70)
    	{
    		this.atmosphere = 60;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 60% !");
    	}
    	if(this.carbonDioxide>=70 && this.carbonDioxide<80 && this.oxygen>=70 && this.oxygen<80)
    	{
    		this.atmosphere = 70;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 70% !");
    	}
    	if(this.carbonDioxide>=80 && this.carbonDioxide<90 && this.oxygen>=80 && this.oxygen<90)
    	{
    		this.atmosphere = 80;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 80% !");
    	}
    	if(this.carbonDioxide>=90 && this.carbonDioxide<100 && this.oxygen>=90 && this.oxygen<100)
    	{
    		this.atmosphere = 90;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 90% !");
    	}
    	if(this.carbonDioxide==100 && this.oxygen==100)
    	{
    		this.atmosphere = 100;
    		JOptionPane.showMessageDialog(null,"Atmosphère complètement formée !");
    	}
    }
}   

    
    