package game;

import java.awt.Color;

import jdk.jfr.Threshold;

public class Condition {
  private String m_name;
  private String m_description;
  private double m_startValue;
  private double m_currentValue;
  private double m_threshold;
  private double m_defaultIncrement;
  private double m_defaultDecrement;
  private boolean displayed;

public Condition()
  {
    m_name = "";
    m_description = "";
    m_currentValue = m_startValue;
    m_threshold = 1.0;
    displayed = false;
  }

  /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param description_p description of the condition
   */
  
  public Condition(String name_p, String description_p)
  {
    m_name = name_p;
    m_description = description_p;
    m_startValue = 0.0;
    m_currentValue = 0.0;
    displayed = false;
  }


  /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param description_p description of the condition
   * @param startValue_p value of progress on initilization
   */
  public Condition(String name_p, String description_p, double startValue_p)
  {
    m_name = name_p;
    m_description = description_p;
    m_startValue = startValue_p;
    m_currentValue = startValue_p;
    displayed = false;
  }

    /**
   * Condition constructor overload
   * @param name_p name of the condition
   * @param description_p description of the condition
   * @param startValue_p value of progress on initilization
   * @param defaultIncrement_p default increment to add to current value when incrementing
   * @param defaultDecrement_p default decrement to substract from current value when decrementing
   */
  public Condition(String name_p, String description_p, double startValue_p, double defaultIncrement_p, double defaultDecrement_p)
  {
    m_name = name_p;
    m_description = description_p;
    m_startValue = startValue_p;
    m_currentValue = startValue_p;
    m_defaultIncrement = defaultIncrement_p;
    m_defaultDecrement = defaultDecrement_p;
    displayed = false;
  }

  public double getCurrentValue()
  {
    return m_currentValue;
  }
  
  public void setCurrentValue(double m_currentValue)
  {
		this.m_currentValue = m_currentValue;
  }

  public double getCurrentValuePercent()
  {
    return 100*m_currentValue;
  }
  
  public boolean getDisplayed()
  {
    return displayed;
  }

  public void setDisplayed()
  {
    displayed = false;
  }
  
  public void increment()
  {
    m_currentValue += m_defaultDecrement;
  }
  
  public void increment(double amount_p)
  {
    m_currentValue += amount_p;
  }
  
  public void decrement()
  {
    m_currentValue -= m_defaultDecrement;
  }

  public void decrement(double amount_p)
  {
    m_currentValue -= amount_p;
  }

  /**
   * @brief return the color representation in hex string that corresponds to the condition completion status from red to green
   * TODO: use it in interface progress bars implemented by @ZackBNT
   */
  public Color getColor()
  {
    byte red, green;
    red = (byte) (255-(m_currentValue*255));
    green = (byte) (255 * m_currentValue);
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
