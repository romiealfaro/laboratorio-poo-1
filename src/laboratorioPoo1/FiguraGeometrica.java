package laboratorioPoo1;

//Abstract para indicar una SuperClase
public abstract class FiguraGeometrica {
	
	protected String nombre;
	
	//Constructor sin parámetros
	public FiguraGeometrica() {
		super();
	}

	//Constructor con parámetros
	public FiguraGeometrica(String nombre) {
		super();
		this.nombre = nombre;
	}
	
    // Calcula el área de la figura
    public abstract double calcularaArea();

    // Retorna un booleano para indicar si la figura es regular o no. 
    public abstract boolean esRegular();


	//Protected para que solo las subclases accedan/manipulen los atributos
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
