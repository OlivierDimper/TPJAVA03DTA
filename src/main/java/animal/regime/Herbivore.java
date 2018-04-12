package animal.regime;

import aliment.Plante;

public class Herbivore extends Regime{
	
	public void manger(Plante plante) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + plante.getName());
	}
	
	public Herbivore() {
		super("Herbivore");
	}

}
