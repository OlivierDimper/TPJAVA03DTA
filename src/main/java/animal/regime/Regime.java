package animal.regime;

import aliment.Aliment;

public abstract class Regime {
	String name;
	public void manger(Aliment aliment) throws Exception {
		throw new Exception();
	}

	public Regime(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
