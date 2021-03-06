package game;

import java.awt.Color;

public class Condition {
  private String m_name;
  private double m_startValue;
  private double m_currentValue;
  private double m_threshold;
  private boolean displayed;

public Condition()
  {
    m_name = "";
    m_currentValue = m_startValue;
    m_threshold = 100.0;
    displayed = false;
  }

  /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param description_p description of the condition
   */
  
  public Condition(String name_p)
  {
    this();
    m_name = name_p;
  }


  /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param description_p description of the condition
   * @param startValue_p value of progress on initilization
   */
  public Condition(String name_p, double startValue_p)
  {
    this(name_p);
    m_startValue = startValue_p;
    m_currentValue = startValue_p;
  }

    /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param startValue_p value of progress on initilization
   * @param defaultIncrement_p default increment to add to current value when incrementing
   * @param defaultDecrement_p default decrement to substract from current value when decrementing
   * @param threshold_p value above which the condition is considered as completed
   */
  public Condition(String name_p, double startValue_p, double defaultIncrement_p, double defaultDecrement_p, double threshold_p)
  {
    this(name_p, startValue_p);
    m_currentValue = startValue_p;
    m_threshold = threshold_p;
  }

  public double getCurrentValue()
  {
    return m_currentValue/100;
  }
  
  public void setCurrentValue(double m_currentValue)
  {
		this.m_currentValue = m_currentValue;
  }

  public double getCurrentValuePercent()
  {
    return m_currentValue;
  }
  
  public boolean getDisplayed()
  {
    return displayed;
  }

  public void setDisplayed()
  {
    displayed = true;
  }
  
  public void increment(double amount_p)
  {
    m_currentValue += amount_p;
  }
  
  /**
   * @brief return the color representation that corresponds to the condition completion status from red to green
   * TODO: use it in interface progress bars implemented by @ZackBNT
   */
  public Color getColor()
  {
    byte red, green;
    red = (byte) (255-(getCurrentValue()*255));
    green = (byte) (255 * getCurrentValue());
    return (new Color(red, green, 0));
  }

  /**
   * 
   * @return true if the condition is satisfied (above or equal to the threshold)
   */
  public boolean isCompleted()
  {
    return (m_currentValue>=m_threshold);
  }

  public String getName()
  {
    return m_name;
  }
}
