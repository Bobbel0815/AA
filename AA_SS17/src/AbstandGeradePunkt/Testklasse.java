package AbstandGeradePunkt;
/**
 * Die Klase repräsentiert die Testklasse. 
 * @author Dennis Bopp
 *
 */
public class Testklasse {

	public static void main (String[] args){
		Gerade gerade1 = new Gerade(1,2, 3, 4);
		Punkt punkt1 = new Punkt(5,6);
		Testklasse test = new Testklasse();
		Abstand abstand = new Abstand();
		abstand.berechneAbstand(gerade1,punkt1);
	}
}
