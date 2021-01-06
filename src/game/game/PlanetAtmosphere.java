package game;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JOptionPane;

public class PlanetAtmosphere
{
  private Vector<Condition> m_conditions;
  private static int NBCONDITIONS = 4;

  public PlanetAtmosphere()
  {
    m_conditions = new Vector<Condition>(NBCONDITIONS);
    m_conditions.add(new Condition("Carbon dioxide", "Carbon dioxide rate in the air", 0, 0.20, 0.20, 1));
    m_conditions.add(new Condition("Oxygen", "Oxygen rate in the air", 0, 0.20, 0.20, 1));
    m_conditions.add(new Condition("Atmosphere", "Atmosphere of the planet", 0, 0.20, 0.20, 1));
    m_conditions.add(new Condition("Biomass", "Energy obtained from factories", 0, 0.15, 0.15, 1));
  }

  
  public Condition findCondition(String conditionName_p)
  {
    for (Condition condition : m_conditions) {
      if(condition.getName()==conditionName_p)
        return condition;
    }
    return null;
  }

  public boolean incrementCondition(String conditionName_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.increment();
      return true;
    }
    return false;
  }

  public boolean decrementCondition(String conditionName_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.decrement();
      return true;
    }
    return false;
  }

  public boolean incrementCondition(String conditionName_p, double value_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.increment(value_p);
      return true;
    }
    return false;
  }

  public boolean decrementCondition(String conditionName_p, double value_p)
  {
    Condition cond = findCondition(conditionName_p);
    if(cond != null)
    {
      cond.decrement(value_p);
      return true;
    }
    return false;
  }

  

  /**
   * @return number of currently completed conditions
   * TODO: use for missions : e.g. complete a mission when 2 conditions are completed simultaneously
   */
  public int nbCompleted()
  {
    int nb = 0;
    for (Condition condition : m_conditions) {
      if(condition.isCompleted())
        nb++;
    }
    return nb;
  }
  
  public boolean isAllCompleted()
  {
    return (nbCompleted() == NBCONDITIONS);
  }

  
  
  public class ConditionThread extends Thread
  {
	Enumeration<Condition> e = m_conditions.elements();
		
	boolean allCompleted = false;
	
  	public void run()
  	{
  		while(e.hasMoreElements())
  		{
  			if(e.nextElement().getCurrentValuePercent()>=100 && !e.nextElement().getDisplayed())
  			{
  				JOptionPane.showMessageDialog(null,"Paramètre " + e.nextElement().getName() + " propice à la vie !");
  				e.nextElement().setDisplayed();
  			}
  		}		
  		
  		if(PlanetAtmosphere.this.isAllCompleted() && !allCompleted)
  		{
  			JOptionPane.showMessageDialog(null,"Tous les paramètres propices à la vie sont réunis");
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