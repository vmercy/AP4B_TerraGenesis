package Game;

import Game.Species.*;

public class Main {

	public static void main(String[] args) {

		double carbonDioxideFish = 12;
		int strenght = 50;
		String typeOfAnimals = "fish";

		Game notreJeu = new Game();
		

		Fish poisson = new Fish(carbonDioxideFish,strenght,typeOfAnimals);
		Tree arbre = new Tree();
	
		notreJeu.animalSpeciesIntroduced(poisson);
		notreJeu.atmosphereStateUpdate();
		

		notreJeu.vegetalSpeciesIntroduced(arbre);
		notreJeu.atmosphereStateUpdate();
		
		System.out.println("La jauge de CO2 est à " + notreJeu.getCarbonDioxide() + "%");
		//successful
		System.out.println("La jauge de 02 est à " + notreJeu.getOxygen() + "%");
	}

}
