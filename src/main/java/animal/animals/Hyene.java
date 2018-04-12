package animal.animals;

import animal.Animal;
import animal.regime.Carnivore;

public class Hyene extends Animal{
	public Hyene(int age, int poids, int taille) {
		super(age, poids, taille, "Hyène", new Carnivore());
	}
	
}
