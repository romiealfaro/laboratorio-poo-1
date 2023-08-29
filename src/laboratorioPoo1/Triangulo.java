package laboratorioPoo1;

/**
 * Palabra reservada extends para indicar que Triángulo es una clase hija de
 * FiguraGeométrica y esto permite: reusar los métodos de calcular área y
 * validar si es una figura regular o no. al ser FiguraGeometrica una SuperClase
 * abstracta, éste va a derivar las intrucciones del cálculo y validación de la
 * forma (Regular o no) a las subclases.
 **/

public class Triangulo extends FiguraGeometrica {

	// Vértices del triángulo
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;

	// Constructor sin parámetros
	public Triangulo() {
		super();
	}

	// Constructor con parámetros que utiliza el constructor de la SuperClase para indicar el nombre (reusamos)
	public Triangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3) {
		super(nombre); // utilizamos palabra reservada super
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public Punto getVertice1() {
		return vertice1;
	}

	public void setVertice1(Punto vertice1) {
		this.vertice1 = vertice1;
	}

	public Punto getVertice2() {
		return vertice2;
	}

	public void setVertice2(Punto vertice2) {
		this.vertice2 = vertice2;
	}

	public Punto getVertice3() {
		return vertice3;
	}

	public void setVertice3(Punto vertice3) {
		this.vertice3 = vertice3;
	}

	@Override
	public String toString() {
		return "Triángulo [vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + "]";
	}

	@Override
	public double calcularaArea() {
		double resultadoArea = 0.5
				* Math.abs(vertice1.getCoordenadaX() * (vertice2.getCoordenadaY() - vertice3.getCoordenadaY())
						+ vertice2.getCoordenadaX() * (vertice3.getCoordenadaY() - vertice1.getCoordenadaY())
						+ vertice3.getCoordenadaX() * (vertice1.getCoordenadaY() - vertice2.getCoordenadaY()));

		return resultadoArea;
	}

	@Override
	public boolean esRegular() {
		boolean _esRegular = (vertice1.getDistancia(vertice2) == vertice2.getDistancia(vertice3))
				&& (vertice1.getDistancia(vertice2) == vertice3.getDistancia(vertice1));

		return _esRegular;
	}
}
