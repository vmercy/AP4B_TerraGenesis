package game;

public class Money {
  private static final double START_MONEY = 10000.0;
  private double m_amount;

  public Money()
  {
    m_amount = START_MONEY;
  }

  public double getAmount()
  {
    return m_amount;
  }

  /**
   * @param amount_p amount to add
   */
  public void add(double amount_p)
  {
    m_amount+=amount_p; 
  }

  public void sub(double amount_p)
  {
    m_amount-=amount_p; 
  }
}
