package ejercicio4;

public class Electronica extends Producto {
	//Fields
	private double imp = 0.13;
	//COnstructor
	
	public Electronica(double precioUnit, String nombre, String id) {
		super(precioUnit, nombre, id);
		// TODO Auto-generated constructor stub
	}
	//Getter and setter
	
	public double getImp() {
		return imp;
	}

	public void setImp(double imp) {
		this.imp = imp;
	}
	//toString
	
	@Override
	public String toString() {
		return "Electrónica [imp=" + imp + ", toString()=" + super.toString() + "]";
	}
	//Methods
	@Override
	public double calcularPVP() {
		// TODO Auto-generated method stub
		return super.getPrecioUnit() * (1+imp);
	}

}
