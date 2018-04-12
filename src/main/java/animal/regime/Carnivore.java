package animal.regime;

import aliment.Viande;

public class Carnivore extends Regime {

	public Carnivore() {
		super("Carnivore");
	}
	
	public void manger(Viande viande) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + viande.getName());
	}
}