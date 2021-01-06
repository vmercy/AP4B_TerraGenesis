package game;

public class Factory {
  
  Factory()
  {
    name = "BLA";
  }

  Factory(String _name)
  {
    name = _name;
  }

  Factory(String _name, double _entier)
  {
    name = _name;
    Entier = _entier;
  }

  private String name;
  
  private double Entier = 2;

  public void setEntier(double newEntier)
  {
    Entier = newEntier;
  }
  
  public double getEntier()
  {
    return Entier;
  }

  public String getName()
  {
    return this.name;
  }
  
  public void setName(String newName)
  {
    name = newName;
  }

  public void print()
  {
    System.out.println(name+" : "+Entier);
  }
  
}