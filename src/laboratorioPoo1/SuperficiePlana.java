package laboratorioPoo1;

import java.util.ArrayList;

public class SuperficiePlana {

	// Array of figuras
	private ArrayList<FiguraGeometrica> figurasGeometricas;

	// Debemos asegurnos de que el constructor cree el objeto figurasGeometricas
	public SuperficiePlana(ArrayList<FiguraGeometrica> figurasGeometricas) {
		super();
		this.figurasGeometricas = figurasGeometricas;
	}

	// Calcula el total del área de las figuras
	public double calcularTotalArea() {
		double totalArea = 0;

		// Agregar una validación que controle el contenido del ArrayList
		for (int i = 0; i < getFigurasGeometricas().size(); i++) {
			totalArea = totalArea + getFigurasGeometricas().get(i).calcularaArea();
		}

		return totalArea;
	}

	// Imprime los toString de las figuras
	public String toString() {
		String cadena = new String();
		for (int i = 0; i < getFigurasGeometricas().size(); i++) {
			cadena = cadena + getFigurasGeometricas().get(i).toString() + " y su área es: "
					+ getFigurasGeometricas().get(i).calcularaArea() + "\n";
		}
		return cadena;
	}

	// Podemos añadir figuras a la lista
	public void insertarFiguraGeometrica(FiguraGeometrica figura) {
		getFigurasGeometricas().add(figura);
	}

	public ArrayList<FiguraGeometrica> getFigurasGeometricas() {
		return figurasGeometricas;
	}

	public void setFigurasGeometricas(ArrayList<FiguraGeometrica> figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}

	public static void main(String[] args) {

		ArrayList<FiguraGeometrica> figurasGeometricas = new ArrayList<FiguraGeometrica>();

		Triangulo triangulo1 = new Triangulo("Triángulo Nro. 1", new Punto(1, 1), new Punto(3, 1), new Punto(2, 3));

		Triangulo triangulo2 = new Triangulo("Triángulo Nro. 2", new Punto(5, 3), new Punto(3, 1), new Punto(8, 3));

		Triangulo triangulo3 = new Triangulo("Triángulo Nro. 3", new Punto(10, 3), new Punto(0, 1), new Punto(2, 3));

		figurasGeometricas.add(triangulo1);
		figurasGeometricas.add(triangulo2);
		figurasGeometricas.add(triangulo3);

		// Instanciamos un objeto llamado superficiePlana con una lista de figuras
		// geométricas.
		SuperficiePlana superficiePlana = new SuperficiePlana(figurasGeometricas);
		Triangulo triangulo4 = new Triangulo("Triángulo Nro. 4", new Punto(15, 3), new Punto(10, 2), new Punto(12, 30));

		// También podemos añadir una figura adicional a la que se ya existe mediante el
		// uso del método:
		superficiePlana.insertarFiguraGeometrica(triangulo4);

		System.out.println(superficiePlana.toString());
		System.out.println(
				"La suma total de las areas de las figuras geométricas es: " + superficiePlana.calcularTotalArea());
	}

}
