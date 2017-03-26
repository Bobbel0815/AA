package Maschienengenauigkeit;

/**
 * Die Klasse gibt jeweils die größte und kleinste darstellbare Zahl des Systems
 * aus.
 * 
 * @author Dennis Bopp
 *
 */
public class Genauigkeit {

	private double i = 1.0; // Variable zum überprüfen der Dedingung.
	private double j = 0; // Variable um den letzten gültigen Wert zu retten.

	/**
	 * Ermittelt durch Multiplikation die kleinste und größte Zahl.
	 * 
	 * @author Dennis Bopp
	 *
	 */
	public void ermittleGenauigkeit() {
		while (i > 0) { // Teilt solange durch 2 bis die Zahl nicht mehr größer
						// als Null ist.
			j = i;
			i = i * 0.5;
		}

		System.out.println("Die Maschienengenauigkeit und kleinste kleinste Darstellbare Zahl beträgt: " + j);
		System.out.println(Math.pow(2, -1074));
										
		

		System.out.println("Größte darstellbare Zahl: " +(2 - Math.pow(2, -52)) * Math.pow(2, 1023));

	}

	public static void main(String[] args) {

		Genauigkeit genauigkeit = new Genauigkeit();
		genauigkeit.ermittleGenauigkeit();
	}

}
