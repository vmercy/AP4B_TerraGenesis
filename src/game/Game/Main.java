package Game;

import Game.species;

public class Main {

	public static void main(String[] args) {

		int strenght = 50;
		double carbonDioxideFish = 12;
		String typeOfAnimals = "fish";

		Game notreJeu = new Game();
		
		Fish poisson = new Fish();
		Tree arbre = new Tree();
	
		notreJeu.animalSpeciesIntroduced(poisson);
		notreJeu.atmosphereStateUpdate();
		
		notreJeu.vegetalSpeciesIntroduced(poisson);
		notreJeu.atmosphereStateUpdate();
		
		System.out.print("La jauge de CO2 est à " + notreJeu.getCarbonDioxide() + "%");
		System.out.print("La jauge de 02 est à " + notreJeu.getOxygen() + "%");
	}

}
