package animal.regime;

import aliment.Aliment;

public class Omnivore extends Regime{
	public void manger(Aliment aliment) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
	}
	
	public Omnivore() {
		super("Omnivore");
	}
}
