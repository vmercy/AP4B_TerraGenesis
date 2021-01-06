
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
    	if(this.carbonDioxide<100)
    	{
    		this.carbonDioxide += animal_p.getcarbonDioxideProduced();
    	}
    	if(this.carbonDioxide>=100)
    	{
    		this.carbonDioxide = 100;
    		JOptionPane.showMessageDialog(null,"Taux de dioxyde de carbone propice à la vie humaine atteint !");
    	}
    }
    	
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un végétal est instauré avec succès sur la planète, la jauge d'O2 monte
     */
    
    public void vegetalSpeciesIntroduced(Vegetal vegetal_p)
    {
    	if(this.oxygen<100)
    	{
    		this.oxygen += vegetal_p.getOxygenGiven();
    	}
    	if(this.oxygen>=100)
    	{
    		this.oxygen = 100;
    		JOptionPane.showMessageDialog(null,"Taux d'oxygène propice à la vie humaine atteint !");
    	}
    }
    
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un végétal est instauré avec succès sur la planète, la jauge d'O2 monte
     */
    
    public void FactoryIntroduced(Factory factory_p)
    {
    	
    	if(this.biomass<100)
    	{
    		this.biomass += factory_p.getBiomassGain();
    	}
    	if(this.biomass>=100)
    	{
    		this.biomass = 100;
    		JOptionPane.showMessageDialog(null,"Biomasse requise atteinte !");
    	}
    }
    
    /**
     * @param None
     * @brief Si les jauges d'O2 et de Co2 sont à 100% alors l'atmosphère est complète 
     */
    
    public void atmosphereStateUpdate()
    {
    	if(this.carbonDioxide>10 && this.oxygen>10 && this.atmosphere<10)
    	{
    		this.atmosphere = 10;
    	}
    	
    	if(this.carbonDioxide>20 && this.oxygen>20 && this.atmosphere<20)
    	{
    		this.atmosphere = 20;
    	}
    	
    	if(this.carbonDioxide>30 && this.oxygen>30 && this.atmosphere<30)
    	{
    		this.atmosphere = 30;
    	}
    	
    	if(this.carbonDioxide>40 && this.oxygen>40 && this.atmosphere<40)
    	{
    		this.atmosphere = 40;
    	}
    	
    	if(this.carbonDioxide>50 && this.oxygen>50 && this.atmosphere<50)
    	{
    		this.atmosphere = 50;
    		JOptionPane.showMessageDialog(null,"Atmosphère formée à 50% !");
    	}
    	
    	if(this.carbonDioxide>60 && this.oxygen>60 && this.atmosphere<60)
    	{
    		this.atmosphere = 60;
    	}
    	
    	if(this.carbonDioxide>70 && this.oxygen>70 && this.atmosphere<70)
    	{
    		this.atmosphere = 70;
    	}
    	
    	if(this.carbonDioxide>80 && this.oxygen>80 && this.atmosphere<80)
    	{
    		this.atmosphere = 80;
    	}
    	
    	if(this.carbonDioxide>90 && this.oxygen>90 && this.atmosphere<90)
    	{
    		this.atmosphere = 90;
    	}
    	
    	if(this.carbonDioxide>100 && this.oxygen>100)
    	{
    		this.atmosphere = 100;
    		JOptionPane.showMessageDialog(null,"Atmosphère complètement formée !");
    	}
    }
}   

public class ConditionThread extends Thread
{
	public void run()
	{
		while(true)
		{
			try 
			{
				Thread.sleep(1000);
			}
		}
	}
}
    