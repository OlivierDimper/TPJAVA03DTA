package animal.animals;

import animal.Animal;
import animal.regime.Carnivore;

public class Lion extends Animal{
	public Lion(int age, int poids, int taille) {
		super(age, poids, taille, "Lion", new Carnivore());
	}
}
