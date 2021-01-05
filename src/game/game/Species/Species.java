package game.Species;

public class Species {
	
	private  String type;
	
    public Species(String type) {
        this.type = type;
    }

   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Species(){}

    public String verifiedSpecies(String species){
        switch (species){
            case "Animal":
                this.type="Animal";
                break;
            case "Vegetal" :
                this.type =" Vegetal";
                break;
            default:
                this.type = "Undefined species";
                break;
        }
        return  this.type;
    }
}
