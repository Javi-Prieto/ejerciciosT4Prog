package ejercicio;

public class EntradaVIP extends EntradaNormal{
	//Fields
	private String nombre;
	//Constructor

	public EntradaVIP(int nAsiento, int nFila, int zona, String nombre) {
		super(nAsiento, nFila, zona);
		this.nombre = nombre;
	}
	//Getter and setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//toString

	@Override
	public String toString() {
		return "EntradaVIP [nombre=" + nombre + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public double calcularPrecio(double desc, double cantFija) {
		return super.calcularPrecio(desc, cantFija) + cantFija;
	}
	public void imprimirRegalo() {
		System.out.println("Vale por una botella de champagne y una foto firmada a nombre de: " + nombre);
	}
}
