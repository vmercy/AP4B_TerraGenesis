
package game;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JOptionPane;

import game.Species.Animal;
import game.Species.Vegetal;


public class Game {

  private class CompleteMissions extends Thread{
    
    @Override
		public void run() { //TODO: deplacer vers la classe Game
			while(true) {
        
        
        
        try {
          Thread.sleep(1000);
				} catch (InterruptedException e1) {
          e1.printStackTrace();
				}
			}
		}
  }
  
  private Missions m_missions; //TODO: turn to public and implement getter
  private Planet m_planet;
  private Vector<BuildingMaterial> m_buildingMaterials;
  private Money m_money;

  public Missions getMissions()
  {
    return m_missions;
  }

  public Money getMoney()
  {
    return m_money;
  }

    private final byte NB_BUILDING_MATERIALS = 4;

    /**
    * @param None
    * @brief Lors de l'initialisation de Game, les param�tres sont d�finis � 0 (jauge de progression en %)
    */

    public Game() 
    {
      m_buildingMaterials = new Vector<BuildingMaterial>(NB_BUILDING_MATERIALS);
      m_buildingMaterials.add(new BuildingMaterial("Wood", 100.0));
      m_buildingMaterials.add(new BuildingMaterial("Iron", 1000.0));
      m_buildingMaterials.add(new BuildingMaterial("Metal", 500.0));
      m_buildingMaterials.add(new BuildingMaterial("Concrete", 800.0));
      m_missions = new Missions();
      m_money = new Money();
    }
    
    /**
     * @param Animal animal_p
     * @brief Lorsque qu'une esp�ce animale est instaur�e avec succ�s sur la plan�te, la jauge de Co2 monte 
     */
    
    public void animalSpeciesIntroduced(Animal animal_p)
    {
    	if(m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() < 100)
    	{
    		m_planet.m_planetAtmosphere.incrementCondition("Carbon dioxide", animal_p.getcarbonDioxideProduced());
    	}
    	
    	if(m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() >= 100)
    	{
    		m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").setCurrentValue(1);
    	}
    }
    	
    /**
     * @param Vegetal vegetal_p
     * @brief Lorsque qu'une esp�ce v�g�tale est instaur�e avec succ�s sur la plan�te, la jauge d'O2 monte 
     */
    
    public void vegetalSpeciesIntroduced(Vegetal vegetal_p)
    {
    	if(m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() < 100)
    	{
    		m_planet.m_planetAtmosphere.incrementCondition("Oxygen", vegetal_p.getOxygenGiven());
    	}
    	
    	if(m_planet.m_planetAtmosphere.findCondition("Carbon dioxide").getCurrentValuePercent() >= 100)
    	{
    		m_planet.m_planetAtmosphere.findCondition("Oxygen").setCurrentValue(1);
    	}
    }
    
    /**
     * @param 
     * @brief 
     */
    
    public void FactoryIntroduced(Factory factory_p) //TODO: call on factory creation via interface
    {
    	
    	if(m_planet.m_planetAtmosphere.findCondition("Biomass").getCurrentValuePercent() < 100)
    	{
    		m_planet.m_planetAtmosphere.incrementCondition("Biomass", factory_p.getBiomassGain());
    	}
    	
    	if(m_planet.m_planetAtmosphere.findCondition("Biomass").getCurrentValuePercent() >= 100)
    	{
    		m_planet.m_planetAtmosphere.findCondition("Biomass").setCurrentValue(1);
    	}
    }
    
    public class ConditionThread extends Thread
    {
  	Enumeration<Condition> e = m_planet.m_planetAtmosphere.getConditions().elements();
  		
  	boolean allCompleted = false;
  	
    	public void run()
    	{
    		while(e.hasMoreElements())
    		{
    			if(e.nextElement().getCurrentValuePercent()>=100 && !e.nextElement().getDisplayed())
    			{
    				JOptionPane.showMessageDialog(null,"Param�tre " + e.nextElement().getName() + " propice � la vie !");
    				e.nextElement().setDisplayed();
    			}
    		}		
    		
    		if(m_planet.m_planetAtmosphere.isAllCompleted() && !allCompleted)
    		{
    			JOptionPane.showMessageDialog(null,"Tous les param�tres propices � la vie sont r�unis");
    			allCompleted = true;
    		}
    		
    		while(true)
    		{
    			try 
    			{
    				Thread.sleep(1000);
    			}
    			catch(InterruptedException e1) 
    			{
    				e1.printStackTrace();
    			}
    		}
    	}
    }
    
}
  


    