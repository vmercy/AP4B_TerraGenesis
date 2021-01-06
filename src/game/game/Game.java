
package game;

import java.util.Vector;

import javax.swing.JOptionPane;

import game.Species.Animal;
import game.Species.Vegetal;


public class Game {

  private Planet m_planet;

    private Vector<BuildingMaterial> m_buildingMaterials;
    
    /* 
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

  */
    /**
    * @param None
    * @brief Lors de l'initialisation de Game, les param�tres sont d�finis � 0 (jauge de progression en %)
    */

    public Game() 
    {
      m_buildingMaterials = new Vector<BuildingMaterial>(10);
      
      m_buildingMaterials.add(new BuildingMaterial("Wood", ))
      //TODO: ajouter des matériaux de construction



      //TODO: replace with condition class
      m_planet.
    	this.money = 0;
    	this.atmosphere = 0;
    	this.oxygen = 0;
    	this.carbonDioxide = 0;
    	this.biomass = 0;
    }
    
    /**
     * @param Animal animal_p
     * @brief Lorsque qu'une esp�ce est instaur�e avec succ�s sur la plan�te, la jauge de Co2 monte 
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
    		JOptionPane.showMessageDialog(null,"Taux de dioxyde de carbone propice � la vie humaine atteint !");
    	}
    }
    	
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un v�g�tal est instaur� avec succ�s sur la plan�te, la jauge d'O2 monte
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
    		JOptionPane.showMessageDialog(null,"Taux d'oxyg�ne propice � la vie humaine atteint !");
    	}
    }
    
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'un v�g�tal est instaur� avec succ�s sur la plan�te, la jauge d'O2 monte
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
     * @brief Si les jauges d'O2 et de Co2 sont � 10% (progression dans le jeu ce n'est pas une r�partition)
     * 		  alors la jauge d'atmosph�re passe � 10%
     */
    
    public void atmosphereStateUpdate()
    {
      
      //FIXME: probleme si le dioxyde de carbone et l'atmisphère ne sont pas dans le même intervalle
    	if(this.carbonDioxide>=10 && this.carbonDioxide<20 && this.oxygen>=10 && this.oxygen<20)
    	{
    		this.atmosphere = 10;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 10% !");
    	}
    	
    	if(this.carbonDioxide>20 && this.oxygen>20 && this.atmosphere<20)
    	{
    		this.atmosphere = 20;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 20% !");
    	}
    	
    	if(this.carbonDioxide>30 && this.oxygen>30 && this.atmosphere<30)
    	{
    		this.atmosphere = 30;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 30% !");
    	}
    	
    	if(this.carbonDioxide>40 && this.oxygen>40 && this.atmosphere<40)
    	{
    		this.atmosphere = 40;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 40% !");
    	}
    	
    	if(this.carbonDioxide>50 && this.oxygen>50 && this.atmosphere<50)
    	{
    		this.atmosphere = 50;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 50% !");
    	}
    	
    	if(this.carbonDioxide>60 && this.oxygen>60 && this.atmosphere<60)
    	{
    		this.atmosphere = 60;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 60% !");
    	}
    	
    	if(this.carbonDioxide>70 && this.oxygen>70 && this.atmosphere<70)
    	{
    		this.atmosphere = 70;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 70% !");
    	}
    	
    	if(this.carbonDioxide>80 && this.oxygen>80 && this.atmosphere<80)
    	{
    		this.atmosphere = 80;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 80% !");
    	}
    	
    	if(this.carbonDioxide>90 && this.oxygen>90 && this.atmosphere<90)
    	{
    		this.atmosphere = 90;
    		JOptionPane.showMessageDialog(null,"Atmosph�re form�e � 90% !");
    	}
    	
    	if(this.carbonDioxide>100 && this.oxygen>100)
    	{
    		this.atmosphere = 100;
    		JOptionPane.showMessageDialog(null,"Atmosph�re compl�tement form�e !");
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
    