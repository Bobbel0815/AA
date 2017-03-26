package AbstandGeradePunkt;

/**
 * Die Klasse repräsentiert einen Punkt mit hilfe von jeweils einem X- und einem
 * Y-Koordinaten.
 * 
 * @author Dennis Bopp
 *
 */
public class Punkt {
	private double punktXKor;  // X-Koordinate des Punktes.		
	private double punktYKor;  // Y-koordinate des Punktes.

	public Punkt(double punktXKor, double punktYKor) {
		this.punktXKor = punktXKor;
		this.punktYKor = punktYKor;
	}

	public double getPunktXKor() {
		return punktXKor;
	}

	public double getPunktYKor() {
		return punktYKor;
	}
}
