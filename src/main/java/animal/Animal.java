package animal;

import aliment.Aliment;
import animal.regime.Regime;

public abstract class Animal {
	protected int age;
	protected int poids;
	protected int taille;
	protected String nom;
	protected Regime regime;
	public Animal(int age, int poids, int taille, String nom, Regime regime) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.regime = regime;
	}
	
	public void description() {
		System.out.println("Bonjour, je suis un " + nom + ". Je pèse " + poids + " kgs, j'ai " + age + " ans et je mesure " + taille + " cm.");
		System.out.println("Je suis un " + regime.getName());
	}

	public void manger(Aliment aliment) throws Exception {
		this.regime.manger(aliment);
	}

	public String getNom() {
		return nom;
	}
}
