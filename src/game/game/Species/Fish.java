package game.Species;


import javax.swing.*;

public class Fish extends Animal {

  Fish()
  {
    
  }
    
	public Fish(double carbonDioxideProduced, int strenght, String typeOfAnimals) {
    	super(carbonDioxideProduced, strenght, typeOfAnimals);
    }
	
    private Invertebrate invertebrate;
    private Vertebrate vertebrate;

    

    public Invertebrate getInvertebrate() {
        return this.invertebrate;
    }

    public Vertebrate getVertebrate() {
        return this.vertebrate;
    }

    public void set(Invertebrate invertebrate) {
        this.invertebrate = invertebrate ;
    }

    public void set(Vertebrate vertebrate) {
        this.vertebrate = vertebrate;
    }
    private static int energyNeed = 80;
    private  int energyProgress;

    @Override
    public void eat(Species species) {
        String message ="message";
        switch (species.getType()){
            case "Animal":
                switch (this.getTypeOfAnimals()){
                    case "AquaticMammal":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Mammal":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed-10);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Insect":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed+140);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;
                    case "Fish":
                        if(getEnergyGiven()<=MAX_ENERGY){
                            if(this.energyProgress<=energyNeed){
                                setEnergyGiven(MAX_ENERGY/energyNeed+180);
                                this.energyProgress += getEnergyGiven();
                            }else {
                                JOptionPane.showMessageDialog(null,message);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                        }
                        break;


                }
            default:
                if(getEnergyGiven()<=MAX_ENERGY){
                    if(this.energyProgress<=energyNeed){
                        setEnergyGiven(MAX_ENERGY/energyNeed+200);
                        this.energyProgress += getEnergyGiven();
                    }else {
                        JOptionPane.showMessageDialog(null,message);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Niveau maximal d'energie atteint");
                }
        }
    }
}