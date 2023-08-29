/**
 * 
 */
package laboratorioPoo1;

/**
 * 
 */
public class Punto {

	private int coordenadaX;
	private int coordenadaY;

	// Constructor sin argumentos
	public Punto() {
		super();
	}

	// Constructor con argumentos
	public Punto(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public double getDistancia(Punto punto) {
		double distancia = Math.sqrt(Math.pow(getCoordenadaX() - punto.getCoordenadaX(), 2)
				+ Math.pow(getCoordenadaY() - punto.getCoordenadaY(), 2));
		return distancia;
	}

	public double getDistancia(int puntoX, int puntoY) {
		int x1x2Diferencia = getCoordenadaX() - puntoX;
		int y1y2Diferencia = getCoordenadaY() - puntoY;

		double distancia = Math.sqrt(x1x2Diferencia * x1x2Diferencia + y1y2Diferencia * y1y2Diferencia);

		return distancia;
	}

	public double getDistancia() {
		Punto puntoOrigen = new Punto(0, 0);
		return getDistancia(puntoOrigen);
	}

	@Override
	public String toString() {
		return "El punto tiene las siguientes coordenadas: " + getCoordenadaX() + ", " + getCoordenadaY();
	}

}
