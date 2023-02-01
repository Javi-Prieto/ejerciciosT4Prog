package ejercicio4;

public class Ropa extends Producto {
	//Constructor
	public Ropa(double precioUnit, String nombre, String id) {
		super(precioUnit, nombre, id);
		// TODO Auto-generated constructor stub
	}
	//toString

	@Override
	public String toString() {
		return "Ropa [toString()=" + super.toString() + "]";
	}
	
	public double calcularPVP() {
		return super.getPrecioUnit();
	}
	
	
}
