package AbstandGeradePunkt;
/**
 * Die Klasse repräsentiert den Abstand von Punkt und Gerade mit hilfe einer Formel.
 * 
 * @author Dennis Bopp
 *
 */
public class Abstand {
/**
 * Berechnet den Abstand von Punkt und Gerade.
 * @param gerade Die Gerade. 
 * @param punkt	Der Punkt des Abstand zur Geraden berechnet werden soll.
 * @return d Der Orthogonale Abstand von Gerade und Punkt.
 */
	public double berechneAbstand(Gerade gerade, Punkt punkt) {

		double dividend = Math.abs(gerade.getGeradeRichtungX() * (punkt.getPunktYKor() - gerade.getGeradeStartY()) // |bx*(Px-aY)-(by*(Px-ax))| 
				- (gerade.getGeradeRichtungY() * (punkt.getPunktXKor() - gerade.getGeradeStartX())));

		double divisor = Math
				.sqrt((Math.abs(Math.pow(gerade.getGeradeRichtungX(), 2) + Math.pow(gerade.getGeradeRichtungY(), 2))));	// sqrt((bx)^2+(by)^2)  Betrag Richtungsvektor 

		double d = dividend / divisor;
		System.out.println("Der Abstand von Punkt zu Geraden beträgt: " + d);
		return d;
	}
}
