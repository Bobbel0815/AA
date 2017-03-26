package AbstandGeradePunkt;

/**
 * Die Klasse repräsentiert eine Gerade mit hilfe von jeweils einem X- und einem
 * Y-Koordinaten des Startvektors und des Richtungsvektors.
 * 
 * @author Dennis Bopp
 *
 */
public class Gerade {
	private double geradeStartX;	//X-Koordinate des Starvektors.
	private double geradeStartY;	//Y-Koordinate des Starvektors.
	private double geradeRichtungX;	//X-Koordinate des Richtungsvektors.
	private double geradeRichtungY;	//Y-Koordinate des Richtungsvektors.

	public Gerade(double geradeStartX, double geradeStartY, double geradeRichtungX, double geradeRichtungY) {
		this.geradeStartX = geradeStartX;
		this.geradeStartY = geradeStartY;
		this.geradeRichtungX = geradeRichtungX;
		this.geradeRichtungY = geradeRichtungY;

	}

	public double getGeradeStartX() {
		return geradeStartX;
	}

	public double getGeradeStartY() {
		return geradeStartY;
	}

	public double getGeradeRichtungX() {
		return geradeRichtungX;
	}

	public double getGeradeRichtungY() {
		return geradeRichtungY;
	}
}
