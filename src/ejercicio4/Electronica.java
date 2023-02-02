package ejercicio4;

public class Electronica extends Producto {
	//Fields
	
	//COnstructor
	
	public Electronica(double precioUnit, String nombre, String id) {
		super(precioUnit, nombre, id);
		// TODO Auto-generated constructor stub
	}
	//toString
	
	@Override
	public String toString() {
		return "Electrónica [ toString()=" + super.toString() + "]";
	}
	//Methods
	@Override
	public double calcularPVP() {
		// TODO Auto-generated method stub
		double imp = 0.1;
		return super.getPrecioUnit() * (1+imp);
	}

}
