package animal.animals;

import animal.Animal;
import animal.regime.Omnivore;

public class Homme extends Animal{
	public Homme(int age, int poids, int taille) {
		super(age, poids, taille, "Homme", new Omnivore());
	}
}
