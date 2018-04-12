package animal.animals;

import animal.Animal;
import animal.regime.Herbivore;

public class Lapin extends Animal{
	public Lapin(int age, int poids, int taille) {
		super(age, poids, taille, "Lapin", new Herbivore());
	}
}
