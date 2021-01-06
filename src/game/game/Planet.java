package game;

public class Planet
{
  PlanetAtmosphere m_planetAtmosphere;

  public Planet()
  {
    m_planetAtmosphere = new PlanetAtmosphere();
  }

  public PlanetAtmosphere getPlanetAtmosphere()
  {
    return m_planetAtmosphere;  
  }

}
