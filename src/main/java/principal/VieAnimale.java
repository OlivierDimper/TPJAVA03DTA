package principal;

import aliment.Viande;
import animal.animals.Homme;
import animal.animals.Lapin;

public class VieAnimale {

	public static void main(String[] args) {
		Homme pierre = new Homme(18, 75, 130);
		pierre.description();

		Viande biche = new Viande("Biche");
		try {
			pierre.manger(biche);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Lapin panpan = new Lapin(4, 5, 20);
		panpan.description();

		try {
			panpan.manger(biche);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// pierre.manger(panpan);
	}
}
