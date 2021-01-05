package game;

public class BuildingMaterial {
  BuildingMaterial()
  {
    m_owned = false;
  }

  BuildingMaterial(String name_p, double price_p)
  {
    m_owned = false;
    m_name = name_p;
    m_price = price_p;
  }

  private String m_name;

  private double m_price;

  /**
   * true if the material has been bought by the player
   */
  private boolean m_owned;

  public boolean isOwned()
  {
    return m_owned;
  }

  public boolean buy(Money currentMoney_p)
  {
    if(currentMoney_p.getAmount()>=m_price)
    {
      currentMoney_p.add(-m_price);
      m_owned = true;
      return true;
    }
    return false;
  }

  public double getPrice()
  {
    return m_price;
  }

  public String getName()
  {
    return m_name;
  }
}
