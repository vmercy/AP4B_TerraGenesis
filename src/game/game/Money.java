package game;

public class Money {
  private double m_amount;
  private String m_currency;

  public double getAmount()
  {
    return m_amount;
  }

  public String getCurrency()
  {
    return m_currency;
  }

  /**
   * @param amount_p amount to add
   */
  public void add(double amount_p)
  {
    m_amount+=amount_p; 
  }
}
