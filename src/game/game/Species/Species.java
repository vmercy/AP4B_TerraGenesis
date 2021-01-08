package game.Species;

public class Species {

  private String m_type;
  protected double m_price;

  public Species(String type) {
    this.m_type = type;
  }

  public double getPrice() {
    return m_price;
  }

  public String getType() {
    return m_type;
  }

  public void setType(String type) {
    this.m_type = type;
  }

  public Species() {
  }

  public String verifiedSpecies(String species) {
    switch (species) {
      case "Animal":
        this.m_type = "Animal";
        break;
      case "Vegetal":
        this.m_type = " Vegetal";
        break;
      default:
        this.m_type = "Undefined species";
        break;
    }
    return this.m_type;
  }
}
