package Game;

<<<<<<< HEAD
import Game.Species.*;
=======
import Game.species;
>>>>>>> branch 'parameters' of https://github.com/vmercy/AP4B_TerraGenesis.git

public class Main {

	public static void main(String[] args) {

		double carbonDioxideFish = 12;
		int strenght = 50;
		String typeOfAnimals = "fish";

		Game notreJeu = new Game();
		
<<<<<<< HEAD
		Fish poisson = new Fish(carbonDioxideFish,strenght,typeOfAnimals);
=======
		Fish poisson = new Fish();
>>>>>>> branch 'parameters' of https://github.com/vmercy/AP4B_TerraGenesis.git
		Tree arbre = new Tree();
	
		notreJeu.animalSpeciesIntroduced(poisson);
		notreJeu.atmosphereStateUpdate();
		
<<<<<<< HEAD
		notreJeu.vegetalSpeciesIntroduced(arbre);
=======
		notreJeu.vegetalSpeciesIntroduced(poisson);
>>>>>>> branch 'parameters' of https://github.com/vmercy/AP4B_TerraGenesis.git
		notreJeu.atmosphereStateUpdate();
		
		System.out.print("La jauge de CO2 est à " + notreJeu.getCarbonDioxide() + "%");
		System.out.print("La jauge de 02 est à " + notreJeu.getOxygen() + "%");
	}

}
